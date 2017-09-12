package org.eclipse.app4mc.amalthea.sphinx.ui;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.provider.AmaltheaEditPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sphinx.emf.edit.TransientItemProvider;

public abstract class ExtendedSphinxTransientItemProvider extends TransientItemProvider {

	public ExtendedSphinxTransientItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	
	protected abstract EStructuralFeature myFeature();
	
	protected AmaltheaFactory myFactory() {
		return AmaltheaFactory.eINSTANCE;
	}

	
	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createDragAndDropCommand(org.eclipse.emf.edit.domain.EditingDomain,
	 *      java.lang.Object, float, int, int, java.util.Collection)
	 */
	@Override
	protected Command createDragAndDropCommand(final EditingDomain domain, final Object owner, final float location,
			final int operations, final int operation, final Collection<?> collection) {
		if (!(owner instanceof TransientItemProvider)
				&& new AddCommand(domain, (EObject) owner, myFeature(), collection).canExecute()) {
			return super.createDragAndDropCommand(domain, owner, location, operations, operation, collection);
		}
		return UnexecutableCommand.INSTANCE;
	}


	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getResourceLocator()
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AmaltheaEditPlugin.INSTANCE.getPluginResourceLocator();
	}

}
