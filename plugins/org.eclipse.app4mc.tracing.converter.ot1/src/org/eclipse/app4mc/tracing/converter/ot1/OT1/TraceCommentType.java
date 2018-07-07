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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Comment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit einem Element vom Typ "TraceCommentType" kann
 * 				ein Trace um einen Kommantar erweitert werden. Das Element "comment"
 * 				beinhaltet den eigentlichen Kommentar als string. Optional kann ein
 * 				Zeitstempel (time1 > 0) oder ein Zeitbereich (time1 > 0 UND
 * 				time2 > 0) angegeben werden für die exakt dieser Kommentar gilt.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime1 <em>Time1</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime2 <em>Time2</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTraceCommentType()
 * @model extendedMetaData="name='TraceCommentType' kind='elementOnly'"
 * @generated
 */
public interface TraceCommentType extends OT1Type {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTraceCommentType_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Time1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time1</em>' attribute.
	 * @see #setTime1(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTraceCommentType_Time1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='time1' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTime1();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime1 <em>Time1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time1</em>' attribute.
	 * @see #getTime1()
	 * @generated
	 */
	void setTime1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Time2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time2</em>' attribute.
	 * @see #setTime2(BigInteger)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getTraceCommentType_Time2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='time2' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTime2();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType#getTime2 <em>Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time2</em>' attribute.
	 * @see #getTime2()
	 * @generated
	 */
	void setTime2(BigInteger value);

} // TraceCommentType
