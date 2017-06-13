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

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic.PragmaticTaskGenerator;
import org.eclipse.app4mc.multicore.openmapping.model.description.OMModelDescriptionBuilder;
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.app4mc.multicore.sharelibs.SelectionUtil;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelDescription;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.ModelSpecLogger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;

public class CreateTasks extends AbstractHandler {

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		UniversalHandler.getInstance().setPluginId(OpenMappingPlugin.getPluginId());
		UniversalHandler.getInstance().setLog(OpenMappingPlugin.getDefault().getLog());

		final ModelSpecLogger logger = ModelSpecLogger.of();

		// Clear model checker view
		UniversalHandler.getInstance().clearModelCheckerView();

		final IStructuredSelection selection = SelectionUtil.getSelection(event);

		// Get preference store and apply settings
		final IPreferenceStore store = OpenMappingPlugin.getDefault().getPreferenceStore();

		// Preference: Enable Verbose Output (Output to console)
		if (store.getBoolean(IOMConstants.PRE_CHECK_LOGCON)) {
			UniversalHandler.getInstance().enableVerboseOutput();
		}

		Amalthea centralModel;


		// final IFile swModelFile =
		// UniversalHandler.getInstance().getSelectedFile(event);

		if (!(selection.getFirstElement() instanceof IFile)) {
			return null;
		}

		final IFile swModelFile = (IFile) selection.getFirstElement();

		final URI uri = URI.createPlatformResourceURI(swModelFile.getFullPath().toOSString(), true);

		// Create the input model checker
		final ModelDescription inputModelChecker = OMModelDescriptionBuilder.ofTaskCreationInput(null)
				.setLogger(logger);

		// Check the input model
		boolean modelOk = inputModelChecker.checkModel(uri);

		if (!modelOk) {
			// Log to the view
			logger.logToView();

			logger.openMessageBox();
			return null;
		}

		// Read the model
		UniversalHandler.getInstance().dropCache();
		UniversalHandler.getInstance().readModels(uri, true);

		centralModel = UniversalHandler.getInstance().getCentralModel();

		final PragmaticTaskGenerator createTaskAlgorithm = new PragmaticTaskGenerator();
		createTaskAlgorithm.setAmaltheaModel(centralModel);
		createTaskAlgorithm.createTasks();

		final Amalthea outModel = createTaskAlgorithm.getAmaltheaOutputModel();

		// Create the output model checker
		final ModelDescription outputModelChecker = OMModelDescriptionBuilder.ofTaskCreationOutput(outModel)
				.setLogger(logger);

		// Check the output model
		modelOk = outputModelChecker.checkModel("<Internal> Task Creation Output Model", outModel);

		if (!modelOk) {
			// Log to the view
			logger.logToView();
			logger.openMessageBox();
			return null;
		}

		final OutputPathParser outputParser = new OutputPathParser(IOMConstants.PRE_RADIO_OUTDIR,
				IOMConstants.PRE_STRING_OUTDIR, store);

		UniversalHandler.getInstance().writeModel(outputParser.parseOutputFileURI(swModelFile, "_withTasks"), outModel);

		// Log to the view
		logger.logToView();
		logger.openMessageBox();

		return null;
	}
}
