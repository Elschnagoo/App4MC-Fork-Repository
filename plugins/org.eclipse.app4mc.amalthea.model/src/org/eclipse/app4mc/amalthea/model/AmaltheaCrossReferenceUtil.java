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
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class AmaltheaCrossReferenceUtil {

	private AmaltheaCrossReferenceUtil() {
	}

	public static <T> EList<T> getInverseReferences(final EObject eObject, final EReference resultEReference,
			final EReference targetEReference) {

		final AmaltheaCrossReferenceAdapter amaltheaAdapter = getAmaltheaAdapter(eObject);

		// Get references from adapter

		final List<EObject> result = new ArrayList<EObject>();
		final Collection<Setting> nonNavigableInverseReferences = amaltheaAdapter
				.getNonNavigableInverseReferences(eObject);
		for (final Setting setting : nonNavigableInverseReferences) {
			if (setting.getEStructuralFeature() == targetEReference) {
				final EObject targetEObject = setting.getEObject();
				result.add(targetEObject);
			}
		}

		// Return immutable list

		final int size = result.size();
		final Object[] values = result.toArray();
		return new EcoreEList.UnmodifiableEList<T>((InternalEObject) eObject, resultEReference, size, values);
	}

	public static void deleteAll(final Collection<? extends EObject> eObjects) {
		Notifier target = null;
		for (final EObject eObject : eObjects) {
			final Notifier context = getRootContext(eObject);
			if (target == null) {
				target = context;
			}
			else if (target != context) {
				throw new IllegalArgumentException("Objects don't share a common context");
			}
		}

		if (target != null) {
			final AmaltheaCrossReferenceAdapter amaltheaAdapter = getAmaltheaAdapter(target);
			for (final EObject eObject : eObjects) {
				final Collection<Setting> inverseReferences = amaltheaAdapter.getInverseReferences(eObject);
				for (final EStructuralFeature.Setting settingObject : inverseReferences) {
					if (settingObject.getEStructuralFeature().isChangeable()) {
						// remove the reference relation
						EcoreUtil.remove(settingObject, eObject);
					}
				}

				// remove the element
				EcoreUtil.remove(eObject);
			}
		}
	}

	public static <T extends IReferable> Set<? extends T> getElements(final Notifier context, final String name,
			final Class<T> targetClass) {
		return getAmaltheaAdapter(getRootContext(context)).getElements(name, targetClass);
	}

	public static <T extends IReferable> Set<? extends T> getElements(final Notifier context, final Pattern namePattern,
			final Class<T> targetClass) {
		return getAmaltheaAdapter(getRootContext(context)).getElements(namePattern, targetClass);
	}

	private static AmaltheaCrossReferenceAdapter getAmaltheaAdapter(final EObject eObject) {
		// Find root element (EObject, Resource or Resource Set)

		final Notifier target = getRootContext(eObject);

		// Get or create Amalthea adapter
		return getAmaltheaAdapter(target);
	}

	private static AmaltheaCrossReferenceAdapter getAmaltheaAdapter(final Notifier target) {

		// Get or create Amalthea adapter

		final EList<Adapter> adapters = target.eAdapters();
		for (final Adapter adapter : adapters) {
			if (adapter instanceof AmaltheaCrossReferenceAdapter) {
				return (AmaltheaCrossReferenceAdapter) adapter;
			}
		}

		final AmaltheaCrossReferenceAdapter amaltheaAdapter = new AmaltheaCrossReferenceAdapter();
		adapters.add(amaltheaAdapter);
		return amaltheaAdapter;
	}

	private static Notifier getRootContext(final EObject eObject) {
		final EObject rootContainer = EcoreUtil.getRootContainer(eObject);
		final Resource resource = rootContainer.eResource();
		if (resource != null) {
			final ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				return resourceSet;
			}

			return resource;
		}

		return rootContainer;
	}

	private static Notifier getRootContext(final Notifier notifier) {
		if (notifier instanceof EObject) {
			return getRootContext((EObject) notifier);
		}
		else if (notifier instanceof Resource) {
			final Resource resource = (Resource) notifier;
			final ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet != null) {
				return resourceSet;
			}
			return resource;
		}
		else {
			return notifier;
		}
	}
}
