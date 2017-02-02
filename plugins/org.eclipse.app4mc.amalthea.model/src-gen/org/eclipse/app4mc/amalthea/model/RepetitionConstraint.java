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
 * A representation of the model object '<em><b>Repetition Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A repetition constraint prescribes the distribution of a single event during runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRepetitionConstraint()
 * @model
 * @generated
 */
public interface RepetitionConstraint extends TimingConstraint {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(EntityEvent)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRepetitionConstraint_Event()
	 * @model
	 * @generated
	 */
	EntityEvent getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EntityEvent value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #setSpan(int)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRepetitionConstraint_Span()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(int value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' containment reference.
	 * @see #setLower(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRepetitionConstraint_Lower()
	 * @model containment="true"
	 * @generated
	 */
	Time getLower();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getLower <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' containment reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Time value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' containment reference.
	 * @see #setUpper(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRepetitionConstraint_Upper()
	 * @model containment="true"
	 * @generated
	 */
	Time getUpper();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getUpper <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' containment reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Time value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRepetitionConstraint_Jitter()
	 * @model containment="true"
	 * @generated
	 */
	Time getJitter();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(Time value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Time)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getRepetitionConstraint_Period()
	 * @model containment="true"
	 * @generated
	 */
	Time getPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.RepetitionConstraint#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Time value);

} // RepetitionConstraint
