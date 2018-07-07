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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.AnyDataType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.AnyDataTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnyDataTypeImpl extends EObjectImpl implements AnyDataType {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected String tool = TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.ANY_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, OT1Package.ANY_DATA_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.ANY_DATA_TYPE__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.ANY_DATA_TYPE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.ANY_DATA_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.ANY_DATA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case OT1Package.ANY_DATA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case OT1Package.ANY_DATA_TYPE__TOOL:
				return getTool();
			case OT1Package.ANY_DATA_TYPE__VENDOR:
				return getVendor();
			case OT1Package.ANY_DATA_TYPE__VERSION:
				return getVersion();
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
			case OT1Package.ANY_DATA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case OT1Package.ANY_DATA_TYPE__TOOL:
				setTool((String)newValue);
				return;
			case OT1Package.ANY_DATA_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case OT1Package.ANY_DATA_TYPE__VERSION:
				setVersion((String)newValue);
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
			case OT1Package.ANY_DATA_TYPE__ANY:
				getAny().clear();
				return;
			case OT1Package.ANY_DATA_TYPE__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case OT1Package.ANY_DATA_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case OT1Package.ANY_DATA_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case OT1Package.ANY_DATA_TYPE__ANY:
				return any != null && !any.isEmpty();
			case OT1Package.ANY_DATA_TYPE__TOOL:
				return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
			case OT1Package.ANY_DATA_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case OT1Package.ANY_DATA_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (any: ");
		result.append(any);
		result.append(", tool: ");
		result.append(tool);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //AnyDataTypeImpl
