/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.provider.RunnableItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedSWModelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.RunnableItemsIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedRunnableItemProvider extends RunnableItemProvider {

	protected RunnableItemsIP runnableItemsIP;

	private final EStructuralFeature feature_RUNNABLE_ITEMS = AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems();

	public ExtendedRunnableItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(final Object object) {
		final Object swModel = super.getParent(object);
		final ExtendedSWModelItemProvider swModelItemProvider = (ExtendedSWModelItemProvider) this.adapterFactory
				.adapt(swModel, ITreeItemContentProvider.class);
		return swModelItemProvider != null ? swModelItemProvider.getRunnables((SWModel) swModel) : null;
	}

	public RunnableItemsIP getRunnableItems(final Runnable runnable) {
		if (null == this.runnableItemsIP) {
			this.runnableItemsIP = new RunnableItemsIP(this.adapterFactory, runnable);
		}
		return this.runnableItemsIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(this.feature_RUNNABLE_ITEMS);
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		children.add(getRunnableItems((Runnable) object));
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
		if (feature == feature_RUNNABLE_ITEMS) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature == feature_RUNNABLE_ITEMS) {
							affected = Collections.singleton(getRunnableItems(((Runnable) owner)));
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
		if (null != this.runnableItemsIP) {
			this.runnableItemsIP.dispose();
		}
		super.dispose();
	}

}
