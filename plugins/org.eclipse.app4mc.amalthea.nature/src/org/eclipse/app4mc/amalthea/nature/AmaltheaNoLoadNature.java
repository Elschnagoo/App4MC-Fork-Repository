/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.nature;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaMetaModelDescriptor;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaWorkspaceEditingDomainMapping;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.workspace.domain.WorkspaceEditingDomainManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class AmaltheaNoLoadNature implements IProjectNature {

	public static final String ID="amlt.no.load.nature";
	
	IProject project;
	@Override
	public void configure() throws CoreException {

			unloadAmaltheaModelElementsFromProject(project);
	}

	@Override
	public void deconfigure() throws CoreException {

	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project=project;
	}
	
	public static void unloadAmaltheaModelElementsFromProject(IProject project) {
		
		WorkspaceEditingDomainManager workspaceEditingDomainManager = WorkspaceEditingDomainManager.INSTANCE;
		
		Method declaredMethod;
		try {
			declaredMethod = workspaceEditingDomainManager.getClass().getDeclaredMethod("getEditingDomainMapping", new Class[] {IMetaModelDescriptor.class});
			
			Object editingDomainMapping=null;
			
			if(declaredMethod!=null) {
				
				
				if(declaredMethod.getName().equals("getEditingDomainMapping") && declaredMethod.getParameterCount()==1){
					
					try {
						editingDomainMapping=	declaredMethod.invoke(workspaceEditingDomainManager, AmaltheaMetaModelDescriptor.INSTANCE);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
					
				} 
			}else {
				editingDomainMapping = workspaceEditingDomainManager.getEditingDomainMapping();
			}
			
			if(editingDomainMapping instanceof AmaltheaWorkspaceEditingDomainMapping) {
				
				Map<IMetaModelDescriptor, HashMap<IContainer, TransactionalEditingDomain>> map = ((AmaltheaWorkspaceEditingDomainMapping) editingDomainMapping).mappedEditingDomains;
				
				HashMap<IContainer, TransactionalEditingDomain> hashMap = map.get(AmaltheaMetaModelDescriptor.INSTANCE);
				if(hashMap !=null) {
					Set<IContainer> keySet = hashMap.keySet();
					
					for (IContainer iContainer : keySet) {
						
						if(iContainer.getProject() == project) {
							
							TransactionalEditingDomain transactionalEditingDomain = hashMap.get(iContainer);
							
							ResourceSet resourceSet = transactionalEditingDomain.getResourceSet();
							EList<Resource> resources = resourceSet.getResources();
							resources.forEach(resource->{
								resource.unload();
							});
							resourceSet.getResources().clear();
						}
						
					}
				}
				

				IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorReference[] editorReferences = activePage.getEditorReferences();
				
				for (IEditorReference iEditorReference : editorReferences) {
					System.out.println(iEditorReference);
					IEditorPart editor = iEditorReference.getEditor(true);
					
					if(editor !=null) {
						activePage.closeEditor(editor, true);
					}
				}
			}
			
		} catch (NoSuchMethodException | SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
	}

}
