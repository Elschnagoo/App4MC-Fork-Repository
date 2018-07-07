/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH.
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

package org.eclipse.app4mc.amalthea.sphinx;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.sphinx.emf.ecore.proxymanagement.ProxyResolutionBehavior;


public class AmaltheaExtendedEObjectImpl extends MinimalEObjectImpl.Container {

	/*
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#eResolveProxy(org.eclipse.emf.ecore.InternalEObject)
	 */
	@Override
	public EObject eResolveProxy(final InternalEObject proxy) {
		return ProxyResolutionBehavior.INSTANCE.eResolveProxy(this, proxy);
	}

}
