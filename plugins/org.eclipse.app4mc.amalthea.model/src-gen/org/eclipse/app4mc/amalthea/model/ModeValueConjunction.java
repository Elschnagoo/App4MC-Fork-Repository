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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Value Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.ModeValueConjunction#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValueConjunction()
 * @model
 * @generated
 */
public interface ModeValueConjunction extends ModeValueDisjunctionEntry {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.ModeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getModeValueConjunction_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModeValue> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" assignmentMapType="org.eclipse.app4mc.amalthea.model.ModeValueMapEntry&lt;org.eclipse.app4mc.amalthea.model.ModeLabel, org.eclipse.app4mc.amalthea.model.ModeLiteral&gt;"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.app4mc.amalthea.model.ModeValue%&gt;&gt; _entries = this.getEntries();\nfor (final &lt;%org.eclipse.app4mc.amalthea.model.ModeValue%&gt; entry : _entries)\n{\n\tboolean _isSatisfiedBy = entry.isSatisfiedBy(assignment);\n\tboolean _not = (!_isSatisfiedBy);\n\tif (_not)\n\t{\n\t\treturn false;\n\t}\n}\nreturn true;'"
	 * @generated
	 */
	boolean isSatisfiedBy(EMap<ModeLabel, ModeLiteral> assignment);

} // ModeValueConjunction
