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

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.ShowTypesAction;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.actions.SearchAction;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.actions.ValidateAction;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.sphinx.emf.editors.forms.pages.AbstractFormPage;
import org.eclipse.sphinx.emf.editors.forms.sections.GenericContentsTreeSection;
import org.eclipse.swt.SWT;

public class ExtendedContentsTreeSection extends GenericContentsTreeSection {

	public ExtendedContentsTreeSection(final AbstractFormPage formPage, final Object sectionInput) {
		super(formPage, sectionInput, SWT.NONE);

	}

	public ExtendedContentsTreeSection(final AbstractFormPage formPage, final Object sectionInput, final int style) {
		super(formPage, sectionInput, style);
	}

	/**
	 * Adding {@link SearchAction} to the tool bar of the editor.
	 *
	 * @see org.eclipse.sphinx.emf.editors.forms.sections.AbstractFormSection#fillSectionToolBarActions(org.eclipse.jface.action.ToolBarManager)
	 */
	@Override
	protected void fillSectionToolBarActions(final ToolBarManager toolBarManager) {
		super.fillSectionToolBarActions(toolBarManager);
		toolBarManager.add(new ShowTypesAction((ExtendedBasicTransactionalFormEditor) this.formPage.getEditor(),
				(StructuredViewer) getViewer()));
		toolBarManager.add(new SearchAction((StructuredViewer) getViewer(),
				(ExtendedBasicTransactionalFormEditor) this.formPage.getEditor()));
		toolBarManager.add(new ValidateAction((StructuredViewer) getViewer(),
				(ExtendedBasicTransactionalFormEditor) this.formPage.getEditor()));
	}

}
