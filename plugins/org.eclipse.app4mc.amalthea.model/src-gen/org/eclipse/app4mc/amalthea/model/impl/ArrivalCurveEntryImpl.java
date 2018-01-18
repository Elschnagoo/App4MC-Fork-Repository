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
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrival Curve Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ArrivalCurveEntryImpl#getNumberOfOccurrences <em>Number Of Occurrences</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ArrivalCurveEntryImpl#getLowerTimeBorder <em>Lower Time Border</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.ArrivalCurveEntryImpl#getUpperTimeBorder <em>Upper Time Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrivalCurveEntryImpl extends BaseObjectImpl implements ArrivalCurveEntry {
	/**
	 * The default value of the '{@link #getNumberOfOccurrences() <em>Number Of Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_OCCURRENCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfOccurrences() <em>Number Of Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected int numberOfOccurrences = NUMBER_OF_OCCURRENCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLowerTimeBorder() <em>Lower Time Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerTimeBorder()
	 * @generated
	 * @ordered
	 */
	protected Time lowerTimeBorder;

	/**
	 * The cached value of the '{@link #getUpperTimeBorder() <em>Upper Time Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperTimeBorder()
	 * @generated
	 * @ordered
	 */
	protected Time upperTimeBorder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrivalCurveEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getArrivalCurveEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfOccurrences() {
		return numberOfOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfOccurrences(int newNumberOfOccurrences) {
		int oldNumberOfOccurrences = numberOfOccurrences;
		numberOfOccurrences = newNumberOfOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__NUMBER_OF_OCCURRENCES, oldNumberOfOccurrences, numberOfOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getLowerTimeBorder() {
		return lowerTimeBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerTimeBorder(Time newLowerTimeBorder, NotificationChain msgs) {
		Time oldLowerTimeBorder = lowerTimeBorder;
		lowerTimeBorder = newLowerTimeBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER, oldLowerTimeBorder, newLowerTimeBorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerTimeBorder(Time newLowerTimeBorder) {
		if (newLowerTimeBorder != lowerTimeBorder) {
			NotificationChain msgs = null;
			if (lowerTimeBorder != null)
				msgs = ((InternalEObject)lowerTimeBorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER, null, msgs);
			if (newLowerTimeBorder != null)
				msgs = ((InternalEObject)newLowerTimeBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER, null, msgs);
			msgs = basicSetLowerTimeBorder(newLowerTimeBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER, newLowerTimeBorder, newLowerTimeBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getUpperTimeBorder() {
		return upperTimeBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperTimeBorder(Time newUpperTimeBorder, NotificationChain msgs) {
		Time oldUpperTimeBorder = upperTimeBorder;
		upperTimeBorder = newUpperTimeBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER, oldUpperTimeBorder, newUpperTimeBorder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperTimeBorder(Time newUpperTimeBorder) {
		if (newUpperTimeBorder != upperTimeBorder) {
			NotificationChain msgs = null;
			if (upperTimeBorder != null)
				msgs = ((InternalEObject)upperTimeBorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER, null, msgs);
			if (newUpperTimeBorder != null)
				msgs = ((InternalEObject)newUpperTimeBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER, null, msgs);
			msgs = basicSetUpperTimeBorder(newUpperTimeBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER, newUpperTimeBorder, newUpperTimeBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER:
				return basicSetLowerTimeBorder(null, msgs);
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER:
				return basicSetUpperTimeBorder(null, msgs);
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
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__NUMBER_OF_OCCURRENCES:
				return getNumberOfOccurrences();
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER:
				return getLowerTimeBorder();
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER:
				return getUpperTimeBorder();
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
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__NUMBER_OF_OCCURRENCES:
				setNumberOfOccurrences((Integer)newValue);
				return;
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER:
				setLowerTimeBorder((Time)newValue);
				return;
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER:
				setUpperTimeBorder((Time)newValue);
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
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__NUMBER_OF_OCCURRENCES:
				setNumberOfOccurrences(NUMBER_OF_OCCURRENCES_EDEFAULT);
				return;
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER:
				setLowerTimeBorder((Time)null);
				return;
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER:
				setUpperTimeBorder((Time)null);
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
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__NUMBER_OF_OCCURRENCES:
				return numberOfOccurrences != NUMBER_OF_OCCURRENCES_EDEFAULT;
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER:
				return lowerTimeBorder != null;
			case AmaltheaPackage.ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER:
				return upperTimeBorder != null;
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
		result.append(" (numberOfOccurrences: ");
		result.append(numberOfOccurrences);
		result.append(')');
		return result.toString();
	}

} //ArrivalCurveEntryImpl
