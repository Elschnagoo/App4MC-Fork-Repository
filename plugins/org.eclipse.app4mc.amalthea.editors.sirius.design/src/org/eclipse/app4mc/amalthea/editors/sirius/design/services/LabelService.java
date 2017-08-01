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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;

public class LabelService {

	public List<Runnable> getRunnablesFromLabelAccesses(final Label label) {
		final List<Runnable> result = new ArrayList<>();
		for (final LabelAccess labelAccess : label.getLabelAccesses()) {
			result.add((Runnable) labelAccess.eContainer());
		}
		return result;
	}

	public List<Runnable> getReadAccessRunnableForLabel(final Label label) {
		final List<Runnable> result = new ArrayList<>();
		for (final LabelAccess labelAccess : label.getLabelAccesses()) {
			if (labelAccess.getAccess().equals(LabelAccessEnum.READ)) {
				result.add((Runnable) labelAccess.eContainer());
			}
		}
		return result;
	}

	public List<Runnable> getWriteAccessRunnableForLabel(final Label label) {
		final List<Runnable> result = new ArrayList<>();
		for (final LabelAccess labelAccess : label.getLabelAccesses()) {
			if (labelAccess.getAccess().equals(LabelAccessEnum.WRITE)) {
				result.add((Runnable) labelAccess.eContainer());
			}
		}
		return result;
	}

}
