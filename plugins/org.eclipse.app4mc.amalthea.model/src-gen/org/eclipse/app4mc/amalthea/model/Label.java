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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Data representation, which can be accessed by run entities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#isBVolatile <em>BVolatile</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#getDataStability <em>Data Stability</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#getStabilityLevel <em>Stability Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#getSection <em>Section</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#getLabelAccesses <em>Label Accesses</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Label#getReferringComponents <em>Referring Components</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends AbstractMemoryElement, IDisplayName {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_DataType()
	 * @model containment="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Label#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the label as a constant, not modifiable entity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_Constant()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Label#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>BVolatile</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines if the label value is volatile or persistent to survive shutdown and start of system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BVolatile</em>' attribute.
	 * @see #setBVolatile(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_BVolatile()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isBVolatile();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Label#isBVolatile <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BVolatile</em>' attribute.
	 * @see #isBVolatile()
	 * @generated
	 */
	void setBVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Stability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.LabelDataStability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the data stability needs of the label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Stability</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelDataStability
	 * @see #setDataStability(LabelDataStability)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_DataStability()
	 * @model unique="false"
	 * @generated
	 */
	LabelDataStability getDataStability();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Label#getDataStability <em>Data Stability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Stability</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.LabelDataStability
	 * @see #getDataStability()
	 * @generated
	 */
	void setDataStability(LabelDataStability value);

	/**
	 * Returns the value of the '<em><b>Stability Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.DataStabilityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stability Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stability Level</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataStabilityLevel
	 * @see #setStabilityLevel(DataStabilityLevel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_StabilityLevel()
	 * @model unique="false"
	 * @generated
	 */
	DataStabilityLevel getStabilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Label#getStabilityLevel <em>Stability Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stability Level</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataStabilityLevel
	 * @see #getStabilityLevel()
	 * @generated
	 */
	void setStabilityLevel(DataStabilityLevel value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' reference.
	 * @see #setSection(Section)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_Section()
	 * @model
	 * @generated
	 */
	Section getSection();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Label#getSection <em>Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Section value);

	/**
	 * Returns the value of the '<em><b>Label Accesses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.LabelAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of accesses (LabelAccess).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Accesses</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_LabelAccesses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.LabelAccess%&gt;&gt;getInverseReferences(this, \n\t&lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getLabel_LabelAccesses(), &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getLabelAccess_Data());'"
	 * @generated
	 */
	EList<LabelAccess> getLabelAccesses();

	/**
	 * Returns the value of the '<em><b>Referring Components</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of components the label belongs to.</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referring Components</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getLabel_ReferringComponents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Component%&gt;&gt;getInverseReferences(this, \n\t&lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getLabel_ReferringComponents(), &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getComponent_Labels());'"
	 * @generated
	 */
	EList<Component> getReferringComponents();

} // Label
