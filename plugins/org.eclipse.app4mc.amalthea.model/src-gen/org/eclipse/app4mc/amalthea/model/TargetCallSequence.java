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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Call Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A call-sequence target description
 * A call-sequence can be a target only for runnable-constraints
 * callSequences: the reference to zero or more call-sequences. If this list is empty, the target stands for all call-sequences!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.TargetCallSequence#getCallSequences <em>Call Sequences</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTargetCallSequence()
 * @model
 * @generated
 */
public interface TargetCallSequence extends RunnableConstraintTarget, BaseObject {
	/**
	 * Returns the value of the '<em><b>Call Sequences</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.CallSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Sequences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Sequences</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getTargetCallSequence_CallSequences()
	 * @model
	 * @generated
	 */
	EList<CallSequence> getCallSequences();

} // TargetCallSequence
