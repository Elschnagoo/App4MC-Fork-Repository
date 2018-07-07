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

import org.eclipse.app4mc.tracing.converter.ot1.OT1.CommentDataType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.CustomDataType;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl#getCustomData <em>Custom Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.impl.OT1TypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OT1TypeImpl extends EObjectImpl implements OT1Type {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected CommentDataType comments;

	/**
	 * The cached value of the '{@link #getCustomData() <em>Custom Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomData()
	 * @generated
	 * @ordered
	 */
	protected CustomDataType customData;

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
	protected OT1TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OT1Package.Literals.OT1_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentDataType getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(CommentDataType newComments, NotificationChain msgs) {
		CommentDataType oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.OT1_TYPE__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(CommentDataType newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.OT1_TYPE__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.OT1_TYPE__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OT1_TYPE__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDataType getCustomData() {
		return customData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomData(CustomDataType newCustomData, NotificationChain msgs) {
		CustomDataType oldCustomData = customData;
		customData = newCustomData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OT1Package.OT1_TYPE__CUSTOM_DATA, oldCustomData, newCustomData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomData(CustomDataType newCustomData) {
		if (newCustomData != customData) {
			NotificationChain msgs = null;
			if (customData != null)
				msgs = ((InternalEObject)customData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OT1Package.OT1_TYPE__CUSTOM_DATA, null, msgs);
			if (newCustomData != null)
				msgs = ((InternalEObject)newCustomData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OT1Package.OT1_TYPE__CUSTOM_DATA, null, msgs);
			msgs = basicSetCustomData(newCustomData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OT1_TYPE__CUSTOM_DATA, newCustomData, newCustomData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OT1_TYPE__TOOL, oldTool, tool));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OT1_TYPE__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OT1Package.OT1_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OT1Package.OT1_TYPE__COMMENTS:
				return basicSetComments(null, msgs);
			case OT1Package.OT1_TYPE__CUSTOM_DATA:
				return basicSetCustomData(null, msgs);
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
			case OT1Package.OT1_TYPE__COMMENTS:
				return getComments();
			case OT1Package.OT1_TYPE__CUSTOM_DATA:
				return getCustomData();
			case OT1Package.OT1_TYPE__TOOL:
				return getTool();
			case OT1Package.OT1_TYPE__VENDOR:
				return getVendor();
			case OT1Package.OT1_TYPE__VERSION:
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
			case OT1Package.OT1_TYPE__COMMENTS:
				setComments((CommentDataType)newValue);
				return;
			case OT1Package.OT1_TYPE__CUSTOM_DATA:
				setCustomData((CustomDataType)newValue);
				return;
			case OT1Package.OT1_TYPE__TOOL:
				setTool((String)newValue);
				return;
			case OT1Package.OT1_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case OT1Package.OT1_TYPE__VERSION:
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
			case OT1Package.OT1_TYPE__COMMENTS:
				setComments((CommentDataType)null);
				return;
			case OT1Package.OT1_TYPE__CUSTOM_DATA:
				setCustomData((CustomDataType)null);
				return;
			case OT1Package.OT1_TYPE__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case OT1Package.OT1_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case OT1Package.OT1_TYPE__VERSION:
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
			case OT1Package.OT1_TYPE__COMMENTS:
				return comments != null;
			case OT1Package.OT1_TYPE__CUSTOM_DATA:
				return customData != null;
			case OT1Package.OT1_TYPE__TOOL:
				return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
			case OT1Package.OT1_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case OT1Package.OT1_TYPE__VERSION:
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
		result.append(" (tool: ");
		result.append(tool);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //OT1TypeImpl
