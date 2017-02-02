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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataRate#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataRate#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataRate()
 * @model
 * @generated
 */
public interface DataRate extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataRate_Value()
	 * @model default="0" unique="false"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataRate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.DataRateUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataRateUnit
	 * @see #setUnit(DataRateUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataRate_Unit()
	 * @model unique="false"
	 * @generated
	 */
	DataRateUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataRate#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataRateUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataRateUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.math.BigInteger%> _value = this.getValue();\n<%java.lang.String%> _plus = (_value + \" \");\n<%java.lang.String%> _xifexpression = null;\n<%org.eclipse.app4mc.amalthea.model.DataRateUnit%> _unit = this.getUnit();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_unit, <%org.eclipse.app4mc.amalthea.model.DataRateUnit%>._UNDEFINED_);\nif (_equals)\n{\n\t_xifexpression = \"<unit>\";\n}\nelse\n{\n\t<%org.eclipse.app4mc.amalthea.model.DataRateUnit%> _unit_1 = this.getUnit();\n\t<%java.lang.String%> _literal = _unit_1.getLiteral();\n\t_xifexpression = _literal.replace(\"PerSecond\", \"/s\");\n}\nreturn (_plus + _xifexpression);'"
	 * @generated
	 */
	String toString();

} // DataRate
