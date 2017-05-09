/*******************************************************************************
 * Copyright (c) 2016 FH-Dortmund and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     FH-Dortmund - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.handlers;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PartitioningJob;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;

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

		PartLog.getInstance().setEnableTargetConsoleLog(this.store.getBoolean(IParConstants.PRE_DEBUG));

		final IFile file = UniversalHandler.getInstance().getSelectedFile(event);
		uh.dropCache();
		uh.readModels(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
		Amalthea amodels = AmaltheaFactory.eINSTANCE.createAmalthea();
		amodels = new Helper().setAllModels(amodels, uh);

		final PartitioningJob part = new PartitioningJob("Partitioning", amodels, this.store, file);
		part.schedule();

		try {
			part.join();
		}
		catch (final InterruptedException e) {
			e.printStackTrace();
		}
		if (part.getResult().equals(Status.OK_STATUS)) {
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Partitioning",
					"Partitioning successful");
		}
		else {
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Partitioning",
					"Partitioning failed. Please see console / error log for details.");
		}
		return null;
	}
}
