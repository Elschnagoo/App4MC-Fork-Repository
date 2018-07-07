/**
 ********************************************************************************
 * Copyright (c) 2015-2018 itemis AG and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *     itemis AG - initial API and implementation
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.providers;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor.ExtendedItemProviderAdapterFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sphinx.emf.explorer.BasicExplorerLabelProvider;

public class ExtendedExplorerLabelProvider extends BasicExplorerLabelProvider {

	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return ExtendedItemProviderAdapterFactory.INSTANCE;
	}
}
