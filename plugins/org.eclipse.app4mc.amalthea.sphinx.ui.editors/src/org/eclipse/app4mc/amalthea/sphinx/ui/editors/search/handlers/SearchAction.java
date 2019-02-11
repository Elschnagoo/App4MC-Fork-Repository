/**
 ********************************************************************************
 * Copyright (c) 2013-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search.handlers;

import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.SphinxSupportPlugin;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor.ExtendedBasicTransactionalFormEditor;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.Messages;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.search.ModelHitCollector;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class SearchAction extends Action {

	private final ExtendedBasicTransactionalFormEditor editor;

	public SearchAction(final StructuredViewer viewer, final ExtendedBasicTransactionalFormEditor editor) {
		super(Messages.SearchAction_title, AS_PUSH_BUTTON);
		this.editor = editor;
		// image taken from
		// https://github.com/eclipse/mylyn.commons/blob/d95886e9e377efa663da5901661d20e5e0da9a49/org.eclipse.mylyn.commons.ui/icons/etool16/find.gif
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(SphinxSupportPlugin.getPluginId(),
				"/icons/full/obj16/find.gif")); //$NON-NLS-1$
		setToolTipText(Messages.SearchGUI_title);
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final SearchDialogSettings settings = new SearchDialogSettings();
		
		// retrieve stored settings
		final IDialogSettings store = SphinxSupportPlugin.getDefault().getDialogSettings();
		settings.loadFrom(store);
		
		final SearchDialog gui = new SearchDialog(window.getShell(), settings);
		gui.create();
		if (gui.open() == Window.OK) {
			final Pattern searchPattern = settings.computeSearchPattern();
			if (searchPattern != null) {
				// store settings
				settings.saveTo(store);
				
				// getting current open model
				final Object input = this.editor.getEditorInputObject();
				if (input != null) {
					EObject model = null;
					if (input instanceof EObject) {
						model = (EObject) input;
					}
					else if (input instanceof Resource) {
						if (((Resource) input).getContents().size() > 0) {
							model = ((Resource) input).getContents().get(0);
						}
					}
					if (model != null) {
						final ModelHitCollector query = new ModelHitCollector (
								searchPattern,
								settings.computeFilterClass(),
								settings.m_restrictToFile,
								model,
								this.editor.getEditorInput());
						NewSearchUI.runQueryInBackground(query);
					}
				}
			}
		}
	}
}
