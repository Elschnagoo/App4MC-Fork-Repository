/**
 * *******************************************************************************
 *  Copyright (c) 2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class CrossReferenceUtil {

	private CrossReferenceUtil() {
	}

	public static <T> EList<T> getInverseReferences(final EObject eObject, final EReference eReference) {
		
		// Find root element (EObject, Resource or Resource Set)
		
		final EObject rootContainer = EcoreUtil.getRootContainer(eObject);
		final Resource resource = rootContainer.eResource();
		Notifier target = rootContainer;
		if (resource != null) {
			target = resource;
			final ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				target = resourceSet;
			}
		}

		// Get or create Amalthea adapter
		
		AmaltheaCrossReferenceAdapter amaltheaAdapter = null;
		final EList<Adapter> adapters = target.eAdapters();
		for (final Adapter adapter : adapters) {
			if (adapter instanceof AmaltheaCrossReferenceAdapter) {
				amaltheaAdapter = (AmaltheaCrossReferenceAdapter) adapter;
				break;
			}
		}

		if (amaltheaAdapter == null) {
			amaltheaAdapter = new AmaltheaCrossReferenceAdapter();
			adapters.add(amaltheaAdapter);
		}

		// Get references from adapter
		
		final List<EObject> result = new ArrayList<EObject>();
		final Collection<Setting> nonNavigableInverseReferences = amaltheaAdapter
				.getNonNavigableInverseReferences(eObject);
		for (final Setting setting : nonNavigableInverseReferences) {
			if (setting.getEStructuralFeature() == eReference) {
				result.add(setting.getEObject());
			}
		}

		// Return immutable list
		
		final int size = result.size();
		final Object[] values = result.toArray();
		return new EcoreEList.UnmodifiableEList<T>((InternalEObject) eObject, eReference, size, values);
	}
}
