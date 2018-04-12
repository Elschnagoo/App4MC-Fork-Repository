/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.HwFeatureLiteral;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.PuType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Unit Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessingUnitDefinitionImpl#getPuType <em>Pu Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessingUnitDefinitionImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ProcessingUnitDefinitionImpl#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingUnitDefinitionImpl extends HwDefinitionImpl implements ProcessingUnitDefinition {
	/**
	 * The default value of the '{@link #getPuType() <em>Pu Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuType()
	 * @generated
	 * @ordered
	 */
	protected static final PuType PU_TYPE_EDEFAULT = PuType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getPuType() <em>Pu Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuType()
	 * @generated
	 * @ordered
	 */
	protected PuType puType = PU_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<HwFeatureLiteral> features;

	/**
	 * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreClassifier> classifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingUnitDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getProcessingUnitDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuType getPuType() {
		return puType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuType(PuType newPuType) {
		PuType oldPuType = puType;
		puType = newPuType == null ? PU_TYPE_EDEFAULT : newPuType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PROCESSING_UNIT_DEFINITION__PU_TYPE, oldPuType, puType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HwFeatureLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<HwFeatureLiteral>(HwFeatureLiteral.class, this, AmaltheaPackage.PROCESSING_UNIT_DEFINITION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreClassifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectResolvingEList<CoreClassifier>(CoreClassifier.class, this, AmaltheaPackage.PROCESSING_UNIT_DEFINITION__CLASSIFIERS);
		}
		return classifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__PU_TYPE:
				return getPuType();
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__FEATURES:
				return getFeatures();
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__CLASSIFIERS:
				return getClassifiers();
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
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__PU_TYPE:
				setPuType((PuType)newValue);
				return;
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends HwFeatureLiteral>)newValue);
				return;
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
				getClassifiers().addAll((Collection<? extends CoreClassifier>)newValue);
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
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__PU_TYPE:
				setPuType(PU_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__FEATURES:
				getFeatures().clear();
				return;
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__CLASSIFIERS:
				getClassifiers().clear();
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
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__PU_TYPE:
				return puType != PU_TYPE_EDEFAULT;
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__FEATURES:
				return features != null && !features.isEmpty();
			case AmaltheaPackage.PROCESSING_UNIT_DEFINITION__CLASSIFIERS:
				return classifiers != null && !classifiers.isEmpty();
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
		result.append(" (puType: ");
		result.append(puType);
		result.append(')');
		return result.toString();
	}

} //ProcessingUnitDefinitionImpl
