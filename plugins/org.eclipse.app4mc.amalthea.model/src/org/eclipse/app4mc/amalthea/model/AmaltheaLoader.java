/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSet;
import org.eclipse.sphinx.emf.resource.ExtendedResourceSetImpl;

public class AmaltheaLoader {

	public static Amalthea loadFromFile(URI uri) {
		final ResourceSet resSet = initializeResourceSet();
		
		java.lang.System.out.println("Reading file: " + uri.toString());

		final Resource res = resSet.createResource(uri);
		try {
			res.load(null);
		} catch (IOException e) {
			// ignore
		}
		for (final EObject content : res.getContents()) {
			if (content instanceof Amalthea) {
				return (Amalthea) content;
			}
		}

		return null;
	}

	private static ResourceSet initializeResourceSet() {
		final ExtendedResourceSet resSet = new ExtendedResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());
		AmaltheaPackage.eINSTANCE.eClass(); // register the package

		return resSet;
	}
	
}
