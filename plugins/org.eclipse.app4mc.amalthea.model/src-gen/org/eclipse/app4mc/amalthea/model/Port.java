/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends ReferableBaseObject, ITaggable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\n<%java.lang.Object%> _eGet = null;\nif (_eContainer!=null)\n{\n\t<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n\t<%org.eclipse.emf.ecore.EStructuralFeature%> _eStructuralFeature = _eClass.getEStructuralFeature(\"name\");\n\t_eGet=_eContainer.eGet(_eStructuralFeature);\n}\nfinal <%java.lang.String%> containerName = this.encode(((<%java.lang.String%>) _eGet));\n<%java.lang.String%> _computeUniqueName = super.computeUniqueName();\nreturn ((containerName + \"/\") + _computeUniqueName);'"
	 * @generated
	 */
	String computeUniqueName();

} // Port
