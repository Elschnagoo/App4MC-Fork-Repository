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

package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import org.eclipse.app4mc.amalthea.model.IReferable;

public class NameService {

	public int lengthOfName(final IReferable referable) {
		if (null != referable && null != referable.getName()) {
			return referable.getName().length() + 2;
		}
		return 0;
	}

}
