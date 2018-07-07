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
 ********************************************************************************
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
