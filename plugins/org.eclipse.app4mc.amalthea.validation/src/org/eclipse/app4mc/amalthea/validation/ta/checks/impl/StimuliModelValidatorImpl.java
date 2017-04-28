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
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.Clock;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.Periodic;
import org.eclipse.app4mc.amalthea.model.Single;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Synthetic;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TimestampList;
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

	/*
	 * Checks the value of property offset. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkPeriodicOffsetUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Periodic) {
				Periodic periodic = (Periodic) elem;
				Time offset = periodic.getOffset();
				if(null != offset) {
					int value = offset.getValue();
					if(0 > value) {
						this.issueCreator.issue(offset, AmaltheaPackage.eINSTANCE.getPeriodic_Offset(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property recurrence. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkPeriodicRecurrenceUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Periodic) {
				Periodic periodic = (Periodic) elem;
				Time recurrence = periodic.getRecurrence();
				if(null != recurrence) {
					int value = recurrence.getValue();
					if(0 > value) {
						this.issueCreator.issue(recurrence, AmaltheaPackage.eINSTANCE.getPeriodic_Recurrence(), value);
					}
				}
			}
		}
	}
	
	/*
	 * Checks the value of property offset. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSyntheticOffsetUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Synthetic) {
				Synthetic synthetic = (Synthetic) elem;
				Time offset = synthetic.getOffset();
				if(null != offset) {
					int value = offset.getValue();
					if(0 > value) {
						this.issueCreator.issue(offset, AmaltheaPackage.eINSTANCE.getSynthetic_Offset(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property recurrence. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSyntheticPeriodUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Synthetic) {
				Synthetic synthetic = (Synthetic) elem;
				Time period = synthetic.getPeriod();
				if(null != period) {
					int value = period.getValue();
					if(0 > value) {
						this.issueCreator.issue(period, AmaltheaPackage.eINSTANCE.getSynthetic_Period(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the values of property timestamps. The parameters must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkTimestampListTimestampsUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof TimestampList) {
				TimestampList timestampList = (TimestampList) elem;
				for(Time timestamp : timestampList.getTimestamps()) {
					if(null != timestamp) {
						int value = timestamp.getValue();
						if(0 > value) {
							this.issueCreator.issue(timestamp, AmaltheaPackage.eINSTANCE.getTimestampList_Timestamps(), value);
						}
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property activation. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSingleActivationUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Single) {
				Single single = (Single) elem;
				Time activation = single.getActivation();
				if(null != activation) {
					int value = activation.getValue();
					if(0 > value) {
						this.issueCreator.issue(activation, AmaltheaPackage.eINSTANCE.getSingle_Activation(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property lowerTimeBorder. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkArrivalCurveEntryLowerUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ArrivalCurveEntry) {
				ArrivalCurveEntry arrivalCurveEntry = (ArrivalCurveEntry) elem;
				Time lowerTimeBorder = arrivalCurveEntry.getLowerTimeBorder();
				if(null != lowerTimeBorder) {
					int value = lowerTimeBorder.getValue();
					if(0 > value) {
						this.issueCreator.issue(lowerTimeBorder, AmaltheaPackage.eINSTANCE.getArrivalCurveEntry_LowerTimeBorder(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property upperTimeBorder. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkArrivalCurveEntryUpperUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ArrivalCurveEntry) {
				ArrivalCurveEntry arrivalCurveEntry = (ArrivalCurveEntry) elem;
				Time upperTimeBorder = arrivalCurveEntry.getUpperTimeBorder();
				if(null != upperTimeBorder) {
					int value = upperTimeBorder.getValue();
					if(0 > value) {
						this.issueCreator.issue(upperTimeBorder, AmaltheaPackage.eINSTANCE.getArrivalCurveEntry_UpperTimeBorder(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property period. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkClockTriangleFunctionPeriodUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ClockTriangleFunction) {
				ClockTriangleFunction clockTriangleFunction = (ClockTriangleFunction) elem;
				Time period = clockTriangleFunction.getPeriod();
				if(null != period) {
					int value = period.getValue();
					if(0 > value) {
						this.issueCreator.issue(period, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Period(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property period. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkClockSinusFunctionPeriodUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ClockSinusFunction) {
				ClockSinusFunction clockSinusFunction = (ClockSinusFunction) elem;
				Time period = clockSinusFunction.getPeriod();
				if(null != period) {
					int value = period.getValue();
					if(0 > value) {
						this.issueCreator.issue(period, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Period(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property time. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkClockMultiplierListEntryTimeUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ClockMultiplierListEntry) {
				ClockMultiplierListEntry clockMultiplierListEntry = (ClockMultiplierListEntry) elem;
				Time time = clockMultiplierListEntry.getTime();
				if(null != time) {
					int value = time.getValue();
					if(0 > value) {
						this.issueCreator.issue(time, AmaltheaPackage.eINSTANCE.getClockMultiplierListEntry_Time(), value);
					}
				}
			}
		}
	}
}
