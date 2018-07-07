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

package org.eclipse.app4mc.amalthea.sphinx.validation.api;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sphinx.emf.util.EObjectUtil;

public class EObjectHelper implements IEObjectHelper {

	@Override
	public Object getName(final EObject obj) {
		if (obj == null) return "???";
		
		return getAttributeValueOf(obj, "name"); //$NON-NLS-1$
	}

	@Override
	public Object getClassName(EObject obj) {
		if (obj == null) return "???";

		return obj.eClass().getName();
	}

	@Override
	public Object getAttributeValueOf(final EObject obj, final String attribName) {
		if (obj == null) return "???";

		for (final EAttribute attr : obj.eClass().getEAllAttributes()) {
			if (attr.getName().equalsIgnoreCase(attribName)) {
				Object value = obj.eGet(attr);
				if (value != null) return value;
			}
		}

		return obj.eClass().getName();
	}


	@Override
	public void printAllAttributesOf(final EObject obj, final boolean... verbose) {
		System.out.println("A*********************************************************A");
		System.out.println("Name (=InstanceClass): " + obj.eClass().getName());

		/**
		 * Checks whether to output more attribute relevant information or not
		 */
		if (verbose.length > 0 ? verbose[0] : false) {
			System.out.println("InstanceClassName: " + obj.eClass().getInstanceClassName());
			System.out.println("InstanceTypeName: " + obj.eClass().getInstanceTypeName());
			System.out.println("Operation Cnt: " + obj.eClass().getOperationCount());
			System.out.println("eOperations Cnt: " + obj.eClass().getEOperations().size());
			System.out.println("eAttributes Cnt: " + obj.eClass().getEAttributes().size());
			System.out.println("eReferences Cnt: " + obj.eClass().getEReferences().size());
		}

		for (final EAttribute attr : obj.eClass().getEAttributes()) {
			System.out.println("  - Attribute pair: {name -> value}: \"" + attr.getName() + "\" -> \""
					+ obj.eGet(attr) + "\"");
		}

		for (final EReference ref : obj.eClass().getEReferences()) {
			System.out.println("  + Reference pair: {name -> value}: \"" + ref.getName() + "\" -> \"" + obj.eGet(ref)
					+ "\"");
		}

		for (final EOperation op : obj.eClass().getEOperations()) {
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
