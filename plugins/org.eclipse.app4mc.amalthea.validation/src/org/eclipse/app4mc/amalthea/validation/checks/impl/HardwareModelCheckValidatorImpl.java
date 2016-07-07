/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;

//import java.util.HashSet;

//import java.util.Set;
//
//import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
//import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
//import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
//import org.eclipse.emf.common.util.TreeIterator;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EReference;
//import org.eclipse.emf.ecore.util.EObjectEList;
//import org.eclipse.app4mc.amalthea.model.AbstractType;
//import org.eclipse.app4mc.amalthea.model.HWModel;
//import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;


public class HardwareModelCheckValidatorImpl extends AbstractValidatorImpl {

	public HardwareModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public HardwareModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	// ===========================================================================
	// TODO
	// ===========================================================================


	/*
	 * Checks for the entire AMALTHEA Hardware model instance if AMALTHEA elements of Type
	 * '@link{org.eclipse.app4mc.amalthea.model.hw.AbstractionTypeDescription}' (e.g. ECUType, CoreType or System)
	 * contain AMALTHEA elements of '@link{org.eclipse.app4mc.amalthea.model.hw.AbstractType}' (e.g. StrValue,
	 * BoolValue) with the identical name. A found duplicate will be handled as an error.
	 */
	public void checkForHwAbstractTypeDuplicateName(final HWModel hwModel) {

		// final Set<EObjectEList<AbstractType>> visited = new HashSet<EObjectEList<AbstractType>>();
		//
		// final TreeIterator<EObject> hwModelContent = hwModel.eAllContents();
		// while (hwModelContent.hasNext()) {
		// final EObject currentElement = hwModelContent.next();
		//
		// for (final EReference containment : currentElement.eClass().getEAllContainments()) {
		//
		// /*
		// * Info: + ECUType extends AbstractionTypeDescription + StrValue extends AbstractType
		// */
		// if (containment.getEType().getName()
		// .equals(HwFactory.eINSTANCE.getHwPackage().getAbstractType().getName())) {
		//
		// // EObjectContainmentEList<E>
		// final EObjectEList<AbstractType> list = (EObjectEList<AbstractType>) currentElement
		// .eGet(containment);
		//
		// for (final AbstractType type1 : list) {
		// for (final AbstractType type2 : list) {
		// if (type1 != type2 && type1.getName().equals(type2.getName())) {
		// if (visited.add(list)) {
		// this.issueCreator.issue(currentElement, HwPackage.Literals.ABSTRACT_TYPE__NAME,
		// getObjectHelper().getName(currentElement));
		// }
		// }
		// }
		// }
		// }
		// }
		// }
	}
}
