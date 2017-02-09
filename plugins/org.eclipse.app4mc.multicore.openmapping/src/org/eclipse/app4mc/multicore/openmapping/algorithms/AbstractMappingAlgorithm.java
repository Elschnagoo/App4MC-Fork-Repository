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
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;

public abstract class AbstractMappingAlgorithm {
	// models
	private Amalthea amaltheaSwModel;
	private Amalthea amaltheaHwModel;
	private Amalthea mergedModel;
	private Amalthea amaltheaOutputModel;
	private Boolean hasConstraints = false;

	abstract public void calculateMapping();

	public boolean initModels() {
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

	// public CommonElements getCommonElements() {
	// return this.commonElements;
	// }
	//
	// public SWModel getSwModel() {
	// return this.swModel;
	// }
	//
	// public HWModel getHwModel() {
	// return this.hwModel;
	// }
	//
	// public ConstraintsModel getConstraintsModel() {
	// return this.conModel;
	// }
	//
	// public OSModel getOsModel() {
	// return this.osModel;
	// }
	//
	// public MappingModel getMappingModel() {
	// return this.mmModel;
	// }
	//
	// public PropertyConstraintsModel getPropertyConstraintsModel() {
	// return this.pcModel;
	// }
	//
	// public StimuliModel getStimuliModel() {
	// return this.stiModel;
	// }

	// public void setCommonElements(final CommonElements commonElements) {
	// this.commonElements = commonElements;
	// }
	//
	// public void setSwModel(final SWModel swModel) {
	// this.swModel = swModel;
	// }
	//
	// public void setHwModel(final HWModel hwModel) {
	// this.hwModel = hwModel;
	// }
	//
	// public void setConnstraintsModel(final ConstraintsModel conModel) {
	// this.conModel = conModel;
	// }
	//
	// public void setOsModel(final OSModel osModel) {
	// this.osModel = osModel;
	// }
	//
	// public void setMappingModel(final MappingModel mmModel) {
	// this.mmModel = mmModel;
	// }
	//
	// public void setPropertyConstraintsModel(final PropertyConstraintsModel
	// pcModel) {
	// this.hasConstraints = true;
	// this.pcModel = pcModel;
	// }
	//
	// public void setStimuliModel(final StimuliModel stiModel) {
	// this.stiModel = stiModel;
	// }

	public Boolean hasConstraints() {
		return this.hasConstraints;
	}
}
