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

package org.eclipse.app4mc.amalthea.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * This class provides static methods for efficient model navigation, search and delete.
 * <p>
 * An {@link AmaltheaCrossReferenceAdapter} is created and attached to the root context of the model.
 * The adapter maintains an index that allows fast access to inverse references and an index based on object name.
 * <p>
 */

public final class AmaltheaIndex {

	// Suppress default constructor
	private AmaltheaIndex() {
	}

	public static <T> EList<T> getInverseReferences(final EObject eObject, final EReference resultEReference,
			final Set<EReference> targetEReferences) {

		final AmaltheaCrossReferenceAdapter amaltheaAdapter = getOrCreateAmaltheaAdapter(eObject);

		// Get references from adapter

		final List<EObject> result = new ArrayList<EObject>();
		final Collection<Setting> nonNavigableInverseReferences = amaltheaAdapter
				.getNonNavigableInverseReferences(eObject);
		for (final Setting setting : nonNavigableInverseReferences) {
			if (targetEReferences.contains(setting.getEStructuralFeature())) {
				final EObject targetEObject = setting.getEObject();
				result.add(targetEObject);
			}
		}

		// Return immutable list

		final int size = result.size();
		final Object[] values = result.toArray();
		return new EcoreEList.UnmodifiableEList<T>((InternalEObject) eObject, resultEReference, size, values);
	}


	/**
	 * Deletes the object from its {@link EObject#eResource containing} resource
	 * and/or its {@link EObject#eContainer containing} object as well as from any
	 * other feature that references it within the enclosing root context
	 * (resource set, resource or root object). Contained children of the object
	 * are similarly removed from any features that reference them.
	 * 
	 * @param eObject object to delete
	 */
	public static void delete(final EObject eObject) {
		deleteAll(Arrays.asList(eObject), true);
	}


	/**
	 * Deletes the objects from their {@link EObject#eResource containing} resource
	 * and/or their {@link EObject#eContainer containing} object as well as from any
	 * other feature that references it within the enclosing root context
	 * (resource set, resource or root object). Contained children of the object
	 * are similarly removed from any features that reference them.
	 * 
	 * @param eObjects objects to delete
	 */
	public static void deleteAll(final Collection<? extends EObject> eObjects) {
		deleteAll(eObjects, true);
	}


	/**
	 * Deletes the objects from their {@link EObject#eResource containing} resource
	 * and/or their {@link EObject#eContainer containing} object as well as from any
	 * other feature that references it within the enclosing root context
	 * (resource set, resource or root object).
	 * If recursive is true, contained children of the object are similarly removed
	 * from any features that reference them.
	 * 
	 * @param eObjects objects to delete
	 * @param recursive true: contained children should also be deleted
	 */
	public static void deleteAll(final Collection<? extends EObject> eObjects, boolean recursive) {
		
		// find the common context
		
		Notifier target = null;
		for (final EObject eObject : eObjects) {
			final Notifier context = getRootContext(eObject);
			if (target == null) {
				target = context;
			} else if (target != context) {
				throw new IllegalArgumentException("Objects don't share a common context");
			}
		}
		if (target == null)
			return;
		
		// collect objects to delete

		Set<EObject> eAllObjects = new HashSet<EObject>();
		if (recursive) {
			// add contained objects
			for (EObject eObject : eObjects) {
				for (TreeIterator<EObject> j = eObject.eAllContents(); j.hasNext();) {
					InternalEObject childEObject = (InternalEObject) j.next();
					eAllObjects.add(childEObject);
				}
			}
		}
		// add original objects
		eAllObjects.addAll(eObjects);
		
		// delete the objects
		
		final AmaltheaCrossReferenceAdapter amaltheaAdapter = getOrCreateAmaltheaAdapter(target);
		for (final EObject eObject : eAllObjects) {
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


	/**
	 * Finds elements by name and class
	 * 
	 * @param context EObject, Resource or ResourceSet
	 * @param name String
	 * @param targetClass for example: <code>Label.class</code>
	 * @return Set of IReferable objects
	 */
	public static <T extends INamed> Set<? extends T> getElements(final Notifier context, final String name,
			final Class<T> targetClass) {
		return getOrCreateAmaltheaAdapter(getRootContext(context)).getElements(name, targetClass);
	}


	/**
	 * Finds elements by name pattern and class
	 * 
	 * @param context EObject, Resource or ResourceSet
	 * @param namePattern for example: <code>Pattern.compile("Prefix_.*")</code>
	 * @param targetClass for example: <code>Label.class</code>
	 * @return Set of IReferable objects
	 */
	public static <T extends INamed> Set<? extends T> getElements(final Notifier context, final Pattern namePattern,
			final Class<T> targetClass) {
		return getOrCreateAmaltheaAdapter(getRootContext(context)).getElements(namePattern, targetClass);
	}


	private static AmaltheaCrossReferenceAdapter getOrCreateAmaltheaAdapter(final EObject eObject) {
		final Notifier target = getRootContext(eObject);
		return getOrCreateAmaltheaAdapter(target);
	}

	private static AmaltheaCrossReferenceAdapter getOrCreateAmaltheaAdapter(final Notifier target) {
		// Try to get Amalthea adapter
		final EList<Adapter> adapters = target.eAdapters();
		for (final Adapter adapter : adapters) {
			if (adapter instanceof AmaltheaCrossReferenceAdapter) {
				return (AmaltheaCrossReferenceAdapter) adapter;
			}
		}
		
		// Create Amalthea adapter
		final AmaltheaCrossReferenceAdapter amaltheaAdapter = new AmaltheaCrossReferenceAdapter();
		adapters.add(amaltheaAdapter);
		return amaltheaAdapter;
	}

	/**
	 * Gets the root context (EObject, Resource or Resource Set)
	 */
	private static Notifier getRootContext(final EObject eObject) {
		final EObject rootContainer = EcoreUtil.getRootContainer(eObject);
		final Resource resource = rootContainer.eResource();
		if (resource != null) {
			return getRootContext(resource);
		}

		return rootContainer;
	}

	/**
	 * Gets the root context (EObject, Resource or Resource Set)
	 */
	private static Notifier getRootContext(final Resource resource) {
		if (resource == null) return null;
		
		final ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet != null) {
			return resourceSet;
		}
		
		return resource;
	}
	
	/**
	 * Gets the root context (EObject, Resource or Resource Set)
	 */
	private static Notifier getRootContext(final Notifier notifier) {
		if (notifier instanceof EObject) {
			return getRootContext((EObject) notifier);
		}
		else if (notifier instanceof Resource) {
			return getRootContext((Resource) notifier);
		}

		return notifier;
	}
}
