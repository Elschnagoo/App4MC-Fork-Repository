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
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.openmapping.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaMerger;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ga.constraints.GABasedConstraints;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ga.lb.GABasedLoadBalancing;
import org.eclipse.app4mc.multicore.openmapping.algorithms.helper.ListBuilder;
import org.eclipse.app4mc.multicore.openmapping.algorithms.heuristic.lb.LoadBalancingDFG;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization.EnergyMinimization;
import org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.lb.ILPBasedLoadBalancing;
import org.eclipse.app4mc.multicore.openmapping.model.AmaltheaModelBuilder;
import org.eclipse.app4mc.multicore.openmapping.model.OMAllocation;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMMapping;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;
import org.eclipse.app4mc.multicore.openmapping.visualizer.OMVisualizer;
import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;
import org.eclipse.jface.preference.IPreferenceStore;

public abstract class AbstractMappingAlgorithm {
	/**
	 * Load balancing using DFG
	 */
	public final static String LOAD_BALANCE_DFG = "0";
	/**
	 * Load balancing ILP
	 */
	public final static String LOAD_BALANCE_ILP = "1";
	/**
	 * Energy minimization ILP
	 */
	public final static String ENERGY_MIN_ILP = "2";
	/**
	 * Load balancing using GA
	 */
	public final static String LOAD_BALANCE_GA = "3";
	/**
	 * Load balancing with allocation constraints using GA
	 */
	public final static String LOAD_BALANCE_CONSTRAINTS_GA = "4";
	/**
	 * Console Output
	 */
	protected final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");

	// models
	private Amalthea amaltheaSwModel;
	private Amalthea amaltheaHwModel;
	private Amalthea mergedModel;
	private Amalthea amaltheaOutputModel;
	private final Boolean hasConstraints = false;
	protected static IPreferenceStore store;

	abstract public void calculateMapping();


	public static AbstractMappingAlgorithm of(final IPreferenceStore store) {
		AbstractMappingAlgorithm mappingAlgorithm;

		AbstractMappingAlgorithm.store = store;

		final int mappingAlgorithmChoice = AbstractMappingAlgorithm.store.getInt(IOMConstants.PRE_MAPPING_ALG);

		switch (mappingAlgorithmChoice) {
			case 0: // Load Balancing DFG
				mappingAlgorithm = new LoadBalancingDFG();
				break;
			case 1: // Load Balancing ILP
				mappingAlgorithm = new ILPBasedLoadBalancing();
				break;
			case 2: // Energy minimization
				mappingAlgorithm = new EnergyMinimization();
				break;
			case 3: // GA Load Balancing
				mappingAlgorithm = new GABasedLoadBalancing();
				break;
			case 4: // GA constraints
				mappingAlgorithm = new GABasedConstraints();
				break;
			default:
				return null;
		}

		return mappingAlgorithm;
	}

	public boolean initModels() {
		if (null != this.mergedModel) {
			return true;
		}
		this.mergedModel = AmaltheaFactory.eINSTANCE.createAmalthea();
		if (null == this.amaltheaSwModel || null == this.amaltheaHwModel) {
			return false;
		}

		if (null != this.amaltheaSwModel.getCommonElements() && null != this.amaltheaHwModel.getCommonElements()) {
			final ArrayList<Amalthea> models = new ArrayList<Amalthea>();
			final Amalthea tmp1 = AmaltheaFactory.eINSTANCE.createAmalthea();
			tmp1.setCommonElements(this.amaltheaSwModel.getCommonElements());
			final Amalthea tmp2 = AmaltheaFactory.eINSTANCE.createAmalthea();
			tmp2.setCommonElements(this.amaltheaHwModel.getCommonElements());
			models.add(tmp1);
			models.add(tmp2);
			AmaltheaMerger.addElements(this.mergedModel, models);
		}
		else if (null != this.amaltheaSwModel.getCommonElements()) {
			this.mergedModel.setCommonElements(this.amaltheaSwModel.getCommonElements());
		}
		else if (null != this.amaltheaHwModel.getCommonElements()) {
			this.mergedModel.setCommonElements(this.amaltheaHwModel.getCommonElements());
		}

		this.mergedModel.setComponentsModel(this.amaltheaSwModel.getComponentsModel());
		this.mergedModel.setConfigModel(this.amaltheaSwModel.getConfigModel());
		this.mergedModel.setConstraintsModel(this.amaltheaSwModel.getConstraintsModel());
		this.mergedModel.setEventModel(this.amaltheaSwModel.getEventModel());
		this.mergedModel.setHwModel(this.amaltheaHwModel.getHwModel());
		this.mergedModel.setPropertyConstraintsModel(this.amaltheaSwModel.getPropertyConstraintsModel());
		this.mergedModel.setStimuliModel(this.amaltheaSwModel.getStimuliModel());
		this.mergedModel.setSwModel(this.amaltheaSwModel.getSwModel());

		return true;
	}

	// getter and setter methods
	public Amalthea getAmaltheaSwModel() {
		return this.amaltheaSwModel;
	}

	public Amalthea getAmaltheaHwModel() {
		return this.amaltheaHwModel;
	}

	public Amalthea getMergedModel() {
		return this.mergedModel;
	}

	public Amalthea getAmaltheaOutputModel() {
		return this.amaltheaOutputModel;
	}

	public void setAmaltheaSwModel(final Amalthea amaltheaSwModel) {
		this.amaltheaSwModel = amaltheaSwModel;
	}

	public void setAmaltheaHwModel(final Amalthea amaltheaHwModel) {
		this.amaltheaHwModel = amaltheaHwModel;
	}

	public void setAmaltheaMergedModel(final Amalthea modelCopy) {
		this.mergedModel = modelCopy;
	}

	public void setAmaltheaOutputModel(final Amalthea amaltheaOutputModel) {
		this.amaltheaOutputModel = amaltheaOutputModel;
	}

	public Boolean hasConstraints() {
		return this.hasConstraints;
	}

	public boolean mapToFirstCore() {
		this.con.appendln(" Just one core found in Hardware model, skipping algorithm run...");

		final List<OMTask> taskList = ListBuilder.getTaskList(getMergedModel().getSwModel());
		final List<OMCore> coreList = ListBuilder.getCoreList(getMergedModel().getHwModel());

		final OMMapping mapping = new OMMapping();

		for (final OMTask task : taskList) {
			final OMAllocation alloc = new OMAllocation(task, coreList.get(0));
			mapping.addAllocation(alloc);
		}

		updateModel(mapping);

		return true;
	}

	/**
	 * Update the model using the result of the evolution stream
	 *
	 * @param result
	 *            result of evulotion stream
	 */
	protected void updateModel(final OMMapping mapping) {

		final AmaltheaModelBuilder builder = new AmaltheaModelBuilder(mapping);
		getMergedModel().setOsModel(builder.getAmaltheaModel().getOsModel());
		getMergedModel().setMappingModel(builder.getAmaltheaModel().getMappingModel());
		setAmaltheaOutputModel(getMergedModel());

		try {
			final OMVisualizer vis = new OMVisualizer(mapping);
			this.con.appendln("\n" + vis.getASCIIChart());
		}
		catch (final ArithmeticException e) {
			this.con.appendln("\n Visualization not available...");
		}

	}
}
