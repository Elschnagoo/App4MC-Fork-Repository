/*********************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
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
