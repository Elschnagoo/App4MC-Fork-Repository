/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended;

import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.provider.CallArgumentItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedCallArgumentIP extends CallArgumentItemProvider {

	public ExtendedCallArgumentIP(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object object) {
		final Object runnableCall = super.getParent(object);
		final ExtendedRunnableCallIP runnableCallIP = (ExtendedRunnableCallIP) this.adapterFactory
				.adapt(runnableCall, ITreeItemContentProvider.class);
		return runnableCallIP != null ? runnableCallIP.getCallArgumentsContainerIP((RunnableCall) runnableCall) : null;
	}

}
