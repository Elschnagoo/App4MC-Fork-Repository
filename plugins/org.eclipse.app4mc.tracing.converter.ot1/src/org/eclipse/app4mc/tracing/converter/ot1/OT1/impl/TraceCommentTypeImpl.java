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

package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import java.math.BigInteger;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Comment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceCommentTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceCommentTypeImpl#getTime1 <em>Time1</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TraceCommentTypeImpl#getTime2 <em>Time2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceCommentTypeImpl extends OT1TypeImpl implements TraceCommentType {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime1() <em>Time1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime1() <em>Time1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger time1 = TIME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime2() <em>Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime2()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIME2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime2() <em>Time2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime2()
	 * @generated
	 * @ordered
	 */
	protected BigInteger time2 = TIME2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceCommentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TRACE_COMMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACE_COMMENT_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTime1() {
		return time1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime1(BigInteger newTime1) {
		BigInteger oldTime1 = time1;
		time1 = newTime1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACE_COMMENT_TYPE__TIME1, oldTime1, time1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTime2() {
		return time2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime2(BigInteger newTime2) {
		BigInteger oldTime2 = time2;
		time2 = newTime2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TRACE_COMMENT_TYPE__TIME2, oldTime2, time2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.TRACE_COMMENT_TYPE__COMMENT:
				return getComment();
			case OT1Package.TRACE_COMMENT_TYPE__TIME1:
				return getTime1();
			case OT1Package.TRACE_COMMENT_TYPE__TIME2:
				return getTime2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OT1Package.TRACE_COMMENT_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case OT1Package.TRACE_COMMENT_TYPE__TIME1:
				setTime1((BigInteger)newValue);
				return;
			case OT1Package.TRACE_COMMENT_TYPE__TIME2:
				setTime2((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OT1Package.TRACE_COMMENT_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case OT1Package.TRACE_COMMENT_TYPE__TIME1:
				setTime1(TIME1_EDEFAULT);
				return;
			case OT1Package.TRACE_COMMENT_TYPE__TIME2:
				setTime2(TIME2_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OT1Package.TRACE_COMMENT_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case OT1Package.TRACE_COMMENT_TYPE__TIME1:
				return TIME1_EDEFAULT == null ? time1 != null : !TIME1_EDEFAULT.equals(time1);
			case OT1Package.TRACE_COMMENT_TYPE__TIME2:
				return TIME2_EDEFAULT == null ? time2 != null : !TIME2_EDEFAULT.equals(time2);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(", time1: ");
		result.append(time1);
		result.append(", time2: ");
		result.append(time2);
		result.append(')');
		return result.toString();
	}

} //TraceCommentTypeImpl
