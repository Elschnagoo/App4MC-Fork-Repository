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
 * A representation of the model object '<em><b>Amalthea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getCommonElements <em>Common Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getSwModel <em>Sw Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getHwModel <em>Hw Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getOsModel <em>Os Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getStimuliModel <em>Stimuli Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getEventModel <em>Event Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getConstraintsModel <em>Constraints Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getPropertyConstraintsModel <em>Property Constraints Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getMappingModel <em>Mapping Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getComponentsModel <em>Components Model</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Amalthea#getConfigModel <em>Config Model</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea()
 * @model
 * @generated
 */
public interface Amalthea extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Common Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Elements</em>' containment reference.
	 * @see #setCommonElements(CommonElements)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_CommonElements()
	 * @model containment="true"
	 * @generated
	 */
	CommonElements getCommonElements();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getCommonElements <em>Common Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Elements</em>' containment reference.
	 * @see #getCommonElements()
	 * @generated
	 */
	void setCommonElements(CommonElements value);

	/**
	 * Returns the value of the '<em><b>Sw Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Model</em>' containment reference.
	 * @see #setSwModel(SWModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_SwModel()
	 * @model containment="true"
	 * @generated
	 */
	SWModel getSwModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getSwModel <em>Sw Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw Model</em>' containment reference.
	 * @see #getSwModel()
	 * @generated
	 */
	void setSwModel(SWModel value);

	/**
	 * Returns the value of the '<em><b>Hw Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw Model</em>' containment reference.
	 * @see #setHwModel(HWModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_HwModel()
	 * @model containment="true"
	 * @generated
	 */
	HWModel getHwModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getHwModel <em>Hw Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw Model</em>' containment reference.
	 * @see #getHwModel()
	 * @generated
	 */
	void setHwModel(HWModel value);

	/**
	 * Returns the value of the '<em><b>Os Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Model</em>' containment reference.
	 * @see #setOsModel(OSModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_OsModel()
	 * @model containment="true"
	 * @generated
	 */
	OSModel getOsModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getOsModel <em>Os Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Model</em>' containment reference.
	 * @see #getOsModel()
	 * @generated
	 */
	void setOsModel(OSModel value);

	/**
	 * Returns the value of the '<em><b>Stimuli Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimuli Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimuli Model</em>' containment reference.
	 * @see #setStimuliModel(StimuliModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_StimuliModel()
	 * @model containment="true"
	 * @generated
	 */
	StimuliModel getStimuliModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getStimuliModel <em>Stimuli Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimuli Model</em>' containment reference.
	 * @see #getStimuliModel()
	 * @generated
	 */
	void setStimuliModel(StimuliModel value);

	/**
	 * Returns the value of the '<em><b>Event Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Model</em>' containment reference.
	 * @see #setEventModel(EventModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_EventModel()
	 * @model containment="true"
	 * @generated
	 */
	EventModel getEventModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getEventModel <em>Event Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Model</em>' containment reference.
	 * @see #getEventModel()
	 * @generated
	 */
	void setEventModel(EventModel value);

	/**
	 * Returns the value of the '<em><b>Constraints Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints Model</em>' containment reference.
	 * @see #setConstraintsModel(ConstraintsModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_ConstraintsModel()
	 * @model containment="true"
	 * @generated
	 */
	ConstraintsModel getConstraintsModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getConstraintsModel <em>Constraints Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints Model</em>' containment reference.
	 * @see #getConstraintsModel()
	 * @generated
	 */
	void setConstraintsModel(ConstraintsModel value);

	/**
	 * Returns the value of the '<em><b>Property Constraints Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Constraints Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Constraints Model</em>' containment reference.
	 * @see #setPropertyConstraintsModel(PropertyConstraintsModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_PropertyConstraintsModel()
	 * @model containment="true"
	 * @generated
	 */
	PropertyConstraintsModel getPropertyConstraintsModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getPropertyConstraintsModel <em>Property Constraints Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Constraints Model</em>' containment reference.
	 * @see #getPropertyConstraintsModel()
	 * @generated
	 */
	void setPropertyConstraintsModel(PropertyConstraintsModel value);

	/**
	 * Returns the value of the '<em><b>Mapping Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Model</em>' containment reference.
	 * @see #setMappingModel(MappingModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_MappingModel()
	 * @model containment="true"
	 * @generated
	 */
	MappingModel getMappingModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getMappingModel <em>Mapping Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Model</em>' containment reference.
	 * @see #getMappingModel()
	 * @generated
	 */
	void setMappingModel(MappingModel value);

	/**
	 * Returns the value of the '<em><b>Components Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Model</em>' containment reference.
	 * @see #setComponentsModel(ComponentsModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_ComponentsModel()
	 * @model containment="true"
	 * @generated
	 */
	ComponentsModel getComponentsModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getComponentsModel <em>Components Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Model</em>' containment reference.
	 * @see #getComponentsModel()
	 * @generated
	 */
	void setComponentsModel(ComponentsModel value);

	/**
	 * Returns the value of the '<em><b>Config Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Model</em>' containment reference.
	 * @see #setConfigModel(ConfigModel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getAmalthea_ConfigModel()
	 * @model containment="true"
	 * @generated
	 */
	ConfigModel getConfigModel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Amalthea#getConfigModel <em>Config Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Model</em>' containment reference.
	 * @see #getConfigModel()
	 * @generated
	 */
	void setConfigModel(ConfigModel value);

} // Amalthea
