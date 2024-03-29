/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx.ui.editors;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor.ExtendedBasicTransactionalFormEditor;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.Messages;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ShowTypesAction extends Action {

	private final ExtendedBasicTransactionalFormEditor editor;

	private final StructuredViewer viewer;

	public ShowTypesAction(final ExtendedBasicTransactionalFormEditor editor, final StructuredViewer viewer) {
		super(Messages.ShowTypesAction_title, AS_CHECK_BOX);
		this.editor = editor;
		this.viewer = viewer;
		setChecked(true);
		if(this.editor!=null) {
			this.editor.setShowTypesOfElements(isChecked());
		}
//		setChecked(editor.isShowTypesOfElements());
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(SphinxSupportPlugin.getPluginId(),
				"/icons/full/obj16/showtypes.png")); //$NON-NLS-1$
		setToolTipText(Messages.ShowTypesAction_tooltip);
		
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		this.editor.setShowTypesOfElements(isChecked());
		this.viewer.refresh();
	}

}
