/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwDefinitionContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwDomainContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwFeatureContainerIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedHWModelItemProvider extends HWModelItemProvider {

	protected HwFeatureContainerIP hwFeatureCIP;
	protected HwDefinitionContainerIP hwDefinitionCIP;
	protected HwDomainContainerIP hwDomainCIP;

	public ExtendedHWModelItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public HwFeatureContainerIP getHwFeaturesContainerIP(final HWModel hwModel) {
		if (this.hwFeatureCIP == null) {
			this.hwFeatureCIP = new HwFeatureContainerIP(this.adapterFactory, hwModel);
		}
		return this.hwFeatureCIP;
	}

	public HwDefinitionContainerIP getHwDefinitionsContainerIP(final HWModel hwModel) {
		if (this.hwDefinitionCIP == null) {
			this.hwDefinitionCIP = new HwDefinitionContainerIP(this.adapterFactory, hwModel);
		}
		return this.hwDefinitionCIP;
	}

	public HwDomainContainerIP getHwDomainsContainerIP(final HWModel hwModel) {
		if (this.hwDomainCIP == null) {
			this.hwDomainCIP = new HwDomainContainerIP(this.adapterFactory, hwModel);
		}
		return this.hwDomainCIP;
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
			children.add(0, getHwFeaturesContainerIP(hwModel));
		if (!hwModel.getDomains().isEmpty())
			children.add(0, getHwDomainsContainerIP(hwModel));
		if (!hwModel.getDefinitions().isEmpty())
			children.add(0, getHwDefinitionsContainerIP(hwModel));
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
							affected = Collections.singleton(getHwFeaturesContainerIP((HWModel) owner));
						} else if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DEFINITIONS) {
							affected = Collections.singleton(getHwDefinitionsContainerIP((HWModel) owner));
						} else if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DOMAINS) {
							affected = Collections.singleton(getHwDomainsContainerIP((HWModel) owner));
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
		if (this.hwFeatureCIP != null) {
			this.hwFeatureCIP.dispose();
		}
		if (this.hwDefinitionCIP != null) {
			this.hwDefinitionCIP.dispose();
		}
		if (this.hwDomainCIP != null) {
			this.hwDomainCIP.dispose();
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
