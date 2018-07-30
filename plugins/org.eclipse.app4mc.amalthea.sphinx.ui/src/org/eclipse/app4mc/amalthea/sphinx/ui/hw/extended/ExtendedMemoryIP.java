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

import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.provider.MemoryItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedMemoryIP extends MemoryItemProvider {

	public ExtendedMemoryIP(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object object) {
		final Object hwStructure = super.getParent(object);
		final ExtendedHwStructureIP hwStructureItemProvider = (ExtendedHwStructureIP) this.adapterFactory
				.adapt(hwStructure, ITreeItemContentProvider.class);
		return hwStructureItemProvider != null ? hwStructureItemProvider.getModulesContainerIP((HwStructure) hwStructure) : null;
	}

}
