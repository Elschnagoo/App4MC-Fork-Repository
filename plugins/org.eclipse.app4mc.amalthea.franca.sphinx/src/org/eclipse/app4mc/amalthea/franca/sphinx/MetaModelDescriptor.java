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
 *     itemis AG - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.franca.sphinx;

import org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor;

public class MetaModelDescriptor extends AbstractMetaModelDescriptor {

	private static final String ID = "org.franca.core"; //$NON-NLS-1$

	private static final String NAMESPACE = "http://core.franca.org"; //$NON-NLS-1$

	private static final String NAME = "Franca IDL Model"; //$NON-NLS-1$

	private static final String CONTENT_TYPE_ID = "org.franca.core.contentType"; //$NON-NLS-1$

	public static final MetaModelDescriptor INSTANCE = new MetaModelDescriptor();


	public MetaModelDescriptor() {
		super(ID, NAMESPACE, NAME);
	}

	/**
	 * @see org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor#getDefaultContentTypeId()
	 */
	@Override
	public String getDefaultContentTypeId() {
		return CONTENT_TYPE_ID;
	}

}
