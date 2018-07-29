/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Channel;
import org.eclipse.app4mc.amalthea.model.ChannelAccess;
import org.eclipse.app4mc.amalthea.model.DataType;
import org.eclipse.app4mc.amalthea.model.IDisplayName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelImpl#getDefaultElements <em>Default Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelImpl#getMaxElements <em>Max Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ChannelImpl#getChannelAccesses <em>Channel Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends AbstractMemoryElementImpl implements Channel {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected DataType elementType;

	/**
	 * The default value of the '{@link #getDefaultElements() <em>Default Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultElements()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultElements() <em>Default Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultElements()
	 * @generated
	 * @ordered
	 */
	protected int defaultElements = DEFAULT_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxElements() <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElements()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxElements() <em>Max Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxElements()
	 * @generated
	 * @ordered
	 */
	protected int maxElements = MAX_ELEMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getChannel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementType(DataType newElementType, NotificationChain msgs) {
		DataType oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL__ELEMENT_TYPE, oldElementType, newElementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(DataType newElementType) {
		if (newElementType != elementType) {
			NotificationChain msgs = null;
			if (elementType != null)
				msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CHANNEL__ELEMENT_TYPE, null, msgs);
			if (newElementType != null)
				msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CHANNEL__ELEMENT_TYPE, null, msgs);
			msgs = basicSetElementType(newElementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL__ELEMENT_TYPE, newElementType, newElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultElements() {
		return defaultElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultElements(int newDefaultElements) {
		int oldDefaultElements = defaultElements;
		defaultElements = newDefaultElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL__DEFAULT_ELEMENTS, oldDefaultElements, defaultElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxElements() {
		return maxElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxElements(int newMaxElements) {
		int oldMaxElements = maxElements;
		maxElements = newMaxElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CHANNEL__MAX_ELEMENTS, oldMaxElements, maxElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelAccess> getChannelAccesses() {
		EReference _channelAccess_Data = AmaltheaPackage.eINSTANCE.getChannelAccess_Data();
		return AmaltheaIndex.<ChannelAccess>getInverseReferences(this, AmaltheaPackage.eINSTANCE.getChannel_ChannelAccesses(), 
			java.util.Collections.<EReference>unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.<EReference>newHashSet(_channelAccess_Data)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CHANNEL__ELEMENT_TYPE:
				return basicSetElementType(null, msgs);
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
			case AmaltheaPackage.CHANNEL__DISPLAY_NAME:
				return getDisplayName();
			case AmaltheaPackage.CHANNEL__ELEMENT_TYPE:
				return getElementType();
			case AmaltheaPackage.CHANNEL__DEFAULT_ELEMENTS:
				return getDefaultElements();
			case AmaltheaPackage.CHANNEL__MAX_ELEMENTS:
				return getMaxElements();
			case AmaltheaPackage.CHANNEL__CHANNEL_ACCESSES:
				return getChannelAccesses();
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
			case AmaltheaPackage.CHANNEL__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case AmaltheaPackage.CHANNEL__ELEMENT_TYPE:
				setElementType((DataType)newValue);
				return;
			case AmaltheaPackage.CHANNEL__DEFAULT_ELEMENTS:
				setDefaultElements((Integer)newValue);
				return;
			case AmaltheaPackage.CHANNEL__MAX_ELEMENTS:
				setMaxElements((Integer)newValue);
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
			case AmaltheaPackage.CHANNEL__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case AmaltheaPackage.CHANNEL__ELEMENT_TYPE:
				setElementType((DataType)null);
				return;
			case AmaltheaPackage.CHANNEL__DEFAULT_ELEMENTS:
				setDefaultElements(DEFAULT_ELEMENTS_EDEFAULT);
				return;
			case AmaltheaPackage.CHANNEL__MAX_ELEMENTS:
				setMaxElements(MAX_ELEMENTS_EDEFAULT);
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
			case AmaltheaPackage.CHANNEL__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case AmaltheaPackage.CHANNEL__ELEMENT_TYPE:
				return elementType != null;
			case AmaltheaPackage.CHANNEL__DEFAULT_ELEMENTS:
				return defaultElements != DEFAULT_ELEMENTS_EDEFAULT;
			case AmaltheaPackage.CHANNEL__MAX_ELEMENTS:
				return maxElements != MAX_ELEMENTS_EDEFAULT;
			case AmaltheaPackage.CHANNEL__CHANNEL_ACCESSES:
				return !getChannelAccesses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IDisplayName.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.CHANNEL__DISPLAY_NAME: return AmaltheaPackage.IDISPLAY_NAME__DISPLAY_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IDisplayName.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.IDISPLAY_NAME__DISPLAY_NAME: return AmaltheaPackage.CHANNEL__DISPLAY_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", defaultElements: ");
		result.append(defaultElements);
		result.append(", maxElements: ");
		result.append(maxElements);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
