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

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeValue#getValueProvider <em>Value Provider</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValue()
 * @model
 * @generated
 */
public interface ModeValue extends ModeValueDisjunctionEntry {
	/**
	 * Returns the value of the '<em><b>Value Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Provider</em>' reference.
	 * @see #setValueProvider(ModeLabel)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValue_ValueProvider()
	 * @model required="true"
	 * @generated
	 */
	ModeLabel getValueProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeValue#getValueProvider <em>Value Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Provider</em>' reference.
	 * @see #getValueProvider()
	 * @generated
	 */
	void setValueProvider(ModeLabel value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ModeLiteral)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValue_Value()
	 * @model required="true"
	 * @generated
	 */
	ModeLiteral getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.ModeValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ModeLiteral value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" assignmentMapType="org.eclipse.app4mc.amalthea.model.ModeValueMapEntry&lt;org.eclipse.app4mc.amalthea.model.ModeLabel, org.eclipse.app4mc.amalthea.model.ModeLiteral&gt;"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt; _get = null;\nif (assignment!=null)\n{\n\t_get=assignment.get(this.getValueProvider());\n}\nfinal &lt;%org.eclipse.app4mc.amalthea.model.ModeLiteral%&gt; assign = _get;\nreturn ((assign == null) || (assign == this.getValue()));'"
	 * @generated
	 */
	boolean isSatisfiedBy(EMap<ModeLabel, ModeLiteral> assignment);

} // ModeValue
