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

package org.eclipse.app4mc.validation.ui.util;

import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.action.ValidateAction.EclipseResourcesUtil;

public class ValidationMarkerHelper extends EclipseResourcesUtil {
	
	protected boolean adjustMarker(IMarker marker, Diagnostic genericDiagnostic) throws CoreException
	  {
		if (genericDiagnostic instanceof ValidationDiagnostic) {
			ValidationDiagnostic diagnostic = (ValidationDiagnostic) genericDiagnostic;
			
			EObject affectedObject = diagnostic.getTargetObject();
			EStructuralFeature affectedFeature = diagnostic.getTargetFeature();
			
			// LOCATION attribute
			String location;
			if (affectedObject == null) {
				location = "Unknown object";
			} else {
				location = affectedObject.eClass().getName();
				if (affectedFeature != null) {
					location = location + "#" + affectedFeature.getName();
				}
			}
			marker.setAttribute(IMarker.LOCATION, location);
			
			// URI attribute
			if (affectedObject != null) {
				marker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(affectedObject).toString());
			}

			// SOURCE attribute
			marker.setAttribute(IMarker.SOURCE_ID, diagnostic.getValidationID());
			
			return true;
		}
		
		return false;
	  }

}
