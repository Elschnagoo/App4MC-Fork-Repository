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
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.provider.RunnableItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedSWModelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.sw.container.RunnableParametersContainerIP;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedRunnableIP extends RunnableItemProvider {

	protected RunnableParametersContainerIP runnableParamsCIP;

	private final EStructuralFeature feature_RUNNABLE_PARAMS = AmaltheaPackage.eINSTANCE.getRunnable_Parameters();

	public ExtendedRunnableIP(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(final Object object) {
		final Object swModel = super.getParent(object);
		final ExtendedSWModelItemProvider swModelItemProvider = (ExtendedSWModelItemProvider) this.adapterFactory
				.adapt(swModel, ITreeItemContentProvider.class);
		return swModelItemProvider != null ? swModelItemProvider.getRunnablesContainerIP((SWModel) swModel) : null;
	}

	public RunnableParametersContainerIP getRunnableParametersContainerIP(final Runnable runnable) {
		if (null == this.runnableParamsCIP) {
			this.runnableParamsCIP = new RunnableParametersContainerIP(this.adapterFactory, runnable);
		}
		return this.runnableParamsCIP;
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		super.getChildrenFeatures(object);
		this.childrenFeatures.remove(this.feature_RUNNABLE_PARAMS);
		return this.childrenFeatures;
	}

	@Override
	public Collection<?> getChildren(final Object object) {
		final List<Object> children = new ArrayList<Object>(super.getChildren(object));
		final Runnable runnable = (Runnable) object;

		// only display virtual folder if not empty
		if (!runnable.getParameters().isEmpty())
			children.add(0, getRunnableParametersContainerIP(runnable));
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
		if (feature == feature_RUNNABLE_PARAMS) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						if (feature == feature_RUNNABLE_PARAMS) {
							affected = Collections.singleton(getRunnableParametersContainerIP(((Runnable) owner)));
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
		if (null != this.runnableParamsCIP) {
			this.runnableParamsCIP.dispose();
		}
		super.dispose();
	}

}
