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

package org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.provider.ExecutionNeedItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.NeedEntriesContainerIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedExecutionNeedIP extends ExecutionNeedItemProvider {

	protected NeedEntriesContainerIP needEntriesCIP;

	private final EStructuralFeature feature_NEED_DEFAULT = AmaltheaPackage.eINSTANCE.getExecutionNeed_Default();

	public ExtendedExecutionNeedIP(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(final Object object) {
		final Object parent = super.getParent(object);

		if (parent instanceof Runnable) {
			final Runnable runnable = (Runnable) parent;
			final ExtendedRunnableIP runnableItemProvider = (ExtendedRunnableIP) this.adapterFactory
					.adapt(runnable, ITreeItemContentProvider.class);
			return runnableItemProvider != null ? runnableItemProvider.getRunnableItemsContainerIP((Runnable) runnable) : null;
		}
		return parent;
	}

	public NeedEntriesContainerIP getNeedEntryContainerIP(final ExecutionNeed execNeed) {
		if (null == this.needEntriesCIP) {
			this.needEntriesCIP = new NeedEntriesContainerIP(this.adapterFactory, execNeed);
		}
		return this.needEntriesCIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(this.feature_NEED_DEFAULT);
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		final ExecutionNeed need = (ExecutionNeed) object;
		
		// only display virtual folder if not empty
		if (!need.getDefault().isEmpty())
			children.add(0, getNeedEntryContainerIP(need));
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
		if (feature == feature_NEED_DEFAULT) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature == feature_NEED_DEFAULT) {
							affected = Collections.singleton(getNeedEntryContainerIP(((ExecutionNeed) owner)));
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
		if (null != this.needEntriesCIP) {
			this.needEntriesCIP.dispose();
		}
		super.dispose();
	}

}
