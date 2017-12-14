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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General data size class to define size (value and unit)
 * <!-- end-model-doc -->
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
public interface DataSize extends Quantity {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%java.math.BigInteger%&gt; _value = this.getValue();\n&lt;%java.lang.String%&gt; _plus = (_value + \" \");\n&lt;%java.lang.String%&gt; _xifexpression = null;\n&lt;%org.eclipse.app4mc.amalthea.model.DataSizeUnit%&gt; _unit = this.getUnit();\nboolean _equals = &lt;%com.google.common.base.Objects%&gt;.equal(_unit, &lt;%org.eclipse.app4mc.amalthea.model.DataSizeUnit%&gt;._UNDEFINED_);\nif (_equals)\n{\n\t_xifexpression = \"&lt;unit&gt;\";\n}\nelse\n{\n\t_xifexpression = this.getUnit().getLiteral();\n}\nreturn (_plus + _xifexpression);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long _xblockexpression = (long) 0;\n{\n\tfinal &lt;%java.math.BigInteger%&gt; bits = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaServices%&gt;.convertToBit(this);\n\tlong _xifexpression = (long) 0;\n\tif ((bits == null))\n\t{\n\t\t_xifexpression = (-1L);\n\t}\n\telse\n\t{\n\t\t_xifexpression = bits.longValue();\n\t}\n\t_xblockexpression = _xifexpression;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	long getNumberBits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long _xblockexpression = (long) 0;\n{\n\tfinal &lt;%java.math.BigInteger%&gt; bits = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaServices%&gt;.convertToBit(this);\n\tlong _xifexpression = (long) 0;\n\tif ((bits == null))\n\t{\n\t\t_xifexpression = (-1L);\n\t}\n\telse\n\t{\n\t\tlong _longValue = bits.longValue();\n\t\tlong _divide = (_longValue / 8);\n\t\t_xifexpression = &lt;%java.lang.Double%&gt;.valueOf(&lt;%java.lang.Math%&gt;.ceil(_divide)).longValue();\n\t}\n\t_xblockexpression = _xifexpression;\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	long getNumberBytes();

} // DataSize
