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
import org.eclipse.app4mc.amalthea.model.HwMemoryConjunction;
import org.eclipse.app4mc.amalthea.model.HwMemoryConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw Memory Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryConjunctionImpl#getConjunction <em>Conjunction</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryConjunctionImpl#getFirstConstraint <em>First Constraint</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.HwMemoryConjunctionImpl#getSecondConstraint <em>Second Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwMemoryConjunctionImpl extends HwMemoryConstraintImpl implements HwMemoryConjunction {
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
	protected HwMemoryConstraint firstConstraint;

	/**
	 * The cached value of the '{@link #getSecondConstraint() <em>Second Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondConstraint()
	 * @generated
	 * @ordered
	 */
	protected HwMemoryConstraint secondConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwMemoryConjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getHwMemoryConjunction();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_CONJUNCTION__CONJUNCTION, oldConjunction, conjunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryConstraint getFirstConstraint() {
		if (firstConstraint != null && firstConstraint.eIsProxy()) {
			InternalEObject oldFirstConstraint = (InternalEObject)firstConstraint;
			firstConstraint = (HwMemoryConstraint)eResolveProxy(oldFirstConstraint);
			if (firstConstraint != oldFirstConstraint) {
				InternalEObject newFirstConstraint = (InternalEObject)firstConstraint;
				NotificationChain msgs = oldFirstConstraint.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT, null, null);
				if (newFirstConstraint.eInternalContainer() == null) {
					msgs = newFirstConstraint.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT, oldFirstConstraint, firstConstraint));
			}
		}
		return firstConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryConstraint basicGetFirstConstraint() {
		return firstConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstConstraint(HwMemoryConstraint newFirstConstraint, NotificationChain msgs) {
		HwMemoryConstraint oldFirstConstraint = firstConstraint;
		firstConstraint = newFirstConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT, oldFirstConstraint, newFirstConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstConstraint(HwMemoryConstraint newFirstConstraint) {
		if (newFirstConstraint != firstConstraint) {
			NotificationChain msgs = null;
			if (firstConstraint != null)
				msgs = ((InternalEObject)firstConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT, null, msgs);
			if (newFirstConstraint != null)
				msgs = ((InternalEObject)newFirstConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT, null, msgs);
			msgs = basicSetFirstConstraint(newFirstConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT, newFirstConstraint, newFirstConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryConstraint getSecondConstraint() {
		if (secondConstraint != null && secondConstraint.eIsProxy()) {
			InternalEObject oldSecondConstraint = (InternalEObject)secondConstraint;
			secondConstraint = (HwMemoryConstraint)eResolveProxy(oldSecondConstraint);
			if (secondConstraint != oldSecondConstraint) {
				InternalEObject newSecondConstraint = (InternalEObject)secondConstraint;
				NotificationChain msgs = oldSecondConstraint.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT, null, null);
				if (newSecondConstraint.eInternalContainer() == null) {
					msgs = newSecondConstraint.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT, oldSecondConstraint, secondConstraint));
			}
		}
		return secondConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwMemoryConstraint basicGetSecondConstraint() {
		return secondConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondConstraint(HwMemoryConstraint newSecondConstraint, NotificationChain msgs) {
		HwMemoryConstraint oldSecondConstraint = secondConstraint;
		secondConstraint = newSecondConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT, oldSecondConstraint, newSecondConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondConstraint(HwMemoryConstraint newSecondConstraint) {
		if (newSecondConstraint != secondConstraint) {
			NotificationChain msgs = null;
			if (secondConstraint != null)
				msgs = ((InternalEObject)secondConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT, null, msgs);
			if (newSecondConstraint != null)
				msgs = ((InternalEObject)newSecondConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT, null, msgs);
			msgs = basicSetSecondConstraint(newSecondConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT, newSecondConstraint, newSecondConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT:
				return basicSetFirstConstraint(null, msgs);
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT:
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
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__CONJUNCTION:
				return getConjunction();
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT:
				if (resolve) return getFirstConstraint();
				return basicGetFirstConstraint();
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT:
				if (resolve) return getSecondConstraint();
				return basicGetSecondConstraint();
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
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__CONJUNCTION:
				setConjunction((ConjunctionType)newValue);
				return;
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT:
				setFirstConstraint((HwMemoryConstraint)newValue);
				return;
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT:
				setSecondConstraint((HwMemoryConstraint)newValue);
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
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__CONJUNCTION:
				setConjunction(CONJUNCTION_EDEFAULT);
				return;
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT:
				setFirstConstraint((HwMemoryConstraint)null);
				return;
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT:
				setSecondConstraint((HwMemoryConstraint)null);
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
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__CONJUNCTION:
				return conjunction != CONJUNCTION_EDEFAULT;
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__FIRST_CONSTRAINT:
				return firstConstraint != null;
			case AmaltheaPackage.HW_MEMORY_CONJUNCTION__SECOND_CONSTRAINT:
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

} //HwMemoryConjunctionImpl
