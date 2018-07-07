/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

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
