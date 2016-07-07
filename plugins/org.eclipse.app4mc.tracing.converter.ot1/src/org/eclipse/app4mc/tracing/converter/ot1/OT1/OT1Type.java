/**
 * *******************************************************************************
 *  Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.tracing.converter.ot1.OT1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basis-Type für alle Elemente dieses Formats. Dieser
 * 				Typ definiert optionale Zusatzelemente, wie Comments oder
 * 				CunstomData, welche beliebige Daten oder tollspezifische
 * 				Erweiterungen beinhalten können.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getCustomData <em>Custom Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type()
 * @model extendedMetaData="name='OT1Type' kind='elementOnly'"
 * @generated
 */
public interface OT1Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(CommentDataType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type_Comments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Comments' namespace='##targetNamespace'"
	 * @generated
	 */
	CommentDataType getComments();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(CommentDataType value);

	/**
	 * Returns the value of the '<em><b>Custom Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Data</em>' containment reference.
	 * @see #setCustomData(CustomDataType)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type_CustomData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomData' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomDataType getCustomData();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getCustomData <em>Custom Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Data</em>' containment reference.
	 * @see #getCustomData()
	 * @generated
	 */
	void setCustomData(CustomDataType value);

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
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type_Tool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTool();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getTool <em>Tool</em>}' attribute.
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
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='vendor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVendor <em>Vendor</em>}' attribute.
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
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getOT1Type_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // OT1Type
