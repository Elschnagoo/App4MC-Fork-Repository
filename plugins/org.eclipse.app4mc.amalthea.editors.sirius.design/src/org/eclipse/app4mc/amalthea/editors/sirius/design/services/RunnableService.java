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
import org.eclipse.app4mc.amalthea.model.RunnableItem;
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

	private List<Label> getLabelAccessesForRunnableItems(final List<RunnableItem> items,
			final LabelAccessEnum accessType) {
		final List<Label> result = new ArrayList<>();
		if (null != items) {
			final TreeIterator<EObject> iter = EcoreUtil.getAllContents(items);
			while (iter.hasNext()) {
				final EObject item = iter.next();
				if (item instanceof LabelAccess && ((LabelAccess) item).getAccess().equals(accessType)) {
					result.add(((LabelAccess) item).getData());
				}
			}
		}
		return result;
	}

	public List<Runnable> getCommunicationForRunnable(final Runnable runnable) {
		System.out.println("Getting communication for Runnable " + runnable.getName());
		final List<Runnable> result = new ArrayList<>();
		final TreeIterator<EObject> iter = EcoreUtil.getAllContents(runnable.getRunnableItems());
		while (iter.hasNext()) {
			final EObject item = iter.next();
			if (item instanceof LabelAccess && ((LabelAccess) item).getAccess().equals(LabelAccessEnum.WRITE)) {
				final Label label = ((LabelAccess) item).getData();
				if (null != label) {
					for (final LabelAccess labelAccess : label.getLabelAccesses()) {
						if (labelAccess != item && labelAccess.getAccess().equals(LabelAccessEnum.READ)) {
							System.out.println("Communication found! " + runnable.getName() + "->" + label.getName()
									+ "->" + ((Runnable) labelAccess.eContainer()).getName());
							result.add((Runnable) labelAccess.eContainer());
						}
					}
				}
			}
		}
		return result;
	}


}
