/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validations.ta;

import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicContinuousValueGaussDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicContinuousValueInterval;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicContinuousValueStatistics;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicContinuousValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicDiscreteValueBetaDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicDiscreteValueGaussDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicDiscreteValueInterval;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicDiscreteValueStatistics;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicDiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTimeBetaDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTimeGaussDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTimeInterval;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTimeStatistics;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTimeWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTruncatedContinuousValueDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTruncatedDiscreteValueDistribution;
import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicTruncatedTimeDistribution;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;

@ValidationGroup(
	severity = Severity.ERROR,
	validations =  {
		TABasicContinuousValueGaussDistribution.class,
		TABasicContinuousValueInterval.class,
		TABasicContinuousValueStatistics.class,
		TABasicContinuousValueWeibullEstimatorsDistribution.class,
		TABasicDiscreteValueBetaDistribution.class,
		TABasicDiscreteValueGaussDistribution.class,
		TABasicDiscreteValueInterval.class,
		TABasicDiscreteValueStatistics.class,
		TABasicDiscreteValueWeibullEstimatorsDistribution.class,
		TABasicTimeBetaDistribution.class,
		TABasicTimeGaussDistribution.class,
		TABasicTimeInterval.class,
		TABasicTimeStatistics.class,
		TABasicTimeWeibullEstimatorsDistribution.class,
		TABasicTruncatedContinuousValueDistribution.class,
		TABasicTruncatedDiscreteValueDistribution.class,
		TABasicTruncatedTimeDistribution.class
	}
)
public class TABasicProfile implements IProfile {
	// Do nothing
}
