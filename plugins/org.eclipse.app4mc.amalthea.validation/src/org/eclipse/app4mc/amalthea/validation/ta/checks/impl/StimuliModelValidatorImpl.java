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
import org.eclipse.app4mc.amalthea.model.Clock;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.Periodic;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class StimuliModelValidatorImpl extends AbstractValidatorImpl {

	public StimuliModelValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public StimuliModelValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks the parameter recurrence of {@link Periodic}. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkPeriodicRecurrence(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Periodic) {
				final Periodic periodic = (Periodic) elem;
				final Time recurrence = periodic.getRecurrence();
				if (null != recurrence) {
					final int value = recurrence.getValue();
					final TimeUnit unit = recurrence.getUnit();
					if ((0 >= value) || (TimeUnit._UNDEFINED_ == unit)) {
						this.issueCreator.issue(periodic, AmaltheaPackage.eINSTANCE.getPeriodic_Recurrence(), value, unit);
					}
				}
			}
		}
	}

	/*
	 * Checks the parameter recurrence of {@link Periodic}. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkClockReferenceOfPeriodic(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<Periodic> periodics = new HashSet<>();
		final Set<Clock> clocks = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Periodic) {
				final Periodic periodic = (Periodic) elem;
				periodics.add(periodic);
			} else if (elem instanceof StimuliModel) {
				final StimuliModel stimuliModel = (StimuliModel) elem;
				final Collection<Clock> clockList = stimuliModel.getClocks();
				for (final Clock clock : clockList) {
					if (null != clock) {
						clocks.add(clock);
					}
				}
			}
		}

		for (final Periodic periodic : periodics) {
			if (null != periodic) {
				final Clock clock = periodic.getClock();
				if ((null == clock) || (false == clocks.contains(clock))) {
					this.issueCreator.issue(periodic, AmaltheaPackage.eINSTANCE.getPeriodic_Clock());
				}
			}
		}
	}

	/*
	 * Checks the parameters min and max of {@link ClockTriangleFunction}. Both parameters must not be negative,
	 * the parameter max must not be zero and the parameter min must not be larger than max.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkClockTriangleFunction(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ClockTriangleFunction) {
				final ClockTriangleFunction clockTriangleFunction = (ClockTriangleFunction) elem;
				final double min = clockTriangleFunction.getMin();
				final double max = clockTriangleFunction.getMax();

				if (min < 0) {
					this.issueCreator.issue(clockTriangleFunction, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Min());
				} else if (max <= 0) {
					this.issueCreator.issue(clockTriangleFunction, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Max());
				} else if (min > max) {
					this.issueCreator.issue(clockTriangleFunction, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Min());
				}
			}
		}
	}

	/*
	 * Checks the parameters amplitude and yOffset of {@link ClockSinusFunction}. Both parameters must not be negative,
	 * the parameter yOffset must not be zero and the parameter amplitude must not be larger than yOffset.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkClockSinusFunction(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ClockSinusFunction) {
				final ClockSinusFunction clockSinusFunction = (ClockSinusFunction) elem;
				final double amplitude = clockSinusFunction.getAmplitude();
				final double yOffset = clockSinusFunction.getYOffset();

				if (amplitude < 0) {
					this.issueCreator.issue(clockSinusFunction, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Amplitude());
				} else if (yOffset <= 0) {
					this.issueCreator.issue(clockSinusFunction, AmaltheaPackage.eINSTANCE.getClockSinusFunction_YOffset());
				} else if (amplitude > yOffset) {
					this.issueCreator.issue(clockSinusFunction, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Amplitude());
				}
			}
		}
	}

	/*
	 * Checks the parameter Multiplier of {@link ClockMultiplierListEntry}. The parameters must not be negative.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkClockMultiplierList(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ClockMultiplierList) {
				final ClockMultiplierList clock = (ClockMultiplierList) elem;
				for (final ClockMultiplierListEntry entry : clock.getEntries()) {
					final double value = entry.getMultiplier();
					if (value < 0) {
						this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockMultiplierListEntry_Multiplier());
					}
				}
			}
		}
	}
}