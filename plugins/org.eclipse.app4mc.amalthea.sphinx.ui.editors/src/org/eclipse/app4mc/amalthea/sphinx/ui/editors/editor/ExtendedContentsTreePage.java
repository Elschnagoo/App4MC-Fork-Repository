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

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.Messages;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.providers.ExtendedColumnLabelProvider;
import org.eclipse.emf.transaction.ui.provider.TransactionalAdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.sphinx.emf.editors.forms.layouts.LayoutFactory;
import org.eclipse.sphinx.emf.editors.forms.pages.GenericContentsTreePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;

public class ExtendedContentsTreePage extends GenericContentsTreePage {

	public ExtendedContentsTreePage(final ExtendedBasicTransactionalFormEditor formEditor) {
		super(formEditor, Messages.ExtendedContentsTreePage_title);
	}

	public ExtendedContentsTreePage(final ExtendedBasicTransactionalFormEditor formEditor, final String title) {
		super(formEditor, title);
	}

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.pages.AbstractFormPage#getLabelProvider()
	 */
	@Override
	public IBaseLabelProvider getLabelProvider() {
		final IBaseLabelProvider provider = super.getLabelProvider();
		if (provider instanceof TransactionalAdapterFactoryLabelProvider) {
			return new ExtendedColumnLabelProvider((ExtendedBasicTransactionalFormEditor) getEditor(),
					(TransactionalAdapterFactoryLabelProvider) provider);
		}
		return provider;
	}

	/**
	 * @see org.eclipse.sphinx.emf.editors.forms.pages.GenericContentsTreePage#doCreateFormContent(org.eclipse.ui.forms.IManagedForm)
	 */
	@Override
	protected void doCreateFormContent(final IManagedForm managedForm) {
		// Create single columned page layout
		final Composite body = managedForm.getForm().getBody();
		body.setLayout(LayoutFactory.createFormBodyGridLayout(false, 1));

		// Create model contents tree section
		final ExtendedContentsTreeSection ects = new ExtendedContentsTreeSection(this, this.pageInput);
		ects.createContent(managedForm, body);
		addSection(ects);
		this.contentsTreeSection = ects;
	}

}
