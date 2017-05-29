/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.dialogs.openmapping.handlers;

import org.eclipse.app4mc.multicore.dialogs.DialogsPlugin;
import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.model.description.OMModelDescriptionBuilder;
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelDescription;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;

public class PerformMappingJobHandler {
	/**
	 * Preference store to use
	 */
	private final IPreferenceStore store;

	/**
	 * Open Mapping Preference store to use
	 */
	private final IPreferenceStore OMstore;
	/**
	 * Path to the Software model
	 */
	private String pathSWModel;
	/**
	 * Path to the Hardware model
	 */
	private String pathHWModel;

	/**
	 * Constructor for MulticoreWizard.
	 */
	public PerformMappingJobHandler(final IPreferenceStore OMstore) {
		this.OMstore = OMstore;
		this.store = DialogsPlugin.getDefaultPreferenceStore();
	}

	/**
	 * Schedule the Job
	 *
	 * @return true if no errors occur and false otherwise
	 */
	public boolean scheduleJob(final ExecutionEvent event) {

		// Init Handler
		UniversalHandler.getInstance().setPluginId(OpenMappingPlugin.getPluginId());
		UniversalHandler.getInstance().setLog(OpenMappingPlugin.getDefault().getLog());
		UniversalHandler.getInstance().clearModelCheckerView();
		// Model paths

		// Preference: Enable Verbose Output (Output to console)
		if (this.OMstore.getBoolean(IOMConstants.PRE_CHECK_LOGCON)) {
			UniversalHandler.getInstance().enableVerboseOutput();
		}

		// Create Mapping Algorithm
		final AbstractMappingAlgorithm mappingAlgorithm = AbstractMappingAlgorithm.of(this.OMstore);

		UniversalHandler.getInstance().dropCache();

		// Create GUI for user input
		this.pathSWModel = this.store.getString(IDialogsConstants.PRE_SW_MODEL_LOCATION);
		this.pathHWModel = this.store.getString(IDialogsConstants.PRE_HW_MODEL_LOCATION);

		final URI uriSwModel = URI.createFileURI(this.pathSWModel);
		final URI uriHwModel = URI.createFileURI(this.pathHWModel);

		// Check the SW Input model
		ModelDescription modelChecker = OMModelDescriptionBuilder.ofMappingSWInput(null);
		boolean modelOk = modelChecker.checkModel(uriSwModel);


		if (!modelOk) {
			modelChecker.logToView();
			modelChecker.openMessageBox();
			return false;
		}

		// Check the HW Input model
		modelChecker = OMModelDescriptionBuilder.ofMappingHWInput(null).concatLog(modelChecker);
		modelOk = modelChecker.checkModel(uriHwModel);


		if (!modelOk) {
			modelChecker.logToView();
			modelChecker.openMessageBox();
			return false;
		}

		modelChecker.logToView();
		modelChecker.openMessageBox();

		final OutputPathParser outputParser = new OutputPathParser(IOMConstants.PRE_RADIO_OUTDIR,
				IOMConstants.PRE_STRING_OUTDIR, this.OMstore);


		// Create Job for reading/solving/writing models
		final PerformMappingJob job = new PerformMappingJob(mappingAlgorithm, uriSwModel, null, uriHwModel,
				outputParser.parseOutputFileURI(getSelectedFile(), "_mapping"));

		job.schedule();

		return true;
	}

	/**
	 * Get the selected file from path
	 *
	 * @return selected file
	 *
	 */
	private IFile getSelectedFile() {
		final IPath ResourcePath = new Path(this.pathSWModel);
		if (!ResourcePath.isAbsolute()) {
			return null;
		}

		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IFile ifile = workspace.getRoot().getFileForLocation(ResourcePath);

		return ifile;
	}


}
