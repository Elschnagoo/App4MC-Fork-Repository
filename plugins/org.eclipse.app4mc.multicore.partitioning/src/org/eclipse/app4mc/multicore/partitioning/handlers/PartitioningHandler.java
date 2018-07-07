/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.partitioning.handlers;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PartitioningJob;
import org.eclipse.app4mc.multicore.partitioning.specs.PartitioningModelDescriptionBuilder;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.app4mc.multicore.sharelibs.SelectionUtil;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelDescription;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * The Prepartitioning performs activation aggregation, independent graph
 * aggregation and cycle elimination
 *
 */
public class PartitioningHandler extends org.eclipse.core.commands.AbstractHandler {

	private IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();

	public PartitioningHandler() {
		this.store = PartitioningPlugin.getDefault().getPreferenceStore();
	}

	public PartitioningHandler(final IPreferenceStore store) {
		this.store = store;
	}

	public IPreferenceStore getPreferenceStore() {
		return this.store;
	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final UniversalHandler uh = UniversalHandler.getInstance();
		PartLog.getInstance().setLogName("PrePartitioning");

		// Clear the Model Checker view
		uh.clearModelCheckerView();

		PartLog.getInstance().setEnableTargetConsoleLog(this.store.getBoolean(IParConstants.PRE_DEBUG));

		final IFile file = SelectionUtil.getSelectedFile(event);
		uh.dropCache();

		final URI uriSwModel = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

		uh.readModels(uriSwModel, true);
		Amalthea amodels = AmaltheaFactory.eINSTANCE.createAmalthea();
		amodels = new Helper().setAllModels(amodels, uh);

		final ModelDescription modelChecker = PartitioningModelDescriptionBuilder.ofInput(null);
		final boolean modelOk = modelChecker.checkModel(uriSwModel);

		if (!modelOk) {
			modelChecker.logToView();
			modelChecker.openMessageBox();
			return null;
		}

		final PartitioningJob part = new PartitioningJob("Partitioning", amodels, this.store, file);
		part.schedule();

		try {
			part.join();
		}
		catch (final InterruptedException e) {
			e.printStackTrace();
		}

		modelChecker.logToView();
		modelChecker.openMessageBox();
		return null;
	}
}
