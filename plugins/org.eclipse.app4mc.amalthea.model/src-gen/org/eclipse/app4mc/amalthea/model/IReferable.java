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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IReferable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IReferable: Name attribute and computed ID for name based references
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.IReferable#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.IReferable#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getIReferable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReferable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getIReferable_Name()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Main'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.IReferable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Name</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getIReferable_UniqueName()
	 * @model unique="false" id="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return this.computeUniqueName();'"
	 * @generated
	 */
	String getUniqueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Overwrite this method to define specific IDs (used by name-based references).
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _name = this.getName();\n<%java.lang.String%> _encode = this.encode(_name);\n<%java.lang.String%> _plus = (_encode + \"?type=\");\n<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n<%java.lang.String%> _name_1 = _eClass.getName();\nreturn (_plus + _name_1);'"
	 * @generated
	 */
	String computeUniqueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" strUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='try\n{\n\t<%java.lang.String%> _xifexpression = null;\n\tboolean _isNullOrEmpty = <%org.eclipse.xtext.xbase.lib.StringExtensions%>.isNullOrEmpty(str);\n\tif (_isNullOrEmpty)\n\t{\n\t\t_xifexpression = \"no-name\";\n\t}\n\telse\n\t{\n\t\t<%java.lang.String%> _string = <%java.nio.charset.StandardCharsets%>.UTF_8.toString();\n\t\t_xifexpression = <%java.net.URLEncoder%>.encode(str, _string);\n\t}\n\treturn _xifexpression;\n}\ncatch (Throwable _e)\n{\n\tthrow org.eclipse.xtext.xbase.lib.Exceptions.sneakyThrow(_e);\n}'"
	 * @generated
	 */
	String encode(String str);

} // IReferable
