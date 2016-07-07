/**
 * *******************************************************************************
 *  Copyright (c) 2013 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *     
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search;

import org.eclipse.search.ui.text.Match;
import org.eclipse.ui.IEditorInput;

/**
 * 
 * 
 */
public class SearchMatch extends Match {

	private final IEditorInput editorInput;

	@SuppressWarnings("javadoc")
	public SearchMatch(final Object element, final int offset, final int length, final IEditorInput editorInput) {
		super(element, offset, length);
		this.editorInput = editorInput;

	}

	@SuppressWarnings("javadoc")
	public SearchMatch(final Object element, final int unit, final int offset, final int length,
			final IEditorInput editorInput) {
		super(element, unit, offset, length);
		this.editorInput = editorInput;
	}

	/**
	 * @return the editorInput
	 */
	public IEditorInput getEditorInput() {
		return this.editorInput;
	}

}
