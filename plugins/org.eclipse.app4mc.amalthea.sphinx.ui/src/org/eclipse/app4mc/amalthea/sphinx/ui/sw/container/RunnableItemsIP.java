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

package org.eclipse.app4mc.amalthea.sphinx.ui.sw.container;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.provider.AmaltheaEditPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sphinx.emf.edit.TransientItemProvider;

public class RunnableItemsIP extends TransientItemProvider {

	public RunnableItemsIP(final AdapterFactory adapterFactory, final Runnable parent) {
		super(adapterFactory);
		parent.eAdapters().add(this);
	}

	private EStructuralFeature myFeature() {
		return AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems();
	}

	private AmaltheaFactory myFactory() {
		return AmaltheaFactory.eINSTANCE;
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object object) {
		return getString("_UI_Runnable_runnableItems_feature"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildrenFeatures(java.lang.Object)
	 */
	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		if (this.childrenFeatures == null) {
			super.getChildrenFeatures(object);
			this.childrenFeatures.add(myFeature());
		}
		return this.childrenFeatures;
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#collectNewChildDescriptors(java.util.Collection,
	 *      java.lang.Object)
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createGroup()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createRunnableInstructions()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createLabelAccess()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createRunnableCall()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createSemaphoreAccess()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createModeLabelAccess()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createRunnableModeSwitch()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createRunnableProbabilitySwitch()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createSenderReceiverRead()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createSenderReceiverWrite()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createSynchronousServerCall()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createAsynchronousServerCall()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createChannelReceive()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createChannelSend()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createCustomEventTrigger()));
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createDragAndDropCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.lang.Object, float, int, int, java.util.Collection)
	 */
	@Override
	protected Command createDragAndDropCommand(final EditingDomain domain, final Object owner, final float location,
			final int operations, final int operation, final Collection<?> collection) {
		if (!(owner instanceof TransientItemProvider)
				&& new AddCommand(domain, (EObject) owner, myFeature(), collection).canExecute()) {
			return super.createDragAndDropCommand(domain, owner, location, operations, operation, collection);
		}
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getResourceLocator()
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AmaltheaEditPlugin.INSTANCE.getPluginResourceLocator();
	}

}
