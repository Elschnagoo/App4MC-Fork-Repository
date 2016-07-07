package org.eclipse.app4mc.multicore.partitioning.algorithms;

import org.eclipse.app4mc.amalthea.model.Amalthea;
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
			new Helper().writeModelFile(this.file, "_PrePartitioned", this.models);
		}

		monitor.subTask("Graph Partitioning...");
		if (this.store.getBoolean("boolCPP") == true || Integer.parseInt(this.store.getString("intThreads")) > 1) {
			new PerformPartitioning().execute(this.file, monitor);
		}
		monitor.worked(1);

		return Status.OK_STATUS;
	}

}
