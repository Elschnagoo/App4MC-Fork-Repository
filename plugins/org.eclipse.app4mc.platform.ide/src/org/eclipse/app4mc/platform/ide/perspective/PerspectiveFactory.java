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

package org.eclipse.app4mc.platform.ide.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Initial contributor: <a href="mailto:lothar.wendehals@itemis.de">Lothar Wendehals, itemis AG</a>
 */
public class PerspectiveFactory implements IPerspectiveFactory {

	/**
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void createInitialLayout(final IPageLayout layout) {
		layout.setEditorAreaVisible(true);

		final IFolderLayout explorerFolder = layout.createFolder(
				"org.eclipse.app4mc.platform.ui.perspective.explorerFolder", //$NON-NLS-1$
				IPageLayout.LEFT, 0.25f, layout.getEditorArea());
		explorerFolder.addView("org.eclipse.app4mc.platform.ide.views.modelExplorer"); //$NON-NLS-1$
		explorerFolder.addView(IPageLayout.ID_PROJECT_EXPLORER);

		final IFolderLayout viewsFolder = layout.createFolder("org.eclipse.app4mc.platform.ui.perspective.viewsFolder", //$NON-NLS-1$
				IPageLayout.BOTTOM, 0.66f, layout.getEditorArea());
		viewsFolder.addView(IPageLayout.ID_PROP_SHEET);
		viewsFolder.addView(IPageLayout.ID_PROBLEM_VIEW);
		viewsFolder.addView(IPageLayout.ID_OUTLINE);
	}

}
