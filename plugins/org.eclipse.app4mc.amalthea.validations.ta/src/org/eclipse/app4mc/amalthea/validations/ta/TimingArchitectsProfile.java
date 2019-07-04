/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.ta;

import org.eclipse.app4mc.amalthea.validations.ta.basic.TABasicContinuousValueBetaDistribution;
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
import org.eclipse.app4mc.validation.annotation.Profile;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;

/**
 * Validations for AMALTHEA models used in a Timing Architects Simulation
 */
@Profile(
	name = "Timing Architects Simulation",
	description = "Validations for AMALTHEA models used in a Timing Architects Simulation."
)
@ValidationGroup(
	severity = Severity.ERROR,
	validations =  {
			TABasicContinuousValueBetaDistribution.class,
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
/*@ValidationGroup(
	severity = Severity.WARNING,
	validations = { TA011.class }
)*/
public class TimingArchitectsProfile implements IProfile {
    // Do nothing
}
