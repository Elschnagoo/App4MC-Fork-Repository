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

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.ProcessConstraintTarget;
import org.eclipse.app4mc.amalthea.model.SchedulerConstraintTarget;
import org.eclipse.app4mc.amalthea.model.TargetCore;
import org.eclipse.app4mc.amalthea.model.Value;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TargetCoreImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.TargetCoreImpl#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetCoreImpl extends RunnableConstraintTargetImpl implements TargetCore {
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
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> cores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetCoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getTargetCore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Value> getCustomProperties() {
		if (customProperties == null) {
			customProperties = new EcoreEMap<String,Value>(AmaltheaPackage.eINSTANCE.getCustomProperty(), CustomPropertyImpl.class, this, AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES);
		}
		return customProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCores() {
		if (cores == null) {
			cores = new EObjectResolvingEList<Core>(Core.class, this, AmaltheaPackage.TARGET_CORE__CORES);
		}
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES:
				return ((InternalEList<?>)getCustomProperties()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES:
				if (coreType) return getCustomProperties();
				else return getCustomProperties().map();
			case AmaltheaPackage.TARGET_CORE__CORES:
				return getCores();
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
			case AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES:
				((EStructuralFeature.Setting)getCustomProperties()).set(newValue);
				return;
			case AmaltheaPackage.TARGET_CORE__CORES:
				getCores().clear();
				getCores().addAll((Collection<? extends Core>)newValue);
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
			case AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
				return;
			case AmaltheaPackage.TARGET_CORE__CORES:
				getCores().clear();
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
			case AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES:
				return customProperties != null && !customProperties.isEmpty();
			case AmaltheaPackage.TARGET_CORE__CORES:
				return cores != null && !cores.isEmpty();
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
		if (baseClass == ProcessConstraintTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SchedulerConstraintTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IAnnotatable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES: return AmaltheaPackage.IANNOTATABLE__CUSTOM_PROPERTIES;
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
		if (baseClass == ProcessConstraintTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SchedulerConstraintTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IAnnotatable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.IANNOTATABLE__CUSTOM_PROPERTIES: return AmaltheaPackage.TARGET_CORE__CUSTOM_PROPERTIES;
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

} //TargetCoreImpl
