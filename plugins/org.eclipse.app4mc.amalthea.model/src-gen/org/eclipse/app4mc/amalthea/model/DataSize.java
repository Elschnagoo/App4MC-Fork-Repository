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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataSize#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.DataSize#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataSize()
 * @model
 * @generated
 */
public interface DataSize extends EObject {
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
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataSize_Value()
	 * @model default="0" unique="false"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataSize#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.DataSizeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataSizeUnit
	 * @see #setUnit(DataSizeUnit)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getDataSize_Unit()
	 * @model unique="false"
	 * @generated
	 */
	DataSizeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.DataSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.DataSizeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataSizeUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.math.BigInteger%> _value = this.getValue();\n<%java.lang.String%> _plus = (_value + \" \");\n<%java.lang.String%> _xifexpression = null;\n<%org.eclipse.app4mc.amalthea.model.DataSizeUnit%> _unit = this.getUnit();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_unit, <%org.eclipse.app4mc.amalthea.model.DataSizeUnit%>._UNDEFINED_);\nif (_equals)\n{\n\t_xifexpression = \"<unit>\";\n}\nelse\n{\n\t<%org.eclipse.app4mc.amalthea.model.DataSizeUnit%> _unit_1 = this.getUnit();\n\t_xifexpression = _unit_1.getLiteral();\n}\nreturn (_plus + _xifexpression);'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenience methods to retrieve the size in Bits and Bytes
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long _xblockexpression = (long) 0;\n{\n\tfinal <%java.math.BigInteger%> bits = <%org.eclipse.app4mc.amalthea.model.AmaltheaServices%>.convertToBit(this);\n\tlong _xifexpression = (long) 0;\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(bits, null);\n\tif (_equals)\n\t{\n\t\t_xifexpression = (-1L);\n\t}\n\telse\n\t{\n\t\t_xifexpression = bits.longValue();\n\t}\n\t_xblockexpression = _xifexpression;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	long getNumberBits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long _xblockexpression = (long) 0;\n{\n\tfinal <%java.math.BigInteger%> bits = <%org.eclipse.app4mc.amalthea.model.AmaltheaServices%>.convertToBit(this);\n\tlong _xifexpression = (long) 0;\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(bits, null);\n\tif (_equals)\n\t{\n\t\t_xifexpression = (-1L);\n\t}\n\telse\n\t{\n\t\tlong _longValue = bits.longValue();\n\t\tlong _divide = (_longValue / 8);\n\t\tdouble _ceil = <%java.lang.Math%>.ceil(_divide);\n\t\t_xifexpression = <%java.lang.Double%>.valueOf(_ceil).longValue();\n\t}\n\t_xblockexpression = _xifexpression;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	long getNumberBytes();

} // DataSize
