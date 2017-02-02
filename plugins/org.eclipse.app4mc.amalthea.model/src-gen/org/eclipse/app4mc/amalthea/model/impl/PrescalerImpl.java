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

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Prescaler;
import org.eclipse.app4mc.amalthea.model.Quartz;

import org.eclipse.app4mc.amalthea.sphinx.AmaltheaExtendedEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescaler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PrescalerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PrescalerImpl#getClockRatio <em>Clock Ratio</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.PrescalerImpl#getQuartz <em>Quartz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescalerImpl extends AmaltheaExtendedEObjectImpl implements Prescaler {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClockRatio() <em>Clock Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double CLOCK_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getClockRatio() <em>Clock Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockRatio()
	 * @generated
	 * @ordered
	 */
	protected double clockRatio = CLOCK_RATIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuartz() <em>Quartz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuartz()
	 * @generated
	 * @ordered
	 */
	protected Quartz quartz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescalerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getPrescaler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PRESCALER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getClockRatio() {
		return clockRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockRatio(double newClockRatio) {
		double oldClockRatio = clockRatio;
		clockRatio = newClockRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PRESCALER__CLOCK_RATIO, oldClockRatio, clockRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz getQuartz() {
		if (quartz != null && quartz.eIsProxy()) {
			InternalEObject oldQuartz = (InternalEObject)quartz;
			quartz = (Quartz)eResolveProxy(oldQuartz);
			if (quartz != oldQuartz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.PRESCALER__QUARTZ, oldQuartz, quartz));
			}
		}
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz basicGetQuartz() {
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuartz(Quartz newQuartz) {
		Quartz oldQuartz = quartz;
		quartz = newQuartz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.PRESCALER__QUARTZ, oldQuartz, quartz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.PRESCALER__NAME:
				return getName();
			case AmaltheaPackage.PRESCALER__CLOCK_RATIO:
				return getClockRatio();
			case AmaltheaPackage.PRESCALER__QUARTZ:
				if (resolve) return getQuartz();
				return basicGetQuartz();
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
			case AmaltheaPackage.PRESCALER__NAME:
				setName((String)newValue);
				return;
			case AmaltheaPackage.PRESCALER__CLOCK_RATIO:
				setClockRatio((Double)newValue);
				return;
			case AmaltheaPackage.PRESCALER__QUARTZ:
				setQuartz((Quartz)newValue);
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
			case AmaltheaPackage.PRESCALER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmaltheaPackage.PRESCALER__CLOCK_RATIO:
				setClockRatio(CLOCK_RATIO_EDEFAULT);
				return;
			case AmaltheaPackage.PRESCALER__QUARTZ:
				setQuartz((Quartz)null);
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
			case AmaltheaPackage.PRESCALER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AmaltheaPackage.PRESCALER__CLOCK_RATIO:
				return clockRatio != CLOCK_RATIO_EDEFAULT;
			case AmaltheaPackage.PRESCALER__QUARTZ:
				return quartz != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", clockRatio: ");
		result.append(clockRatio);
		result.append(')');
		return result.toString();
	}

} //PrescalerImpl
