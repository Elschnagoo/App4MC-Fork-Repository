package org.eclipse.app4mc.amalthea.sphinx;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.sphinx.emf.domain.factory.EditingDomainFactoryListenerRegistry;
import org.eclipse.sphinx.emf.domain.factory.ITransactionalEditingDomainFactoryListener;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;
import org.eclipse.sphinx.platform.IExtendedPlatformConstants;

public class AmaltheaNoLoadEditingDomain extends TransactionalEditingDomainImpl implements IAdaptable {


	private Collection<IMetaModelDescriptor> fMetaModelDescriptors = new HashSet<IMetaModelDescriptor>();

	public AmaltheaNoLoadEditingDomain(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public AmaltheaNoLoadEditingDomain(AdapterFactory adapterFactory, ResourceSet resourceSet) {
		super(adapterFactory, resourceSet);
	}

	public AmaltheaNoLoadEditingDomain(AdapterFactory adapterFactory, TransactionalCommandStack commandStack) {
		super(adapterFactory, commandStack);
	}

	public AmaltheaNoLoadEditingDomain(AdapterFactory adapterFactory, TransactionalCommandStack commandStack, ResourceSet resourceSet) {
		super(adapterFactory, commandStack, resourceSet);
	}

	/**
	 * Returns an object which is an instance of the given class associated with this object. Returns
	 * <code>null</code> if no such object can be found.
	 * <p>
	 * This implementation of the method declared by <code>IAdaptable</code> passes the request along to the
	 * platform's adapter manager; roughly <code>Platform.getAdapterManager().getAdapter(this, adapter)</code>.
	 * Subclasses may override this method (however, if they do so, they should invoke the method on their
	 * superclass to ensure that the Platform's adapter manager is consulted).
	 * </p>
	 * 
	 * @param adapter
	 *            the class to adapt to
	 * @return the adapted object or <code>null</code>
	 * @see IAdaptable#getAdapter(Class)
	 * @see Platform#getAdapterManager()
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Object getAdapter(Class adapterType) {
		Object adapter = super.getAdapter(adapterType);
		if (adapter != null) {
			return adapter;
		}
		return Platform.getAdapterManager().getAdapter(this, adapterType);
	}

	public Collection<IMetaModelDescriptor> getMetaModelDescriptors() {
		return fMetaModelDescriptors;
	}

	@Override
	public boolean isReadOnly(Resource resource) {
		// FIXME File bug to EMF: NPE is raised when opening a platform:/plugin resource and resolving its URL in an
		// editor while workspace is closing
		try {
			return super.isReadOnly(resource);
		} catch (NullPointerException ex) {
			return true;
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	protected boolean isReadOnlyURI(URI uri) {
		// FIXME File bug to EMF: NPE is raised when calling this method for an URI that doesn't exist
		if (!EcoreResourceUtil.exists(uri)) {
			return true;
		}
		return super.isReadOnlyURI(uri);
	}

	@Override
	public void dispose() {
		/*
		 * !! Important Note !! First unload all resources in order to give a chance to registered
		 * ResourceSetListeners to act upon as needed. Wait until all of them are done and only then proceed with
		 * unregistering and disposing editing domain itself.
		 */
		EcorePlatformUtil.unloadAllResources(this, null);
		try {
			Job.getJobManager().join(IExtendedPlatformConstants.FAMILY_MODEL_LOADING, null);
		} catch (Exception ex) {
			// Ignore exception
		}
		firePreDisposeEditingDomain(fMetaModelDescriptors, this);
		super.dispose();
	}

	@Override
	public String toString() {
		return getID();
	}
	
	protected void firePreDisposeEditingDomain(Collection<IMetaModelDescriptor> metaModelDescriptors, TransactionalEditingDomain editingDomain) {
		for (IMetaModelDescriptor mmd : metaModelDescriptors) {
			// Retrieve and notify TEDFactoryListeners contributed to
			// 'org.eclipse.sphinx.emf.editingDomainFactoryListeners'
			for (ITransactionalEditingDomainFactoryListener listener : EditingDomainFactoryListenerRegistry.INSTANCE.getListeners(mmd)) {
				listener.preDisposeEditingDomain(editingDomain);
			}
		}
	}

}
