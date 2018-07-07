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


import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;


public abstract class AbstractTaskCreationAlgorithm {
	
	/**
	 * Pragmatic Task Creation
	 */
	public final static String PRAGMATIC_TASK_CREATION = "0";
	
	// models
	private Amalthea centralModel;
	private Amalthea amaltheaOutputModel;
	private final AmaltheaFactory factoryInstance = AmaltheaFactory.eINSTANCE;

	abstract public void createTasks();

	// getter and setter methods for model handlers
	public AmaltheaFactory getSwInstance() {
		return this.factoryInstance;
	}

	public AmaltheaFactory getStimuliInstance() {
		return this.factoryInstance;
	}

	public AmaltheaFactory getConstraintsInstance() {
		return this.factoryInstance;
	}

	// getter and setter methods for models
	public Amalthea getAmaltheaModel() {
		return this.centralModel;
	}
	
	public Amalthea getAmaltheaOutputModel() {
		return this.amaltheaOutputModel;
	}

	public void setAmaltheaModel(Amalthea centralModel) {
		this.centralModel = centralModel;
	}
	
	public void setAmaltheaOutputModel(final Amalthea amaltheaOutputModel) {
		this.amaltheaOutputModel = amaltheaOutputModel;
	}
}
