/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.common.utils;


public class HrefElement {

	private final String fileName;

	private final String xmiID;


	public HrefElement(final String fileName, final String xmiID) {
		this.fileName = fileName;

		this.xmiID = xmiID;
	}

	public String getFileName() {
		return this.fileName;
	}


	public String getXmiID() {
		return this.xmiID;
	}


}
