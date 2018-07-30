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

package org.eclipse.app4mc.amalthea.sphinx.ui.hw.container;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedSphinxTransientItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

public class HwDefinitionContainerIP extends ExtendedSphinxTransientItemProvider {

	public HwDefinitionContainerIP(final AdapterFactory adapterFactory, final HWModel parent) {
		super(adapterFactory);
		parent.eAdapters().add(this);
	}

	protected EStructuralFeature myFeature() {
		return AmaltheaPackage.eINSTANCE.getHWModel_Definitions();
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object object) {
		final StringBuffer buffer = new StringBuffer();
		buffer.append("Definitions ("); //$NON-NLS-1$
		buffer.append(((HWModel) getTarget()).getDefinitions().size());
		buffer.append(")"); //$NON-NLS-1$

		return buffer.toString();
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#collectNewChildDescriptors(java.util.Collection,
	 *      java.lang.Object)
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createMemoryDefinition()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createProcessingUnitDefinition()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createConnectionHandlerDefinition()));
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createCacheDefinition()));
	}

}
