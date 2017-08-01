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

package org.eclipse.app4mc.amalthea.editors.sirius.integration;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter;

public class SiriusAmaltheaResource extends org.eclipse.app4mc.amalthea.sphinx.AmaltheaResource {

	protected ExtendedResourceAdapter extendedResourceAdapter;

	public SiriusAmaltheaResource() {
		super();
	}

	public SiriusAmaltheaResource(final URI uri) {
		super(uri);
	}

}
