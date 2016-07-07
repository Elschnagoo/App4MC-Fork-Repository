/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx.validation.api;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sphinx.emf.util.EObjectUtil;

public class EObjectHelper implements IEObjectHelper {

	@Override
	public Object getName(final EObject element) {
		return getAttributeValueOf(element, "name"); //$NON-NLS-1$
	}

	@Override
	public Object getAttributeValueOf(final EObject item, final String attribName) {
		for (final EAttribute attr : item.eClass().getEAllAttributes()) {
			if (attr.getName().equalsIgnoreCase(attribName)) {
				return item.eGet(attr);
			}
		}

		return item.eClass().getName();
	}


	@Override
	public void printAllAttributesOf(final EObject item, final boolean... verbose) {
		System.out.println("A*********************************************************A");
		System.out.println("Name (=InstanceClass): " + item.eClass().getName());

		/**
		 * Checks whether to output more attribute relevant information or not
		 */
		if (verbose.length > 0 ? verbose[0] : false) {
			System.out.println("InstanceClassName: " + item.eClass().getInstanceClassName());
			System.out.println("InstanceTypeName: " + item.eClass().getInstanceTypeName());
			System.out.println("Operation Cnt: " + item.eClass().getOperationCount());
			System.out.println("eOperations Cnt: " + item.eClass().getEOperations().size());
			System.out.println("eAttributes Cnt: " + item.eClass().getEAttributes().size());
			System.out.println("eReferences Cnt: " + item.eClass().getEReferences().size());
		}

		for (final EAttribute attr : item.eClass().getEAttributes()) {
			System.out.println("  - Attribute pair: {name -> value}: \"" + attr.getName() + "\" -> \""
					+ item.eGet(attr) + "\"");
		}

		for (final EReference ref : item.eClass().getEReferences()) {
			System.out.println("  + Reference pair: {name -> value}: \"" + ref.getName() + "\" -> \"" + item.eGet(ref)
					+ "\"");
		}

		for (final EOperation op : item.eClass().getEOperations()) {
			System.out.println("  * Operation name: \"" + op.getName() + "\"");
		}

		System.out.println("Z*********************************************************Z");
	}

	@Override
	public <T> List<T> getAllInstancesOf(final EObject contextObject, final Class<T> type) {
		return EObjectUtil.getAllInstancesOf(contextObject, type, true);
	}

	@Override
	public <T> List<T> getAllInstancesAndInheritedOf(final EObject contextObject, final Class<T> type) {
		return EObjectUtil.getAllInstancesOf(contextObject, type, false);
	}
}
