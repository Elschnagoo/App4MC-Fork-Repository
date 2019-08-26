/**
 ********************************************************************************
 * Copyright (c) 2015, 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.execution.logic.openmapping;

import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.util.HardwareUtil;

public class OMCore {
	private final ProcessingUnit coreRef;

	public OMCore(final ProcessingUnit coreRef) {
		this.coreRef = coreRef;
	}

	public ProcessingUnit getCoreRef() {
		return this.coreRef;
	}

	public long getFrequencyHz() throws MalformedModelException{		
		if(this.coreRef==null){
			throw new MalformedModelException(
					"No core available!");
		}
		return HardwareUtil.getFrequencyOfModuleInHz(this.coreRef);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof OMCore){
			OMCore c = (OMCore)obj;
			return coreRef.equals(c.getCoreRef());
		}
		return false;
	};

	@Override
	public String toString() {
		return this.coreRef.getUniqueName();
	}
}
