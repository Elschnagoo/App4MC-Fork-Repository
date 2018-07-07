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

package org.eclipse.app4mc.multicore.openmapping.model;

import org.eclipse.app4mc.amalthea.model.CoreClassifier;

public class OMCoreClassifier extends OMAnnotationElement {
	private CoreClassifier refCoreClassifier;

	public OMCoreClassifier(final CoreClassifier c) {
		this.refCoreClassifier = c;
	}

	public boolean isEqual(final CoreClassifier cmpCoreClassifier) {
		String c1_name = refCoreClassifier.getName();
		String c1_desc = refCoreClassifier.getDescription();
		String c2_name = cmpCoreClassifier.getName();
		String c2_desc = cmpCoreClassifier.getDescription();
		return (c1_name == c2_name && c1_desc == c2_desc);
	}

	@Override
	public boolean equals(Object obj) {
		boolean eqName;
		boolean eqDesc;
		if (obj instanceof OMCoreClassifier) {
			OMCoreClassifier occ = (OMCoreClassifier) obj;
			if (occ.refCoreClassifier == null)
				return false;

			String c1_name = this.refCoreClassifier.getName();
			String c2_name = occ.refCoreClassifier.getName();
			if (c1_name == null || c2_name == null) {
				if (c1_name == null && c2_name == null) {
					eqName = true;
				} else {
					eqName = false;
				}
			} else {
				eqName = (c1_name.equals(c2_name));
			}

			String c1_type = this.refCoreClassifier.getDescription();
			String c2_type = occ.refCoreClassifier.getDescription();
			if (c1_type == null || c2_type == null) {
				if (c1_type == null && c2_type == null) {
					eqDesc = true;
				} else {
					eqDesc = false;
				}
			}else {
				eqDesc = (c1_type.equals(c2_type));
			}

			return (eqName && eqDesc);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int i = 1;
		i = i * 31 + this.refCoreClassifier.getName().hashCode();
		i = i * 17 + (this.refCoreClassifier.getDescription() == null ? 0 : this.refCoreClassifier.getDescription().hashCode());
		return i;
	}

	@Override
	public String toString() {
		return this.refCoreClassifier.getName() + ":" + this.refCoreClassifier.getDescription() + ":" + this.refCoreClassifier.getUniqueName();
	}
}
