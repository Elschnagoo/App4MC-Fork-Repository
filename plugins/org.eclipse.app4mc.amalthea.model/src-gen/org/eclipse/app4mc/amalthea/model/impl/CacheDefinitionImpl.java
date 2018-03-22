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
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.CacheType;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.HwLatency;
import org.eclipse.app4mc.amalthea.model.WriteStrategy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#getAccessLatency <em>Access Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#getWriteStrategy <em>Write Strategy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#getNWays <em>NWays</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#isCoherency <em>Coherency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#isExclusive <em>Exclusive</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.impl.CacheDefinitionImpl#getHitRate <em>Hit Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheDefinitionImpl extends HwDefinitionImpl implements CacheDefinition {
	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize size;

	/**
	 * The cached value of the '{@link #getLineSize() <em>Line Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected DataSize lineSize;

	/**
	 * The cached value of the '{@link #getAccessLatency() <em>Access Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLatency()
	 * @generated
	 * @ordered
	 */
	protected HwLatency accessLatency;

	/**
	 * The default value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected static final CacheType CACHE_TYPE_EDEFAULT = CacheType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected CacheType cacheType = CACHE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteStrategy() <em>Write Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final WriteStrategy WRITE_STRATEGY_EDEFAULT = WriteStrategy._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getWriteStrategy() <em>Write Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteStrategy()
	 * @generated
	 * @ordered
	 */
	protected WriteStrategy writeStrategy = WRITE_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNWays() <em>NWays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNWays()
	 * @generated
	 * @ordered
	 */
	protected static final int NWAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNWays() <em>NWays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNWays()
	 * @generated
	 * @ordered
	 */
	protected int nWays = NWAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCoherency() <em>Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCoherency()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COHERENCY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCoherency() <em>Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCoherency()
	 * @generated
	 * @ordered
	 */
	protected boolean coherency = COHERENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusive = EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHitRate() <em>Hit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitRate()
	 * @generated
	 * @ordered
	 */
	protected static final double HIT_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHitRate() <em>Hit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitRate()
	 * @generated
	 * @ordered
	 */
	protected double hitRate = HIT_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmaltheaPackage.eINSTANCE.getCacheDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(DataSize newSize, NotificationChain msgs) {
		DataSize oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(DataSize newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CACHE_DEFINITION__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CACHE_DEFINITION__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getLineSize() {
		return lineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineSize(DataSize newLineSize, NotificationChain msgs) {
		DataSize oldLineSize = lineSize;
		lineSize = newLineSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE, oldLineSize, newLineSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineSize(DataSize newLineSize) {
		if (newLineSize != lineSize) {
			NotificationChain msgs = null;
			if (lineSize != null)
				msgs = ((InternalEObject)lineSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE, null, msgs);
			if (newLineSize != null)
				msgs = ((InternalEObject)newLineSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE, null, msgs);
			msgs = basicSetLineSize(newLineSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE, newLineSize, newLineSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwLatency getAccessLatency() {
		return accessLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessLatency(HwLatency newAccessLatency, NotificationChain msgs) {
		HwLatency oldAccessLatency = accessLatency;
		accessLatency = newAccessLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY, oldAccessLatency, newAccessLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLatency(HwLatency newAccessLatency) {
		if (newAccessLatency != accessLatency) {
			NotificationChain msgs = null;
			if (accessLatency != null)
				msgs = ((InternalEObject)accessLatency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY, null, msgs);
			if (newAccessLatency != null)
				msgs = ((InternalEObject)newAccessLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY, null, msgs);
			msgs = basicSetAccessLatency(newAccessLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY, newAccessLatency, newAccessLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType getCacheType() {
		return cacheType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheType(CacheType newCacheType) {
		CacheType oldCacheType = cacheType;
		cacheType = newCacheType == null ? CACHE_TYPE_EDEFAULT : newCacheType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__CACHE_TYPE, oldCacheType, cacheType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStrategy getWriteStrategy() {
		return writeStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteStrategy(WriteStrategy newWriteStrategy) {
		WriteStrategy oldWriteStrategy = writeStrategy;
		writeStrategy = newWriteStrategy == null ? WRITE_STRATEGY_EDEFAULT : newWriteStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__WRITE_STRATEGY, oldWriteStrategy, writeStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNWays() {
		return nWays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNWays(int newNWays) {
		int oldNWays = nWays;
		nWays = newNWays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__NWAYS, oldNWays, nWays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCoherency() {
		return coherency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoherency(boolean newCoherency) {
		boolean oldCoherency = coherency;
		coherency = newCoherency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__COHERENCY, oldCoherency, coherency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusive() {
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusive(boolean newExclusive) {
		boolean oldExclusive = exclusive;
		exclusive = newExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__EXCLUSIVE, oldExclusive, exclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHitRate() {
		return hitRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHitRate(double newHitRate) {
		double oldHitRate = hitRate;
		hitRate = newHitRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmaltheaPackage.CACHE_DEFINITION__HIT_RATE, oldHitRate, hitRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmaltheaPackage.CACHE_DEFINITION__SIZE:
				return basicSetSize(null, msgs);
			case AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE:
				return basicSetLineSize(null, msgs);
			case AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY:
				return basicSetAccessLatency(null, msgs);
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
			case AmaltheaPackage.CACHE_DEFINITION__SIZE:
				return getSize();
			case AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE:
				return getLineSize();
			case AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY:
				return getAccessLatency();
			case AmaltheaPackage.CACHE_DEFINITION__CACHE_TYPE:
				return getCacheType();
			case AmaltheaPackage.CACHE_DEFINITION__WRITE_STRATEGY:
				return getWriteStrategy();
			case AmaltheaPackage.CACHE_DEFINITION__NWAYS:
				return getNWays();
			case AmaltheaPackage.CACHE_DEFINITION__COHERENCY:
				return isCoherency();
			case AmaltheaPackage.CACHE_DEFINITION__EXCLUSIVE:
				return isExclusive();
			case AmaltheaPackage.CACHE_DEFINITION__HIT_RATE:
				return getHitRate();
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
			case AmaltheaPackage.CACHE_DEFINITION__SIZE:
				setSize((DataSize)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE:
				setLineSize((DataSize)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY:
				setAccessLatency((HwLatency)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__CACHE_TYPE:
				setCacheType((CacheType)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__WRITE_STRATEGY:
				setWriteStrategy((WriteStrategy)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__NWAYS:
				setNWays((Integer)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__COHERENCY:
				setCoherency((Boolean)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__EXCLUSIVE:
				setExclusive((Boolean)newValue);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__HIT_RATE:
				setHitRate((Double)newValue);
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
			case AmaltheaPackage.CACHE_DEFINITION__SIZE:
				setSize((DataSize)null);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE:
				setLineSize((DataSize)null);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY:
				setAccessLatency((HwLatency)null);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__CACHE_TYPE:
				setCacheType(CACHE_TYPE_EDEFAULT);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__WRITE_STRATEGY:
				setWriteStrategy(WRITE_STRATEGY_EDEFAULT);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__NWAYS:
				setNWays(NWAYS_EDEFAULT);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__COHERENCY:
				setCoherency(COHERENCY_EDEFAULT);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__EXCLUSIVE:
				setExclusive(EXCLUSIVE_EDEFAULT);
				return;
			case AmaltheaPackage.CACHE_DEFINITION__HIT_RATE:
				setHitRate(HIT_RATE_EDEFAULT);
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
			case AmaltheaPackage.CACHE_DEFINITION__SIZE:
				return size != null;
			case AmaltheaPackage.CACHE_DEFINITION__LINE_SIZE:
				return lineSize != null;
			case AmaltheaPackage.CACHE_DEFINITION__ACCESS_LATENCY:
				return accessLatency != null;
			case AmaltheaPackage.CACHE_DEFINITION__CACHE_TYPE:
				return cacheType != CACHE_TYPE_EDEFAULT;
			case AmaltheaPackage.CACHE_DEFINITION__WRITE_STRATEGY:
				return writeStrategy != WRITE_STRATEGY_EDEFAULT;
			case AmaltheaPackage.CACHE_DEFINITION__NWAYS:
				return nWays != NWAYS_EDEFAULT;
			case AmaltheaPackage.CACHE_DEFINITION__COHERENCY:
				return coherency != COHERENCY_EDEFAULT;
			case AmaltheaPackage.CACHE_DEFINITION__EXCLUSIVE:
				return exclusive != EXCLUSIVE_EDEFAULT;
			case AmaltheaPackage.CACHE_DEFINITION__HIT_RATE:
				return hitRate != HIT_RATE_EDEFAULT;
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
		result.append(" (cacheType: ");
		result.append(cacheType);
		result.append(", writeStrategy: ");
		result.append(writeStrategy);
		result.append(", nWays: ");
		result.append(nWays);
		result.append(", coherency: ");
		result.append(coherency);
		result.append(", exclusive: ");
		result.append(exclusive);
		result.append(", hitRate: ");
		result.append(hitRate);
		result.append(')');
		return result.toString();
	}

} //CacheDefinitionImpl
