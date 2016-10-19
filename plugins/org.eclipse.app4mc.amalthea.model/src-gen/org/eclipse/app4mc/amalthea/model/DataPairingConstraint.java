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
 * A representation of the model object '<em><b>Data Pairing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data-pairing-constraint
 * labels describes the group of labels that should be paired on the target
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataPairingConstraint#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataPairingConstraint()
 * @model
 * @generated
 */
public interface DataPairingConstraint extends PairingConstraint, DataConstraint, BaseObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference.
	 * @see #setLabels(LabelEntityGroup)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataPairingConstraint_Labels()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	LabelEntityGroup getLabels();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataPairingConstraint#getLabels <em>Labels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' containment reference.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(LabelEntityGroup value);

} // DataPairingConstraint