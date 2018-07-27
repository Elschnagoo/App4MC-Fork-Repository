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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Memory#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Memory#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends HwModule, HwDestination {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(MemoryDefinition)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemory_Definition()
	 * @model
	 * @generated
	 */
	MemoryDefinition getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Memory#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(MemoryDefinition value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.MemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of mappings (MemoryMapping).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getMemory_Mappings()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='&lt;%org.eclipse.emf.ecore.EReference%&gt; _memoryMapping_Memory = &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getMemoryMapping_Memory();\nreturn &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaIndex%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.MemoryMapping%&gt;&gt;getInverseReferences(this, &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getMemory_Mappings(), \n\tjava.util.Collections.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;unmodifiableSet(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%org.eclipse.emf.ecore.EReference%&gt;&gt;newHashSet(_memoryMapping_Memory)));'"
	 * @generated
	 */
	EList<MemoryMapping> getMappings();

} // Memory
