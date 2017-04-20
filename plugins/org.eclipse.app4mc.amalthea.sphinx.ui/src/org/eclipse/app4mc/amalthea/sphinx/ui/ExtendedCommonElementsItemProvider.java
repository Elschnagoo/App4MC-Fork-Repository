/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.provider.CommonElementsItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.container.CoreClassifiersIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.container.MemoryClassifiersIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.container.TagsIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedCommonElementsItemProvider extends CommonElementsItemProvider {

	protected CoreClassifiersIP coreClassifiersIP;
	protected MemoryClassifiersIP memoryClassifiersIP;
	protected TagsIP tagsIP;
	
	public ExtendedCommonElementsItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object getCoreClassifiers(final CommonElements owner) {
		if (this.coreClassifiersIP == null) {
			this.coreClassifiersIP = new CoreClassifiersIP(this.adapterFactory, owner);
		}
		return this.coreClassifiersIP;
	}

	public Object getMemoryClassifiers(final CommonElements owner) {
		if (this.memoryClassifiersIP == null) {
			this.memoryClassifiersIP = new MemoryClassifiersIP(this.adapterFactory, owner);
		}
		return this.memoryClassifiersIP;
	}

	public Object getTags(final CommonElements owner) {
		if (this.tagsIP == null) {
			this.tagsIP = new TagsIP(this.adapterFactory, owner);
		}
		return this.tagsIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getCommonElements_CoreClassifiers());
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getCommonElements_MemoryClassifiers());
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getCommonElements_Tags());
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		final CommonElements commonElements = (CommonElements) object;
		children.add(getCoreClassifiers(commonElements));
		children.add(getMemoryClassifiers(commonElements));
		children.add(getTags(commonElements));
		return children;
	}

	@Override
	protected Command createAddCommand(final EditingDomain domain, final EObject owner,
			final EStructuralFeature feature, final Collection<?> collection, final int index) {
		return createWrappedCommand(super.createAddCommand(domain, owner, feature, collection, index), owner, feature);
	}

	@Override
	protected Command createRemoveCommand(final EditingDomain domain, final EObject owner,
			final EStructuralFeature feature, final Collection<?> collection) {
		return createWrappedCommand(super.createRemoveCommand(domain, owner, feature, collection), owner, feature);
	}

	protected Command createWrappedCommand(final Command command, final EObject owner,
			final EStructuralFeature feature) {
		if (feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS
				|| feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS
				|| feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__TAGS) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS) {
							affected = Collections.singleton(getCoreClassifiers((CommonElements) owner));
						}
						else if (feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS) {
							affected = Collections.singleton(getMemoryClassifiers((CommonElements) owner));
						}
						else if (feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__TAGS) {
							affected = Collections.singleton(getTags((CommonElements) owner));
						}
					}
					return affected;
				}
			};
		}
		return command;
	}

	@Override
	public void dispose() {
		if (this.coreClassifiersIP != null) {
			this.coreClassifiersIP.dispose();
		}
		if (this.memoryClassifiersIP != null) {
			this.memoryClassifiersIP.dispose();
		}
		if (this.tagsIP != null) {
			this.tagsIP.dispose();
		}
		super.dispose();
	}


	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SWModel.class)) {
		case AmaltheaPackage.COMMON_ELEMENTS__CORE_CLASSIFIERS:
		case AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS:
		case AmaltheaPackage.COMMON_ELEMENTS__TAGS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}
}
