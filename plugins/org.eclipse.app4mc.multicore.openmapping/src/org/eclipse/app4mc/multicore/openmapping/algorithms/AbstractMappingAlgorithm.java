/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms;

import java.util.ArrayList;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaMerger;

public abstract class AbstractMappingAlgorithm {
	// models
	private Amalthea amaltheaSwModel;
	private Amalthea amaltheaHwModel;
	private Amalthea mergedModel;
	private Amalthea amaltheaOutputModel;
	private Boolean hasConstraints = false;

	abstract public void calculateMapping();

	public boolean initModels() {
		if(null != this.mergedModel) return true;
		this.mergedModel = AmaltheaFactory.eINSTANCE.createAmalthea();
		if (null == amaltheaSwModel || null == amaltheaHwModel) {
			return false;
		}

		if (null != amaltheaSwModel.getCommonElements() && null != amaltheaHwModel.getCommonElements()) {
			ArrayList<Amalthea> models = new ArrayList<Amalthea>();
			Amalthea tmp1 = AmaltheaFactory.eINSTANCE.createAmalthea();
			tmp1.setCommonElements(amaltheaSwModel.getCommonElements());
			Amalthea tmp2 = AmaltheaFactory.eINSTANCE.createAmalthea();
			tmp2.setCommonElements(amaltheaHwModel.getCommonElements());
			AmaltheaMerger.addElements(this.mergedModel, models);
		} else if(null != amaltheaSwModel.getCommonElements()) {
			this.mergedModel.setCommonElements(amaltheaSwModel.getCommonElements());
		} else if(null != amaltheaHwModel.getCommonElements()) {
			this.mergedModel.setCommonElements(amaltheaHwModel.getCommonElements());
		}
		
		mergedModel.setComponentsModel(this.amaltheaSwModel.getComponentsModel());
		mergedModel.setConfigModel(this.amaltheaSwModel.getConfigModel());
		mergedModel.setConstraintsModel(this.amaltheaSwModel.getConstraintsModel());
		mergedModel.setEventModel(this.amaltheaSwModel.getEventModel());
		mergedModel.setHwModel(this.amaltheaHwModel.getHwModel());
		mergedModel.setPropertyConstraintsModel(this.amaltheaSwModel.getPropertyConstraintsModel());
		mergedModel.setStimuliModel(this.amaltheaSwModel.getStimuliModel());
		mergedModel.setSwModel(this.amaltheaSwModel.getSwModel());		

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
}
