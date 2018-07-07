/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.converters.ui.jobs;

import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters.common.base.IFormatter;
import org.eclipse.app4mc.amalthea.converters.common.base.IPostProcessor;
import org.eclipse.app4mc.amalthea.converters.common.base.IPreProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters.common.utils.BaseHelperUtils;
import org.eclipse.app4mc.amalthea.converters.common.xpath.utils.ProcessorElement;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ConverterElement;
import org.eclipse.app4mc.amalthea.converters.ui.utils.IMigrationStatus;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationSettings;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ModelVersions;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.jdom2.Document;

public class ModelMigrationJob extends Job {

	private final MigrationSettings migrationSettings;

	protected AbstractHelper helper;

	private final Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	public ModelMigrationJob(final String name, final MigrationSettings migrationSettings) {
		super(name);
		this.migrationSettings = migrationSettings;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {


		monitor.setTaskName("Collecting information for intermediate migration steps");


		final String inputModelVersion = this.migrationSettings.getInputModelVersion();

		final String outputModelVersion = this.migrationSettings.getMigrationModelVersion();

		this.helper = BaseHelperUtils.getInstance();

		final List<Entry<String, String>> migStepEntries = generateMigrationSteps(inputModelVersion,
				outputModelVersion);

		final SubMonitor subMonitor = SubMonitor.convert(monitor, migStepEntries.size() + 3);

		subMonitor.worked(1);

		if (migStepEntries.size() == 0) {

			this.logger.error("Migration not supported for the selected model versions. \nInput Model version : \""
					+ inputModelVersion + "\" Output Model Version : \"" + outputModelVersion + "\"");

			return new Status(IStatus.CANCEL, " org.eclipse.app4mc.amalthea.converters.ui",
					IMigrationStatus.UNSUPPORTED_MODEL_VERSIONS,
					"Migration not supported for the selected model versions. \nInput Model version : \""
							+ inputModelVersion + "\" Output Model Version : \"" + outputModelVersion + "\"",
					null);
		}

		try {

			final Map<File, Document> fileName_documentsMap = this.migrationSettings.getMigModelFilesMap();

			final StringBuffer buffer = new StringBuffer();

			buffer.append(System.getProperty("line.separator")
					+ "***************************************************************************************************************************************"
					+ System.getProperty("line.separator"));
			buffer.append("\t\t Starting model migration for the following AMALTHEA models: "
					+ System.getProperty("line.separator"));

			for (final File modelFile : fileName_documentsMap.keySet()) {
				buffer.append("\t\t -- " + modelFile.getAbsolutePath() + System.getProperty("line.separator"));
			}

			buffer.append(System.getProperty("line.separator")
					+ "***************************************************************************************************************************************"
					+ System.getProperty("line.separator"));

			this.logger.info(buffer.toString());

			// clearing the stringbuffer
			buffer.delete(0, buffer.length());


			subMonitor.setTaskName("invoking pre processors ");

			final List<IPreProcessor> preProcessors = getAllPreProcessorObjectsFromExtensions(inputModelVersion);

			final List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> allPostProcessorObjectsFromExtensions = getAllPostProcessorObjectsFromExtensions();

			invokeAllPreProcessors(preProcessors, fileName_documentsMap);

			subMonitor.worked(1);

			final List<ConverterElement> allConverters = new ArrayList<ConverterElement>();

			for (final Entry<String, String> entry : migStepEntries) {

				if (subMonitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}
				subMonitor
						.setTaskName("Migrating AMALTHEA models from : " + entry.getKey() + " to " + entry.getValue());

				this.logger.info("=========== START: Migrating AMALTHEA models from : " + entry.getKey() + " to "
						+ entry.getValue() + " ========== ");

				/*- Building caches for a specific input model version*/
				final List<ICache> caches = getAllCacheObjectsFromExtensions(entry.getKey());
				
				final Collection<ConverterElement> converterObjects = executeConversion(caches,fileName_documentsMap,
						entry.getKey(), entry.getValue());

				allConverters.addAll(converterObjects);

				subMonitor.worked(1);

				executePostProcessors(caches,entry, migStepEntries, allPostProcessorObjectsFromExtensions,
						fileName_documentsMap);

				this.logger.info("=========== END: Migrating AMALTHEA models from : " + entry.getKey() + " to "
						+ entry.getValue() + "  =========== " + System.getProperty("line.separator"));
			}

			subMonitor.setTaskName("invoking post processors ");


			subMonitor.worked(1);


			if (allConverters.size() > 0) {

				// TODO: Implement a generalized logic so as to support future versions
				boolean updateFileNames = false;
				if (inputModelVersion.equals("itea.103") || inputModelVersion.equals("itea.110")) {
					if (outputModelVersion.equals("itea.111") || outputModelVersion.equals("0.7.0")
							|| outputModelVersion.equals("0.7.1") || outputModelVersion.equals("0.7.2")
							|| outputModelVersion.equals("0.8.0")) {
						updateFileNames = true;
					}
				}
				saveFiles(subMonitor, fileName_documentsMap, updateFileNames);
			}


		}
		catch (final Exception e) {

			this.logger.error(e.getMessage(), e);

			return new Status(IStatus.CANCEL, " org.eclipse.app4mc.amalthea.converters.ui", IMigrationStatus.ERROR,
					"Error during migration ", e);

		}


		return Status.OK_STATUS;
	}


	/**
	 * This method is used to generate list of model migration steps which are required to migrate from one version to
	 * other. <br>
	 * <br>
	 * <b>Example</b>: Below are the steps which are required to migrate from itea.103 to 0.7.2:<br>
	 * <br>
	 *
	 * <table style="height: 65px;" width="120">
	 * <tbody>
	 * <tr>
	 * <td style="text-align:right;">itea.103 --&gt;</td>
	 * <td>itea.110</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align:right;">itea.110--&gt;</td>
	 * <td>itea.111</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align:right;">itea.111--&gt;</td>
	 * <td>0.7.0</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align:center;">0.7.0--&gt;</td>
	 * <td>0.7.1</td>
	 * </tr>
	 * <tr>
	 * <td style="text-align:center;">0.7.1--&gt;</td>
	 * <td>0.7.2</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * <p>
	 * &nbsp;
	 * </p>
	 *
	 * @param inputModelVersion
	 *            This is the version present in input AMALTHEA model file (e.g: itea.103)
	 * @param outputModelVersion
	 *            AMALTHEA model file should be migrated to this version (e.g: 0.7.2)
	 * @return
	 */
	private List<Entry<String, String>> generateMigrationSteps(final String inputModelVersion,
			final String outputModelVersion) {

		final List<Entry<String, String>> migStepEntries = new ArrayList<Map.Entry<String, String>>();

		/*- Note: These are the various AMALTHEA model versions which are released.
		 *  Order of the below list should be same as the release order- > as based on this order, model migration steps are prepared*/
		final List<String> versions = ModelVersions.get();

		final int inputModelVersionIndex = versions.indexOf(inputModelVersion);
		final int outputModelVersionIndex = versions.indexOf(outputModelVersion);

		if (inputModelVersionIndex != -1 & outputModelVersionIndex != -1) {

			for (int i = inputModelVersionIndex; (i <= outputModelVersionIndex)
					&& ((i + 1) <= outputModelVersionIndex); i++) {

				final Entry<String, String> entry = new AbstractMap.SimpleEntry<String, String>(versions.get(i),
						versions.get(i + 1));

				migStepEntries.add(entry);

			}
		}


		return migStepEntries;
	}


	private void saveFiles(final SubMonitor subMonitor, final Map<File, Document> fileName_documentsMap,
			final boolean updateFileNames) throws Exception {


		final List<File> outputFiles = new ArrayList<File>();

		subMonitor.setTaskName("Saving migrated AMALTHEA model files ");

		final Set<File> keySet = fileName_documentsMap.keySet();

		for (final File inputFile : keySet) {

			final String outputDirectoryLocation = this.migrationSettings.getOutputDirectoryLocation();


			String convertedFileName = inputFile.getName();

			if (updateFileNames) {
				// add amxmi extension to file names which do not have it (and are migrated to versions 1.1.1 or higher)

				final int indexOfDot = convertedFileName.lastIndexOf(".");

				final String extension = convertedFileName.substring(indexOfDot + 1);

				if (extension.startsWith("amxmi") && !extension.equals("amxmi")) {
					convertedFileName = convertedFileName + ".amxmi";
				}


			}

			File outputFile = null;

			if (outputDirectoryLocation != null && !outputDirectoryLocation.equals("")) {

				final String location = outputDirectoryLocation + File.separator + convertedFileName;
				this.helper.saveFile(fileName_documentsMap.get(inputFile), location, true, true);

				outputFile = new File(location);
				/*-adding new file path */
				outputFiles.add(outputFile);
			}
			else {
				final String location = inputFile.getParentFile().getAbsolutePath() + File.separator
						+ convertedFileName;
				this.helper.saveFile(fileName_documentsMap.get(inputFile), location, true, true);

				/*-adding new file path */

				outputFile = new File(location);
				outputFiles.add(outputFile);
			}

			this.logger.info("Migrated model file saved @ : " + outputFile.getAbsolutePath());
		}

		subMonitor.worked(1);

		subMonitor.setTaskName("Formatting AMALTHEA model files ");

		final IFormatter modelFormatter = getModelFormatter();

		if (modelFormatter != null) {

			// modelFormatter.format(outputFiles);
		}

		subMonitor.worked(1);


	}


	@Override
	public boolean belongsTo(final Object family) {

		if (family != null && family.equals(IMigrationJobConstants.FAMILY)) {
			return true;
		}

		return super.belongsTo(family);
	}

	protected void executeConversion(final IConverter converter, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		for (final File file : fileName_documentsMap.keySet()) {
			converter.convert(file, fileName_documentsMap, caches);
		}

	}

	protected IConfigurationElement[] getAllConverterExtensions() {

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		final IExtensionPoint extensionPoint = registry
				.getExtensionPoint("org.eclipse.app4mc.amalthea.model.converters");
		final IConfigurationElement[] extensions = extensionPoint.getConfigurationElements();

		return extensions;
	}

	protected List<ICache> getAllCacheObjectsFromExtensions(final String inputModelVersion) throws CoreException {

		final List<ICache> caches = new ArrayList<ICache>();

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		final IExtensionPoint extensionPoint = registry
				.getExtensionPoint("org.eclipse.app4mc.amalthea.model.converters.cachebuilders");
		final IConfigurationElement[] extensions = extensionPoint.getConfigurationElements();

		for (final IConfigurationElement iConfigurationElement : extensions) {
			final String definedInputModelVersion = iConfigurationElement.getAttribute("input-model-version");

			if (definedInputModelVersion.equals(inputModelVersion)) {

				final Object cacheBuilder = iConfigurationElement.createExecutableExtension("class");

				caches.add((ICache) cacheBuilder);
			}
		}

		return caches;
	}

	protected List<IPreProcessor> getAllPreProcessorObjectsFromExtensions(final String... inputModelVersions)
			throws CoreException {

		final List<IPreProcessor> preProcessors = new ArrayList<IPreProcessor>();

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		final IExtensionPoint extensionPoint = registry
				.getExtensionPoint("org.eclipse.app4mc.amalthea.model.converters.preprocessor");
		final IConfigurationElement[] extensions = extensionPoint.getConfigurationElements();

		for (final IConfigurationElement iConfigurationElement : extensions) {

			/*- obtain the input-model-version's defined in the extension */
			final List<String> definedModelVersions = new ArrayList<String>();

			final IConfigurationElement[] children = iConfigurationElement.getChildren();
			for (final IConfigurationElement childConfigurationElement : children) {
				final String attrib = childConfigurationElement.getAttribute("version");

				if (attrib != null) {
					definedModelVersions.add(attrib);
				}
			}

			loop: for (final String inputModelVersion : inputModelVersions) {

				for (final String definedModelVersion : definedModelVersions) {

					if (definedModelVersion.equals(inputModelVersion)) {

						final Object preProcessor = iConfigurationElement.createExecutableExtension("class");

						preProcessors.add((IPreProcessor) preProcessor);

						break loop;
					}

				}
			}


		}

		return preProcessors;
	}

	/**
	 * This method is responsible to execute the post processors in a generalized way
	 *
	 * Example:
	 *
	 * If PostProcessor is defined by associating input versions : 1.0.3, 1.1.0 and outputversion 0.7.0 <br>
	 * In case if the migration is expected from 1.0.3 to 0.7.0<br>
	 * Following migration entries are created<br>
	 * 1.0.3 to 1.1.0 <br>
	 * 1.1.0 to 1.1.1 <br>
	 * 1.1.1 to 0.7.0<br>
	 * <br>
	 * <br>
	 * In this case it is expected to execute post processor only after migration from 1.1.0 to 1.1.1 is completed
	 *
	 * <br>
	 * <br>
	 * From the extension point,<br>
	 * input versions collected are : 1.0.3, 1.1.0<br>
	 * output versions collected are : 0.7.0<br>
	 * <br>
	 * These versions are stored in two seperate lists<br>
	 * <br>
	 * <br>
	 * After each migration entry is processed, check is made if the postprocessors can be executed<br>
	 * <br>
	 * Check is the following way:<br>
	 * get all input & output versions from the current & subsequent entries of the Migration entry<br>
	 * If atlease one content of input& output versions list is available in both the lists defined in the extension
	 * point of the postprocessor, then the corresponding PostProcessor is considered to be a candidate for execution
	 * <br>
	 * : </t>then subsequent iterations are performed with the next Migration entries (e.g: 1.1.0 to 1.1.1) and the
	 * corresponding PostProcessor objects are obtained<br>
	 * <br>
	 * During the process of current migration entry, it is checked if the same PostProcessor objects are also
	 * candidates for the next migration entry<br>
	 * </t>If this is the case, PostProcessor element for the current Migration Entry is discarded and is considered
	 * only for the next migration Entry
	 *
	 * <br>
	 * <br>
	 * Goal of this logic, is to have a post processor only once for the specified input and output versions
	 *
	 *
	 * @param executionEntry
	 * @param allEntries
	 * @param allPostProcessors
	 * @param fileName_documentsMap
	 * @throws Exception
	 */
	private void executePostProcessors(final List<ICache> caches,final Entry<String, String> executionEntry,
			final List<Entry<String, String>> allEntries,
			final List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> allPostProcessors,
			final Map<File, Document> fileName_documentsMap) throws Exception {


		final List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> matchingProcessorElements = getMatchingPostProcessorElements(
				getAllInputVersionsFromMigrationsEntries(executionEntry, allEntries),
				getAllOutputVersionsFromMigrationsEntries(executionEntry, allEntries), allPostProcessors);

		final List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> matchingProcessorElementsForOtherEntries = new ArrayList<ProcessorElement<IConfigurationElement, List<String>, List<String>>>();

		final int indexOf = allEntries.indexOf(executionEntry);

		if (indexOf != -1) {

			for (int i = indexOf + 1; i < allEntries.size(); i++) {
				final Entry<String, String> nextEntry = allEntries.get(i);

				matchingProcessorElementsForOtherEntries.addAll(getMatchingPostProcessorElements(
						getAllInputVersionsFromMigrationsEntries(nextEntry, allEntries),
						getAllOutputVersionsFromMigrationsEntries(nextEntry, allEntries), allPostProcessors));
			}
		}

		/*- below code is used : to consider only ProcessorElements which are not matched for the next entries */

		matchingProcessorElements.removeAll(matchingProcessorElementsForOtherEntries);

		/*- Executing the post processors */


		for (final ProcessorElement<IConfigurationElement, List<String>, List<String>> processorElement : matchingProcessorElements) {

			final IConfigurationElement iConfigurationElement = processorElement.getConfigurationElement();

			// final String sequence = iConfigurationElement.getAttribute("sequence_id");

			final Object postProcessor = iConfigurationElement.createExecutableExtension("class");


			((IPostProcessor) postProcessor).addCaches(caches);
			((IPostProcessor) postProcessor).process(fileName_documentsMap, this.helper);

		}


	}


	private List<String> getAllInputVersionsFromMigrationsEntries(final Entry<String, String> entry,
			final List<Entry<String, String>> allEntries) {

		final List<String> keys = new ArrayList<String>();

		for (int i = allEntries.indexOf(entry); (i < allEntries.size() && i != -1); i++) {
			keys.add(allEntries.get(i).getKey());
		}

		return keys;

	}

	private List<String> getAllOutputVersionsFromMigrationsEntries(final Entry<String, String> entry,
			final List<Entry<String, String>> allEntries) {

		final List<String> values = new ArrayList<String>();

		for (int i = allEntries.indexOf(entry); (i < allEntries.size() && i != -1); i++) {
			values.add(allEntries.get(i).getValue());
		}

		return values;

	}


	private List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> getMatchingPostProcessorElements(
			final List<String> inputVersions, final List<String> outputVersions,
			final List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> allPostProcessors) {


		final List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> matchingElements = new ArrayList<ProcessorElement<IConfigurationElement, List<String>, List<String>>>();

		for (final ProcessorElement<IConfigurationElement, List<String>, List<String>> processorElement : allPostProcessors) {


			final boolean isInputVersionFound = processorElement.getInputVersions() != null
					&& !Collections.disjoint(processorElement.getInputVersions(), inputVersions) ? true : false;

			final boolean isOutputVersionFound = processorElement.getOutputVersions() != null
					&& !Collections.disjoint(processorElement.getOutputVersions(), outputVersions) ? true : false;

			if (isInputVersionFound && isOutputVersionFound) {
				matchingElements.add(processorElement);
			}
		}

		return matchingElements;
	}

	/**
	 * This method is used to get all ProcessorElement from the PostProcess extension points
	 *
	 * @return List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> <br>
	 *         Each ProcessorElement contains following elements:<br>
	 *         IConfigurationElement<br>
	 *         inputVersions List<String><br>
	 *         outputVersions List<String>
	 */
	protected List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> getAllPostProcessorObjectsFromExtensions() {

		final List<ProcessorElement<IConfigurationElement, List<String>, List<String>>> postProcessors = new ArrayList<ProcessorElement<IConfigurationElement, List<String>, List<String>>>();

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		final IExtensionPoint extensionPoint = registry
				.getExtensionPoint("org.eclipse.app4mc.amalthea.model.converters.postprocessor");
		final IConfigurationElement[] extensions = extensionPoint.getConfigurationElements();

		for (final IConfigurationElement iConfigurationElement : extensions) {

			/*- obtain the input-model-version's defined in the extension */
			final List<String> definedInputModelVersions = new ArrayList<String>();

			/*- obtain the output-model-version's defined in the extension */
			final List<String> definedOutputModelVersions = new ArrayList<String>();

			final IConfigurationElement[] children = iConfigurationElement.getChildren();
			for (final IConfigurationElement childConfigurationElement : children) {
				final String attrib = childConfigurationElement.getAttribute("version");

				if (attrib == null) {
					continue;
				}

				if (childConfigurationElement.getName().equals("input-model-version")) {
					definedInputModelVersions.add(attrib);
				}
				else if (childConfigurationElement.getName().equals("output-model-version")) {
					definedOutputModelVersions.add(attrib);
				}

			}

			postProcessors.add(new ProcessorElement<IConfigurationElement, List<String>, List<String>>(
					iConfigurationElement, definedInputModelVersions, definedOutputModelVersions));

		}

		return postProcessors;
	}


	protected void invokeAllPreProcessors(final List<IPreProcessor> preProcessors,
			final Map<File, Document> fileName_documentsMap) throws Exception {

		for (final IPreProcessor preProcessor : preProcessors) {

			for (final File file : fileName_documentsMap.keySet()) {
				preProcessor.process(file, fileName_documentsMap);
			}
		}

	}


	protected void invokeAllCacheBuilders(final List<ICache> caches, final Map<File, Document> fileName_documentsMap) {

		for (final ICache iCache : caches) {
			iCache.buildCache(fileName_documentsMap);
		}

	}


	protected Collection<ConverterElement> getEnabledConverterObjects(final IConfigurationElement[] extensions,
			final String inputModelVersion, final String outputModelVersion) throws CoreException {


		final Map<String, ConverterElement> converterElementsMap = new HashMap<String, ConverterElement>();


		for (final IConfigurationElement iConfigurationElement : extensions) {

			final String isEnabled = iConfigurationElement.getAttribute("enabled");

			/* - considers only extensions which are enabled */

			if ("true".equals(isEnabled)) {

				final String id = iConfigurationElement.getAttribute("id");

				final String definedInputModelVersion = iConfigurationElement.getAttribute("input-model-version");

				final String definedOutputModelVersion = iConfigurationElement.getAttribute("output-model-version");

				if (inputModelVersion.equals(definedInputModelVersion)
						&& outputModelVersion.equals(definedOutputModelVersion)) {

					final Object converterObject = iConfigurationElement.createExecutableExtension("converter-class");

					final ConverterElement converterElement = new ConverterElement(id, (IConverter) converterObject);

					converterElementsMap.put(id, converterElement);

					final IConfigurationElement[] children = iConfigurationElement
							.getChildren("dependent-on-converter");

					for (final IConfigurationElement childConfigurationElement : children) {

						final String dependentOnConverterID = childConfigurationElement.getAttribute("id");

						if (dependentOnConverterID != null) {
							converterElement.addDependentOnConverterID(dependentOnConverterID);
						}

					}
				}
			}


		}

		if (converterElementsMap.size() > 0) {

			for (final String converterID : converterElementsMap.keySet()) {

				final ConverterElement converterElement = converterElementsMap.get(converterID);

				final List<String> idsOfDependentOnConverters = converterElement.getIDSofDependentOnConverters();

				for (final String idOfDependentOnConverter : idsOfDependentOnConverters) {

					converterElement.addRequiredConverter(converterElementsMap.get(idOfDependentOnConverter));

				}

			}
		}


		return converterElementsMap.values();
	}

	protected void invokeAllConvertersHeirarchially(final Collection<ConverterElement> converterObjects,
			final List<String> iconverters, final Map<File, Document> fileName_documentsMap, final List<ICache> caches)
			throws Exception {

		for (final ConverterElement converterElement : converterObjects) {

			if (!converterElement.isCompleted() && !iconverters.contains(converterElement.getID())) {

				final List<ConverterElement> requiredConverters = converterElement.getRequiredConverters();

				/*- this method is called recursively to invoke all required Converters  */

				invokeAllConvertersHeirarchially(requiredConverters, iconverters, fileName_documentsMap, caches);

				executeConversion(converterElement.getConverterObject(), fileName_documentsMap, caches);

				converterElement.setCompleted(true);

				/*- storage of name (set in the Converter extension) in the List is to avoid cyclic loop */

				iconverters.add(converterElement.getID());

			}

		}
	}

	protected Collection<ConverterElement> executeConversion(final List<ICache> caches,final Map<File, Document> fileName_documentsMap,
			final String inputModelVersion, final String outputModelVersion) throws CoreException, Exception {

		long st;
		long end;
		IConfigurationElement[] allConverterExtensions;

//		final List<ICache> caches = getAllCacheObjectsFromExtensions(inputModelVersion);

		this.logger.trace("Start : Building cache for AMALTHEA models present in : " + inputModelVersion);

		st = System.currentTimeMillis();

		invokeAllCacheBuilders(caches, fileName_documentsMap);

		end = System.currentTimeMillis();


		this.logger.trace("End : Building cache for AMALTHEA models present in : " + inputModelVersion);

		this.logger.trace("Total time taken to build cache for " + inputModelVersion + " models:  " + (end - st)
				+ "milli seconds");


		allConverterExtensions = getAllConverterExtensions();

		final Collection<ConverterElement> converterObjects = getEnabledConverterObjects(allConverterExtensions,
				inputModelVersion, outputModelVersion);

		invokeAllConvertersHeirarchially(converterObjects, new ArrayList<String>(), fileName_documentsMap, caches);

		return converterObjects;
	}

	protected IFormatter getModelFormatter() {

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		if (registry == null) {
			return null;
		}
		final IExtensionPoint extensionPoint = registry
				.getExtensionPoint("org.eclipse.app4mc.amalthea.model.converters.formatter");

		if (extensionPoint != null) {

			final IConfigurationElement[] extensions = extensionPoint.getConfigurationElements();

			for (final IConfigurationElement iConfigurationElement : extensions) {

				Object iConverter;
				try {
					iConverter = iConfigurationElement.createExecutableExtension("class");
					return (IFormatter) iConverter;
				}
				catch (final CoreException e) {
					this.logger.error(e.getMessage(), e);
					e.printStackTrace();
				}


			}
		}

		return null;

	}

}
