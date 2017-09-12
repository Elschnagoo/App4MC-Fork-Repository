/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.common.container;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedSphinxTransientItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;

public class MemoryClassifiersIP extends ExtendedSphinxTransientItemProvider {

	public MemoryClassifiersIP(final AdapterFactory adapterFactory, final CommonElements parent) {
		super(adapterFactory);
		parent.eAdapters().add(this);
	}

	protected EStructuralFeature myFeature() {
		return AmaltheaPackage.eINSTANCE.getCommonElements_MemoryClassifiers();
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object object) {
		assert object instanceof CommonElements;
		final StringBuffer buffer = new StringBuffer();
		buffer.append("Memory Classifiers ("); //$NON-NLS-1$
		buffer.append(((CommonElements) getTarget()).getMemoryClassifiers().size());
		buffer.append(")"); //$NON-NLS-1$
		return buffer.toString();
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildrenFeatures(java.lang.Object)
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
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
		newChildDescriptors.add(createChildParameter(myFeature(), myFactory().createMemoryClassifier()));
	}

}
