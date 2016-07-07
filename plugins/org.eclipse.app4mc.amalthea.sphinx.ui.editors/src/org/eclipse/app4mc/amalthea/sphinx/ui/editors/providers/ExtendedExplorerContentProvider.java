/**
 * *******************************************************************************
 *  Copyright (c) 2013 itemis AG and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     itemis AG - initial API and implementation
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.sphinx.ui.editors.providers;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor.ExtendedItemProviderAdapterFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sphinx.emf.explorer.BasicExplorerContentProvider;

public class ExtendedExplorerContentProvider extends BasicExplorerContentProvider {

	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return ExtendedItemProviderAdapterFactory.INSTANCE;
	}
}
