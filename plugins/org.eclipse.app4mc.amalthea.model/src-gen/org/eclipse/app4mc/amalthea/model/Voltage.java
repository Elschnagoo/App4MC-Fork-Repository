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
 * A representation of the model object '<em><b>Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General voltage class to define voltage value and unit
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Voltage#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Voltage#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVoltage()
 * @model
 * @generated
 */
public interface Voltage extends Quantity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVoltage_Value()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Voltage#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.VoltageUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.VoltageUnit
	 * @see #setUnit(VoltageUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getVoltage_Unit()
	 * @model unique="false"
	 * @generated
	 */
	VoltageUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Voltage#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.VoltageUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(VoltageUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='double _value = this.getValue();\n&lt;%java.lang.String%&gt; _plus = (&lt;%java.lang.Double%&gt;.valueOf(_value) + \" \");\n&lt;%java.lang.String%&gt; _xifexpression = null;\n&lt;%org.eclipse.app4mc.amalthea.model.VoltageUnit%&gt; _unit = this.getUnit();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_unit, &lt;%org.eclipse.app4mc.amalthea.model.VoltageUnit%&gt;._UNDEFINED_);\nif (_equals)\n{\n\t_xifexpression = \"&lt;unit&gt;\";\n}\nelse\n{\n\t_xifexpression = this.getUnit().getLiteral();\n}\nreturn (_plus + _xifexpression);'"
	 * @generated
	 */
	String toString();

} // Voltage