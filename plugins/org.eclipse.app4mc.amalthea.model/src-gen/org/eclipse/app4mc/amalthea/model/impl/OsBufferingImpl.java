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
import org.eclipse.app4mc.amalthea.model.OsBuffering;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Buffering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsBufferingImpl#isRunnableLevel <em>Runnable Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsBufferingImpl#isProcessLevel <em>Process Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsBufferingImpl#isScheduleSectionLevel <em>Schedule Section Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.OsBufferingImpl#getBufferingAlgorithm <em>Buffering Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsBufferingImpl extends BaseObjectImpl implements OsBuffering {
	/**
	 * The default value of the '{@link #isRunnableLevel() <em>Runnable Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunnableLevel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNABLE_LEVEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunnableLevel() <em>Runnable Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunnableLevel()
	 * @generated
	 * @ordered
	 */
	protected boolean runnableLevel = RUNNABLE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isProcessLevel() <em>Process Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROCESS_LEVEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProcessLevel() <em>Process Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProcessLevel()
	 * @generated
	 * @ordered
	 */
	protected boolean processLevel = PROCESS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isScheduleSectionLevel() <em>Schedule Section Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduleSectionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCHEDULE_SECTION_LEVEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScheduleSectionLevel() <em>Schedule Section Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduleSectionLevel()
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleSectionLevel = SCHEDULE_SECTION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferingAlgorithm() <em>Buffering Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String BUFFERING_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferingAlgorithm() <em>Buffering Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String bufferingAlgorithm = BUFFERING_ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsBufferingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getOsBuffering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunnableLevel() {
		return runnableLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunnableLevel(boolean newRunnableLevel) {
		boolean oldRunnableLevel = runnableLevel;
		runnableLevel = newRunnableLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_BUFFERING__RUNNABLE_LEVEL, oldRunnableLevel, runnableLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProcessLevel() {
		return processLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessLevel(boolean newProcessLevel) {
		boolean oldProcessLevel = processLevel;
		processLevel = newProcessLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_BUFFERING__PROCESS_LEVEL, oldProcessLevel, processLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScheduleSectionLevel() {
		return scheduleSectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleSectionLevel(boolean newScheduleSectionLevel) {
		boolean oldScheduleSectionLevel = scheduleSectionLevel;
		scheduleSectionLevel = newScheduleSectionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_BUFFERING__SCHEDULE_SECTION_LEVEL, oldScheduleSectionLevel, scheduleSectionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBufferingAlgorithm() {
		return bufferingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferingAlgorithm(String newBufferingAlgorithm) {
		String oldBufferingAlgorithm = bufferingAlgorithm;
		bufferingAlgorithm = newBufferingAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.OS_BUFFERING__BUFFERING_ALGORITHM, oldBufferingAlgorithm, bufferingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmaltheaPackage.OS_BUFFERING__RUNNABLE_LEVEL:
				return isRunnableLevel();
			case AmaltheaPackage.OS_BUFFERING__PROCESS_LEVEL:
				return isProcessLevel();
			case AmaltheaPackage.OS_BUFFERING__SCHEDULE_SECTION_LEVEL:
				return isScheduleSectionLevel();
			case AmaltheaPackage.OS_BUFFERING__BUFFERING_ALGORITHM:
				return getBufferingAlgorithm();
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
			case AmaltheaPackage.OS_BUFFERING__RUNNABLE_LEVEL:
				setRunnableLevel((Boolean)newValue);
				return;
			case AmaltheaPackage.OS_BUFFERING__PROCESS_LEVEL:
				setProcessLevel((Boolean)newValue);
				return;
			case AmaltheaPackage.OS_BUFFERING__SCHEDULE_SECTION_LEVEL:
				setScheduleSectionLevel((Boolean)newValue);
				return;
			case AmaltheaPackage.OS_BUFFERING__BUFFERING_ALGORITHM:
				setBufferingAlgorithm((String)newValue);
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
			case AmaltheaPackage.OS_BUFFERING__RUNNABLE_LEVEL:
				setRunnableLevel(RUNNABLE_LEVEL_EDEFAULT);
				return;
			case AmaltheaPackage.OS_BUFFERING__PROCESS_LEVEL:
				setProcessLevel(PROCESS_LEVEL_EDEFAULT);
				return;
			case AmaltheaPackage.OS_BUFFERING__SCHEDULE_SECTION_LEVEL:
				setScheduleSectionLevel(SCHEDULE_SECTION_LEVEL_EDEFAULT);
				return;
			case AmaltheaPackage.OS_BUFFERING__BUFFERING_ALGORITHM:
				setBufferingAlgorithm(BUFFERING_ALGORITHM_EDEFAULT);
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
			case AmaltheaPackage.OS_BUFFERING__RUNNABLE_LEVEL:
				return runnableLevel != RUNNABLE_LEVEL_EDEFAULT;
			case AmaltheaPackage.OS_BUFFERING__PROCESS_LEVEL:
				return processLevel != PROCESS_LEVEL_EDEFAULT;
			case AmaltheaPackage.OS_BUFFERING__SCHEDULE_SECTION_LEVEL:
				return scheduleSectionLevel != SCHEDULE_SECTION_LEVEL_EDEFAULT;
			case AmaltheaPackage.OS_BUFFERING__BUFFERING_ALGORITHM:
				return BUFFERING_ALGORITHM_EDEFAULT == null ? bufferingAlgorithm != null : !BUFFERING_ALGORITHM_EDEFAULT.equals(bufferingAlgorithm);
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
		result.append(" (runnableLevel: ");
		result.append(runnableLevel);
		result.append(", processLevel: ");
		result.append(processLevel);
		result.append(", scheduleSectionLevel: ");
		result.append(scheduleSectionLevel);
		result.append(", bufferingAlgorithm: ");
		result.append(bufferingAlgorithm);
		result.append(')');
		return result.toString();
	}

} //OsBufferingImpl
