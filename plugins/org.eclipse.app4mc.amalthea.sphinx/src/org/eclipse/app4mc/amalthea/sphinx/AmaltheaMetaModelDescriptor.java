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
 *     itemis AG, Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx;

import org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor;

public class AmaltheaMetaModelDescriptor extends AbstractMetaModelDescriptor {

	private static final String CONTENT_TYPE_ID = "org.eclipse.app4mc.amalthea.xmi.contentType";//$NON-NLS-1$

	public static final String ID = "org.eclipse.app4mc.amalthea.model";//$NON-NLS-1$

	private static final String NAME = "AMALTHEA Model";//$NON-NLS-1$

	private static final String BASE_NAMESPACE = "http://app4mc.eclipse.org/amalthea/0.9.4";

	// Old definition with subpackages -> no longer required
	// private static final String POSTFIX_PATTERN =
	// "(central|components|config|constraints|events|hw|mapping|os|propertyconstraints|stimuli|sw)";

	public static final AmaltheaMetaModelDescriptor INSTANCE = new AmaltheaMetaModelDescriptor();

	protected AmaltheaMetaModelDescriptor() {
		super(ID, BASE_NAMESPACE, NAME);
	}

	@Override
	public String getDefaultContentTypeId() {
		return CONTENT_TYPE_ID;
	}
}
