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
 * A representation of the model object '<em><b>Os Buffering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * buffering for intercore communication (process on core 1 communicates witch process on core 2)
 * runnable-, process-, and scheduleSectionLevel defines the section where buffering occurs
 * at selected layer, data is read at beginning of section and written back at the end of the section
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isRunnableLevel <em>Runnable Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isProcessLevel <em>Process Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isScheduleSectionLevel <em>Schedule Section Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.OsBuffering#getBufferingAlgorithm <em>Buffering Algorithm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsBuffering()
 * @model
 * @generated
 */
public interface OsBuffering extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Runnable Level</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable Level</em>' attribute.
	 * @see #setRunnableLevel(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsBuffering_RunnableLevel()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isRunnableLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isRunnableLevel <em>Runnable Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable Level</em>' attribute.
	 * @see #isRunnableLevel()
	 * @generated
	 */
	void setRunnableLevel(boolean value);

	/**
	 * Returns the value of the '<em><b>Process Level</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Level</em>' attribute.
	 * @see #setProcessLevel(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsBuffering_ProcessLevel()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isProcessLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isProcessLevel <em>Process Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Level</em>' attribute.
	 * @see #isProcessLevel()
	 * @generated
	 */
	void setProcessLevel(boolean value);

	/**
	 * Returns the value of the '<em><b>Schedule Section Level</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Section Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Section Level</em>' attribute.
	 * @see #setScheduleSectionLevel(boolean)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsBuffering_ScheduleSectionLevel()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isScheduleSectionLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#isScheduleSectionLevel <em>Schedule Section Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Section Level</em>' attribute.
	 * @see #isScheduleSectionLevel()
	 * @generated
	 */
	void setScheduleSectionLevel(boolean value);

	/**
	 * Returns the value of the '<em><b>Buffering Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffering Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffering Algorithm</em>' attribute.
	 * @see #setBufferingAlgorithm(String)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getOsBuffering_BufferingAlgorithm()
	 * @model unique="false"
	 * @generated
	 */
	String getBufferingAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.OsBuffering#getBufferingAlgorithm <em>Buffering Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffering Algorithm</em>' attribute.
	 * @see #getBufferingAlgorithm()
	 * @generated
	 */
	void setBufferingAlgorithm(String value);

} // OsBuffering
