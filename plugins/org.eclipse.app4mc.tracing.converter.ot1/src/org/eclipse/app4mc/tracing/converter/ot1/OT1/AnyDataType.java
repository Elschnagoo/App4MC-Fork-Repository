/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Type "AnyDataType" steht als Datencontainer für
 * 				toolspezifische Erweiterungen oder Zusatzdaten. Die Identifizierung
 * 				der Tools kann anhand der Attribute "vendor", "tool" und "version"
 * 				durchgeführt werden.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAnyDataType()
 * @model extendedMetaData="name='AnyDataType' kind='elementOnly'"
 * @generated
 */
public interface AnyDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAnyDataType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':0' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see #setTool(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAnyDataType_Tool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTool();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAnyDataType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vendor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAnyDataType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // AnyDataType
