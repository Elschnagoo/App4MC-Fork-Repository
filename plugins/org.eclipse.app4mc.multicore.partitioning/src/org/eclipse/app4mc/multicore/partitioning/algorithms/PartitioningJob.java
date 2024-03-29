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

package org.eclipse.app4mc.multicore.partitioning.algorithms;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.IPreferenceStore;

public class PartitioningJob extends Job {

	private final IPreferenceStore store;
	Amalthea models;
	private final IFile file;

	public PartitioningJob(final String name, final Amalthea amalthea, final IPreferenceStore store, final IFile file) {
		super(name);
		this.models = amalthea;
		this.store = store;
		this.file = file;
	}


	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		
		final PrePartitioning prepart = new PrePartitioning(this.store);
		assert this.models != null;
		monitor.beginTask("Partitioning", 2);
		monitor.subTask("Prepartitioning...");
		this.models = prepart.performPrePartitioning(this.models, monitor);
		monitor.worked(1);
		if (this.models == null) {
			PartLog.getInstance().log("Prepartitioning aborted", null);
			return null;
		}
		if (!this.file.getName().endsWith("_PrePartitioned.amxmi")) {
			OutputPathParser parser = new OutputPathParser(IParConstants.PRE_LOC_RADIO,
					IParConstants.PRE_LOC_STRING,
					store);
			Helper.writeModelFile(this.file, parser.parseOutputFileURI(file, "_PrePartitioned"), this.models);
		}

		monitor.subTask("Graph Partitioning...");
		if (this.store.getString(IParConstants.PRE_PARTITIONING_ALG).equals(PerformPartitioning.PART_CPP) || Integer.parseInt(this.store.getString(IParConstants.PRE_INT)) > 1) {
			new PerformPartitioning().execute(this.file, monitor, store);
		}
		monitor.worked(1);

		return Status.OK_STATUS;
	}

}
