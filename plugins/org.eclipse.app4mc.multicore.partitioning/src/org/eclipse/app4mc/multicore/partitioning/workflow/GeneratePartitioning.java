/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PerformPartitioning;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;

public class GeneratePartitioning extends WorkflowComponent {

	public static final String PARTITIONING_CPP = "cpp";
	public static final String PARTITIONING_ESSP = "essp";
	private final String resultSlot = "partitioning";
	private String partitioningAlg;
	private String numberOfPartitions;
	private String modelLoc = "";


	public void setModelLoc(final String modelLoc) {
		this.modelLoc = modelLoc;
	}

	private final boolean enableLog = false;

	@Override
	protected void runInternal(final Context ctx) {

		final NullProgressMonitor monitor = new NullProgressMonitor();
		Amalthea modelCopy = getAmaltheaModelCopy(ctx);
		assert null != modelCopy.getSwModel() && null != modelCopy.getConstraintsModel();
		if (isEnableLog()) {
			PartLog.getInstance().setEnableSourceConsoleLog(true);
		}

		final Path path = new Path(this.modelLoc);
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		final PerformPartitioning partitioning = new PerformPartitioning();
		final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
		store.setValue(IParConstants.PRE_PARTITIONING_ALG, getPartitioningAlg());
		store.setValue(IParConstants.PRE_INT, this.numberOfPartitions);
		partitioning.execute(file, monitor, store);

		modelCopy = partitioning.retainAffntyCnstrnts(file, modelCopy, monitor);

		PartLog.getInstance().log("Setting result model in slot: " + getResultSlot());
		ctx.set(getResultSlot(), modelCopy);
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

}
