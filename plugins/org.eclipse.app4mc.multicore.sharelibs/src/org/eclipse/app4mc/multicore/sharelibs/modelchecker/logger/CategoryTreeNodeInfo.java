/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger;

import org.eclipse.swt.graphics.Image;

public class CategoryTreeNodeInfo {
	/**
	 * Name.
	 */
	private final String name;
	/**
	 * Count.
	 */
	private int count;
	/**
	 * Image.
	 */
	private final Image img;

	/**
	 * Constructor.
	 *
	 * @param name
	 *            name of the category
	 * @param img
	 *            image to be displayed left of the tree item
	 */
	public CategoryTreeNodeInfo(final String name, final Image img) {
		this.name = name;
		this.count = 0;
		this.img = img;
	}

	/**
	 * Set count
	 *
	 * @param count
	 */
	public void setCount(final int count) {
		this.count = count;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		if (this.count == 0) {
			return this.name;
		}

		return this.name + " (" + this.count + " items)";
	}

	/**
	 * Return image
	 *
	 * @return image
	 */
	public Image getImage() {
		return this.img;
	}

}
