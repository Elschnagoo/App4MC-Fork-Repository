package org.eclipse.app4mc.multicore.partitioning.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PrePartitioning;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.core.runtime.NullProgressMonitor;

public class PrePartitioningWrkflw extends WorkflowComponent {
	private final String resultSlot = "prePartitioning";
	private boolean aa = false;
	private boolean ggp = false;
	private boolean effEdge = false;
	private boolean minimEdge = false;

	@Override
	protected void runInternal(final Context ctx) {
		Amalthea amodels = getAmaltheaModelCopy(ctx);

		PartLog.getInstance().setEnableTargetConsoleLog(true);
		PartLog.getInstance().setLogName("PrePartWorkflow");

		final PrePartitioning prePart = new PrePartitioning(isAa(), isGgp(), isMinimEdge(), isEffEdge());
		amodels = prePart.performPrePartitioning(amodels, new NullProgressMonitor());

		if (amodels == null) {
			PartLog.getInstance().log("Prepartitioning failed", null);
			return;
		}
		PartLog.getInstance().log("Setting result model in slot: " + getResultSlot());
		ctx.set(getResultSlot(), amodels);
	}

	public String getResultSlot() {
		return this.resultSlot;
	}

	public boolean isAa() {
		return this.aa;
	}

	public boolean isGgp() {
		return this.ggp;
	}

	public boolean isEffEdge() {
		return this.effEdge;
	}

	public boolean isMinimEdge() {
		return this.minimEdge;
	}


	public void setAa(final boolean aa) {
		this.aa = aa;
	}


	public void setGgp(final boolean ggp) {
		this.ggp = ggp;
	}


	public void setEffEdge(final boolean effEdge) {
		this.effEdge = effEdge;
	}


	public void setMinimEdge(final boolean minimEdge) {
		this.minimEdge = minimEdge;
	}
}
