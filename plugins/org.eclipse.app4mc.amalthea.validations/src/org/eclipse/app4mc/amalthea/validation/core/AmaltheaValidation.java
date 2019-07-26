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

package org.eclipse.app4mc.amalthea.validation.core;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Strings;

public abstract class AmaltheaValidation implements IValidation {

	protected static AmaltheaPackage ePackage = AmaltheaPackage.eINSTANCE;

	// general setting

	@Override
	public EPackage getEPackage() {
		return ePackage;
	}

	// helper methods

	protected String name(final INamed object) {
		if (object == null) return "?";

		if (Strings.isNullOrEmpty(object.getName())) {
			return "?";
		} else {
			return "\"" + object.getName() + "\"";
		}
	}

	protected String longName(final IReferable object) {
		if (object == null) return "?";

		final String prefix = object.getNamePrefix();
		if (prefix == null || prefix.isEmpty()) {
			return name(object);
		} else {
			return "\"" + prefix + "/" + object.getName() + "\"";			
		}
	}
	
	protected String namedContainerInfo(final EObject object) {
		return " ( in " + objectInfo(AmaltheaServices.getContainerOfType(object, INamed.class)) + " )";
	}
	
	public String objectInfo(final EObject object) {
		if (object == null) return "?";
		
		String s1 = typeInfo(object);
		String s2 = (object instanceof INamed) ? " " + name((INamed) object) : "";
		return s1 + s2;
	}

	protected void addIssue(final List<ValidationDiagnostic> results, final EObject object, final EStructuralFeature feature, final String message) {
		results.add(new ValidationDiagnostic(message, object, feature));
	}

}
