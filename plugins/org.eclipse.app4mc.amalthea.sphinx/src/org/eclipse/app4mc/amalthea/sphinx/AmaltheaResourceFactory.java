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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class AmaltheaResourceFactory extends XMIResourceFactoryImpl {

	public AmaltheaResourceFactory() {
		super();
	}

	/**
	 * Adds UTF-8 encoding to AMALTHEA resource.
	 *
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl#createResource(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public Resource createResource(final URI uri) {

		System.out.println(uri.toString());

		boolean canLoadAmalthea = canLoadAmaltheaModel(uri);

		if(canLoadAmalthea) {
			return new AmaltheaResource(uri);
		}else {
			return null;
		}

	}

/**
 * This method is used to verify if Amalthea model can be loaded from the specified URI
 * Note: In UI mode, if the "amlt.no.load.nature" is specified on a IProject, corresponding Amalthea models inside a project will not be loaded	
 * @param uri
 * @return boolean (true if Amalthea model is loaded successfully, false if model is not allowed to be loaded)
 */
	private boolean canLoadAmaltheaModel(final URI uri) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		
		if(workspace !=null) {
			IWorkspaceRoot root = workspace.getRoot();

			if(root !=null) {
				
				String scheme = uri.scheme();
				
				if(scheme !=null) {
					int segmentCount=uri.segmentCount();
					
					if(scheme.equals("platform") && segmentCount>1 && uri.segment(0).equals("resource")) {
						
						StringBuilder resourcePath = new StringBuilder();
						for (int segementNumber = 1, size = uri.segmentCount(); segementNumber < size; ++segementNumber) {
							resourcePath.append('/'+uri.segment(segementNumber));
						}
						IFile iFile = root.getFile(new Path(resourcePath.toString()));

						IProject project = iFile.getProject();
						try {
							if (project.getNature("amlt.no.load.nature") != null) {
								return false;
							}
						} catch (CoreException e) {
							e.printStackTrace();
						}
					
					}
				}
				
			}
		}
		
		return true;
	}

}
