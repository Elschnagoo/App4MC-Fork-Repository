/*******************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Timing-Architects Embedded Systems GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.Microcontroller;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

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
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<CoreAllocation> allocations = new HashSet<>();
		final Set<Core> cores = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof CoreAllocation) {
				final CoreAllocation allocation = (CoreAllocation) elem;
				allocations.add(allocation);
			} else if (elem instanceof Microcontroller) {
				final Microcontroller microcontroller = (Microcontroller) elem;
				final Collection<Core> coreList = microcontroller.getCores();
				if (null != coreList) {
					for (final Core core : coreList) {
						if (null != core) {
							cores.add(core);
						}
					}
				}
			}
		}

		for (final CoreAllocation allocation : allocations) {
			if (null != allocation) {
				final Collection<Core> coreList = allocation.getCore();
				if (null == coreList) {
					this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getCoreAllocation_Core());
				} else {
					if (true == coreList.isEmpty()) {
						this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getCoreAllocation_Core());
					} else {
						for (final Core core : coreList) {
							if ((null == core) || (false == cores.contains(core))) {
								this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getCoreAllocation_Core());
							}
						}
					}
				}
			}
		}
	}

}
