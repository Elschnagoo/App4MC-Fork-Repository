/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.common.utils;

public enum Tags {

	central_AMALTHEA("central:AMALTHEA"), hw_HWModel("hw:HWModel"), hwModel("hwModel"), os_OSModel("os:OSModel"), osModel(
			"osModel"), operatingSystems("operatingSystems"), mapping_MappingModel("mapping:MappingModel"), mappingModel(
			"mappingModel"), processAllocation("processAllocation"), runnableAllocation("runnableAllocation"), isrs(
							"isrs"), tasks("tasks"), scheduler("scheduler"), process("process"), stimuli_StimuliModel(
			"stimuli:StimuliModel"), stimuliModel("stimuliModel");

	private String value;

	private Tags(final String v) {
		this.value = v;
	}

	public String getValue() {
		return this.value;
	}

}
