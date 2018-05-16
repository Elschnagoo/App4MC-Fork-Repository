/**
 * *******************************************************************************
 *  Copyright (c) 2018 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.provider.HWModelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwDefinitionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwDomainIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwFeatureIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedHWModelItemProvider extends HWModelItemProvider {

	protected HwFeatureIP hwFeatureIP;
	protected HwDefinitionIP hwDefinitionIP;
	protected HwDomainIP hwDomainIP;

	public ExtendedHWModelItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public HwFeatureIP getHwFeatures(final HWModel hwModel) {
		if (this.hwFeatureIP == null) {
			this.hwFeatureIP = new HwFeatureIP(this.adapterFactory, hwModel);
		}
		return this.hwFeatureIP;
	}

	public HwDefinitionIP getHwDefinitions(final HWModel hwModel) {
		if (this.hwDefinitionIP == null) {
			this.hwDefinitionIP = new HwDefinitionIP(this.adapterFactory, hwModel);
		}
		return this.hwDefinitionIP;
	}

	public HwDomainIP getHwDomains(final HWModel hwModel) {
		if (this.hwDomainIP == null) {
			this.hwDomainIP = new HwDomainIP(this.adapterFactory, hwModel);
		}
		return this.hwDomainIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getHWModel_FeatureCategories());
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getHWModel_Definitions());
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getHWModel_Domains());
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		final HWModel hwModel = (HWModel) object;
		
		// only display virtual folders if not empty (on top of the list)
		if (!hwModel.getFeatureCategories().isEmpty())
			children.add(0, getHwFeatures(hwModel));
		if (!hwModel.getDomains().isEmpty())
			children.add(0, getHwDomains(hwModel));
		if (!hwModel.getDefinitions().isEmpty())
			children.add(0, getHwDefinitions(hwModel));
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
		if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES
				|| feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DEFINITIONS
				|| feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DOMAINS) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES) {
							affected = Collections.singleton(getHwFeatures((HWModel) owner));
						} else if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DEFINITIONS) {
							affected = Collections.singleton(getHwDefinitions((HWModel) owner));
						} else if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DOMAINS) {
							affected = Collections.singleton(getHwDomains((HWModel) owner));
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
		if (this.hwFeatureIP != null) {
			this.hwFeatureIP.dispose();
		}
		if (this.hwDefinitionIP != null) {
			this.hwDefinitionIP.dispose();
		}
		if (this.hwDomainIP != null) {
			this.hwDomainIP.dispose();
		}

		super.dispose();
	}

	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HWModel.class)) {
		case AmaltheaPackage.HW_MODEL__FEATURE_CATEGORIES:
		case AmaltheaPackage.HW_MODEL__DEFINITIONS:
		case AmaltheaPackage.HW_MODEL__DOMAINS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}
}
