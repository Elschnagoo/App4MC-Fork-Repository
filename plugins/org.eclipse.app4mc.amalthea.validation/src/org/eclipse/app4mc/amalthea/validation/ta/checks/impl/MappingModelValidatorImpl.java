/**
 ********************************************************************************
 * Copyright (c) 2016-2018 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;

public class MappingModelValidatorImpl extends AbstractValidatorImpl {

	public MappingModelValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public MappingModelValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks the reference to a Core of {@link CoreAllocation}. The reference must be set and reference an existing Core.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkCoreReferenceOfCoreAllocation(final Amalthea amalthea) {

// TODO
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//		final Set<SchedulerAllocation> allocations = new HashSet<>();
//		final Set<Core> cores = new HashSet<>();
//
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof SchedulerAllocation) {
//				final SchedulerAllocation allocation = (SchedulerAllocation) elem;
//				allocations.add(allocation);
//			} else if (elem instanceof Microcontroller) {
//				final Microcontroller microcontroller = (Microcontroller) elem;
//				final Collection<Core> coreList = microcontroller.getCores();
//				if (null != coreList) {
//					for (final Core core : coreList) {
//						if (null != core) {
//							cores.add(core);
//						}
//					}
//				}
//			}
//		}
//
//		for (final SchedulerAllocation allocation : allocations) {
//			if (null != allocation) {
//				final Collection<Core> coreList = allocation.getResponsibility();
//				if (null == coreList) {
//					this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility());
//				} else {
//					if (true == coreList.isEmpty()) {
//						this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility());
//					} else {
//						for (final Core core : coreList) {
//							if ((null == core) || (false == cores.contains(core))) {
//								this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility());
//							}
//						}
//					}
//				}
//			}
//		}
	}

}
