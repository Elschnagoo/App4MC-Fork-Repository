/**
 * *******************************************************************************
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

package org.eclipse.app4mc.amalthea.model.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public final class CheckMetamodelStructure {

	public static void main(String[] args) {

		AmaltheaPackage amPackage = AmaltheaPackage.eINSTANCE;

		// Get all classes

		List<EClass> classList = new ArrayList<EClass>();
		for (EClassifier classifier : amPackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				classList.add((EClass) classifier);
			}
		}

		// Find references to classes without unique name

		for (EClass eClass : classList) {
			for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
				if (feature instanceof EReference) {
					EReference eRef = (EReference) feature;
					if (eRef.getEType() instanceof EClass) {
						EClass refClass = (EClass) eRef.getEType();
						if (eRef.isContainment()) {
							//print("Containment reference", eClass, eRef, refClass);
							continue;
						}

						if (eRef.isTransient()) {
							if (eRef.isDerived()) {
								//print("Derived reference", eClass, eRef, refClass);
							} else {
								//print("Transient reference", eClass, eRef, refClass);
							}
							continue;
						}

						if (amPackage.getIReferable().isSuperTypeOf(refClass)) {
							// valid reference
							//print("Valid reference", eClass, eRef, refClass);
							continue;
						}

						// invalid reference
						print("Illegal reference", eClass, eRef, refClass);
					}
				}
			}
		}

	} // main

	private static void print(String prefix, EClass origin, EReference ref, EClass target) {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(": ");
		sb.append(origin.getName());
		sb.append(" -- ");
		sb.append(ref.getName());
		sb.append(" --> ");
		sb.append(target.getName());
		System.out.println(sb.toString());
	}

}
