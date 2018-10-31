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

package org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.provider.HwStructureItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwConnectionContainerIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwModuleContainerIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedHwStructureIP extends HwStructureItemProvider {

	protected HwConnectionContainerIP hwConnectionCIP;
	protected HwModuleContainerIP hwModuleCIP;

	private final EStructuralFeature feature_CONNECTIONS = AmaltheaPackage.eINSTANCE.getHwStructure_Connections();
	private final EStructuralFeature feature_MODULES = AmaltheaPackage.eINSTANCE.getHwStructure_Modules();

	public ExtendedHwStructureIP(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public HwConnectionContainerIP getConnectionsContainerIP(final HwStructure hwStructure) {
		if (this.hwConnectionCIP == null) {
			this.hwConnectionCIP = new HwConnectionContainerIP(this.adapterFactory, hwStructure);
		}
		return this.hwConnectionCIP;
	}

	public HwModuleContainerIP getModulesContainerIP(final HwStructure hwStructure) {
		if (this.hwModuleCIP == null) {
			this.hwModuleCIP = new HwModuleContainerIP(this.adapterFactory, hwStructure);
		}
		return this.hwModuleCIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(this.feature_CONNECTIONS);
		this.childrenFeatures.remove(this.feature_MODULES);
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		HwStructure hwStruct = (HwStructure) object;
		
		// only display virtual folders if not empty (on top of the list)
		if (hwStruct.getModules().size() > 0)
			children.add(0, getModulesContainerIP(hwStruct));
		if (hwStruct.getConnections().size() > 0)
			children.add(0, getConnectionsContainerIP(hwStruct));

		// move ports to top of the list
		children.removeAll(hwStruct.getPorts());
		children.addAll(0, hwStruct.getPorts());

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
		if (feature == feature_CONNECTIONS || feature == feature_MODULES) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature == feature_CONNECTIONS) {
							affected = Collections.singleton(getConnectionsContainerIP(((HwStructure) owner)));
						} else if (feature == feature_MODULES) {
							affected = Collections.singleton(getModulesContainerIP(((HwStructure) owner)));
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
		if (this.hwConnectionCIP != null) {
			this.hwConnectionCIP.dispose();
		}
		if (this.hwModuleCIP != null) {
			this.hwModuleCIP.dispose();
		}
		super.dispose();
	}

	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HwStructure.class)) {
		case AmaltheaPackage.HW_STRUCTURE__MODULES:
		case AmaltheaPackage.HW_STRUCTURE__CONNECTIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}

}