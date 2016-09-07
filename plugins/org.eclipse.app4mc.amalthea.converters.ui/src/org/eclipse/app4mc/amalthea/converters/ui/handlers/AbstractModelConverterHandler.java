/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.ui.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters.common.base.IFormatter;
import org.eclipse.app4mc.amalthea.converters.common.base.IPreProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ConverterElement;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jdom2.Document;

public abstract class AbstractModelConverterHandler extends AbstractHandler {

	protected AbstractHelper helper;

	protected Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea");

	protected void executeConversion(final IConverter converter, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		for (final File file : fileName_documentsMap.keySet()) {
			converter.convert(file, fileName_documentsMap, caches);
		}


		/*
		 * final ISafeRunnable runnable = new ISafeRunnable() {
		 *
		 * @Override public void handleException(final Throwable e) {
		 * MessageDialog.openError(Display.getDefault().getActiveShell(), "Model migration exception", e.getMessage());
		 * }
		 *
		 * @Override public void run() throws Exception { converter.convert(null, null); } }; SafeRunner.run(runnable);
		 */
	}

	protected Object getSelection(final ExecutionEvent event) {

		// Fetch current selection
		final IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveSite(event)
				.getSelectionProvider().getSelection();

		// Check if function was called properly
		if (selection == null) {
			return null;
		}

		// return first element of selection
		return selection.getFirstElement();
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

	protected Collection<ConverterElement> executeConversion(final Map<File, Document> fileName_documentsMap,
			final String inputModelVersion, final String outputModelVersion) throws CoreException, Exception {

		long st;
		long end;
		IConfigurationElement[] allConverterExtensions;

		final List<ICache> caches = getAllCacheObjectsFromExtensions(inputModelVersion);

		this.logger.info("start to build cache for models : " + inputModelVersion);

		st = System.currentTimeMillis();

		invokeAllCacheBuilders(caches, fileName_documentsMap);

		end = System.currentTimeMillis();


		this.logger.info("end of building cache for models " + inputModelVersion);

		this.logger.info("total time taken to build cache for " + inputModelVersion + " models:  " + (end - st));


		allConverterExtensions = getAllConverterExtensions();

		final Collection<ConverterElement> converterObjects = getEnabledConverterObjects(allConverterExtensions,
				inputModelVersion, outputModelVersion);

		invokeAllConvertersHeirarchially(converterObjects, new ArrayList<String>(), fileName_documentsMap, caches);

		return converterObjects;
	}

	protected IFormatter getModelFormatter() {

		final IExtensionRegistry registry = Platform.getExtensionRegistry();

		final IExtensionPoint extensionPoint = registry
				.getExtensionPoint("org.eclipse.app4mc.amalthea.model.converters.formatter");
		final IConfigurationElement[] extensions = extensionPoint.getConfigurationElements();

		for (final IConfigurationElement iConfigurationElement : extensions) {

			Object iConverter;
			try {
				iConverter = iConfigurationElement.createExecutableExtension("class");
				return (IFormatter) iConverter;
			}
			catch (final CoreException e) {

				this.logger.error("Error occured during Object creation of Formatter class ", e);
			}


		}

		return null;

	}
}
