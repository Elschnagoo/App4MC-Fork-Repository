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
 * A representation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of a label access of a run entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getBuffered <em>Buffered</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess()
 * @model features="dataLinkInt" 
 *        dataLinkIntType="org.eclipse.app4mc.amalthea.model.Label" dataLinkIntOpposite="labelAccesses" dataLinkIntRequired="true" dataLinkIntTransient="true" dataLinkIntSuppressedGetVisibility="true" dataLinkIntSuppressedSetVisibility="true"
 *        dataLinkIntAnnotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
 * @generated
 */
public interface LabelAccess extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Label)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess_Data()
	 * @model required="true"
	 * @generated
	 */
	Label getData();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Label value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LabelAccessEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessEnum
	 * @see #setAccess(LabelAccessEnum)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess_Access()
	 * @model unique="false"
	 * @generated
	 */
	LabelAccessEnum getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessEnum
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(LabelAccessEnum value);

	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional parameter for statistic values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistic</em>' containment reference.
	 * @see #setStatistic(LabelAccessStatistic)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess_Statistic()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	LabelAccessStatistic getStatistic();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getStatistic <em>Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistic</em>' containment reference.
	 * @see #getStatistic()
	 * @generated
	 */
	void setStatistic(LabelAccessStatistic value);

	/**
	 * Returns the value of the '<em><b>Buffered</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LabelAccessBuffering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines if the access to the label is buffered
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffered</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessBuffering
	 * @see #setBuffered(LabelAccessBuffering)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess_Buffered()
	 * @model unique="false"
	 * @generated
	 */
	LabelAccessBuffering getBuffered();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getBuffered <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffered</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessBuffering
	 * @see #getBuffered()
	 * @generated
	 */
	void setBuffered(LabelAccessBuffering value);

} // LabelAccess
