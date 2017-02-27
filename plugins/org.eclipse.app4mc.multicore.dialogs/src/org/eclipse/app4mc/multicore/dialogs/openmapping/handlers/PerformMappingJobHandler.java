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
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.ExecutionEvent;
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

		final OutputPathParser outputParser = new OutputPathParser(IOMConstants.PRE_RADIO_OUTDIR,
				IOMConstants.PRE_STRING_OUTDIR, this.OMstore);

		// Create Job for reading/solving/writing models
		final PerformMappingJob job = new PerformMappingJob(mappingAlgorithm, URI.createFileURI(this.pathSWModel), null,
				URI.createFileURI(this.pathHWModel),
				outputParser.parseOutputFileURI(UniversalHandler.getInstance().getSelectedFile(event), "_mapping"));

		job.schedule();

		return true;
	}

}
