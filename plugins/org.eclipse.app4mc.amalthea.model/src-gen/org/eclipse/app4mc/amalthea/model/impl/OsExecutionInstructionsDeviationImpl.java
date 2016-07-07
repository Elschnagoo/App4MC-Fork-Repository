/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.OsExecutionInstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Execution Instructions Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsDeviationImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsExecutionInstructionsDeviationImpl#getDeviation <em>Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsExecutionInstructionsDeviationImpl extends OsExecutionInstructionsImpl implements OsExecutionInstructionsDeviation {
	/**
	 * The cached value of the '{@link #getCustomProperties() <em>Custom Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Value> customProperties;

	/**
	 * The cached value of the '{@link #getDeviation() <em>Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviation()
	 * @generated
	 * @ordered
	 */
	protected Deviation<LongObject> deviation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsExecutionInstructionsDeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsExecutionInstructionsDeviation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Value> getCustomProperties() {
		if (customProperties == null) {
			customProperties = new EcoreEMap<String,Value>(AmaltheaPackage.eINSTANCE.getCustomProperty(), CustomPropertyImpl.class, this, AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES);
		}
		return customProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Deviation<LongObject> getDeviation() {
		if (deviation != null && deviation.eIsProxy()) {
			InternalEObject oldDeviation = (InternalEObject)deviation;
			deviation = (Deviation<LongObject>)eResolveProxy(oldDeviation);
			if (deviation != oldDeviation) {
				InternalEObject newDeviation = (InternalEObject)deviation;
				NotificationChain msgs = oldDeviation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION, null, null);
				if (newDeviation.eInternalContainer() == null) {
					msgs = newDeviation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION, oldDeviation, deviation));
			}
		}
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation<LongObject> basicGetDeviation() {
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviation(Deviation<LongObject> newDeviation, NotificationChain msgs) {
		Deviation<LongObject> oldDeviation = deviation;
		deviation = newDeviation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION, oldDeviation, newDeviation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviation(Deviation<LongObject> newDeviation) {
		if (newDeviation != deviation) {
			NotificationChain msgs = null;
			if (deviation != null)
				msgs = ((InternalEObject)deviation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION, null, msgs);
			if (newDeviation != null)
				msgs = ((InternalEObject)newDeviation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION, null, msgs);
			msgs = basicSetDeviation(newDeviation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION, newDeviation, newDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES:
				return ((InternalEList<?>)getCustomProperties()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION:
				return basicSetDeviation(null, msgs);
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
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES:
				if (coreType) return getCustomProperties();
				else return getCustomProperties().map();
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION:
				if (resolve) return getDeviation();
				return basicGetDeviation();
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
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES:
				((EStructuralFeature.Setting)getCustomProperties()).set(newValue);
				return;
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION:
				setDeviation((Deviation<LongObject>)newValue);
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
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
				return;
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION:
				setDeviation((Deviation<LongObject>)null);
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
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES:
				return customProperties != null && !customProperties.isEmpty();
			case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__DEVIATION:
				return deviation != null;
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
		if (baseClass == IAnnotatable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES: return AmaltheaPackage.IANNOTATABLE__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == IAnnotatable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.IANNOTATABLE__CUSTOM_PROPERTIES: return AmaltheaPackage.OS_EXECUTION_INSTRUCTIONS_DEVIATION__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OsExecutionInstructionsDeviationImpl
