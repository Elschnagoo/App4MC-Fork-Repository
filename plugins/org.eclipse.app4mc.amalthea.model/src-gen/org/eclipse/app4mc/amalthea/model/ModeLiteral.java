/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Mode Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLiteral()
 * @model
 * @generated
 */
public interface ModeLiteral extends ReferableBaseObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\n<%java.lang.Object%> _eGet = null;\nif (_eContainer!=null)\n{\n\t<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n\t<%org.eclipse.emf.ecore.EStructuralFeature%> _eStructuralFeature = _eClass.getEStructuralFeature(\"name\");\n\t_eGet=_eContainer.eGet(_eStructuralFeature);\n}\nfinal <%java.lang.String%> containerName = this.encode(((<%java.lang.String%>) _eGet));\n<%java.lang.String%> _computeUniqueName = super.computeUniqueName();\nreturn ((containerName + \"/\") + _computeUniqueName);'"
	 * @generated
	 */
	String computeUniqueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\n<%java.lang.Object%> _eGet = null;\nif (_eContainer!=null)\n{\n\t<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n\t<%org.eclipse.emf.ecore.EStructuralFeature%> _eStructuralFeature = _eClass.getEStructuralFeature(\"name\");\n\t_eGet=_eContainer.eGet(_eStructuralFeature);\n}\nfinal <%java.lang.String%> modeName = ((<%java.lang.String%>) _eGet);\n<%java.lang.String%> _xifexpression = null;\nboolean _isNullOrEmpty = <%org.eclipse.xtext.xbase.lib.StringExtensions%>.isNullOrEmpty(modeName);\nif (_isNullOrEmpty)\n{\n\t_xifexpression = \"<mode>\";\n}\nelse\n{\n\t_xifexpression = modeName;\n}\n<%java.lang.String%> _plus = (_xifexpression + \"::\");\n<%java.lang.String%> _xifexpression_1 = null;\n<%java.lang.String%> _name = this.getName();\nboolean _isNullOrEmpty_1 = <%org.eclipse.xtext.xbase.lib.StringExtensions%>.isNullOrEmpty(_name);\nif (_isNullOrEmpty_1)\n{\n\t_xifexpression_1 = \"<literal>\";\n}\nelse\n{\n\t_xifexpression_1 = this.getName();\n}\nreturn (_plus + _xifexpression_1);'"
	 * @generated
	 */
	String toString();

} // ModeLiteral
