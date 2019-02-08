/**
 ********************************************************************************
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.jdt.annotation.NonNull;

public class AmaltheaCrossReferenceAdapter extends ECrossReferenceAdapter {
	private static final String ARG_NAME_MESSAGE = "Name argument is null, expected: String";
	private static final String ARG_PATTERN_MESSAGE = "Pattern argument is null, expected: Pattern";
	private static final String ARG_CLASS_MESSAGE = "Class argument is null, expected: Class<T extends INamed>";

	private final Map<String, Set<INamed>> nameIndex = new HashMap<>();

	public @NonNull Set<@NonNull ? extends INamed> getElements(final @NonNull String name) {
		checkArgument(name != null, ARG_NAME_MESSAGE);
		
		return getElements(name, INamed.class);
	}

	@SuppressWarnings("null")
	public <T extends INamed> @NonNull Set<@NonNull ? extends T> getElements(final @NonNull String name, final @NonNull Class<T> targetClass) {
		checkArgument(name != null, ARG_NAME_MESSAGE);
		checkArgument(targetClass != null, ARG_CLASS_MESSAGE);
		
		final Set<T> result = new HashSet<>();
		final Set<INamed> values = this.nameIndex.get(name);
		if (values != null) {
			for (final INamed namedObject : values) {
				if (targetClass.isInstance(namedObject)) {
					result.add(targetClass.cast(namedObject));
				}
			}
		}
		return result;
	}

	public @NonNull Set<@NonNull ? extends INamed> getElements(final @NonNull Pattern namePattern) {
		checkArgument(namePattern != null, ARG_PATTERN_MESSAGE);
		
		return getElements(namePattern, INamed.class);
	}

	@SuppressWarnings("null")
	public <T extends INamed> @NonNull Set<@NonNull ? extends T> getElements(final @NonNull Pattern namePattern, final @NonNull Class<T> targetClass) {
		checkArgument(namePattern != null, ARG_PATTERN_MESSAGE);
		checkArgument(targetClass != null, ARG_CLASS_MESSAGE);
		
		final Set<T> result = new HashSet<>();
		for (final Map.Entry<String, Set<INamed>> entry : this.nameIndex.entrySet()) {
			if (namePattern.matcher(entry.getKey()).matches()) {
				for (final INamed namedObject : entry.getValue()) {
					if (targetClass.isInstance(namedObject)) {
						result.add(targetClass.cast(namedObject));
					}
				}
			}
		}
		return result;
	}

	@Override
	protected void selfAdapt(final Notification notification) {
		final Object notifier = notification.getNotifier();
		if (notifier instanceof INamed && notification.getFeature() == AmaltheaPackage.eINSTANCE.getINamed_Name()) {
			// Update the name index if an INamed's name is changed.
			final INamed namedObj = (INamed) notifier;
			switch (notification.getEventType()) {
			case Notification.UNSET: {
				final String oldValue = notification.getOldStringValue();
				removeFromNameIndex(namedObj, oldValue);
				break;
			}
			case Notification.SET: {
				final String oldValue = notification.getOldStringValue();
				removeFromNameIndex(namedObj, oldValue);
				final String newValue = notification.getNewStringValue();
				addToNameIndex(namedObj, newValue);
				break;
			}
			}
		}
		else {
			super.selfAdapt(notification);
		}
	}

	@Override
	protected void setTarget(final EObject target) {
		super.setTarget(target);

		if (target instanceof INamed) {
			// Add the INamed's name to the name index.
			final INamed namedObj = (INamed) target;
			addToNameIndex(namedObj, namedObj.getName());
		}
	}

	@Override
	protected void unsetTarget(final EObject target) {
		super.unsetTarget(target);

		if (target instanceof INamed) {
			// Remove the INamed's name to the name index.
			final INamed namedObj = (INamed) target;
			removeFromNameIndex(namedObj, namedObj.getName());
		}
	}

	private void addToNameIndex(final INamed eObject, final String name) {
		if (name != null) {
			Set<INamed> objSet = this.nameIndex.get(name);
			if (objSet == null) {
				objSet = new HashSet<>();
				this.nameIndex.put(name, objSet);
			}
			objSet.add(eObject);
		}
	}

	private void removeFromNameIndex(final INamed eObject, final String name) {
		if (name != null) {
			final Set<INamed> objSet = this.nameIndex.get(name);
			if (objSet != null) {
				objSet.remove(eObject);
				if (objSet.isEmpty()) {
					this.nameIndex.remove(name);
				}
			}
		}
	}


	/**
	 * Handles a containment change by adding and removing the adapter just like
	 * {@link EContentAdapter#handleContainment(Notification)}.
	 */
	@Override
	protected void handleContainment(final Notification notification) {
		switch (notification.getEventType()) {
		case Notification.RESOLVE: {
			// We need to be careful that the proxy may be resolved while we are attaching this adapter.
			// We need to avoid attaching the adapter during the resolve
			// and also attaching it again as we walk the eContents() later.
			// Checking here avoids having to check during addAdapter.
			//
			final Notifier oldValue = (Notifier) notification.getOldValue();
			if (oldValue.eAdapters().contains(this)) {
				removeAdapter(oldValue);
				final Notifier newValue = (Notifier) notification.getNewValue();
				addAdapter(newValue);
			}
			break;
		}
		case Notification.UNSET: {
			final Object oldValue = notification.getOldValue();
			if (oldValue != Boolean.TRUE && oldValue != Boolean.FALSE) {
				if (oldValue != null) {
					removeAdapter((Notifier) oldValue);
				}
				final Notifier newValue = (Notifier) notification.getNewValue();
				if (newValue != null) {
					addAdapter(newValue);
				}
			}
			break;
		}
		case Notification.SET: {
			final Notifier oldValue = (Notifier) notification.getOldValue();
			if (oldValue != null) {
				removeAdapter(oldValue);
			}
			final Notifier newValue = (Notifier) notification.getNewValue();
			if (newValue != null) {
				addAdapter(newValue);
			}
			break;
		}
		case Notification.ADD: {
			final Notifier newValue = (Notifier) notification.getNewValue();
			if (newValue != null) {
				addAdapter(newValue);
			}
			break;
		}
		case Notification.ADD_MANY: {
			@SuppressWarnings("unchecked")
			final Collection<Notifier> newValues = (Collection<Notifier>) notification.getNewValue();
			for (final Notifier newValue : newValues) {
				addAdapter(newValue);
			}
			break;
		}
		case Notification.REMOVE: {
			final Notifier oldValue = (Notifier) notification.getOldValue();
			if (oldValue != null) {
				removeAdapter(oldValue);
			}
			break;
		}
		case Notification.REMOVE_MANY: {
			@SuppressWarnings("unchecked")
			final Collection<Notifier> oldValues = (Collection<Notifier>) notification.getOldValue();
			for (final Notifier oldContentValue : oldValues) {
				removeAdapter(oldContentValue);
			}
			break;
		}
		}
	}
}
