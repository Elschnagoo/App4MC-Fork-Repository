/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.handlers;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.multicore.openmapping.IOpenMappingConstants;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic.PragmaticTaskGenerator;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;

public class CreateTasks extends AbstractHandler {
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		UniversalHandler.getInstance().setPluginId(OpenMappingPlugin.getPluginId());
		UniversalHandler.getInstance().setLog(OpenMappingPlugin.getDefault().getLog());

		// Get preference store and apply settings
		final IPreferenceStore store = OpenMappingPlugin.getDefault().getPreferenceStore();

		// Preference: Enable Verbose Output (Output to console)
		if (store.getBoolean(IOpenMappingConstants.PRE_CHECK_LOGCON)) {
			UniversalHandler.getInstance().enableVerboseOutput();
		}

		// Preference: Output directory (radio)
		final int radioOutputDirectory = store.getInt(IOpenMappingConstants.PRE_RADIO_OUTDIR);
		final String sOutputDirectory = store.getString(IOpenMappingConstants.PRE_STRING_OUTDIR);

		SWModel sourceSwModel;
		SWModel targetSwModel;
		StimuliModel stimuliModel;
		ConstraintsModel conModel;
		PropertyConstraintsModel pcModel;
		final ArrayList<EObject> outModels = new ArrayList<EObject>();

		final IFile swModelFile = UniversalHandler.getInstance().getSelectedFile(event);
		final String fileName = new File(swModelFile.getFullPath().toOSString()).getName();
		final String rawFileName = fileName.substring(0, fileName.lastIndexOf('.'));

		UniversalHandler.getInstance().dropCache();
		UniversalHandler.getInstance()
				.readModels(URI.createPlatformResourceURI(swModelFile.getFullPath().toOSString(), true), true);

		// // Fix models without "Central" Parent element
		// EObject amodel = UniversalHandler.getInstance().getSwModel();
		// EObject bmodel =
		// UniversalHandler.getInstance().getConstraintsModel();
		// // outModels.add(sourceSwModel);
		// outModels.add(amodel);
		// outModels.add(bmodel);
		// UniversalHandler.getInstance().writeModel(URI.createPlatformResourceURI(swModelFile.getFullPath().toOSString()+"_FIXED.amxmi",
		// true), outModels);
		// if(true)
		// return null;
		//

		sourceSwModel = UniversalHandler.getInstance().getSwModel();
		if (sourceSwModel == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no software model in the selected file.\nExiting...");
			return null;
		}

		conModel = UniversalHandler.getInstance().getConstraintsModel();
		if (conModel == null) {
			UniversalHandler.getInstance()
					.logCon("There seems to be no constraints model in the selected file.\nExiting...");
			return null;
		}

		// Not an error if the following is empty, we just want to pass the
		// sub-model to the next file
		pcModel = UniversalHandler.getInstance().getPropertyConstraintsModel();

		final PragmaticTaskGenerator createTaskAlgorithm = new PragmaticTaskGenerator();
		createTaskAlgorithm.setSwModel(sourceSwModel);
		createTaskAlgorithm.setConstraintsModel(conModel);
		createTaskAlgorithm.createTasks();

		if ((targetSwModel = createTaskAlgorithm.getSwModel()) == null) {
			System.out.println("An error occured during the task creation process");
			System.out.println("Check the error logs for further details");
			System.out.println("No changes will be made to the software model until this issue is fixed");
			return null;
		}

		if ((stimuliModel = createTaskAlgorithm.getStimuliModel()) == null) {
			System.out.println("An error occured during the task creation process");
			System.out.println("Check the error logs for further details");
			System.out.println("No changes will be made to the software model until this issue is fixed");
			return null;
		}

		outModels.add(targetSwModel);
		outModels.add(stimuliModel);
		outModels.add(conModel);
		if (pcModel != null) {
			outModels.add(pcModel);
		}

		final URI uri;
		if (radioOutputDirectory == 0 || sOutputDirectory == null || sOutputDirectory.isEmpty()) {
			// Default
			final String outputLocation = swModelFile.getProject().getFullPath().toString() + "/output/";
			uri = URI.createPlatformResourceURI(outputLocation + rawFileName + "_withTasks.amxmi", true);
		}
		else if (radioOutputDirectory == 1) {
			final String outputLocation = swModelFile.getProject().getFullPath().toString() + "/" + sOutputDirectory;
			uri = URI.createPlatformResourceURI(outputLocation + "/" + rawFileName + "_withTasks.amxmi", true);
		}
		else {
			uri = URI.createFileURI(sOutputDirectory + "/" + rawFileName + "_withTasks.amxmi");
		}

		UniversalHandler.getInstance().writeModel(uri, outModels);

		return null;
	}
}
