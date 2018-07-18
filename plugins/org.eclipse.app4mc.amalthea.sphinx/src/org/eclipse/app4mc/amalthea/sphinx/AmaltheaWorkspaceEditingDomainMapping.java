/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.osgi.util.NLS;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.workspace.domain.factory.IExtendedTransactionalEditingDomainFactory;
import org.eclipse.sphinx.emf.workspace.domain.mapping.AbstractWorkspaceEditingDomainMapping;
import org.eclipse.sphinx.platform.messages.PlatformMessages;

public class AmaltheaWorkspaceEditingDomainMapping extends AbstractWorkspaceEditingDomainMapping {

	protected Map<IMetaModelDescriptor, HashMap<IContainer, TransactionalEditingDomain>> mappedEditingDomains = Collections
			.synchronizedMap(new HashMap<IMetaModelDescriptor, HashMap<IContainer, TransactionalEditingDomain>>());

	@Override
	protected TransactionalEditingDomain createEditingDomain(IExtendedTransactionalEditingDomainFactory factory,
			Collection<IMetaModelDescriptor> mmDescriptors) {
		if (mmDescriptors.size() != 1) {
			throw new IllegalArgumentException(
					NLS.bind(PlatformMessages.error_unexpectedArrayLength, mmDescriptors.size(), 1));
		}
		return super.createEditingDomain(factory, mmDescriptors);
	}

	@Override
	public TransactionalEditingDomain getEditingDomain(IContainer container, IMetaModelDescriptor mmDescriptor) {
		if (mmDescriptor == null)
			return null;

		synchronized (mappedEditingDomains) {
			TransactionalEditingDomain transactionalEditingDomain = null;
			HashMap<IContainer, TransactionalEditingDomain> editingDomainsMap = mappedEditingDomains.get(mmDescriptor);

			// try to get existing editing domain
			if (editingDomainsMap != null) {
				transactionalEditingDomain = editingDomainsMap.get(container);
				if (transactionalEditingDomain != null)
					return transactionalEditingDomain;
			}
			
			// create new editing domain
			return createNewTransactionalEditingDomain(container, mmDescriptor);	
		}
	}

	private TransactionalEditingDomain createNewTransactionalEditingDomain(IContainer container,
			IMetaModelDescriptor mmDescriptor) {

		IExtendedTransactionalEditingDomainFactory factory = getEditingDomainFactory(mmDescriptor);
		TransactionalEditingDomain editingDomain = createEditingDomain(factory, Collections.singleton(mmDescriptor));

		HashMap<IContainer, TransactionalEditingDomain> hashMap = mappedEditingDomains.get(mmDescriptor);

		if (hashMap == null) {
			hashMap = new HashMap<IContainer, TransactionalEditingDomain>();
			mappedEditingDomains.put(mmDescriptor, hashMap);
		}

		hashMap.put(container, editingDomain);

		return editingDomain;
	}

	/*
	 * @see org.eclipse.sphinx.emf.workspace.domain.mapping.
	 * IWorkspaceEditingDomainMapping#getEditingDomains()
	 */
	@Override
	public List<TransactionalEditingDomain> getEditingDomains() {

		List<TransactionalEditingDomain> all = allOriginalEditingDomains();
		return Collections.unmodifiableList(all);
	}

	private List<TransactionalEditingDomain> allOriginalEditingDomains() {
		Collection<HashMap<IContainer, TransactionalEditingDomain>> values = mappedEditingDomains.values();

		List<TransactionalEditingDomain> all = new ArrayList<TransactionalEditingDomain>();

		for (HashMap<IContainer, TransactionalEditingDomain> hashMap : values) {
			all.addAll(hashMap.values());
		}
		return all;
	}

	/*
	 * @see org.eclipse.sphinx.emf.workspace.domain.mapping.
	 * AbstractWorkspaceEditingDomainMapping#preDisposeEditingDomain (org.
	 * eclipse.emf.transaction.TransactionalEditingDomain)
	 */
	@Override
	public void preDisposeEditingDomain(TransactionalEditingDomain editingDomain) {
		// Remove EditingDomain to be disposed from mapping

		Collection<HashMap<IContainer, TransactionalEditingDomain>> values = mappedEditingDomains.values();

		for (HashMap<IContainer, TransactionalEditingDomain> hashMap : values) {

			// cloning the master map, as direct modification of master map during iteration
			// will cause concurrent modification exception
			HashMap<IContainer, TransactionalEditingDomain> mapClone = new HashMap<IContainer, TransactionalEditingDomain>(
					hashMap);

			for (IContainer scope : mapClone.keySet()) {
				TransactionalEditingDomain transactionalEditingDomain = mapClone.get(scope);

				if (transactionalEditingDomain == editingDomain) {

					// removing contents from the master map
					hashMap.remove(scope);
				}
			}
		}

		super.preDisposeEditingDomain(editingDomain);
	}

	/*
	 * @see org.eclipse.sphinx.emf.workspace.domain.mapping.
	 * AbstractWorkspaceEditingDomainMapping#dispose()
	 */
	@Override
	public void dispose() {
		/*
		 * !! Important Note !! Perform iteration over unsynchronized copy of mapped
		 * editing domain set in order to avoid deadlocks between this thread intending
		 * to dispose all mapped editing domains and concurrent threads needing to
		 * access synchronized mapped editing domains meanwhile.
		 */
		List<TransactionalEditingDomain> unsynchronizedMappedEditingDomains = new ArrayList<TransactionalEditingDomain>(
				allOriginalEditingDomains());
		for (TransactionalEditingDomain editingDomain : unsynchronizedMappedEditingDomains) {
			editingDomain.dispose();
		}
		super.dispose();
	}

}
