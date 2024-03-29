/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

import static com.google.common.base.Preconditions.checkArgument;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * This class provides static methods for efficient model navigation, search and delete.
 * <p>
 * An {@link AmaltheaCrossReferenceAdapter} is created and attached to the root context of the model.
 * The adapter maintains an index that allows fast access to inverse references and an index based on object name.
 * <p>
 * The method {@link AmaltheaIndex#getInverseReferences getInverseReferences} is called from several
 * generated model objects to compute inverse transient references based on the incoming references.
 */
public final class AmaltheaIndex {

	private static final String ARG_OBJECT_MESSAGE = "Object argument is null, expected: EObject";
	private static final String ARG_COLLECTION_MESSAGE = "Collection argument is null,  expected: Collection<? extends EObject>";
	private static final String ARG_NOTIFIER_MESSAGE = "Context argument is null, expected: Notifier";
	private static final String ARG_NAME_MESSAGE = "Name argument is null, expected: String";
	private static final String ARG_PATTERN_MESSAGE = "Pattern argument is null, expected: Pattern";
	private static final String ARG_CLASS_MESSAGE = "Class argument is null, expected: Class<T extends INamed>";
	private static final String ARG_RESULT_REFERENCE_MESSAGE = "Result reference argument is null, expected: EReference";
	private static final String ARG_TARGET_REFERENCES_MESSAGE = "Target references argument is null, expected: Set<EReference>";
	private static final String ARG_TARGET_REFERENCE_MESSAGE = "Target reference argument is null, expected: EReference";
	
	// Suppress default constructor
	private AmaltheaIndex() {
	}

	/**
	 * Computes a list of objects that refer to an EObject via dedicated references.
	 * <p>
	 * This method is called from several generated model objects to compute
	 * an inverse transient reference based on the incoming references.
	 * 
	 * @param eObject				object that implements a derived transient opposite reference
	 * @param resultEReference		opposite reference definition (resulting objects are computed)
	 * @param targetEReferences		list of incoming references
	 * @return
	 * 		EcoreEList.UnmodifiableEList &lt;T&gt;
	 */
	public static <T> EList<T> getInverseReferences(final @NonNull EObject eObject, final @NonNull EReference resultEReference,
			final @NonNull Set<@NonNull EReference> targetEReferences) {
		checkArgument(eObject != null, ARG_OBJECT_MESSAGE);
		checkArgument(resultEReference != null, ARG_RESULT_REFERENCE_MESSAGE);
		checkArgument(targetEReferences != null, ARG_TARGET_REFERENCES_MESSAGE);
		
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
	 * Returns a set of objects that refer to the given <code>eObject</code>.
	 * 
	 * @param eObject
	 * @return Set of objects (EObject)
	 */
	public static Set<EObject> getReferringObjects(final @NonNull EObject eObject) {
		checkArgument(eObject != null, ARG_OBJECT_MESSAGE);
		
		return getOrCreateAmaltheaAdapter(eObject).getNonNavigableInverseReferences(eObject)
				.stream()
				.map(setting -> setting.getEObject())
				.collect(Collectors.toSet());
	}

	/**
	 * Returns a type filtered set of objects that refer to the given <code>eObject</code>.
	 * 
	 * @param eObject
	 * @param targetClass
	 * @return Set of objects of given type <T extends EObject>
	 */
	public static <T extends EObject> Set<T> getReferringObjects(final @NonNull EObject eObject, final @NonNull Class<T> targetClass) {
		checkArgument(eObject != null, ARG_OBJECT_MESSAGE);
		checkArgument(targetClass != null, ARG_CLASS_MESSAGE);
		
		return getOrCreateAmaltheaAdapter(eObject).getNonNavigableInverseReferences(eObject)
				.stream()
				.map(setting -> setting.getEObject())
				.filter(obj -> targetClass.isInstance(obj))
				.map(obj -> targetClass.cast(obj))
				.collect(Collectors.toSet());
	}
	
	/**
	 * Returns a filtered set of objects that refer to the given <code>eObject</code>
	 * <p>
	 * Filters:
	 * <ul>
	 * <li>type (<code>targetClass</code>)</li>
	 * <li>reference (<code>targetEReference</code>)</li>
	 * </ul>
	 * 
	 * @param eObject
	 * @param targetClass
	 * @param targetEReference
	 * @return Set of objects of given type <T extends EObject>
	 */
	public static <T extends EObject> Set<T> getReferringObjects(final @NonNull EObject eObject, final @NonNull Class<T> targetClass, final @NonNull EReference targetEReference) {
		checkArgument(eObject != null, ARG_OBJECT_MESSAGE);
		checkArgument(targetEReference != null, ARG_TARGET_REFERENCE_MESSAGE);
		checkArgument(targetClass != null, ARG_CLASS_MESSAGE);
		
		return getOrCreateAmaltheaAdapter(eObject).getNonNavigableInverseReferences(eObject)
				.stream()
				.filter(setting -> setting.getEStructuralFeature() == targetEReference)
				.map(setting -> setting.getEObject())
				.filter(obj -> targetClass.isInstance(obj))
				.map(obj -> targetClass.cast(obj))
				.collect(Collectors.toSet());
	}

	public static List<Set<IReferable>> getObjectsWithConflictingNames(final @NonNull Notifier context) {
		checkArgument(context != null, ARG_NOTIFIER_MESSAGE);
		
		// call index
		@NonNull List<@NonNull Set<@NonNull IReferable>> list = getOrCreateAmaltheaAdapter(context).getObjectsWithConflictingNames();
		
		// filter scope
		List<Set<IReferable>> result = new ArrayList<>();
		for (Set<IReferable> initialSet : list) {
			Set<IReferable> filteredSet = filterElements(context, initialSet);
			if (filteredSet.size() > 1) {
				result.add(filteredSet);
			}
		}
		
		return result;
	}

	/**
	 * Creates the index explicitly. If the index is already available the method will have no effect.
	 * <p>
	 * This method is optional. Normally the index will be built on demand.
	 * 
	 * @param eObject
	 */
	public static void buildIndex(final @NonNull Notifier context) {
		checkArgument(context != null, ARG_NOTIFIER_MESSAGE);
		
		getOrCreateAmaltheaAdapter(context);
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
	public static void delete(final @NonNull EObject eObject) {
		checkArgument(eObject != null, ARG_OBJECT_MESSAGE);
		
		ArrayList<EObject> list = new ArrayList<EObject>();
		list.add(eObject);
		deleteAll(list, true);
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
	public static void deleteAll(final @NonNull Collection<? extends EObject> eObjects) {
		checkArgument(eObjects != null, ARG_COLLECTION_MESSAGE);
		
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
	public static void deleteAll(final @NonNull Collection<? extends EObject> eObjects, boolean recursive) {
		checkArgument(eObjects != null, ARG_COLLECTION_MESSAGE);
		
		@SuppressWarnings("null")
		Set<@NonNull ? extends EObject> objectsToDelete = eObjects.stream()
				.filter(Objects::nonNull).collect(Collectors.toSet());
		
		// extended argument check: ensure a common context
		
		Notifier target = null;
		for (final EObject eObject : objectsToDelete) {
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
			for (EObject eObject : objectsToDelete) {
				for (TreeIterator<EObject> j = eObject.eAllContents(); j.hasNext();) {
					InternalEObject childEObject = (InternalEObject) j.next();
					eAllObjects.add(childEObject);
				}
			}
		}
		// add original objects
		eAllObjects.addAll(objectsToDelete);
		
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
	 * @return Set of named objects (INamed)
	 */
	public static <T extends INamed> Set<T> getElements(final @NonNull Notifier context, final @NonNull String name,
			final @NonNull Class<T> targetClass) {
		checkArgument(context != null, ARG_NOTIFIER_MESSAGE);
		checkArgument(name != null, ARG_NAME_MESSAGE);
		checkArgument(targetClass != null, ARG_CLASS_MESSAGE);
		
		@NonNull Set<@NonNull T> elements = getOrCreateAmaltheaAdapter(context).getElements(name, targetClass);
		
		return filterElements(context, elements);
	}

	/**
	 * Finds elements by name pattern and class
	 * 
	 * @param context EObject, Resource or ResourceSet
	 * @param namePattern for example: <code>Pattern.compile("Prefix_.*")</code>
	 * @param targetClass for example: <code>Label.class</code>
	 * @return Set of named objects (INamed)
	 */
	public static <T extends INamed> Set<T> getElements(final @NonNull Notifier context, final @NonNull Pattern namePattern,
			final @NonNull Class<T> targetClass) {
		checkArgument(context != null, ARG_NOTIFIER_MESSAGE);
		checkArgument(namePattern != null, ARG_PATTERN_MESSAGE);
		checkArgument(targetClass != null, ARG_CLASS_MESSAGE);
		
		@NonNull Set<@NonNull T> elements = getOrCreateAmaltheaAdapter(context).getElements(namePattern, targetClass);
		
		return filterElements(context, elements);
	}

	/**
	 * Dumps adapter info to a print stream
	 * 
	 * @param context	EObject, Resource or ResourceSet
	 * @param info		content selector <ul>
	 * 					<li> 1 - basic adapter info (resources, size of maps)
	 * 					<li> 2 - cross reference map
	 * 					<li> 3 - name index </ul>
	 * @param stream	output stream (if undefined then {@code System.out} is used)
	 */
	public static void dumpAdapterInfo(final @NonNull Notifier context, int info, final @Nullable PrintStream stream) {
		checkArgument(context != null, ARG_NOTIFIER_MESSAGE);
	
		PrintStream out = (stream == null) ? java.lang.System.out : stream;
		
		AmaltheaCrossReferenceAdapter adapter = getOrCreateAmaltheaAdapter(context);
		
		switch (info) {
		case 1: adapter.dumpInfo(out); break;
		case 2: adapter.dumpCrossReferenceMap(out); break;
		case 3: adapter.dumpNameIndex(out); break;
		}
	}

	private static synchronized @NonNull AmaltheaCrossReferenceAdapter getOrCreateAmaltheaAdapter(final @NonNull Notifier target) {
		// Try to get Amalthea adapter
		final EList<Adapter> adapters = getRootContext(target).eAdapters();
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
	 * Gets the root context of an EObject
	 */
	private static @NonNull Notifier getRootContext(final @NonNull EObject eObject) {
		final EObject rootContainer = EcoreUtil.getRootContainer(eObject);
		final Resource resource = rootContainer.eResource();
		if (resource != null) {
			return getRootContext(resource);
		}

		return rootContainer;
	}

	/**
	 * Gets the root context of a Resource
	 */
	private static @NonNull Notifier getRootContext(final @NonNull Resource resource) {
		final ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet != null) {
			return resourceSet;
		}
		
		return resource;
	}
	
	/**
	 * Gets the root context of a Notifier (EObject, Resource or Resource Set)
	 */
	private static @NonNull Notifier getRootContext(final @NonNull Notifier notifier) {
		if (notifier instanceof EObject) {
			return getRootContext((EObject) notifier);
		}
		else if (notifier instanceof Resource) {
			return getRootContext((Resource) notifier);
		}

		return notifier;
	}
	
	/**
	 * Gets the resource of a Notifier (EObject, Resource or Resource Set)
	 */
	private static Resource getResource(final Notifier notifier) {
		if (notifier instanceof EObject) {
			return((EObject) notifier).eResource();
		}
		else if (notifier instanceof Resource) {
			return (Resource) notifier;
		}

		return null;
	}

	/**
	 * Removes elements out of scope (to handle larger editing domains / resource sets)
	 */
	private static <T extends INamed> Set<T> filterElements(final @NonNull Notifier context, Set<@NonNull T> elements) {
		Notifier rootContext = getRootContext(context);
		Resource resource = getResource(context);
		if (rootContext instanceof ResourceSet && resource != null) {
			URI folderUri = resource.getURI().trimSegments(1);
			return elements.stream()
					.filter(e -> e.eResource().getURI().trimSegments(1).equals(folderUri))
					.collect(Collectors.toSet());
		}
		
		return elements;
	}

}
