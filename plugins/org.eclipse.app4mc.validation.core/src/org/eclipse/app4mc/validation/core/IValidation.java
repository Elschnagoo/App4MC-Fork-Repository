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

package org.eclipse.app4mc.validation.core;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Strings;

public interface IValidation {

	public EPackage getEPackage();
	
	public EClassifier getEClassifier();

	/**
	 * @param eObject the Ecore object to validate
	 * @param results the list of validation results
	 */
	public void validate(final EObject eObject, final List<ValidationDiagnostic> results);

	default String typeInfo(final EObject object) {
		if (object == null) return "?";

		final String type = object.eClass().getName();
		final String typeWithBlanks = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(type), ' ');
		return typeWithBlanks;
	}
	
	default String objectInfo(final EObject object) {
		if (object == null) return "?";
		
		String s1 = typeInfo(object);
		Object name = attributeValue(object, "name");
		String s2 = (name == null) ? "" : ((Strings.isNullOrEmpty(name.toString())) ? " ?" : " \"" + name + "\"");
		return s1 + s2;
	}
	
	default Object attributeValue(final EObject object, final String attribName) {
		if (object == null || attribName == null) return null;
		
		EStructuralFeature feature = object.eClass().getEStructuralFeature(attribName);
		if (feature == null) return null;

		return object.eGet(feature);
	}

}
