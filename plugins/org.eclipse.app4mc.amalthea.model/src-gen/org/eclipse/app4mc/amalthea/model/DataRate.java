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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General data rate class to define rate (value and unit)
 * <!-- end-model-doc -->
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
 * @model superTypes="org.eclipse.app4mc.amalthea.model.Quantity org.eclipse.app4mc.amalthea.model.DataRateComparable"
 * @generated
 */
public interface DataRate extends Quantity, Comparable<DataRate> {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.math.BigInteger%&gt; _value = this.getValue();\n&lt;%java.lang.String%&gt; _plus = (_value + \" \");\n&lt;%java.lang.String%&gt; _xifexpression = null;\n&lt;%org.eclipse.app4mc.amalthea.model.DataRateUnit%&gt; _unit = this.getUnit();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_unit, &lt;%org.eclipse.app4mc.amalthea.model.DataRateUnit%&gt;._UNDEFINED_);\nif (_equals)\n{\n\t_xifexpression = \"&lt;unit&gt;\";\n}\nelse\n{\n\t_xifexpression = this.getUnit().getLiteral().replace(\"PerSecond\", \"/s\");\n}\nreturn (_plus + _xifexpression);'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rateUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaServices%&gt;.compareDataRates(this, rate);'"
	 * @generated
	 */
	int compareTo(DataRate rate);

} // DataRate
