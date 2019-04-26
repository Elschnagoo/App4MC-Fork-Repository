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

package org.eclipse.app4mc.amalthea.validations;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.Result;
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

	protected String typeInfo(final EObject object) {
		if (object == null) return "?";

		final String type = object.eClass().getName();
		final String typeWithBlanks = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(type), ' ');
		return typeWithBlanks;
	}
	
	protected String objectInfo(final EObject object) {
		if (object == null) return "?";
		
		String s1 = typeInfo(object);
		String s2 = (object instanceof INamed) ? " " + name((INamed) object) : "";
		return s1 + s2;
	}

	protected String containerInfo(final EObject object) {
		if (object == null) return "";
		
		return " ( in " + objectInfo(object.eContainer()) + " )";
	}

	protected Object attributeValue(final EObject object, final String attribName) {
		if (object == null || attribName == null) return null;
		
		EStructuralFeature feature = object.eClass().getEStructuralFeature(attribName);
		if (feature == null) return null;

		return object.eGet(feature);
	}

	protected void addIssue(final List<Result> results, final EObject object, final String message) {
		results.add(new Result(message, object));
	}

}