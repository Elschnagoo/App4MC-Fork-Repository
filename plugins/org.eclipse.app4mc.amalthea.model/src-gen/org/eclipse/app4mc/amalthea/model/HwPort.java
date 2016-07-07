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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwPort#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPort()
 * @model
 * @generated
 */
public interface HwPort extends ReferableBaseObject {
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.ecore.EObject%> _eContainer = this.eContainer();\n<%java.lang.Object%> _eGet = null;\nif (_eContainer!=null)\n{\n\t<%org.eclipse.emf.ecore.EClass%> _eClass = this.eClass();\n\t<%org.eclipse.emf.ecore.EStructuralFeature%> _eStructuralFeature = _eClass.getEStructuralFeature(\"name\");\n\t_eGet=_eContainer.eGet(_eStructuralFeature);\n}\nfinal <%java.lang.String%> containerName = this.encode(((<%java.lang.String%>) _eGet));\n<%java.lang.String%> _computeUniqueName = super.computeUniqueName();\nreturn ((containerName + \"/\") + _computeUniqueName);'"
	 * @generated
	 */
	String computeUniqueName();

} // HwPort
