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

package org.eclipse.app4mc.amalthea.sphinx;

import org.eclipse.core.resources.IResource;
import org.eclipse.sphinx.emf.scoping.AbstractResourceScopeProvider;

public class ContainerResourceScopeProvider extends AbstractResourceScopeProvider {

	/*
	 * @see
	 * org.eclipse.sphinx.emf.scoping.AbstractResourceScopeProvider#createScope(org.eclipse.core.resources.IResource)
	 */
	@Override
	protected ContainerResourceScope createScope(final IResource resource) {
		return new ContainerResourceScope(resource);
	}


}
