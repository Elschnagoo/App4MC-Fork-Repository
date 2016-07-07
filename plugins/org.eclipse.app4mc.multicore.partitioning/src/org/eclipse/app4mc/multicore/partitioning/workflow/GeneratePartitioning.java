/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.app4mc.multicore.partitioning.algorithms.CPP;
import org.eclipse.app4mc.multicore.partitioning.algorithms.ESSP;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PartLog;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PerformPartitioning;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

public class GeneratePartitioning extends WorkflowComponent {

	private static final String PARTITIONING_CPP = "cpp";
	private static final String PARTITIONING_ESSP = "essp";
	private final String resultSlot = "partitioning";
	private String partitioningAlg;
	private String numberOfPartitions;
	private boolean globalCP = true;
	private String modelLoc = "";


	public void setModelLoc(final String modelLoc) {
		this.modelLoc = modelLoc;
	}

	public void setglobalCP(final boolean GlobalCP) {
		this.globalCP = GlobalCP;
	}

	private final boolean enableLog = false;

	@Override
	protected void runInternal(final Context ctx) {

		// new PerformPartitioning().execute(getFileFromctx(ctx), new
		// NullProgressMonitor());

		final NullProgressMonitor monitor = new NullProgressMonitor();
		PartLog.getInstance().log("Starting Partitioning...");
		Amalthea modelCopy = getAmaltheaModelCopy(ctx);
		assert null != modelCopy.getSwModel() && null != modelCopy.getConstraintsModel();
		if (isEnableLog()) {
			PartLog.getInstance().setEnableSourceConsoleLog(true);
		}
		if (modelCopy.getSwModel().getProcessPrototypes().size() == 0) {
			modelCopy.setSwModel(createPPs(modelCopy.getSwModel()));
		}

		// modelCopy = new PerformPartitioning().execute(null, monitor);


		if (this.partitioningAlg.equals(PARTITIONING_ESSP)) {
			PartLog.getInstance().setLogName("ESS Partitioning");
			PartLog.getInstance().log("Starting ESS Partitioning");

			if (this.numberOfPartitions == null || Integer.parseInt(this.numberOfPartitions) < 1) {
				PartLog.getInstance().log("Number of Partitions required for ESS Partitioning! (>0)", null);
				return;
			}
			final int inumberOfPartitions = Integer.parseInt(this.numberOfPartitions);
			assert 1 < inumberOfPartitions;
			final ESSP essp = new ESSP(modelCopy.getSwModel(), modelCopy.getConstraintsModel(), inumberOfPartitions);
			essp.build(monitor);
			if (essp.swm.getRunnables().size() < 1 || essp.cm.getRunnableSequencingConstraints().size() < 1) {
				PartLog.getInstance().log(
						"ESS Partitioning did not work correctly. No Runnables / Sequencing Constraints available!!",
						null);
				return;
			}
			if (essp.swm.getProcessPrototypes().size() < Integer.parseInt(this.numberOfPartitions)) {
				PartLog.getInstance()
						.log("ESSP could not generate " + Integer.parseInt(this.numberOfPartitions)
								+ " partitions since the softwaremodel's graph does not feature enough parallel runnables. "
								+ essp.swm.getProcessPrototypes().size() + " partitions could be generated.");
			}
			modelCopy.setConstraintsModel(essp.cm);
			modelCopy.setSwModel(essp.swm);
		}
		else if (this.partitioningAlg.equals(PARTITIONING_CPP)) {
			PartLog.getInstance().setLogName("CP Partitioning");
			PartLog.getInstance()
					.log("Starting CP Partitioning. Runnables: " + modelCopy.getSwModel().getRunnables().size()
							+ "; RSCs: " + modelCopy.getConstraintsModel().getRunnableSequencingConstraints().size());
			final CPP cpp = new CPP(modelCopy.getSwModel(), modelCopy.getConstraintsModel());
			cpp.bglobalCP = this.globalCP;
			cpp.build(monitor);
			if (cpp.swm.getRunnables().size() < 1 || cpp.cm.getRunnableSequencingConstraints().size() < 1) {
				PartLog.getInstance()
						.log("CP Partitioning did not work correctly. No Runnables / Sequencing Constraints available!! RSCs: "
								+ cpp.cm.getRunnableSequencingConstraints().size(), null);
				return;
			}
			// assert null != cpp.cm && null != cpp.swm;
			modelCopy.setConstraintsModel(cpp.cm);
			modelCopy.setSwModel(cpp.swm);
		}

		final UniversalHandler uh = UniversalHandler.getInstance();
		// final File file = new File(this.modelLoc);
		// final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		// final IPath location = Path.fromOSString(this.modelLoc);
		// final IFile ifile = workspace.getRoot().getFileForLocation(location);
		final Path path = new Path(this.modelLoc);
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		PartLog.getInstance().log(file.getFullPath().toString());

		modelCopy = new PerformPartitioning().retainAffntyCnstrnts(file, uh, modelCopy, monitor);

		PartLog.getInstance().log("Setting result model in slot: " + getResultSlot());
		ctx.set(getResultSlot(), modelCopy);
		PartLog.getInstance().logSimple(this.partitioningAlg + " Partitioning finished.");

	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void checkInternal() throws ConfigurationException {
		if (null == getPartitioningAlg() || getPartitioningAlg().isEmpty()) {
			throw new ConfigurationException(
					"No proper partitioning defined! Please define one of the following values: numberOfPartitions, globalCP, partitioningAlg");
		}
	}


	public String getPartitioningAlg() {
		return this.partitioningAlg;
	}

	public void setPartitioningAlg(final String partitioningAlg) {
		this.partitioningAlg = partitioningAlg;
	}

	public String getResultSlot() {
		return this.resultSlot;
	}

	public boolean isEnableLog() {
		return this.enableLog;
	}

	public String getNumberOfPartitions() {
		return this.numberOfPartitions;
	}

	public void setNumberOfPartitions(final String numberOfPartitions) {
		this.numberOfPartitions = numberOfPartitions;
	}

	private SWModel createPPs(final SWModel swm) {
		final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
		final ProcessPrototype pp = swf.createProcessPrototype();
		pp.setActivation(swm.getRunnables().get(0).getActivation());
		pp.setName("PPTemp");
		for (final Runnable r : swm.getRunnables()) {
			final TaskRunnableCall trc = swf.createTaskRunnableCall();
			trc.setRunnable(r);
			pp.getRunnableCalls().add(trc);
		}
		swm.getProcessPrototypes().add(pp);
		return swm;
	}
}
