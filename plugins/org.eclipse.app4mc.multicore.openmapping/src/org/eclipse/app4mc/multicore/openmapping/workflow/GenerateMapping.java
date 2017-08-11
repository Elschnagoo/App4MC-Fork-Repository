/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.ConfigurationException;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.OMPreferenceInitializer;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;

/**
 *
 *
 */
public class GenerateMapping extends WorkflowComponent {
	public static final String MAPPING_DFG = "dfg";
	public static final String MAPPING_ILP_LB = "ilp_lb";
	public static final String MAPPING_ILP_ENERGY = "ilp_energy";
	public static final String MAPPING_GA_LB = "ga_lb";
	public static final String MAPPING_GA_CONSTRAINTS = "ga_constraints";

	private String resultSlot = "mapping";

	private IPreferenceStore store = new PreferenceStore();
	
	public GenerateMapping() {
		// Init store with default values of OMPlugin
		OMPreferenceInitializer init = new OMPreferenceInitializer(store);
		init.initializeDefaultPreferences();
	}

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
		
		// Using default values for Solver Settings
		AbstractMappingAlgorithm mappingAlg = AbstractMappingAlgorithm.of(store);
		
		final Amalthea modelCopy = getAmaltheaModelCopy(ctx);
//		if (null != modelCopy.getConstraintsModel()) {
//			mappingAlg.setConnstraintsModel(modelCopy.getConstraintsModel());
//		}
//		mappingAlg.setHwModel(modelCopy.getHwModel());
//		mappingAlg.setSwModel(modelCopy.getSwModel());
		mappingAlg.setAmaltheaMergedModel(modelCopy);
		mappingAlg.calculateMapping();
		assert null != mappingAlg.getAmaltheaOutputModel().getOsModel() && null != mappingAlg.getAmaltheaOutputModel().getMappingModel();
//		modelCopy.setOsModel(mappingAlg.getOsModel());
//		modelCopy.setMappingModel(mappingAlg.getMappingModel());
		this.log.info("Setting result model in slot: " + getResultSlot());
		ctx.set(getResultSlot(), mappingAlg.getAmaltheaOutputModel());
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void checkInternal() throws ConfigurationException {
		if (null == getMappingAlg() || getMappingAlg().isEmpty()
				|| ((!getMappingAlg().equals(MAPPING_DFG) && !getMappingAlg().equals(MAPPING_ILP_LB)
						&& !getMappingAlg().equals(MAPPING_ILP_ENERGY) && !getMappingAlg().equals(MAPPING_GA_LB) && !getMappingAlg().equals(MAPPING_GA_CONSTRAINTS)))) {
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
		String mapAlg = store.getString(IOMConstants.PRE_MAPPING_ALG);
		
		return mapAlgPreferenceToWorkflow(mapAlg);
	}

	/**
	 * @param mappingAlg
	 *            the mappingAlg to set
	 */
	public void setMappingAlg(final String mappingAlg) {
		store.setValue(IOMConstants.PRE_MAPPING_ALG, mapAlgWorkflowToPreference(mappingAlg));
		
	}

	/**
	 * @return the enableLog
	 */
	public boolean isEnableLog() {
		return store.getBoolean(IOMConstants.PRE_CHECK_LOGCON);
	}

	/**
	 * @param enableLog
	 *            the enableLog to set
	 */
	public void setEnableLog(final boolean enableLog) {
		store.setValue(IOMConstants.PRE_CHECK_LOGCON, enableLog);
	}
	
	public void setStore(IPreferenceStore store) {
		this.store = store;
		
	}

	public static String mapAlgWorkflowToPreference(String workFlowMean) {
		String mapAlg = "";
		
		switch (workFlowMean) {
		case MAPPING_DFG:
			mapAlg = AbstractMappingAlgorithm.LOAD_BALANCE_DFG;
			break;
		case MAPPING_ILP_LB:
			mapAlg = AbstractMappingAlgorithm.LOAD_BALANCE_ILP;
			break;
		case MAPPING_ILP_ENERGY:
			mapAlg = AbstractMappingAlgorithm.ENERGY_MIN_ILP;
			break;
		case MAPPING_GA_LB:
			mapAlg = AbstractMappingAlgorithm.LOAD_BALANCE_GA;
			break;
		case MAPPING_GA_CONSTRAINTS:
			mapAlg = AbstractMappingAlgorithm.LOAD_BALANCE_CONSTRAINTS_GA;
			break;
		default:
			mapAlg = AbstractMappingAlgorithm.LOAD_BALANCE_ILP;
			break;
		}
		
		return mapAlg;
		
	}
	
	public static String mapAlgPreferenceToWorkflow(String preferenceMean) {
		String mapAlg = "";

		switch (preferenceMean) {
		case AbstractMappingAlgorithm.ENERGY_MIN_ILP:
			mapAlg = GenerateMapping.MAPPING_ILP_ENERGY;
			break;
		case AbstractMappingAlgorithm.LOAD_BALANCE_CONSTRAINTS_GA:
			mapAlg = GenerateMapping.MAPPING_GA_CONSTRAINTS;
			break;
		case AbstractMappingAlgorithm.LOAD_BALANCE_DFG:
			mapAlg = GenerateMapping.MAPPING_DFG;
			break;
		case AbstractMappingAlgorithm.LOAD_BALANCE_GA:
			mapAlg = GenerateMapping.MAPPING_GA_LB;
			break;
		case AbstractMappingAlgorithm.LOAD_BALANCE_ILP:
			mapAlg = GenerateMapping.MAPPING_ILP_LB;
			break;
		default:
			mapAlg = GenerateMapping.MAPPING_ILP_LB;
			break;
		}

		return mapAlg;
	}

}
