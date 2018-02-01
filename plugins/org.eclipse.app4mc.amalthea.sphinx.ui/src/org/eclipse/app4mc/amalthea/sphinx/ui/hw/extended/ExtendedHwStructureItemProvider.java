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

package org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.provider.HwStructureItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedHWModelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwConnectionIP;
import org.eclipse.app4mc.amalthea.sphinx.ui.hw.container.HwModuleIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

public class ExtendedHwStructureItemProvider extends HwStructureItemProvider {

	protected HwConnectionIP hwDirectConnectionIP;
	protected HwModuleIP hwModuleIP;

	private final EStructuralFeature HWSTRUCTURE_DIRECTCONNECTIONS = AmaltheaPackage.eINSTANCE.getHwStructure_Connections();
	private final EStructuralFeature HWSTRUCTURE_HWMODULE = AmaltheaPackage.eINSTANCE.getHwStructure_Modules();

	public ExtendedHwStructureItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object object) {
		final Object hwModel = super.getParent(object);
		final ExtendedHWModelItemProvider hwModelItemProvider = (ExtendedHWModelItemProvider) this.adapterFactory
				.adapt(hwModel, ITreeItemContentProvider.class);
		return hwModelItemProvider != null ? hwModelItemProvider.getHWStructure((HWModel) hwModel) : null;
	}

	/**
	 * @return the DirectConnections
	 */
	public HwConnectionIP getDirectConnections(final HwStructure hwStructure) {
		if (null == this.hwDirectConnectionIP) {
			this.hwDirectConnectionIP = new HwConnectionIP(this.adapterFactory, hwStructure);
		}
		return this.hwDirectConnectionIP;
	}

	/**
	 * @return the HWModules
	 */
	public HwModuleIP getHWModule(final HwStructure hwStructure) {
		if (null == this.hwModuleIP) {
			this.hwModuleIP = new HwModuleIP(this.adapterFactory, hwStructure);
		}
		return this.hwModuleIP;
	}

	/**
	 * @see org.eclipse.app4mc.amalthea.model.providerHWStrucutureItemProvider#getChildrenFeatures(java.lang.Object)
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(this.HWSTRUCTURE_DIRECTCONNECTIONS);
		this.childrenFeatures.remove(this.HWSTRUCTURE_HWMODULE);
		return this.childrenFeatures;
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		children.add(getDirectConnections((HwStructure) object));
		children.add(getHWModule((HwStructure) object));
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
		if (this.HWSTRUCTURE_DIRECTCONNECTIONS == feature || this.HWSTRUCTURE_HWMODULE == feature) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature == AmaltheaPackage.eINSTANCE.getHwStructure_Connections()) {
							affected = Collections.singleton(getDirectConnections(((HwStructure) owner)));
						} else if (feature == AmaltheaPackage.eINSTANCE.getHwStructure_Modules()) {
							affected = Collections.singleton(getHWModule(((HwStructure) owner)));
						}
					}
					return affected;
				}
			};
		}
		return command;
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#dispose()
	 */
	@Override
	public void dispose() {
		if (null != this.hwDirectConnectionIP) {
			this.hwDirectConnectionIP.dispose();
		}
		if (null != this.hwModuleIP) {
			this.hwModuleIP.dispose();
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