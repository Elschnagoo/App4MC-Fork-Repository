/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *     Generated using Eclipse EMF
 * 
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.ot1.OT1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autosar Os Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Die "SchedulingEntity" AutosarOsType beschreibt ein
 * 				AUTOSAR OS.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType#getKernelPriority <em>Kernel Priority</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAutosarOsType()
 * @model extendedMetaData="name='AutosarOsType' kind='elementOnly'"
 * @generated
 */
public interface AutosarOsType extends SchedulingEntityType {
	/**
	 * Returns the value of the '<em><b>Kernel Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Priority</em>' attribute.
	 * @see #isSetKernelPriority()
	 * @see #unsetKernelPriority()
	 * @see #setKernelPriority(long)
	 * @see org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Package#getAutosarOsType_KernelPriority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='kernelPriority' namespace='##targetNamespace'"
	 * @generated
	 */
	long getKernelPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType#getKernelPriority <em>Kernel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Priority</em>' attribute.
	 * @see #isSetKernelPriority()
	 * @see #unsetKernelPriority()
	 * @see #getKernelPriority()
	 * @generated
	 */
	void setKernelPriority(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType#getKernelPriority <em>Kernel Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKernelPriority()
	 * @see #getKernelPriority()
	 * @see #setKernelPriority(long)
	 * @generated
	 */
	void unsetKernelPriority();

	/**
	 * Returns whether the value of the '{@link org.eclipse.app4mc.tracing.converter.ot1.OT1.AutosarOsType#getKernelPriority <em>Kernel Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kernel Priority</em>' attribute is set.
	 * @see #unsetKernelPriority()
	 * @see #getKernelPriority()
	 * @see #setKernelPriority(long)
	 * @generated
	 */
	boolean isSetKernelPriority();

} // AutosarOsType
