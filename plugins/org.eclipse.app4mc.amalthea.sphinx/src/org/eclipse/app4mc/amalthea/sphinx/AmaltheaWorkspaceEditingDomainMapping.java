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

	 
	/**
	 * In case of Amalthea metamodel descriptor's: TransactionalEditingDomain's are mapped to the IContainer
	 */
	protected    Map<IContainer,TransactionalEditingDomain>  amlt_mappedEditingDomains = Collections
			.synchronizedMap(  new HashMap<IContainer,TransactionalEditingDomain> ());

	/**
	 * In case of non Amalthea metamodel descriptor's: Map associating one editing domain to each type of meta-model.
	 */
	protected Map<IMetaModelDescriptor, TransactionalEditingDomain> mappedEditingDomains = Collections
			.synchronizedMap(new HashMap<IMetaModelDescriptor, TransactionalEditingDomain>());
	
	 
	@Override
	protected TransactionalEditingDomain createEditingDomain(IExtendedTransactionalEditingDomainFactory factory,
			Collection<IMetaModelDescriptor> mmDescriptors) {
		if (mmDescriptors.size() != 1) {
			throw new IllegalArgumentException(NLS.bind(PlatformMessages.error_unexpectedArrayLength, mmDescriptors.size(), 1));
		}
		return super.createEditingDomain(factory, mmDescriptors);
	}
 
	@Override
	public TransactionalEditingDomain getEditingDomain(IContainer container, IMetaModelDescriptor mmDescriptor) {
		if (mmDescriptor == null) {
			return null;
		}
		if(mmDescriptor instanceof AmaltheaMetaModelDescriptor) {
			synchronized (amlt_mappedEditingDomains) {

				TransactionalEditingDomain  transactionalEditingDomain = amlt_mappedEditingDomains.get(container);

				if(transactionalEditingDomain !=null) {
					return transactionalEditingDomain;
				}else {
					IExtendedTransactionalEditingDomainFactory factory = getEditingDomainFactory(mmDescriptor);

					TransactionalEditingDomain editingDomain = createEditingDomain(factory, Collections.singleton(mmDescriptor));

					amlt_mappedEditingDomains.put(container, editingDomain);

					return editingDomain;
				}
			}
		}else {
			synchronized (mappedEditingDomains) {
				TransactionalEditingDomain editingDomain = mappedEditingDomains.get(mmDescriptor);
				if (editingDomain == null) {
					// Obtain the right editing domain factory
					IExtendedTransactionalEditingDomainFactory factory = getEditingDomainFactory(mmDescriptor);
					// Ask for the creation of a new editing domain
					editingDomain = createEditingDomain(factory, Collections.singleton(mmDescriptor));
					// Register the newly created editing domain
					mappedEditingDomains.put(mmDescriptor, editingDomain);
				}
				return editingDomain;
			}

		}

	}
 

	/*
	 * @see org.eclipse.sphinx.emf.workspace.domain.mapping.IWorkspaceEditingDomainMapping#getEditingDomains()
	 */
	@Override
	public List<TransactionalEditingDomain> getEditingDomains() {
		
		
		List<TransactionalEditingDomain> allTransactionalEditingDomains=new ArrayList<TransactionalEditingDomain>();
		
		allTransactionalEditingDomains.addAll(amlt_mappedEditingDomains.values());
		allTransactionalEditingDomains.addAll(mappedEditingDomains.values());
		
		return Collections.unmodifiableList(allTransactionalEditingDomains);
	}

	/*
	 * @see
	 * org.eclipse.sphinx.emf.workspace.domain.mapping.AbstractWorkspaceEditingDomainMapping#preDisposeEditingDomain
	 * (org. eclipse.emf.transaction.TransactionalEditingDomain)
	 */
	@Override
	public void preDisposeEditingDomain(TransactionalEditingDomain editingDomain) {
		// Remove EditingDomain to be disposed from mapping
		
		//Case 1: inside Amalthea Metamodel based group

		amlt_mappedEditingDomains.values().remove(editingDomain);
		
		//case 2: inside non Amalthea Metamodel based group
		
		mappedEditingDomains.values().remove(editingDomain);
		
		
		super.preDisposeEditingDomain(editingDomain);
	}

	/*
	 * @see org.eclipse.sphinx.emf.workspace.domain.mapping.AbstractWorkspaceEditingDomainMapping#dispose()
	 */
	@Override
	public void dispose() {
		/*
		 * !! Important Note !! Perform iteration over unsynchronized copy of mapped editing domain set in order to
		 * avoid deadlocks between this thread intending to dispose all mapped editing domains and concurrent threads
		 * needing to access synchronized mapped editing domains meanwhile.
		 */
		List<TransactionalEditingDomain> unsynchronizedMappedEditingDomains = new ArrayList<TransactionalEditingDomain>(amlt_mappedEditingDomains.values());
		for (TransactionalEditingDomain editingDomain : unsynchronizedMappedEditingDomains) {
			editingDomain.dispose();
		}
		
		unsynchronizedMappedEditingDomains = new ArrayList<TransactionalEditingDomain>(mappedEditingDomains.values());
		for (TransactionalEditingDomain editingDomain : unsynchronizedMappedEditingDomains) {
			editingDomain.dispose();
		}
		super.dispose();
	}
}
