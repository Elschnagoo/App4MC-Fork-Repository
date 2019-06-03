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
 * A representation of the model object '<em><b>SW Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Central instance to provide central access.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getIsrs <em>Isrs</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getProcessPrototypes <em>Process Prototypes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getActivations <em>Activations</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getCustomEntities <em>Custom Entities</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getProcessChains <em>Process Chains</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getModes <em>Modes</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.SWModel#getModeLabels <em>Mode Labels</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel()
 * @model
 * @generated
 */
public interface SWModel extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Isrs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ISR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isrs</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Isrs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISR> getIsrs();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Runnables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Runnable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnables</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Runnables()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Process Prototypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessPrototype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Prototypes</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_ProcessPrototypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessPrototype> getProcessPrototypes();

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Activations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Activation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activations</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Activations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activation> getActivations();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.OsEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.TypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_TypeDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeDefinition> getTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Custom Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.CustomEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Entities</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_CustomEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomEntity> getCustomEntities();

	/**
	 * Returns the value of the '<em><b>Process Chains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ProcessChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Chains</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_ProcessChains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessChain> getProcessChains();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Mode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

	/**
	 * Returns the value of the '<em><b>Mode Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ModeLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Labels</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSWModel_ModeLabels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeLabel> getModeLabels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" modeUnique="false" literalUnique="false"
	 * @generated
	 */
	ModeLiteral modeLiteral(String mode, String literal);

} // SWModel
