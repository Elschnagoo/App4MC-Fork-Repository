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
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwStructureIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedHWModelItemProvider extends HWModelItemProvider {

	protected HwDefinitionIP hwDefinitionIP;
	protected HwFeatureIP hwFeatureIP;
	protected HwDomainIP hwDomainIP;
	protected HwStructureIP hwStructureIP;

	public ExtendedHWModelItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object getHWFeatures(final HWModel hwModel) {
		if (this.hwFeatureIP == null) {
			this.hwFeatureIP = new HwFeatureIP(this.adapterFactory, hwModel);
		}
		return this.hwFeatureIP;
	}

	public Object getHWDefinition(final HWModel hwModel) {
		if (this.hwDefinitionIP == null) {
			this.hwDefinitionIP = new HwDefinitionIP(this.adapterFactory, hwModel);
		}
		return this.hwDefinitionIP;
	}

	public Object getHWStructure(final HWModel hwModel) {
		if (this.hwStructureIP == null) {
			this.hwStructureIP = new HwStructureIP(this.adapterFactory, hwModel);
		}
		return this.hwStructureIP;
	}

	public Object getHWDomain(final HWModel hwModel) {
		if (this.hwDomainIP == null) {
			this.hwDomainIP = new HwDomainIP(this.adapterFactory, hwModel);
		}
		return this.hwDomainIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getHWModel_Features());
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getHWModel_Definitions());
		this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getHWModel_Domains());
		// this.childrenFeatures.remove(AmaltheaPackage.eINSTANCE.getHWModel_HwStructure());
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		final HWModel hwModel = (HWModel) object;
		children.add(getHWFeatures(hwModel));
		children.add(getHWDefinition(hwModel));
		children.add(getHWDomain(hwModel));
		// children.add(getHWStructure(hwModel));
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
		if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__FEATURES
				|| feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DEFINITIONS
				|| feature.getFeatureID() == AmaltheaPackage.HW_MODEL__STRUCTURES) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__FEATURES) {
							affected = Collections.singleton(getHWFeatures((HWModel) owner));
						} else if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DEFINITIONS) {
							affected = Collections.singleton(getHWDefinition((HWModel) owner));
						} else if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__STRUCTURES) {
							affected = Collections.singleton(getHWStructure((HWModel) owner));
						} else if (feature.getFeatureID() == AmaltheaPackage.HW_MODEL__DOMAINS) {
							affected = Collections.singleton(getHWDomain((HWModel) owner));
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
		if (this.hwStructureIP != null) {
			this.hwStructureIP.dispose();
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
		case AmaltheaPackage.HW_MODEL__FEATURES:
		case AmaltheaPackage.HW_MODEL__DEFINITIONS:
		case AmaltheaPackage.HW_MODEL__STRUCTURES:
		case AmaltheaPackage.HW_MODEL__DOMAINS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}
}
