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

package org.eclipse.app4mc.amalthea.sphinx.ui.sw.container;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedSphinxTransientItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

public class RunnableItemsContainerIP extends ExtendedSphinxTransientItemProvider {

	public RunnableItemsContainerIP(final AdapterFactory adapterFactory, final Runnable parent) {
		super(adapterFactory);
		parent.eAdapters().add(this);
	}

	protected EStructuralFeature myFeature() {
		return AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems();
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object object) {
		return getString("_UI_Runnable_runnableItems_feature"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#collectNewChildDescriptors(java.util.Collection,
	 *      java.lang.Object)
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createGroup()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createExecutionNeed()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createExecutionTicks()));
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
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createGetResultServerCall()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createChannelReceive()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createChannelSend()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createCustomEventTrigger()));
	}

}
