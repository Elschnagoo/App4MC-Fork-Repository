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
import org.eclipse.app4mc.amalthea.model.ConjunctionType;
import org.eclipse.app4mc.amalthea.model.HwCoreConjunction;
import org.eclipse.app4mc.amalthea.model.HwCoreConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Core Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwCoreConjunctionImpl#getConjunction <em>Conjunction</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwCoreConjunctionImpl#getFirstConstraint <em>First Constraint</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwCoreConjunctionImpl#getSecondConstraint <em>Second Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwCoreConjunctionImpl extends HwCoreConstraintImpl implements HwCoreConjunction {
	/**
	 * The default value of the '{@link #getConjunction() <em>Conjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjunction()
	 * @generated
	 * @ordered
	 */
	protected static final ConjunctionType CONJUNCTION_EDEFAULT = ConjunctionType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getConjunction() <em>Conjunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjunction()
	 * @generated
	 * @ordered
	 */
	protected ConjunctionType conjunction = CONJUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstConstraint() <em>First Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstConstraint()
	 * @generated
	 * @ordered
	 */
	protected HwCoreConstraint firstConstraint;

	/**
	 * The cached value of the '{@link #getSecondConstraint() <em>Second Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondConstraint()
	 * @generated
	 * @ordered
	 */
	protected HwCoreConstraint secondConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwCoreConjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwCoreConjunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjunctionType getConjunction() {
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjunction(ConjunctionType newConjunction) {
		ConjunctionType oldConjunction = conjunction;
		conjunction = newConjunction == null ? CONJUNCTION_EDEFAULT : newConjunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CORE_CONJUNCTION__CONJUNCTION, oldConjunction, conjunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCoreConstraint getFirstConstraint() {
		return firstConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstConstraint(HwCoreConstraint newFirstConstraint, NotificationChain msgs) {
		HwCoreConstraint oldFirstConstraint = firstConstraint;
		firstConstraint = newFirstConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT, oldFirstConstraint, newFirstConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstConstraint(HwCoreConstraint newFirstConstraint) {
		if (newFirstConstraint != firstConstraint) {
			NotificationChain msgs = null;
			if (firstConstraint != null)
				msgs = ((InternalEObject)firstConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT, null, msgs);
			if (newFirstConstraint != null)
				msgs = ((InternalEObject)newFirstConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT, null, msgs);
			msgs = basicSetFirstConstraint(newFirstConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT, newFirstConstraint, newFirstConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCoreConstraint getSecondConstraint() {
		return secondConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondConstraint(HwCoreConstraint newSecondConstraint, NotificationChain msgs) {
		HwCoreConstraint oldSecondConstraint = secondConstraint;
		secondConstraint = newSecondConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT, oldSecondConstraint, newSecondConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondConstraint(HwCoreConstraint newSecondConstraint) {
		if (newSecondConstraint != secondConstraint) {
			NotificationChain msgs = null;
			if (secondConstraint != null)
				msgs = ((InternalEObject)secondConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT, null, msgs);
			if (newSecondConstraint != null)
				msgs = ((InternalEObject)newSecondConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT, null, msgs);
			msgs = basicSetSecondConstraint(newSecondConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT, newSecondConstraint, newSecondConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT:
				return basicSetFirstConstraint(null, msgs);
			case AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT:
				return basicSetSecondConstraint(null, msgs);
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
			case AmaltheaPackage.HW_CORE_CONJUNCTION__CONJUNCTION:
				return getConjunction();
			case AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT:
				return getFirstConstraint();
			case AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT:
				return getSecondConstraint();
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
			case AmaltheaPackage.HW_CORE_CONJUNCTION__CONJUNCTION:
				setConjunction((ConjunctionType)newValue);
				return;
			case AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT:
				setFirstConstraint((HwCoreConstraint)newValue);
				return;
			case AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT:
				setSecondConstraint((HwCoreConstraint)newValue);
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
			case AmaltheaPackage.HW_CORE_CONJUNCTION__CONJUNCTION:
				setConjunction(CONJUNCTION_EDEFAULT);
				return;
			case AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT:
				setFirstConstraint((HwCoreConstraint)null);
				return;
			case AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT:
				setSecondConstraint((HwCoreConstraint)null);
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
			case AmaltheaPackage.HW_CORE_CONJUNCTION__CONJUNCTION:
				return conjunction != CONJUNCTION_EDEFAULT;
			case AmaltheaPackage.HW_CORE_CONJUNCTION__FIRST_CONSTRAINT:
				return firstConstraint != null;
			case AmaltheaPackage.HW_CORE_CONJUNCTION__SECOND_CONSTRAINT:
				return secondConstraint != null;
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
		result.append(" (conjunction: ");
		result.append(conjunction);
		result.append(')');
		return result.toString();
	}

} //HwCoreConjunctionImpl
