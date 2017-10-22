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
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getTransmissionPolicy <em>Transmission Policy</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getDataStability <em>Data Stability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess()
 * @model features="dataLinkInt" 
 *        dataLinkIntType="org.eclipse.app4mc.amalthea.model.Label" dataLinkIntOpposite="labelAccesses" dataLinkIntRequired="true" dataLinkIntTransient="true" dataLinkIntSuppressedGetVisibility="true" dataLinkIntSuppressedSetVisibility="true"
 *        dataLinkIntAnnotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
 * @generated
 */
public interface LabelAccess extends ComputationItem {
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
	 * @model containment="true"
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
	 * Returns the value of the '<em><b>Transmission Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional parameter for transmission policy of larger data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmission Policy</em>' containment reference.
	 * @see #setTransmissionPolicy(TransmissionPolicy)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess_TransmissionPolicy()
	 * @model containment="true"
	 * @generated
	 */
	TransmissionPolicy getTransmissionPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getTransmissionPolicy <em>Transmission Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Policy</em>' containment reference.
	 * @see #getTransmissionPolicy()
	 * @generated
	 */
	void setTransmissionPolicy(TransmissionPolicy value);

	/**
	 * Returns the value of the '<em><b>Data Stability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LabelAccessDataStability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the data stability needs of the label access
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Stability</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessDataStability
	 * @see #setDataStability(LabelAccessDataStability)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess_DataStability()
	 * @model unique="false"
	 * @generated
	 */
	LabelAccessDataStability getDataStability();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getDataStability <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Stability</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessDataStability
	 * @see #getDataStability()
	 * @generated
	 */
	void setDataStability(LabelAccessDataStability value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LabelAccessImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessImplementation
	 * @see #setImplementation(LabelAccessImplementation)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabelAccess_Implementation()
	 * @model unique="false"
	 * @generated
	 */
	LabelAccessImplementation getImplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.LabelAccess#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelAccessImplementation
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(LabelAccessImplementation value);

} // LabelAccess
