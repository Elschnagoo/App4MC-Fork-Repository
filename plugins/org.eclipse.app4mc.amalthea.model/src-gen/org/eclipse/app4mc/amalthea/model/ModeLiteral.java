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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer = this.eContainer();\n&lt;%java.lang.Object%&gt; _eGet = null;\nif (_eContainer!=null)\n{\n\t_eGet=_eContainer.eGet(this.eClass().getEStructuralFeature(\"name\"));\n}\nfinal &lt;%java.lang.String%&gt; containerName = this.encode(((&lt;%java.lang.String%&gt;) _eGet));\n&lt;%java.lang.String%&gt; _computeUniqueName = super.computeUniqueName();\nreturn ((containerName + \"/\") + _computeUniqueName);'"
	 * @generated
	 */
	String computeUniqueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.ecore.EObject%&gt; _eContainer = this.eContainer();\n&lt;%java.lang.Object%&gt; _eGet = null;\nif (_eContainer!=null)\n{\n\t_eGet=_eContainer.eGet(this.eClass().getEStructuralFeature(\"name\"));\n}\nfinal &lt;%java.lang.String%&gt; modeName = ((&lt;%java.lang.String%&gt;) _eGet);\n&lt;%java.lang.String%&gt; _xifexpression = null;\nboolean _isNullOrEmpty = &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(modeName);\nif (_isNullOrEmpty)\n{\n\t_xifexpression = \"&lt;mode&gt;\";\n}\nelse\n{\n\t_xifexpression = modeName;\n}\n&lt;%java.lang.String%&gt; _plus = (_xifexpression + \"::\");\n&lt;%java.lang.String%&gt; _xifexpression_1 = null;\nboolean _isNullOrEmpty_1 = &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(this.getName());\nif (_isNullOrEmpty_1)\n{\n\t_xifexpression_1 = \"&lt;literal&gt;\";\n}\nelse\n{\n\t_xifexpression_1 = this.getName();\n}\nreturn (_plus + _xifexpression_1);'"
	 * @generated
	 */
	String toString();

} // ModeLiteral
