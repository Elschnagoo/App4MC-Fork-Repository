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

import org.eclipse.app4mc.amalthea.model.ASILType;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.Section;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SectionImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SectionImpl#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.SectionImpl#getAsilLevel <em>Asil Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ReferableBaseObjectImpl implements Section {
	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * The cached value of the '{@link #getRunnables() <em>Runnables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.app4mc.amalthea.model.Runnable> runnables;

	/**
	 * The default value of the '{@link #getAsilLevel() <em>Asil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ASILType ASIL_LEVEL_EDEFAULT = ASILType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAsilLevel() <em>Asil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilLevel()
	 * @generated
	 * @ordered
	 */
	protected ASILType asilLevel = ASIL_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectWithInverseResolvingEList<Label>(Label.class, this, AmaltheaPackage.SECTION__LABELS, AmaltheaPackage.LABEL__SECTION_LINK_INT);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables() {
		if (runnables == null) {
			runnables = new EObjectWithInverseResolvingEList<org.eclipse.app4mc.amalthea.model.Runnable>(org.eclipse.app4mc.amalthea.model.Runnable.class, this, AmaltheaPackage.SECTION__RUNNABLES, AmaltheaPackage.RUNNABLE__SECTION_LINK_INT);
		}
		return runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILType getAsilLevel() {
		return asilLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsilLevel(ASILType newAsilLevel) {
		ASILType oldAsilLevel = asilLevel;
		asilLevel = newAsilLevel == null ? ASIL_LEVEL_EDEFAULT : newAsilLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.SECTION__ASIL_LEVEL, oldAsilLevel, asilLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SECTION__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
			case AmaltheaPackage.SECTION__RUNNABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRunnables()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.SECTION__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case AmaltheaPackage.SECTION__RUNNABLES:
				return ((InternalEList<?>)getRunnables()).basicRemove(otherEnd, msgs);
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
			case AmaltheaPackage.SECTION__LABELS:
				return getLabels();
			case AmaltheaPackage.SECTION__RUNNABLES:
				return getRunnables();
			case AmaltheaPackage.SECTION__ASIL_LEVEL:
				return getAsilLevel();
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
			case AmaltheaPackage.SECTION__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case AmaltheaPackage.SECTION__RUNNABLES:
				getRunnables().clear();
				getRunnables().addAll((Collection<? extends org.eclipse.app4mc.amalthea.model.Runnable>)newValue);
				return;
			case AmaltheaPackage.SECTION__ASIL_LEVEL:
				setAsilLevel((ASILType)newValue);
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
			case AmaltheaPackage.SECTION__LABELS:
				getLabels().clear();
				return;
			case AmaltheaPackage.SECTION__RUNNABLES:
				getRunnables().clear();
				return;
			case AmaltheaPackage.SECTION__ASIL_LEVEL:
				setAsilLevel(ASIL_LEVEL_EDEFAULT);
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
			case AmaltheaPackage.SECTION__LABELS:
				return labels != null && !labels.isEmpty();
			case AmaltheaPackage.SECTION__RUNNABLES:
				return runnables != null && !runnables.isEmpty();
			case AmaltheaPackage.SECTION__ASIL_LEVEL:
				return asilLevel != ASIL_LEVEL_EDEFAULT;
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
		result.append(" (asilLevel: ");
		result.append(asilLevel);
		result.append(')');
		return result.toString();
	}

} //SectionImpl
