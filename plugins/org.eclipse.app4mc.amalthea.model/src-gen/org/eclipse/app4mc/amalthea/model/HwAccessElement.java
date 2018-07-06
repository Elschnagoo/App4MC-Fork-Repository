/**
 * *******************************************************************************
 *  Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Hw Access Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * class HwConverter extends INamed {
 * 	contains HwLatency latency
 * 	refers FrequencyDomain[1] sourceFrequencyDomain
 * 	refers FrequencyDomain[1] targetFrequencyDomain
 *  }
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getAccessPath <em>Access Path</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getReadLatency <em>Read Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getWriteLatency <em>Write Latency</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getDataRate <em>Data Rate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessElement()
 * @model
 * @generated
 */
public interface HwAccessElement extends ITaggable, INamed {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.ProcessingUnit#getAccessElements <em>Access Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessElement_Source()
	 * @see org.eclipse.app4mc.amalthea.model.ProcessingUnit#getAccessElements
	 * @model opposite="accessElements" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	ProcessingUnit getSource();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(HwDestination)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessElement_Destination()
	 * @model required="true"
	 * @generated
	 */
	HwDestination getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(HwDestination value);

	/**
	 * Returns the value of the '<em><b>Access Path</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getContainingAccessElement <em>Containing Access Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Path</em>' containment reference.
	 * @see #setAccessPath(HwAccessPath)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessElement_AccessPath()
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessPath#getContainingAccessElement
	 * @model opposite="containingAccessElement" containment="true"
	 * @generated
	 */
	HwAccessPath getAccessPath();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getAccessPath <em>Access Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Path</em>' containment reference.
	 * @see #getAccessPath()
	 * @generated
	 */
	void setAccessPath(HwAccessPath value);

	/**
	 * Returns the value of the '<em><b>Read Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Latency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Latency</em>' containment reference.
	 * @see #setReadLatency(HwLatency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessElement_ReadLatency()
	 * @model containment="true"
	 * @generated
	 */
	HwLatency getReadLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getReadLatency <em>Read Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Latency</em>' containment reference.
	 * @see #getReadLatency()
	 * @generated
	 */
	void setReadLatency(HwLatency value);

	/**
	 * Returns the value of the '<em><b>Write Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Latency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Latency</em>' containment reference.
	 * @see #setWriteLatency(HwLatency)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessElement_WriteLatency()
	 * @model containment="true"
	 * @generated
	 */
	HwLatency getWriteLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getWriteLatency <em>Write Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Latency</em>' containment reference.
	 * @see #getWriteLatency()
	 * @generated
	 */
	void setWriteLatency(HwLatency value);

	/**
	 * Returns the value of the '<em><b>Data Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rate</em>' containment reference.
	 * @see #setDataRate(DataRate)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessElement_DataRate()
	 * @model containment="true"
	 * @generated
	 */
	DataRate getDataRate();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getDataRate <em>Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Rate</em>' containment reference.
	 * @see #getDataRate()
	 * @generated
	 */
	void setDataRate(DataRate value);

} // HwAccessElement
