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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Port#getContainingComponent <em>Containing Component</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends ReferableBaseObject, ITaggable {
	/**
	 * Returns the value of the '<em><b>Containing Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Component</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getPort_ContainingComponent()
	 * @see org.eclipse.app4mc.amalthea.model.Component#getPorts
	 * @model opposite="ports" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	Component getContainingComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.app4mc.amalthea.model.Component%&gt; _containingComponent = this.getContainingComponent();\n&lt;%java.lang.String%&gt; _name = null;\nif (_containingComponent!=null)\n{\n\t_name=_containingComponent.getName();\n}\nreturn this.basicComputeUniqueNameWithPrefix(_name);'"
	 * @generated
	 */
	String computeUniqueName();

} // Port
