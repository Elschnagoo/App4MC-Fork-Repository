/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 *  This program and the accompanying materials are made
 *  available under the terms of the Eclipse Public License 2.0
 *  which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 *     Generated using Eclipse EMF
 * 
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.model.impl;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.ITaggable;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessDataStability;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessImplementation;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getTransmissionPolicy <em>Transmission Policy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getDataStability <em>Data Stability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.LabelAccessImpl#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelAccessImpl extends ComputationItemImpl implements LabelAccess {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Label data;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessEnum ACCESS_EDEFAULT = LabelAccessEnum._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessEnum access = ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatistic() <em>Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistic()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessStatistic statistic;

	/**
	 * The cached value of the '{@link #getTransmissionPolicy() <em>Transmission Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionPolicy()
	 * @generated
	 * @ordered
	 */
	protected TransmissionPolicy transmissionPolicy;

	/**
	 * The default value of the '{@link #getDataStability() <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStability()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessDataStability DATA_STABILITY_EDEFAULT = LabelAccessDataStability._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getDataStability() <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStability()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessDataStability dataStability = DATA_STABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessImplementation IMPLEMENTATION_EDEFAULT = LabelAccessImplementation._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessImplementation implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected DataDependency dependsOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getLabelAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, AmaltheaPackage.LABEL_ACCESS__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Label)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmaltheaPackage.LABEL_ACCESS__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(Label newData) {
		Label oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelAccessEnum getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess(LabelAccessEnum newAccess) {
		LabelAccessEnum oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelAccessStatistic getStatistic() {
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistic(LabelAccessStatistic newStatistic, NotificationChain msgs) {
		LabelAccessStatistic oldStatistic = statistic;
		statistic = newStatistic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__STATISTIC, oldStatistic, newStatistic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatistic(LabelAccessStatistic newStatistic) {
		if (newStatistic != statistic) {
			NotificationChain msgs = null;
			if (statistic != null)
				msgs = ((InternalEObject)statistic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__STATISTIC, null, msgs);
			if (newStatistic != null)
				msgs = ((InternalEObject)newStatistic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__STATISTIC, null, msgs);
			msgs = basicSetStatistic(newStatistic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__STATISTIC, newStatistic, newStatistic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionPolicy getTransmissionPolicy() {
		return transmissionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissionPolicy(TransmissionPolicy newTransmissionPolicy, NotificationChain msgs) {
		TransmissionPolicy oldTransmissionPolicy = transmissionPolicy;
		transmissionPolicy = newTransmissionPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, oldTransmissionPolicy, newTransmissionPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmissionPolicy(TransmissionPolicy newTransmissionPolicy) {
		if (newTransmissionPolicy != transmissionPolicy) {
			NotificationChain msgs = null;
			if (transmissionPolicy != null)
				msgs = ((InternalEObject)transmissionPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, null, msgs);
			if (newTransmissionPolicy != null)
				msgs = ((InternalEObject)newTransmissionPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, null, msgs);
			msgs = basicSetTransmissionPolicy(newTransmissionPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY, newTransmissionPolicy, newTransmissionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelAccessDataStability getDataStability() {
		return dataStability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataStability(LabelAccessDataStability newDataStability) {
		LabelAccessDataStability oldDataStability = dataStability;
		dataStability = newDataStability == null ? DATA_STABILITY_EDEFAULT : newDataStability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY, oldDataStability, dataStability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelAccessImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(LabelAccessImplementation newImplementation) {
		LabelAccessImplementation oldImplementation = implementation;
		implementation = newImplementation == null ? IMPLEMENTATION_EDEFAULT : newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDependency getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependsOn(DataDependency newDependsOn, NotificationChain msgs) {
		DataDependency oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON, oldDependsOn, newDependsOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependsOn(DataDependency newDependsOn) {
		if (newDependsOn != dependsOn) {
			NotificationChain msgs = null;
			if (dependsOn != null)
				msgs = ((InternalEObject)dependsOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON, null, msgs);
			if (newDependsOn != null)
				msgs = ((InternalEObject)newDependsOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON, null, msgs);
			msgs = basicSetDependsOn(newDependsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON, newDependsOn, newDependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				return basicSetStatistic(null, msgs);
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				return basicSetTransmissionPolicy(null, msgs);
			case AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON:
				return basicSetDependsOn(null, msgs);
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
			case AmaltheaPackage.LABEL_ACCESS__TAGS:
				return getTags();
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				if (resolve) return getData();
				return basicGetData();
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				return getAccess();
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				return getStatistic();
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				return getTransmissionPolicy();
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				return getDataStability();
			case AmaltheaPackage.LABEL_ACCESS__IMPLEMENTATION:
				return getImplementation();
			case AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON:
				return getDependsOn();
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
			case AmaltheaPackage.LABEL_ACCESS__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				setData((Label)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				setAccess((LabelAccessEnum)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				setStatistic((LabelAccessStatistic)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				setTransmissionPolicy((TransmissionPolicy)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				setDataStability((LabelAccessDataStability)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__IMPLEMENTATION:
				setImplementation((LabelAccessImplementation)newValue);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON:
				setDependsOn((DataDependency)newValue);
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
			case AmaltheaPackage.LABEL_ACCESS__TAGS:
				getTags().clear();
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				setData((Label)null);
				return;
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				setStatistic((LabelAccessStatistic)null);
				return;
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				setTransmissionPolicy((TransmissionPolicy)null);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				setDataStability(DATA_STABILITY_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL_ACCESS__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON:
				setDependsOn((DataDependency)null);
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
			case AmaltheaPackage.LABEL_ACCESS__TAGS:
				return tags != null && !tags.isEmpty();
			case AmaltheaPackage.LABEL_ACCESS__DATA:
				return data != null;
			case AmaltheaPackage.LABEL_ACCESS__ACCESS:
				return access != ACCESS_EDEFAULT;
			case AmaltheaPackage.LABEL_ACCESS__STATISTIC:
				return statistic != null;
			case AmaltheaPackage.LABEL_ACCESS__TRANSMISSION_POLICY:
				return transmissionPolicy != null;
			case AmaltheaPackage.LABEL_ACCESS__DATA_STABILITY:
				return dataStability != DATA_STABILITY_EDEFAULT;
			case AmaltheaPackage.LABEL_ACCESS__IMPLEMENTATION:
				return implementation != IMPLEMENTATION_EDEFAULT;
			case AmaltheaPackage.LABEL_ACCESS__DEPENDS_ON:
				return dependsOn != null;
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
		if (baseClass == ITaggable.class) {
			switch (derivedFeatureID) {
				case AmaltheaPackage.LABEL_ACCESS__TAGS: return AmaltheaPackage.ITAGGABLE__TAGS;
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
		if (baseClass == ITaggable.class) {
			switch (baseFeatureID) {
				case AmaltheaPackage.ITAGGABLE__TAGS: return AmaltheaPackage.LABEL_ACCESS__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (access: ");
		result.append(access);
		result.append(", dataStability: ");
		result.append(dataStability);
		result.append(", implementation: ");
		result.append(implementation);
		result.append(')');
		return result.toString();
	}

} //LabelAccessImpl
