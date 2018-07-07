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

import java.util.Collection;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceCommentType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TraceEntryType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Trace Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.XmlTraceTypeImpl#getTraceEntry <em>Trace Entry</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.XmlTraceTypeImpl#getTraceComment <em>Trace Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlTraceTypeImpl extends UniqueElementTypeImpl implements XmlTraceType {
	/**
	 * The cached value of the '{@link #getTraceEntry() <em>Trace Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceEntryType> traceEntry;

	/**
	 * The cached value of the '{@link #getTraceComment() <em>Trace Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceComment()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceCommentType> traceComment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlTraceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.XML_TRACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceEntryType> getTraceEntry() {
		if (traceEntry == null) {
			traceEntry = new EObjectContainmentEList<TraceEntryType>(TraceEntryType.class, this, OT1Package.XML_TRACE_TYPE__TRACE_ENTRY);
		}
		return traceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceCommentType> getTraceComment() {
		if (traceComment == null) {
			traceComment = new EObjectContainmentEList<TraceCommentType>(TraceCommentType.class, this, OT1Package.XML_TRACE_TYPE__TRACE_COMMENT);
		}
		return traceComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.XML_TRACE_TYPE__TRACE_ENTRY:
				return ((InternalEList<?>)getTraceEntry()).basicRemove(otherEnd, msgs);
			case OT1Package.XML_TRACE_TYPE__TRACE_COMMENT:
				return ((InternalEList<?>)getTraceComment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.XML_TRACE_TYPE__TRACE_ENTRY:
				return getTraceEntry();
			case OT1Package.XML_TRACE_TYPE__TRACE_COMMENT:
				return getTraceComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OT1Package.XML_TRACE_TYPE__TRACE_ENTRY:
				getTraceEntry().clear();
				getTraceEntry().addAll((Collection<? extends TraceEntryType>)newValue);
				return;
			case OT1Package.XML_TRACE_TYPE__TRACE_COMMENT:
				getTraceComment().clear();
				getTraceComment().addAll((Collection<? extends TraceCommentType>)newValue);
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
			case OT1Package.XML_TRACE_TYPE__TRACE_ENTRY:
				getTraceEntry().clear();
				return;
			case OT1Package.XML_TRACE_TYPE__TRACE_COMMENT:
				getTraceComment().clear();
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
			case OT1Package.XML_TRACE_TYPE__TRACE_ENTRY:
				return traceEntry != null && !traceEntry.isEmpty();
			case OT1Package.XML_TRACE_TYPE__TRACE_COMMENT:
				return traceComment != null && !traceComment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XmlTraceTypeImpl
