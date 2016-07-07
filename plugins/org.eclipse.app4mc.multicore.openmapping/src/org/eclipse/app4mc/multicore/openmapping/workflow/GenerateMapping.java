/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.multicore.openmapping.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ga.lb.GABasedLoadBalancing;
import org.eclipse.app4mc.multicore.openmapping.algorithms.heuristic.lb.LoadBalancingDFG;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization.EnergyMinimization;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.lb.ILPBasedLoadBalancing;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;

/**
 *
 *
 */
public class GenerateMapping extends WorkflowComponent {
	private static final String MAPPING_DFG = "dfg";
	private static final String MAPPING_ILP_LB = "ilp_lb";
	private static final String MAPPING_ILP_ENERGY = "ilp_energy";
	private static final String MAPPING_GA_LB = "ga_lb";

	private String resultSlot = "mapping";

	private String mappingAlg;

	private boolean enableLog = false;

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext,
	 *      org.eclipse.emf.mwe.core.monitor.ProgressMonitor, org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void runInternal(Context ctx) {
		assert null != getAmaltheaModel(ctx).getHwModel() && null != getAmaltheaModel(ctx).getSwModel();
		if (isEnableLog()) {
			UniversalHandler.getInstance().enableVerboseOutput();
		}
		AbstractMappingAlgorithm mappingAlg = null;
		if (getMappingAlg().equals(MAPPING_DFG)) {
			this.log.info("Using DFG Algorithm...");
			mappingAlg = new LoadBalancingDFG();
		}
		else if (getMappingAlg().equals(MAPPING_ILP_LB)) {
			this.log.info("Using ILP Load Balancing Algorithm...");
			mappingAlg = new ILPBasedLoadBalancing();
		}
		else if (getMappingAlg().equals(MAPPING_ILP_ENERGY)) {
			this.log.info("Using ILP Energy Minimization Algorithm...");
			mappingAlg = new EnergyMinimization();
		}
		else if (getMappingAlg().equals(MAPPING_GA_LB)) {
			this.log.info("Using GA Load Balancing Algorithm...");
			mappingAlg = new GABasedLoadBalancing();
		}
		final Amalthea modelCopy = getAmaltheaModelCopy(ctx);
		if (null != modelCopy.getConstraintsModel()) {
			mappingAlg.setConnstraintsModel(modelCopy.getConstraintsModel());
		}
		mappingAlg.setHwModel(modelCopy.getHwModel());
		mappingAlg.setSwModel(modelCopy.getSwModel());
		mappingAlg.calculateMapping();
		assert null != mappingAlg.getOsModel() && null != mappingAlg.getMappingModel();
		modelCopy.setOsModel(mappingAlg.getOsModel());
		modelCopy.setMappingModel(mappingAlg.getMappingModel());
		this.log.info("Setting result model in slot: " + getResultSlot());
		ctx.set(getResultSlot(), modelCopy);
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void checkInternal() throws ConfigurationException {
		if (null == getMappingAlg() || getMappingAlg().isEmpty()
				|| ((!getMappingAlg().equals(MAPPING_DFG) && !getMappingAlg().equals(MAPPING_ILP_LB)
						&& !getMappingAlg().equals(MAPPING_ILP_ENERGY) && !getMappingAlg().equals(MAPPING_GA_LB)))) {
			throw new ConfigurationException(
					"No proper mapping algorithm defined! Please define one of the following values: dfg,ilp_lb,ilp_energy,ga_lb");
		}
	}

	/**
	 * @return the resultSlot
	 */
	public String getResultSlot() {
		return this.resultSlot;
	}

	/**
	 * @param resultSlot
	 *            the resultSlot to set
	 */
	public void setResultSlot(final String resultSlot) {
		this.resultSlot = resultSlot;
	}

	/**
	 * @return the mappingAlg
	 */
	public String getMappingAlg() {
		return this.mappingAlg;
	}

	/**
	 * @param mappingAlg
	 *            the mappingAlg to set
	 */
	public void setMappingAlg(final String mappingAlg) {
		this.mappingAlg = mappingAlg;
	}

	/**
	 * @return the enableLog
	 */
	public boolean isEnableLog() {
		return this.enableLog;
	}

	/**
	 * @param enableLog
	 *            the enableLog to set
	 */
	public void setEnableLog(final boolean enableLog) {
		this.enableLog = enableLog;
	}

}
