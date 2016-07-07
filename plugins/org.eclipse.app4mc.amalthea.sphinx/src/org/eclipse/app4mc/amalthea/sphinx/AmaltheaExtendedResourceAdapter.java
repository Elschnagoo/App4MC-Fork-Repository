/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter;

public class AmaltheaExtendedResourceAdapter extends ExtendedResourceAdapter {


	@Override
	public URI createURI(final String uriLiteral, final EClass eClass) {

		return super.createURI(uriLiteral, eClass);
	}

	@Override
	public URI getHREF(final EObject eObject) {

		return super.getHREF(eObject);
	}

	@Override
	protected URI getURI(final URI resourceURI, final String eObjectURIFragment, final boolean resolve) {
		if (!resolve) {
			return createAmaltheaURI(eObjectURIFragment);
		}
		return getURI(resourceURI, eObjectURIFragment);
	}


	private URI createAmaltheaURI(final String uRIFragment) {
		return URI.createURI("amlt" + URI_SCHEME_SEPARATOR + URI_SEGMENT_SEPARATOR + URI_FRAGMENT_SEPARATOR
				+ uRIFragment, true);


	}
}
