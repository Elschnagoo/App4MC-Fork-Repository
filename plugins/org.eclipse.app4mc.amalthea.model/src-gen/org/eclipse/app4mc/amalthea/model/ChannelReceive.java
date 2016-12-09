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
package org.eclipse.app4mc.amalthea.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Receive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#getReceiveOperation <em>Receive Operation</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#isDataMustBeNew <em>Data Must Be New</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#getElementIndex <em>Element Index</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelReceive()
 * @model
 * @generated
 */
public interface ChannelReceive extends ChannelAccess {
	/**
	 * Returns the value of the '<em><b>Receive Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.ReceiveOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Operation</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ReceiveOperation
	 * @see #setReceiveOperation(ReceiveOperation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelReceive_ReceiveOperation()
	 * @model unique="false"
	 * @generated
	 */
	ReceiveOperation getReceiveOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#getReceiveOperation <em>Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Operation</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ReceiveOperation
	 * @see #getReceiveOperation()
	 * @generated
	 */
	void setReceiveOperation(ReceiveOperation value);

	/**
	 * Returns the value of the '<em><b>Data Must Be New</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Must Be New</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Must Be New</em>' attribute.
	 * @see #setDataMustBeNew(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelReceive_DataMustBeNew()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isDataMustBeNew();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#isDataMustBeNew <em>Data Must Be New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Must Be New</em>' attribute.
	 * @see #isDataMustBeNew()
	 * @generated
	 */
	void setDataMustBeNew(boolean value);

	/**
	 * Returns the value of the '<em><b>Element Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Index</em>' attribute.
	 * @see #setElementIndex(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelReceive_ElementIndex()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getElementIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#getElementIndex <em>Element Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Index</em>' attribute.
	 * @see #getElementIndex()
	 * @generated
	 */
	void setElementIndex(int value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getChannelReceive_LowerBound()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ChannelReceive#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

} // ChannelReceive