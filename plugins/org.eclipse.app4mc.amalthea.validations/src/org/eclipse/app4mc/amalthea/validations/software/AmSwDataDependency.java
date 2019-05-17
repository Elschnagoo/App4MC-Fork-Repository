/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.validations.software;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.DirectionType;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

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

@Validation(id = "AM-SW-DataDependency")

public class AmSwDataDependency extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getDataDependency();
	}

	@Override
	public void validate(final EObject object, List<ValidationDiagnostic> results) {
		if (object instanceof DataDependency) {
			DataDependency dependency = (DataDependency) object;
			
			Runnable runnable = dependency.getContainingRunnable();
			if (runnable == null) return;
			
			EObject container = dependency.eContainer();
			if (container instanceof LabelAccess) {
				LabelAccess labelAccess = (LabelAccess) container;
				LabelAccessEnum accessType = labelAccess.getAccess();
				if (accessType != LabelAccessEnum.WRITE) {
					addIssue(results, labelAccess, ePackage.getLabelAccess_DependsOn(),
							"Data dependency: A data dependency can only be defined for WRITE label accesses");
				}
			}
			
			if (container instanceof RunnableParameter) {
				RunnableParameter runParam = (RunnableParameter) container;
				DirectionType direction = runParam.getDirection();
				if (direction != DirectionType.OUT && direction != DirectionType.INOUT) {
					addIssue(results, runParam, ePackage.getRunnableParameter_DependsOn(),
							"Data dependency: A data dependency can only be defined for OUT/INOUT parameters");
				}
			}
			
			if (container instanceof CallArgument) {
				CallArgument callArg = (CallArgument) container;
				RunnableParameter parameter = callArg.getParameter();
				if (parameter != null) {
					DirectionType direction = parameter.getDirection();
					if (direction != DirectionType.IN && direction != DirectionType.INOUT) {
						addIssue(results, callArg, ePackage.getCallArgument_DependsOn(),
								"Data dependency: A data dependency can only be defined for IN/INOUT call arguments");
					}
				}
			}
			
			List<RunnableParameter> localParameters = getSuitableParameters(runnable);
			if (!localParameters.containsAll(dependency.getParameters())) {
				addIssue(results, dependency, ePackage.getDataDependency_Parameters(),
						"Data dependency: A data dependency can only refer to local IN/INOUT parameters");
			}
			
			List<CallArgument> localCallArguments = getSuitableCallArguments(runnable);
			if (!localCallArguments.containsAll(dependency.getCallArguments())) {
				addIssue(results, dependency, ePackage.getDataDependency_CallArguments(),
						"Data dependency: A data dependency can only refer to local OUT/INOUT call arguments");
			}

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
