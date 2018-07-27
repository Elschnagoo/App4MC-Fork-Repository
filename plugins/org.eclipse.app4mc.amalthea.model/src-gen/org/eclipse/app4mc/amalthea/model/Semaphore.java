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
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * name: Name of semaphore
 * maxValue: maximum number of users which can access the semaphore simultaneously
 * initialValue: number of users which access semaphore at system startup
 * priorityCeilingProtocol: enables priority ceiling for this resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getSemaphoreType <em>Semaphore Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#isPriorityCeilingProtocol <em>Priority Ceiling Protocol</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getSemaphoreAccesses <em>Semaphore Accesses</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Semaphore#getReferringComponents <em>Referring Components</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore()
 * @model
 * @generated
 */
public interface Semaphore extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Semaphore Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.SemaphoreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreType
	 * @see #setSemaphoreType(SemaphoreType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_SemaphoreType()
	 * @model unique="false"
	 * @generated
	 */
	SemaphoreType getSemaphoreType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getSemaphoreType <em>Semaphore Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore Type</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.SemaphoreType
	 * @see #getSemaphoreType()
	 * @generated
	 */
	void setSemaphoreType(SemaphoreType value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_InitialValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getInitialValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_MaxValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Priority Ceiling Protocol</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Ceiling Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Ceiling Protocol</em>' attribute.
	 * @see #setPriorityCeilingProtocol(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_PriorityCeilingProtocol()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isPriorityCeilingProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Semaphore#isPriorityCeilingProtocol <em>Priority Ceiling Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Ceiling Protocol</em>' attribute.
	 * @see #isPriorityCeilingProtocol()
	 * @generated
	 */
	void setPriorityCeilingProtocol(boolean value);

	/**
	 * Returns the value of the '<em><b>Semaphore Accesses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.SemaphoreAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of accesses (SemaphoreAccess).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semaphore Accesses</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_SemaphoreAccesses()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _semaphoreAccess_Semaphore = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getSemaphoreAccess_Semaphore();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.SemaphoreAccess%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getSemaphore_SemaphoreAccesses(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_semaphoreAccess_Semaphore)));'"
	 * @generated
	 */
	EList<SemaphoreAccess> getSemaphoreAccesses();

	/**
	 * Returns the value of the '<em><b>Referring Components</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of components the semaphore belongs to.</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referring Components</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSemaphore_ReferringComponents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _component_Semaphores = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getComponent_Semaphores();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Component%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getSemaphore_ReferringComponents(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_component_Semaphores)));'"
	 * @generated
	 */
	EList<Component> getReferringComponents();

} // Semaphore
