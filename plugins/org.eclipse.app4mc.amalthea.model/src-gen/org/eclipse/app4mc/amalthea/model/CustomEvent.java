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
 * A representation of the model object '<em><b>Custom Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CustomEvent#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.CustomEvent#getExplicitTriggers <em>Explicit Triggers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCustomEvent()
 * @model
 * @generated
 */
public interface CustomEvent extends TriggerEvent {
	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see #setEventType(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCustomEvent_EventType()
	 * @model unique="false"
	 * @generated
	 */
	String getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.CustomEvent#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(String value);

	/**
	 * Returns the value of the '<em><b>Explicit Triggers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.CustomEventTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of triggers (CustomEventTrigger).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explicit Triggers</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getCustomEvent_ExplicitTriggers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _customEventTrigger_Event = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getCustomEventTrigger_Event();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.CustomEventTrigger%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getCustomEvent_ExplicitTriggers(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_customEventTrigger_Event)));'"
	 * @generated
	 */
	EList<CustomEventTrigger> getExplicitTriggers();

} // CustomEvent
