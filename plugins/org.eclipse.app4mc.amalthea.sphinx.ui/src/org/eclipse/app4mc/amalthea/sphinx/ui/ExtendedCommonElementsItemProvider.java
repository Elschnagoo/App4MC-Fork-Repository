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
 *  Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
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
import org.eclipse.app4mc.amalthea.sphinx.ui.common.container.CoreClassifiersContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.container.MemoryClassifiersContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.common.container.TagsContainerIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedCommonElementsItemProvider extends CommonElementsItemProvider {

	protected CoreClassifiersContainerIP coreClassifiersCIP;
	protected MemoryClassifiersContainerIP memoryClassifiersCIP;
	protected TagsContainerIP tagsCIP;
	
	public ExtendedCommonElementsItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public CoreClassifiersContainerIP getCoreClassifiersContainerIP(final CommonElements owner) {
		if (this.coreClassifiersCIP == null) {
			this.coreClassifiersCIP = new CoreClassifiersContainerIP(this.adapterFactory, owner);
		}
		return this.coreClassifiersCIP;
	}

	public MemoryClassifiersContainerIP getMemoryClassifiersContainerIP(final CommonElements owner) {
		if (this.memoryClassifiersCIP == null) {
			this.memoryClassifiersCIP = new MemoryClassifiersContainerIP(this.adapterFactory, owner);
		}
		return this.memoryClassifiersCIP;
	}

	public TagsContainerIP getTagsContainerIP(final CommonElements owner) {
		if (this.tagsCIP == null) {
			this.tagsCIP = new TagsContainerIP(this.adapterFactory, owner);
		}
		return this.tagsCIP;
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

		// only display virtual folders if not empty
		if (!commonElements.getCoreClassifiers().isEmpty())
			children.add(getCoreClassifiersContainerIP(commonElements));
		if (!commonElements.getMemoryClassifiers().isEmpty())
			children.add(getMemoryClassifiersContainerIP(commonElements));
		if (!commonElements.getTags().isEmpty())
			children.add(getTagsContainerIP(commonElements));
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
							affected = Collections.singleton(getCoreClassifiersContainerIP((CommonElements) owner));
						}
						else if (feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__MEMORY_CLASSIFIERS) {
							affected = Collections.singleton(getMemoryClassifiersContainerIP((CommonElements) owner));
						}
						else if (feature.getFeatureID() == AmaltheaPackage.COMMON_ELEMENTS__TAGS) {
							affected = Collections.singleton(getTagsContainerIP((CommonElements) owner));
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
		if (this.coreClassifiersCIP != null) {
			this.coreClassifiersCIP.dispose();
		}
		if (this.memoryClassifiersCIP != null) {
			this.memoryClassifiersCIP.dispose();
		}
		if (this.tagsCIP != null) {
			this.tagsCIP.dispose();
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
