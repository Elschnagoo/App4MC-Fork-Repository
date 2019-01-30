/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.visualization.hw;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.visualization.hw.templates.HWBlockDiagramCreator;
import org.eclipse.app4mc.amalthea.visualization.hw.ui.PreferenceConstants;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;

public class VisualizationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Object selection = getSelection(event);

		if (selection instanceof HWModel) {

			HWBlockDiagramCreator umlDiagramCreator = new HWBlockDiagramCreator();
			OutputToFile createDiagramFile = new OutputToFile();

			HWModel hwModel = ((HWModel) selection);

			String diagramFileName = "Diagram.svg";
			String plantumlFileName = "Diagram_Description.plantuml";

			final String dot_exe_location = getValueFromPreferenceStore(PreferenceConstants.P_DOT_PATH);

			if (dot_exe_location == null || dot_exe_location.equals("")) {
				MessageDialog.openError(Display.getDefault().getActiveShell(), "AMALTHEA HW Visualization",
						"Not able to find Grpahviz dot.exe location, please set it in the Amalthea Hw Visualization preference page");
				return null;
			}

			System.setProperty("GRAPHVIZ_DOT", dot_exe_location);

			if (hwModel != null) {

				Resource eResource = hwModel.eResource();

				if (eResource != null) {

					org.eclipse.emf.common.util.URI uri = eResource.getURI();
					IPath path = new Path(uri.toPlatformString(true));
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					IContainer parentFolder = file.getParent();

					try {
						if (parentFolder != null) {

							IFolder folder = parentFolder.getFolder(new Path("hwModelVisualization"));

							if (!folder.exists()) {
								folder.create(IResource.NONE, true, null);
							}

							String absPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()
									+ folder.getFullPath().toString();
							
							final ModelToTextResult errorCheck = new ModelToTextResult();

							CharSequence umlOutput = umlDiagramCreator.generatePlantUmlContent(hwModel, errorCheck);
							
							if(errorCheck.getErrorFlag() == false)
							{

								createDiagramFile.createfile(umlOutput, absPath, plantumlFileName);
	
								System.out.println("diagram.plantuml created");
								System.out.println(umlOutput);
	
								try {
									OutputStream diagramFile = new FileOutputStream(absPath + "/" + diagramFileName);
									SourceStringReader reader = new SourceStringReader(umlOutput.toString());
									reader.outputImage(diagramFile, new FileFormatOption(FileFormat.SVG));
									diagramFile.close();
	
									folder.refreshLocal(1, new NullProgressMonitor());
	
									MessageDialog.openInformation(Display.getDefault().getActiveShell(),
											"AMALTHEA HW Visualization",
											"Successfully generated HW Visualization for amalthea model file");
	
								} catch (Exception e) {
									MessageDialog.openError(Display.getDefault().getActiveShell(),
											"AMALTHEA HW Visualization",
											"Unable to generate HW Visualization for selected AMALTHEA model file");
									e.printStackTrace();
								}
	
							}
							else {
								MessageDialog.openError(Display.getDefault().getActiveShell(),
										"AMALTHEA HW Visualization",
										"Due to errors unable to generate HW Visualization for selected AMALTHEA model file");
							}
						}
							
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("No HW-Model availible");
				}
			}
		}

		return null;
	}

	protected static String getValueFromPreferenceStore(final String key) {

		final IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		return store.getString(key);
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

}
