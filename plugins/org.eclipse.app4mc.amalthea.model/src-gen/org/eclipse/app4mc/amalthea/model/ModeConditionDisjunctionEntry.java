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

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Condition Disjunction Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeConditionDisjunctionEntry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModeConditionDisjunctionEntry extends BaseObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" assignmentMapType="org.eclipse.app4mc.amalthea.model.ModeValueMapEntry&lt;org.eclipse.app4mc.amalthea.model.ModeLabel, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	boolean isSatisfiedBy(EMap<ModeLabel, String> assignment);

} // ModeConditionDisjunctionEntry
