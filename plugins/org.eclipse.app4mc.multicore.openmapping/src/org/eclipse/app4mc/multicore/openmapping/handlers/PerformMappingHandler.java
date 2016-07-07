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

import org.eclipse.app4mc.multicore.openmapping.IOpenMappingConstants;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractILPBasedMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ga.lb.GABasedLoadBalancing;
import org.eclipse.app4mc.multicore.openmapping.algorithms.heuristic.lb.LoadBalancingDFG;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization.EnergyMinimization;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.lb.ILPBasedLoadBalancing;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class PerformMappingHandler extends AbstractHandler {
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		// Init Handler
		UniversalHandler.getInstance().setPluginId(OpenMappingPlugin.getPluginId());
		UniversalHandler.getInstance().setLog(OpenMappingPlugin.getDefault().getLog());
		// Get context of selection and specify paths
		final IFile file = UniversalHandler.getInstance().getSelectedFile(event);
		final URI projectFolder = UniversalHandler.getInstance().getProjectDir(event);
		// Model paths
		// final URI pathOsModel;
		// final URI pathMmModel;
		String projectName = "";
		String pathSWModel = "";
		String pathHWModel = "";
		final URI path;
		// final String pathPCModel = "";

		// Read and set preferences
		// Get preference store and apply settings
		final IPreferenceStore store = OpenMappingPlugin.getDefault().getPreferenceStore();
		// Preference: Enable Verbose Output (Output to console)
		if (store.getBoolean(IOpenMappingConstants.PRE_CHECK_LOGCON)) {
			UniversalHandler.getInstance().enableVerboseOutput();
		}

		// Preference: Output directory (radio)
		final int radioOutputDirectory = store.getInt(IOpenMappingConstants.PRE_RADIO_OUTDIR);
		final String sOutputDirectory = store.getString(IOpenMappingConstants.PRE_STRING_OUTDIR);

		// Preference: Mapping Algorithm
		final int radioAlgorithmChoice = store.getInt(IOpenMappingConstants.PRE_RADIO_ALG);
		final AbstractMappingAlgorithm mappingAlgorithm;
		switch (radioAlgorithmChoice) {
		case 0: // Load Balancing DFG
			mappingAlgorithm = new LoadBalancingDFG();
			break;
		case 1: // Load Balancing ILP
			mappingAlgorithm = new ILPBasedLoadBalancing();
			break;
		case 2: // Energy minimization
			mappingAlgorithm = new EnergyMinimization();
			break;
		case 3: // GA Load Balancing
			mappingAlgorithm = new GABasedLoadBalancing();
			break;
		default:
			return null;
		}

		UniversalHandler.getInstance().dropCache();

		// Create GUI for user input
		try {
			// Fetch workbench window context
			final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			// Initialize dialog
			final PerformMappingGUI dialog = new PerformMappingGUI(window.getShell());
			// Name the project after the SW model file (proposition)
			final String f = file.getName();
			dialog.setProjectName(f.substring(0, f.lastIndexOf('.')));
			// Set the Software Model (fixed) and output directory (proposition)
			dialog.setInitSWModel(file.getRawLocation().toOSString());
			dialog.setWorkingDirectory(projectFolder.devicePath());
			dialog.create();
			if (dialog.open() == Window.OK) {
				projectName = dialog.getNameOfCompilation();
				pathSWModel = dialog.getPathToSWModel();
				pathHWModel = dialog.getPathToHWModel();
			}
			else {
				return null;
			}
		}
		catch (final ExecutionException e) {
			e.printStackTrace();
			return null;
		}

		if (radioOutputDirectory == 0 || sOutputDirectory == null || sOutputDirectory.isEmpty()) {
			final String outputLocation = file.getProject().getFullPath().toString() + "/output/";
			path = URI.createPlatformResourceURI(outputLocation + projectName + "_out.amxmi", true);
			// pathOsModel = URI.createPlatformResourceURI(outputLocation + projectName + ".amxmi-os", true);
			// pathMmModel = URI.createPlatformResourceURI(outputLocation + projectName + ".amxmi-mapping", true);
		}
		else if (radioOutputDirectory == 1) {
			final String outputLocation = file.getProject().getFullPath().toString() + "/" + sOutputDirectory;
			path = URI.createPlatformResourceURI(outputLocation + "/" + projectName + "_out.amxmi", true);
			// pathOsModel = URI.createPlatformResourceURI(outputLocation + "/" + projectName + ".amxmi-os", true);
			// pathMmModel = URI.createPlatformResourceURI(outputLocation + "/" + projectName + ".amxmi-mapping", true);
		}
		else {
			path = URI.createPlatformResourceURI(sOutputDirectory + "/" + projectName + "_out.amxmi", true);
			// pathOsModel = URI.createFileURI(sOutputDirectory + "/" + projectName + ".amxmi-os");
			// pathMmModel = URI.createFileURI(sOutputDirectory + "/" + projectName + ".amxmi-mapping");
		}

		// Apply settings for mapping algorithm
		if (mappingAlgorithm instanceof AbstractILPBasedMappingAlgorithm) {
			int iMaxItAbort, iMaxItSuffice, iMaxTimeAbort, iMaxTimeSuffice;
			final double fMaxGap;

			if ((iMaxItAbort = store.getInt(IOpenMappingConstants.PRE_MAX_IT_ABORT)) == 0) {
				iMaxItAbort = Integer.MAX_VALUE;
			}
			if ((iMaxTimeAbort = store.getInt(IOpenMappingConstants.PRE_MAX_TIME_ABORT)) == 0) {
				iMaxTimeAbort = Integer.MAX_VALUE;
			}
			if ((iMaxItSuffice = store.getInt(IOpenMappingConstants.PRE_MAX_IT_SUFFICE)) == 0) {
				iMaxItSuffice = Integer.MAX_VALUE;
			}
			if ((iMaxTimeSuffice = store.getInt(IOpenMappingConstants.PRE_MAX_TIME_SUFFICE)) == 0) {
				iMaxTimeSuffice = Integer.MAX_VALUE;
			}
			fMaxGap = store.getDouble(IOpenMappingConstants.PRE_MAX_GAP);

			((AbstractILPBasedMappingAlgorithm) mappingAlgorithm).setMaxGap(fMaxGap);
			((AbstractILPBasedMappingAlgorithm) mappingAlgorithm).setMaxIterationsAbort(iMaxItAbort);
			((AbstractILPBasedMappingAlgorithm) mappingAlgorithm).setMaxTimeAbort(iMaxTimeAbort);
			((AbstractILPBasedMappingAlgorithm) mappingAlgorithm).setMaxIterationsSuffice(iMaxItSuffice);
			((AbstractILPBasedMappingAlgorithm) mappingAlgorithm).setMaxTimeSuffice(iMaxTimeSuffice);
		}

		// Create Job for reading/solving/writing models
		// final PerformMappingJob job = new PerformMappingJob(mappingAlgorithm, URI.createFileURI(pathSWModel), null,
		// URI.createFileURI(pathHWModel), pathOsModel, pathMmModel);
		final PerformMappingJob job = new PerformMappingJob(mappingAlgorithm, URI.createFileURI(pathSWModel), null,
				URI.createFileURI(pathHWModel), path);

		job.schedule();

		return null;
	}
}
