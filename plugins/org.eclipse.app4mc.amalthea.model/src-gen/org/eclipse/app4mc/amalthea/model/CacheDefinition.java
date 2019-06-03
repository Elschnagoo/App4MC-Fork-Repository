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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getAccessLatency <em>Access Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getWriteStrategy <em>Write Strategy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getNWays <em>NWays</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#isCoherency <em>Coherency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#isExclusive <em>Exclusive</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getHitRate <em>Hit Rate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition()
 * @model
 * @generated
 */
public interface CacheDefinition extends HwDefinition {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(DataSize)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_Size()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Line Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Size</em>' containment reference.
	 * @see #setLineSize(DataSize)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_LineSize()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getLineSize();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getLineSize <em>Line Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Size</em>' containment reference.
	 * @see #getLineSize()
	 * @generated
	 */
	void setLineSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Access Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Access latency [cycles]</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Latency</em>' containment reference.
	 * @see #setAccessLatency(IDiscreteValueDeviation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_AccessLatency()
	 * @model containment="true"
	 * @generated
	 */
	IDiscreteValueDeviation getAccessLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getAccessLatency <em>Access Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Latency</em>' containment reference.
	 * @see #getAccessLatency()
	 * @generated
	 */
	void setAccessLatency(IDiscreteValueDeviation value);

	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.CacheType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CacheType
	 * @see #setCacheType(CacheType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_CacheType()
	 * @model unique="false"
	 * @generated
	 */
	CacheType getCacheType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.CacheType
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(CacheType value);

	/**
	 * Returns the value of the '<em><b>Write Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.WriteStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Strategy</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WriteStrategy
	 * @see #setWriteStrategy(WriteStrategy)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_WriteStrategy()
	 * @model unique="false"
	 * @generated
	 */
	WriteStrategy getWriteStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getWriteStrategy <em>Write Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Strategy</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.WriteStrategy
	 * @see #getWriteStrategy()
	 * @generated
	 */
	void setWriteStrategy(WriteStrategy value);

	/**
	 * Returns the value of the '<em><b>NWays</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NWays</em>' attribute.
	 * @see #setNWays(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_NWays()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getNWays();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getNWays <em>NWays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NWays</em>' attribute.
	 * @see #getNWays()
	 * @generated
	 */
	void setNWays(int value);

	/**
	 * Returns the value of the '<em><b>Coherency</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coherency</em>' attribute.
	 * @see #setCoherency(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_Coherency()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isCoherency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#isCoherency <em>Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coherency</em>' attribute.
	 * @see #isCoherency()
	 * @generated
	 */
	void setCoherency(boolean value);

	/**
	 * Returns the value of the '<em><b>Exclusive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive</em>' attribute.
	 * @see #setExclusive(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_Exclusive()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isExclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#isExclusive <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive</em>' attribute.
	 * @see #isExclusive()
	 * @generated
	 */
	void setExclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Hit Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Rate</em>' attribute.
	 * @see #setHitRate(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCacheDefinition_HitRate()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getHitRate();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CacheDefinition#getHitRate <em>Hit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Rate</em>' attribute.
	 * @see #getHitRate()
	 * @generated
	 */
	void setHitRate(double value);

} // CacheDefinition
