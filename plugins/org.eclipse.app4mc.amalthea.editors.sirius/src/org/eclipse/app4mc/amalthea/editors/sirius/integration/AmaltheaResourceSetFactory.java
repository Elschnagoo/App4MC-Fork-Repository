/*********************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetFactory;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSetImpl;

/**
 * @author kud7fe
 *
 */
public class AmaltheaResourceSetFactory extends ResourceSetFactory {

	@Override
	public ResourceSet createResourceSet(final URI resourceURI) {
//		IFile iFile = EcorePlatformUtil.getFile(resourceURI);
//		IContainer directory = iFile.getParent();
//		final List<String> amxmiFileNames = new ArrayList<String>();
//		for (final File file : directory.getLocation().toFile().listFiles()) {
//			if (file.getName().endsWith(".amxmi")) {
//				amxmiFileNames.add(file.getName());
//			}
//		}
//		TransactionalEditingDomain editingDomain1 = null;
//		for (final String amxmiFileName : amxmiFileNames) {
//			iFile = directory.getFile(new Path(amxmiFileName));
//			editingDomain1 = WorkspaceEditingDomainUtil.getEditingDomain(iFile);
////			EcorePlatformUtil.loadResource(iFile, null);
//		}
//		TransactionalEditingDomain editingDomain = WorkspaceEditingDomainUtil.getEditingDomain(iFile);
//		return editingDomain.getResourceSet();
		final ExtendedResourceSet resSet = new ExtendedResourceSetImpl();
		SiriusAmaltheaResourceFactory arsf = new SiriusAmaltheaResourceFactory();
		
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", arsf);
		return resSet;
	}

}
