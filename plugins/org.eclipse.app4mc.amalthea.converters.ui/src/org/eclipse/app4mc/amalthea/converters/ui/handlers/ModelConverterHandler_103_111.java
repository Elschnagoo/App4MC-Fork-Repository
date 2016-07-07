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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.converters.common.base.IFormatter;
import org.eclipse.app4mc.amalthea.converters.common.base.IPreProcessor;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ConverterElement;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.jdom2.Document;

/**
 * Handler to convert models from 1.1.0 to 1.1.1
 */
public class ModelConverterHandler_103_111 extends AbstractModelConverterHandler {
	/**
	 * The constructor.
	 */
	public ModelConverterHandler_103_111() {

		this.helper = HelperUtils_110_111.getInstance();
	}

	/**
	 * the command has been executed, so extract extract the needed information from the application context.
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		final long start = System.currentTimeMillis();

		final Object selectedElement = getSelection(event);

		final IFormatter modelFormatter = getModelFormatter();

		if (selectedElement instanceof IFile) {

			final String xmlFilePath = ((IFile) selectedElement).getLocationURI().getPath();

			final File inputXmlFile = new File(xmlFilePath);


			try {

				final Map<File, Document> fileName_documentsMap = new HashMap<File, Document>();

				this.helper.buildXMLDocumentsMap(inputXmlFile, fileName_documentsMap);


				System.out.println("start of pre processing");

				final List<IPreProcessor> preProcessors = getAllPreProcessorObjectsFromExtensions("itea.103");

				invokeAllPreProcessors(preProcessors, fileName_documentsMap);

				System.out.println("end of pre processing");


				final Collection<ConverterElement> converterObjects_110 = executeConversion(fileName_documentsMap,
						"itea.103", "itea.110");

				final Collection<ConverterElement> converterObjects_111 = executeConversion(fileName_documentsMap,
						"itea.110", "itea.111");


				if (converterObjects_110.size() > 0 || converterObjects_111.size() > 0) {


					final Set<File> keySet = fileName_documentsMap.keySet();

					for (final File file : keySet) {

						final String convertedFileName = file.getName();


						this.helper.saveFile(fileName_documentsMap.get(file),
								inputXmlFile.getParent() + File.separator + convertedFileName, true, true);
					}
				}


				if (modelFormatter != null) {

					modelFormatter.format(fileName_documentsMap.keySet());
				}

			}
			catch (final Exception e) {

				MessageDialog.openError(Display.getDefault().getActiveShell(), "Model migration exception",
						e.getMessage());
			}


			final long end = System.currentTimeMillis();

			final File timeStatsFile = new File(inputXmlFile.getParent(), inputXmlFile.getName() + "_timetaken.txt");

			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(timeStatsFile));
				bw.write("Total time taken for migration" + inputXmlFile.getPath() + " (in milli seconds) : "
						+ (end - start));
				bw.close();
			}
			catch (final Exception e) {
				e.printStackTrace();
			}


		}

		final long end = System.currentTimeMillis();

		System.out.println("Total time taken for migration (in milli seconds) : " + (end - start));

		MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Model migration result",
				"Total time taken for migration (in milli seconds) : " + (end - start));


		try {
			((IFile) selectedElement).getParent().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		}
		catch (final CoreException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
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
				e.printStackTrace();
			}


		}

		return null;

	}


}
