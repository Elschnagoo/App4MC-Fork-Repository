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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class RunnableService {

	public List<Label> getLabelWriteAccessesForRunnable(final Runnable runnable) {
		return getLabelAccessesForRunnable(runnable, LabelAccessEnum.WRITE);
	}

	public List<Label> getLabelReadAccessesForRunnable(final Runnable runnable) {
		return getLabelAccessesForRunnable(runnable, LabelAccessEnum.READ);
	}

	private List<Label> getLabelAccessesForRunnable(final Runnable runnable, final LabelAccessEnum accessType) {
		List<Label> result = new ArrayList<>();
		if (null != runnable) {
			result = getLabelAccessesForRunnableItems(runnable.getRunnableItems(), accessType);
		}
		return result;
	}

	private List<Label> getLabelAccessesForRunnableItems(final List<CallGraphItem> items,
			final LabelAccessEnum accessType) {
		final List<Label> result = new ArrayList<>();
		final TreeIterator<EObject> iter = EcoreUtil.getAllContents(items);
		while (iter.hasNext()) {
			final EObject item = iter.next();
			if (item instanceof LabelAccess && ((LabelAccess) item).getAccess().equals(accessType)) {
				result.add(((LabelAccess) item).getData());
			}
		}
		return result;
	}

	public List<Runnable> getCommunicationForRunnable(final Runnable runnable) {
		final List<Runnable> result = new ArrayList<>();
		if (null != runnable) {
			final TreeIterator<EObject> iter = EcoreUtil.getAllContents(runnable.getRunnableItems());
			while (iter.hasNext()) {
				final EObject item = iter.next();
				if (item instanceof LabelAccess && ((LabelAccess) item).getAccess().equals(LabelAccessEnum.WRITE)) {
					final Label label = ((LabelAccess) item).getData();
					if (null != label) {
						for (final LabelAccess labelAccess : label.getLabelAccesses()) {
							if (labelAccess != item && labelAccess.getAccess().equals(LabelAccessEnum.READ)) {
								result.add(labelAccess.getContainingRunnable());
							}
						}
					}
				}
			}
		}
		return result;
	}


}
