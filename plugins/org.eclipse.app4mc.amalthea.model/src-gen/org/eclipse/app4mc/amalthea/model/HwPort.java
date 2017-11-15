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
 * A representation of the model object '<em><b>Hw Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getContainingNode <em>Containing Node</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort()
 * @model
 * @generated
 */
public interface HwPort extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Containing Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.ComplexNode#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Node</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_ContainingNode()
	 * @see org.eclipse.app4mc.amalthea.model.ComplexNode#getPorts
	 * @model opposite="ports" transient="false" changeable="false"
	 * @generated
	 */
	ComplexNode getContainingNode();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference.
	 * @see #setPins(Pin)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort_Pins()
	 * @model containment="true"
	 * @generated
	 */
	Pin getPins();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwPort#getPins <em>Pins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pins</em>' containment reference.
	 * @see #getPins()
	 * @generated
	 */
	void setPins(Pin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.ComplexNode%&gt; _containingNode = this.getContainingNode();\n&lt;%java.lang.String%&gt; _name = null;\nif (_containingNode!=null)\n{\n\t_name=_containingNode.getName();\n}\nreturn this.basicComputeUniqueNameWithPrefix(_name);'"
	 * @generated
	 */
	String computeUniqueName();

} // HwPort
