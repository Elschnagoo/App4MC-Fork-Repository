/**
 * *******************************************************************************
 *  Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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
 * A representation of the model object '<em><b>Hw Access Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getContainingAccessElement <em>Containing Access Element</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getPathElements <em>Path Elements</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getMemOffset <em>Mem Offset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath()
 * @model
 * @generated
 */
public interface HwAccessPath extends HwPath, INamed {
	/**
	 * Returns the value of the '<em><b>Containing Access Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.app4mc.amalthea.model.HwAccessElement#getAccessPath <em>Access Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Access Element</em>' container reference.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath_ContainingAccessElement()
	 * @see org.eclipse.app4mc.amalthea.model.HwAccessElement#getAccessPath
	 * @model opposite="accessPath" transient="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only'"
	 * @generated
	 */
	HwAccessElement getContainingAccessElement();

	/**
	 * Returns the value of the '<em><b>Path Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.HwPathElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Elements</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath_PathElements()
	 * @model required="true"
	 * @generated
	 */
	EList<HwPathElement> getPathElements();

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath_StartAddress()
	 * @model default="0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.Address"
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

	/**
	 * Returns the value of the '<em><b>End Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Address</em>' attribute.
	 * @see #setEndAddress(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath_EndAddress()
	 * @model default="0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.Address"
	 * @generated
	 */
	long getEndAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(long value);

	/**
	 * Returns the value of the '<em><b>Mem Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Offset</em>' attribute.
	 * @see #setMemOffset(long)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwAccessPath_MemOffset()
	 * @model default="0" unique="false" dataType="org.eclipse.app4mc.amalthea.model.Address"
	 * @generated
	 */
	long getMemOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.HwAccessPath#getMemOffset <em>Mem Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Offset</em>' attribute.
	 * @see #getMemOffset()
	 * @generated
	 */
	void setMemOffset(long value);

} // HwAccessPath
