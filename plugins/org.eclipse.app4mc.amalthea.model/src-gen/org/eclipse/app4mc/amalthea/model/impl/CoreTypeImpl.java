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
import org.eclipse.app4mc.amalthea.model.CoreType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreTypeImpl#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreTypeImpl#getInstructionsPerCycle <em>Instructions Per Cycle</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CoreTypeImpl#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreTypeImpl extends AbstractionTypeImpl implements CoreType {
	/**
	 * The default value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected int bitWidth = BIT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructionsPerCycle() <em>Instructions Per Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsPerCycle()
	 * @generated
	 * @ordered
	 */
	protected static final float INSTRUCTIONS_PER_CYCLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInstructionsPerCycle() <em>Instructions Per Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsPerCycle()
	 * @generated
	 * @ordered
	 */
	protected float instructionsPerCycle = INSTRUCTIONS_PER_CYCLE_EDEFAULT;

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
	protected CoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCoreType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitWidth() {
		return bitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitWidth(int newBitWidth) {
		int oldBitWidth = bitWidth;
		bitWidth = newBitWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE_TYPE__BIT_WIDTH, oldBitWidth, bitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInstructionsPerCycle() {
		return instructionsPerCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionsPerCycle(float newInstructionsPerCycle) {
		float oldInstructionsPerCycle = instructionsPerCycle;
		instructionsPerCycle = newInstructionsPerCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE, oldInstructionsPerCycle, instructionsPerCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreClassifier> getClassifiers() {
		if (classifiers == null) {
			classifiers = new EObjectResolvingEList<CoreClassifier>(CoreClassifier.class, this, AmaltheaPackage.CORE_TYPE__CLASSIFIERS);
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
			case AmaltheaPackage.CORE_TYPE__BIT_WIDTH:
				return getBitWidth();
			case AmaltheaPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				return getInstructionsPerCycle();
			case AmaltheaPackage.CORE_TYPE__CLASSIFIERS:
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
			case AmaltheaPackage.CORE_TYPE__BIT_WIDTH:
				setBitWidth((Integer)newValue);
				return;
			case AmaltheaPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				setInstructionsPerCycle((Float)newValue);
				return;
			case AmaltheaPackage.CORE_TYPE__CLASSIFIERS:
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
			case AmaltheaPackage.CORE_TYPE__BIT_WIDTH:
				setBitWidth(BIT_WIDTH_EDEFAULT);
				return;
			case AmaltheaPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				setInstructionsPerCycle(INSTRUCTIONS_PER_CYCLE_EDEFAULT);
				return;
			case AmaltheaPackage.CORE_TYPE__CLASSIFIERS:
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
			case AmaltheaPackage.CORE_TYPE__BIT_WIDTH:
				return bitWidth != BIT_WIDTH_EDEFAULT;
			case AmaltheaPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				return instructionsPerCycle != INSTRUCTIONS_PER_CYCLE_EDEFAULT;
			case AmaltheaPackage.CORE_TYPE__CLASSIFIERS:
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
		result.append(" (bitWidth: ");
		result.append(bitWidth);
		result.append(", instructionsPerCycle: ");
		result.append(instructionsPerCycle);
		result.append(')');
		return result.toString();
	}

} //CoreTypeImpl
