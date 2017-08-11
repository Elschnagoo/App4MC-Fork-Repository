/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.labelproviders;

import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.LoggerEntry;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TreeNode;

public class TypeLabelProvider extends ColumnLabelProvider {

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object element) {
		if (!(element instanceof TreeNode)) {
			return "";
		}

		final TreeNode node = (TreeNode) element;
		final Object value = node.getValue();

		if (value instanceof LoggerEntry) {
			final LoggerEntry entry = (LoggerEntry) value;
			return entry.getType();
		}

		return "";

	}
}

