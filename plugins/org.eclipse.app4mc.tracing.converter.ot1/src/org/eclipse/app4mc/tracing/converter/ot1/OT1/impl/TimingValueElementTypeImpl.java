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
package org.eclipse.app4mc.tracing.converter.ot1.OT1.impl;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingInformationSourceEnum;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.TimingValueElementType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Value Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValueElementTypeImpl#isRequest <em>Request</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.TimingValueElementTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TimingValueElementTypeImpl extends ElementTypeImpl implements TimingValueElementType {
	/**
	 * The default value of the '{@link #isRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequest() <em>Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequest()
	 * @generated
	 * @ordered
	 */
	protected boolean request = REQUEST_EDEFAULT;

	/**
	 * This is true if the Request attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestESet;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final TimingInformationSourceEnum SOURCE_EDEFAULT = TimingInformationSourceEnum.CONFIGURATION;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TimingInformationSourceEnum source = SOURCE_EDEFAULT;

	/**
	 * This is true if the Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingValueElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.TIMING_VALUE_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(boolean newRequest) {
		boolean oldRequest = request;
		request = newRequest;
		boolean oldRequestESet = requestESet;
		requestESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_VALUE_ELEMENT_TYPE__REQUEST, oldRequest, request, !oldRequestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequest() {
		boolean oldRequest = request;
		boolean oldRequestESet = requestESet;
		request = REQUEST_EDEFAULT;
		requestESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIMING_VALUE_ELEMENT_TYPE__REQUEST, oldRequest, REQUEST_EDEFAULT, oldRequestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequest() {
		return requestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingInformationSourceEnum getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(TimingInformationSourceEnum newSource) {
		TimingInformationSourceEnum oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		boolean oldSourceESet = sourceESet;
		sourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.TIMING_VALUE_ELEMENT_TYPE__SOURCE, oldSource, source, !oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSource() {
		TimingInformationSourceEnum oldSource = source;
		boolean oldSourceESet = sourceESet;
		source = SOURCE_EDEFAULT;
		sourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OT1Package.TIMING_VALUE_ELEMENT_TYPE__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
		return sourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__REQUEST:
				return isRequest();
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__SOURCE:
				return getSource();
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
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__REQUEST:
				setRequest((Boolean)newValue);
				return;
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__SOURCE:
				setSource((TimingInformationSourceEnum)newValue);
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
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__REQUEST:
				unsetRequest();
				return;
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__SOURCE:
				unsetSource();
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
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__REQUEST:
				return isSetRequest();
			case OT1Package.TIMING_VALUE_ELEMENT_TYPE__SOURCE:
				return isSetSource();
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
		result.append(" (request: ");
		if (requestESet) result.append(request); else result.append("<unset>");
		result.append(", source: ");
		if (sourceESet) result.append(source); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimingValueElementTypeImpl
