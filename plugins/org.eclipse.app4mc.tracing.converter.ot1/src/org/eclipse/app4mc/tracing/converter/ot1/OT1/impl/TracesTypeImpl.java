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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1HexTraceType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1TraceLinkType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TracesType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.XmlTraceType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traces Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracesTypeImpl#getOT1TraceLink <em>OT1 Trace Link</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracesTypeImpl#getOT1HexTrace <em>OT1 Hex Trace</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TracesTypeImpl#getXmlTrace <em>Xml Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracesTypeImpl extends EObjectImpl implements TracesType {
	/**
	 * The cached value of the '{@link #getOT1TraceLink() <em>OT1 Trace Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOT1TraceLink()
	 * @generated
	 * @ordered
	 */
	protected EList<OT1TraceLinkType> oT1TraceLink;

	/**
	 * The cached value of the '{@link #getOT1HexTrace() <em>OT1 Hex Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOT1HexTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<OT1HexTraceType> oT1HexTrace;

	/**
	 * The cached value of the '{@link #getXmlTrace() <em>Xml Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlTraceType> xmlTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TRACES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OT1TraceLinkType> getOT1TraceLink() {
		if (oT1TraceLink == null) {
			oT1TraceLink = new EObjectContainmentEList<OT1TraceLinkType>(OT1TraceLinkType.class, this, OT1Package.TRACES_TYPE__OT1_TRACE_LINK);
		}
		return oT1TraceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OT1HexTraceType> getOT1HexTrace() {
		if (oT1HexTrace == null) {
			oT1HexTrace = new EObjectContainmentEList<OT1HexTraceType>(OT1HexTraceType.class, this, OT1Package.TRACES_TYPE__OT1_HEX_TRACE);
		}
		return oT1HexTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XmlTraceType> getXmlTrace() {
		if (xmlTrace == null) {
			xmlTrace = new EObjectContainmentEList<XmlTraceType>(XmlTraceType.class, this, OT1Package.TRACES_TYPE__XML_TRACE);
		}
		return xmlTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.TRACES_TYPE__OT1_TRACE_LINK:
				return ((InternalEList<?>)getOT1TraceLink()).basicRemove(otherEnd, msgs);
			case OT1Package.TRACES_TYPE__OT1_HEX_TRACE:
				return ((InternalEList<?>)getOT1HexTrace()).basicRemove(otherEnd, msgs);
			case OT1Package.TRACES_TYPE__XML_TRACE:
				return ((InternalEList<?>)getXmlTrace()).basicRemove(otherEnd, msgs);
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
			case OT1Package.TRACES_TYPE__OT1_TRACE_LINK:
				return getOT1TraceLink();
			case OT1Package.TRACES_TYPE__OT1_HEX_TRACE:
				return getOT1HexTrace();
			case OT1Package.TRACES_TYPE__XML_TRACE:
				return getXmlTrace();
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
			case OT1Package.TRACES_TYPE__OT1_TRACE_LINK:
				getOT1TraceLink().clear();
				getOT1TraceLink().addAll((Collection<? extends OT1TraceLinkType>)newValue);
				return;
			case OT1Package.TRACES_TYPE__OT1_HEX_TRACE:
				getOT1HexTrace().clear();
				getOT1HexTrace().addAll((Collection<? extends OT1HexTraceType>)newValue);
				return;
			case OT1Package.TRACES_TYPE__XML_TRACE:
				getXmlTrace().clear();
				getXmlTrace().addAll((Collection<? extends XmlTraceType>)newValue);
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
			case OT1Package.TRACES_TYPE__OT1_TRACE_LINK:
				getOT1TraceLink().clear();
				return;
			case OT1Package.TRACES_TYPE__OT1_HEX_TRACE:
				getOT1HexTrace().clear();
				return;
			case OT1Package.TRACES_TYPE__XML_TRACE:
				getXmlTrace().clear();
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
			case OT1Package.TRACES_TYPE__OT1_TRACE_LINK:
				return oT1TraceLink != null && !oT1TraceLink.isEmpty();
			case OT1Package.TRACES_TYPE__OT1_HEX_TRACE:
				return oT1HexTrace != null && !oT1HexTrace.isEmpty();
			case OT1Package.TRACES_TYPE__XML_TRACE:
				return xmlTrace != null && !xmlTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracesTypeImpl
