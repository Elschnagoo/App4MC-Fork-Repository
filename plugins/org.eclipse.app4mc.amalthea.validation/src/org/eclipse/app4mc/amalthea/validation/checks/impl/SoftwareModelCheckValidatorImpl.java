/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.DirectionType;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.ecore.EObject;

public class SoftwareModelCheckValidatorImpl extends AbstractValidatorImpl {

	public SoftwareModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public SoftwareModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}


	/**
	 * Checks the correctness of data dependency references
	 * 
	 * <ul>
	 * <li>A data dependency can only be defined for:</li>
	 * <ul>
	 * <li>WRITE label accesses</li>
	 * <li>OUT/INOUT parameters</li>
	 * <li>IN/INOUT call arguments</li>
	 * </ul>
	 * <li>A data dependency can only refer to:</li>
	 * <ul>
	 * <li>local IN/INOUT parameters</li>
	 * <li>local IN/INOUT call arguments</li>
	 * </ul>
	 * </ul>
	 */
	public void checkDataDependency(final DataDependency dependency) {
		Runnable runnable = dependency.getContainingRunnable();
		if (runnable == null) return;
		
		EObject container = dependency.eContainer();
		if (container instanceof LabelAccess) {
			LabelAccessEnum accessType = ((LabelAccess)container).getAccess();
			if (accessType != LabelAccessEnum.WRITE) {
				this.issueCreator.issue(container,
						AmaltheaPackage.eINSTANCE.getRunnable_RunnableItems(),
						"A data dependency can only be defined for WRITE label accesses");
			}
		}
		
		if (container instanceof RunnableParameter) {
			DirectionType direction = ((RunnableParameter)container).getDirection();
			if (direction != DirectionType.OUT && direction != DirectionType.INOUT) {
				this.issueCreator.issue(container,
						AmaltheaPackage.eINSTANCE.getRunnable_Parameters(),
						"A data dependency can only be defined for OUT/INOUT parameters");
			}
		}
		
		if (container instanceof CallArgument) {
			RunnableParameter parameter = ((CallArgument) container).getParameter();
			if (parameter != null) {
				DirectionType direction = parameter.getDirection();
				if (direction != DirectionType.IN && direction != DirectionType.INOUT) {
					this.issueCreator.issue(container, AmaltheaPackage.eINSTANCE.getRunnableCall_Arguments(),
							"A data dependency can only be defined for IN/INOUT call arguments");
				}
			}
		}
		
		List<RunnableParameter> localParameters = getSuitableParameters(runnable);
		if (!localParameters.containsAll(dependency.getParameters())) {
			this.issueCreator.issue(dependency, AmaltheaPackage.eINSTANCE.getDataDependency_Parameters(),
					"A data dependency can only refer to local IN/INOUT parameters");
		}
		
		List<CallArgument> localCallArguments = getSuitableCallArguments(runnable);
		if (!localCallArguments.containsAll(dependency.getCallArguments())) {
			this.issueCreator.issue(dependency, AmaltheaPackage.eINSTANCE.getDataDependency_CallArguments(),
					"A data dependency can only refer to local OUT/INOUT call arguments");
		}
	}

	/**
	 * Checks the correctness of call argument definitions
	 * 
	 * <ul>
	 * <li>The referred runnable must contain the referred parameter</li>
	 * </ul>
	 */	
	public void checkCallArgument(final CallArgument argument) {
		Runnable calledRunnable = argument.getContainingCall().getRunnable();
		RunnableParameter parameter = argument.getParameter();
		
		if (parameter == null) {
			this.issueCreator.issue(argument, AmaltheaPackage.eINSTANCE.getCallArgument_Parameter(),
					"Parameter of argument is undefined");
			return;
		}
		
		if (calledRunnable == null) {
			this.issueCreator.issue(argument.getContainingCall(), AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable(),
					"Called runnable is undefined");
			return;
		}
		
		if (!calledRunnable.getParameters().contains(parameter)) {
			this.issueCreator.issue(argument, AmaltheaPackage.eINSTANCE.getCallArgument_Parameter(),
				"Called Runnable \"" + calledRunnable.getName()
				+ "\" does not match Parameter \"" + parameter.toString() + "\"");
		}
	}

	
	private List<RunnableParameter> getSuitableParameters(final Runnable runnable) {
		if (runnable == null)
			return Collections.emptyList();

		// Parameters (in, inout) of runnable
		return runnable.getParameters().stream()
				.filter(e -> e.getDirection() == DirectionType.IN || e.getDirection() == DirectionType.INOUT)
				.collect(Collectors.toList());
	}

	private List<CallArgument> getSuitableCallArguments(final Runnable runnable) {
		if (runnable == null)
			return Collections.emptyList();

		// CallArguments (out, inout) of contained calls
		List<DirectionType> possibleDirections = Arrays.asList(DirectionType.OUT, DirectionType.INOUT);
		
		return SoftwareUtil.collectRunnableItems(runnable, null, (e -> e instanceof RunnableCall)).stream()
				.flatMap(e -> ((RunnableCall) e).getArguments().stream())
				.filter(e -> e.getParameter() != null)
				.filter(e -> possibleDirections.contains(e.getParameter().getDirection()))
				.collect(Collectors.toList());
	}
	
}
