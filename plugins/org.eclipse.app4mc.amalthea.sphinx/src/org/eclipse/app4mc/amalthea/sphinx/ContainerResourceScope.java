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

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sphinx.emf.scoping.AbstractResourceScope;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;

public class ContainerResourceScope extends AbstractResourceScope {

	protected IContainer rootContainer;


	public ContainerResourceScope(final IResource resource) {
		Assert.isNotNull(resource);
		Assert.isTrue(!(resource instanceof IWorkspaceRoot));
		this.rootContainer = resource.getParent();
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#getRoot()
	 */
	@Override
	public IResource getRoot() {
		return this.rootContainer;
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#getReferencedRoots()
	 */
	@Override
	public Collection<IResource> getReferencedRoots() {
		return Collections.emptySet();
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#getReferencingRoots()
	 */
	@Override
	public Collection<IResource> getReferencingRoots() {
		return Collections.emptySet();
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#belongsTo(org.eclipse.core.resources.IFile, boolean)
	 */
	@Override
	public boolean belongsTo(final IFile file, final boolean includeReferencedScopes) {
		if (belongsToRootContainer(file, includeReferencedScopes)) {
			return true;
		}

		if (isShared(file)) {
			return true;
		}

		return false;
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#belongsTo(org.eclipse.emf.ecore.resource.Resource, boolean)
	 */
	@Override
	public boolean belongsTo(final Resource resource, final boolean includeReferencedScopes) {
		final IFile file = EcorePlatformUtil.getFile(resource);
		if (belongsToRootContainer(file, includeReferencedScopes)) {
			return true;
		}

		if (isShared(resource)) {
			return true;
		}

		return false;
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#belongsTo(org.eclipse.emf.common.util.URI, boolean)
	 */
	@Override
	public boolean belongsTo(final URI uri, final boolean includeReferencedScopes) {
		final IFile file = EcorePlatformUtil.getFile(uri);
		if (belongsToRootContainer(file, includeReferencedScopes)) {
			return true;
		}

		if (isShared(uri)) {
			return true;
		}

		return false;
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#didBelongTo(org.eclipse.core.resources.IFile, boolean)
	 */
	@Override
	public boolean didBelongTo(final IFile file, final boolean includeReferencedScopes) {
		return belongsToRootContainer(file, includeReferencedScopes);
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#didBelongTo(org.eclipse.emf.ecore.resource.Resource, boolean)
	 */
	@Override
	public boolean didBelongTo(final Resource resource, final boolean includeReferencedScopes) {
		final IFile file = EcorePlatformUtil.getFile(resource);
		return belongsToRootContainer(file, includeReferencedScopes);
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.IResourceScope#didBelongTo(org.eclipse.emf.common.util.URI, boolean)
	 */
	@Override
	public boolean didBelongTo(final URI uri, final boolean includeReferencedScopes) {
		final IFile file = EcorePlatformUtil.getFile(uri);
		return belongsToRootContainer(file, includeReferencedScopes);
	}

	protected boolean belongsToRootContainer(final IFile file, final boolean includeReferencedScopes) {
		if (file != null && null != this.rootContainer) {
			return this.rootContainer.equals(file.getParent());
		}
		return false;
	}

}
