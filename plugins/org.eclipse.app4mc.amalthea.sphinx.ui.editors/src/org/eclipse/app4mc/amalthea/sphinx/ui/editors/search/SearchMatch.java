/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *     
 ********************************************************************************
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
