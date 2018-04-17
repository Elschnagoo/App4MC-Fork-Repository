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
 * A representation of the model object '<em><b>Hw Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwFeature#getContainingCategory <em>Containing Category</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwFeature#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwFeature()
 * @model
 * @generated
 */
public interface HwFeature extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Containing Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.HwFeatureCategory#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Category</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwFeature_ContainingCategory()
	 * @see org.eclipse.app4mc.amalthea.model.HwFeatureCategory#getFeatures
	 * @model opposite="features" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert'"
	 * @generated
	 */
	HwFeatureCategory getContainingCategory();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwFeature_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwFeature#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.HwFeatureCategory%&gt; _containingCategory = this.getContainingCategory();\n&lt;%java.lang.String%&gt; _name = null;\nif (_containingCategory!=null)\n{\n\t_name=_containingCategory.getName();\n}\nreturn this.basicComputeUniqueNameWithPrefix(_name);'"
	 * @generated
	 */
	String computeUniqueName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.HwFeatureCategory%&gt; _containingCategory = this.getContainingCategory();\n&lt;%java.lang.String%&gt; _name = null;\nif (_containingCategory!=null)\n{\n\t_name=_containingCategory.getName();\n}\nfinal &lt;%java.lang.String%&gt; featureName = _name;\n&lt;%java.lang.String%&gt; _xifexpression = null;\nboolean _isNullOrEmpty = &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(featureName);\nif (_isNullOrEmpty)\n{\n\t_xifexpression = \"&lt;category&gt;\";\n}\nelse\n{\n\t_xifexpression = featureName;\n}\n&lt;%java.lang.String%&gt; _plus = (_xifexpression + \"::\");\n&lt;%java.lang.String%&gt; _xifexpression_1 = null;\nboolean _isNullOrEmpty_1 = &lt;%org.eclipse.xtext.xbase.lib.StringExtensions%&gt;.isNullOrEmpty(this.getName());\nif (_isNullOrEmpty_1)\n{\n\t_xifexpression_1 = \"&lt;feature&gt;\";\n}\nelse\n{\n\t_xifexpression_1 = this.getName();\n}\nreturn (_plus + _xifexpression_1);'"
	 * @generated
	 */
	String toString();

} // HwFeature
