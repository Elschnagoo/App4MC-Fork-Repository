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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Unit Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition#getPuType <em>Pu Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessingUnitDefinition()
 * @model
 * @generated
 */
public interface ProcessingUnitDefinition extends HwDefinition {
	/**
	 * Returns the value of the '<em><b>Pu Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.PuType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pu Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PuType
	 * @see #setPuType(PuType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessingUnitDefinition_PuType()
	 * @model unique="false"
	 * @generated
	 */
	PuType getPuType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition#getPuType <em>Pu Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pu Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.PuType
	 * @see #getPuType()
	 * @generated
	 */
	void setPuType(PuType value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessingUnitDefinition_Features()
	 * @model
	 * @generated
	 */
	EList<HwFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.CoreClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getProcessingUnitDefinition_Classifiers()
	 * @model
	 * @generated
	 */
	EList<CoreClassifier> getClassifiers();

} // ProcessingUnitDefinition
