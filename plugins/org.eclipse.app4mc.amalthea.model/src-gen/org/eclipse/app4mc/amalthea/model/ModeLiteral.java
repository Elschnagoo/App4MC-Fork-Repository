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
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeLiteral#getContainingMode <em>Containing Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLiteral()
 * @model
 * @generated
 */
public interface ModeLiteral extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Containing Mode</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.Mode#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Mode</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Mode</em>' container reference.
	 * @see #setContainingMode(Mode)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeLiteral_ContainingMode()
	 * @see org.eclipse.app4mc.amalthea.model.Mode#getLiterals
	 * @model opposite="literals" transient="false"
	 * @generated
	 */
	Mode getContainingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeLiteral#getContainingMode <em>Containing Mode</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Mode</em>' container reference.
	 * @see #getContainingMode()
	 * @generated
	 */
	void setContainingMode(Mode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt; _containingMode = this.getContainingMode();\n&lt;%java.lang.String%&gt; _name = null;\nif (_containingMode!=null)\n{\n\t_name=_containingMode.getName();\n}\nreturn this.basicComputeUniqueNameWithPrefix(_name);'"
	 * @generated
	 */
	String computeUniqueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.Mode%&gt; _containingMode = this.getContainingMode();\n&lt;%java.lang.String%&gt; _name = null;\nif (_containingMode!=null)\n{\n\t_name=_containingMode.getName();\n}\nfinal &lt;%java.lang.String%&gt; modeName = _name;\n&lt;%java.lang.String%&gt; _xifexpression = null;\nboolean _isNullOrEmpty = &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(modeName);\nif (_isNullOrEmpty)\n{\n\t_xifexpression = \"&lt;mode&gt;\";\n}\nelse\n{\n\t_xifexpression = modeName;\n}\n&lt;%java.lang.String%&gt; _plus = (_xifexpression + \"::\");\n&lt;%java.lang.String%&gt; _xifexpression_1 = null;\nboolean _isNullOrEmpty_1 = &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(this.getName());\nif (_isNullOrEmpty_1)\n{\n\t_xifexpression_1 = \"&lt;literal&gt;\";\n}\nelse\n{\n\t_xifexpression_1 = this.getName();\n}\nreturn (_plus + _xifexpression_1);'"
	 * @generated
	 */
	String toString();

} // ModeLiteral
