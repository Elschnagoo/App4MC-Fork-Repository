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
 * A representation of the model object '<em><b>Hw Path Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * class HwLogicalPath extends HwPath, INamed {
 * 	@GenModel(propertyCategory="Read only", propertyFilterFlags="org.eclipse.ui.views.properties.expert")
 * 	container readonly AddressElement containingAddressElement opposite logicalPaths
 * 	contains DataRate dataRate
 * 	contains HwLatency readLatency
 * 	contains HwLatency writeLatency
 * }
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.app4mc.amalthea.model.AmaltheaPackage#getHwPathElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HwPathElement extends IReferable {
} // HwPathElement
