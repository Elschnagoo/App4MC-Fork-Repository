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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A section is a logical structure, which contains labels and abstract run entities.
 * It is used to provide an easy mechanism to distribute objects to memory,
 * which are belonging together.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Section#getAsilLevel <em>Asil Level</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Section#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.eclipse.app4mc.amalthea.model.Section#getRunnables <em>Runnables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Asil Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.app4mc.amalthea.model.ASILType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * for specifying the ASIL level for the "virtual memory sections"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asil Level</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ASILType
	 * @see #setAsilLevel(ASILType)
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSection_AsilLevel()
	 * @model unique="false"
	 * @generated
	 */
	ASILType getAsilLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.app4mc.amalthea.model.Section#getAsilLevel <em>Asil Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asil Level</em>' attribute.
	 * @see org.eclipse.app4mc.amalthea.model.ASILType
	 * @see #getAsilLevel()
	 * @generated
	 */
	void setAsilLevel(ASILType value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of labels (Label).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSection_Labels()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaCrossReferenceUtil%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Label%&gt;&gt;getInverseReferences(this, \n\t&lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getSection_Labels(), &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getLabel_Section());'"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Runnables</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.app4mc.amalthea.model.Runnable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>Returns an <em>immutable</em> list of runnables (Runnable).</b></p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runnables</em>' reference list.
	 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getSection_Runnables()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Read only' propertyFilterFlags='org.eclipse.ui.views.properties.expert' get='return &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaCrossReferenceUtil%&gt;.&lt;&lt;%org.eclipse.app4mc.amalthea.model.Runnable%&gt;&gt;getInverseReferences(this, \n\t&lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getSection_Runnables(), &lt;%org.eclipse.app4mc.amalthea.model.AmaltheaPackage%&gt;.eINSTANCE.getRunnable_Section());'"
	 * @generated
	 */
	EList<org.eclipse.app4mc.amalthea.model.Runnable> getRunnables();

} // Section
