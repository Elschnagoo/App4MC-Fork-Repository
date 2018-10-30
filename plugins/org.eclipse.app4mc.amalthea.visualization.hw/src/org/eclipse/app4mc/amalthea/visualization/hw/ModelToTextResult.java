/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.visualization.hw;

public class ModelToTextResult {

	ModelToTextResult(){
		errorFlag = false;
	}
	
	private Boolean errorFlag;

	public Boolean getErrorFlag() {
		return errorFlag;
	}

	public void setErrorFlag(Boolean errorFlag) {
		this.errorFlag = errorFlag;
	}
	
}
