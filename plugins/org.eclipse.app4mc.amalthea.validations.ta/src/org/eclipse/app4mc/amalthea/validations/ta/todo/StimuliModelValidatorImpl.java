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

package org.eclipse.app4mc.amalthea.validations.ta.todo;

import java.math.BigInteger;
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
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Scenario;
import org.eclipse.app4mc.amalthea.model.SingleStimulus;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class StimuliModelValidatorImpl {

	/*
	 * Checks the parameter recurrence of {@link Periodic}. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkPeriodicRecurrence(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof PeriodicStimulus) {
				final PeriodicStimulus periodic = (PeriodicStimulus) elem;
				final Time recurrence = periodic.getRecurrence();
				if (null != recurrence) {
					final BigInteger value = recurrence.getValue();
					final TimeUnit unit = recurrence.getUnit();
					if ((0 >= value.signum()) || (TimeUnit._UNDEFINED_ == unit)) {
						issue(periodic, AmaltheaPackage.eINSTANCE.getFixedPeriodic_Recurrence(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks {@link VariableRateStimulus}.
	 *  - The scenario must be set.
	 */
	public void checkVariableRateScenario(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof VariableRateStimulus) {
				final VariableRateStimulus vr = (VariableRateStimulus) elem;
				final Scenario sc = vr.getScenario();
				if (sc == null) {
					// Scenario is undefined
					issue(vr, AmaltheaPackage.eINSTANCE.getVariableRateStimulus_Scenario());
				}
			}
		}
	}

	/*
	 * Checks {@link Scenario}.
	 *  - The parameter recurrence must be greater than zero.
	 */
	public void checkScenarioRecurrence(final Amalthea amalthea) {
		
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Scenario) {
				final Scenario sc = (Scenario) elem;
				final Time recurrence = sc.getRecurrence();
				if (null != recurrence) {
					final BigInteger value = recurrence.getValue();
					final TimeUnit unit = recurrence.getUnit();
					if ((0 >= value.signum()) || (TimeUnit._UNDEFINED_ == unit)) {
						issue(sc, AmaltheaPackage.eINSTANCE.getScenario_Recurrence(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks {@link Scenario}.
	 *  - The clock reference must be valid.
	 */
	public void checkScenarioClock(final Amalthea amalthea) {
		
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<VariableRateStimulus> stimuliSet = new HashSet<>();
		final Set<Clock> clockSet = new HashSet<>();
		
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof VariableRateStimulus) {
				final VariableRateStimulus vr = (VariableRateStimulus) elem;
				stimuliSet.add(vr);
			} else if (elem instanceof StimuliModel) {
				final StimuliModel stimuliModel = (StimuliModel) elem;
				final Collection<Clock> clockList = stimuliModel.getClocks();
				for (final Clock clock : clockList) {
					if (null != clock) {
						clockSet.add(clock);
					}
				}
			}
		}
		
		for (final VariableRateStimulus vr : stimuliSet) {
			if (vr != null) {
				final Scenario sc = vr.getScenario();
				if (sc != null) {					
					// Check clock reference
					final Clock clock = sc.getClock();
					if ((null == clock) || (false == clockSet.contains(clock))) {
						issue(sc, AmaltheaPackage.eINSTANCE.getScenario_Clock());
					}
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
					issue(clockTriangleFunction, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Min());
				} else if (max <= 0) {
					issue(clockTriangleFunction, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Max());
				} else if (min > max) {
					issue(clockTriangleFunction, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Min());
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
					issue(clockSinusFunction, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Amplitude());
				} else if (yOffset <= 0) {
					issue(clockSinusFunction, AmaltheaPackage.eINSTANCE.getClockSinusFunction_YOffset());
				} else if (amplitude > yOffset) {
					issue(clockSinusFunction, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Amplitude());
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
						issue(clock, AmaltheaPackage.eINSTANCE.getClockMultiplierListEntry_Multiplier());
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
			if (elem instanceof PeriodicStimulus) {
				PeriodicStimulus periodic = (PeriodicStimulus) elem;
				Time offset = periodic.getOffset();
				if(null != offset) {
					BigInteger value = offset.getValue();
					if(0 > value.signum()) {
						issue(offset, AmaltheaPackage.eINSTANCE.getFixedPeriodic_Offset(), value);
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
			if (elem instanceof PeriodicStimulus) {
				PeriodicStimulus periodic = (PeriodicStimulus) elem;
				Time recurrence = periodic.getRecurrence();
				if(null != recurrence) {
					BigInteger value = recurrence.getValue();
					if(0 > value.signum()) {
						issue(recurrence, AmaltheaPackage.eINSTANCE.getFixedPeriodic_Recurrence(), value);
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
			if (elem instanceof PeriodicSyntheticStimulus) {
				PeriodicSyntheticStimulus synthetic = (PeriodicSyntheticStimulus) elem;
				Time offset = synthetic.getOffset();
				if(null != offset) {
					BigInteger value = offset.getValue();
					if(0 > value.signum()) {
						issue(offset, AmaltheaPackage.eINSTANCE.getFixedPeriodic_Offset(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property recurrence. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSyntheticRecurrenceUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof PeriodicSyntheticStimulus) {
				PeriodicSyntheticStimulus synthetic = (PeriodicSyntheticStimulus) elem;
				Time period = synthetic.getRecurrence();
				if(null != period) {
					BigInteger value = period.getValue();
					if(0 > value.signum()) {
						issue(period, AmaltheaPackage.eINSTANCE.getFixedPeriodic_Recurrence(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the values of property timestamps. The parameters must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSyntheticTimestampsUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof PeriodicSyntheticStimulus) {

				for(Time timestamp : ((PeriodicSyntheticStimulus) elem).getOccurrenceTimes()) {
					if(null != timestamp) {
						BigInteger value = timestamp.getValue();
						if(0 > value.signum()) {
							issue(timestamp, AmaltheaPackage.eINSTANCE.getPeriodicSyntheticStimulus_OccurrenceTimes(), value);
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
	public void checkSingleOccurrenceUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof SingleStimulus) {
				SingleStimulus single = (SingleStimulus) elem;
				Time activation = single.getOccurrence();
				if(null != activation) {
					BigInteger value = activation.getValue();
					if(0 > value.signum()) {
						issue(activation, AmaltheaPackage.eINSTANCE.getSingleStimulus_Occurrence(), value);
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
					BigInteger value = lowerTimeBorder.getValue();
					if(0 > value.signum()) {
						issue(lowerTimeBorder, AmaltheaPackage.eINSTANCE.getArrivalCurveEntry_LowerTimeBorder(), value);
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
					BigInteger value = upperTimeBorder.getValue();
					if(0 > value.signum()) {
						issue(upperTimeBorder, AmaltheaPackage.eINSTANCE.getArrivalCurveEntry_UpperTimeBorder(), value);
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
					BigInteger value = period.getValue();
					if(0 > value.signum()) {
						issue(period, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Period(), value);
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
					BigInteger value = period.getValue();
					if(0 > value.signum()) {
						issue(period, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Period(), value);
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
					BigInteger value = time.getValue();
					if(0 > value.signum()) {
						issue(time, AmaltheaPackage.eINSTANCE.getClockMultiplierListEntry_Time(), value);
					}
				}
			}
		}
	}

	
	/*
	 * Checks if property valueProvider of {@link ModeValue} references an existing {@link ModeLiteral}.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeValueProviderConstraint(Amalthea amalthea) {
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//
//		final List<ModeLabel> modeLabels = new ArrayList<>();
//		final Map<ModeLabel, ModeCondition> valueProviders = new HashMap<>();
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof SWModel) {
//				SWModel swModel = (SWModel) elem;
//				modeLabels.addAll(swModel.getModeLabels());
//			}
//			if (elem instanceof ModeCondition) {
//				ModeCondition entry = (ModeCondition) elem;
//				ModeLabel valueProvider = entry.getValueProvider();
//				if(null == valueProvider) {
//					issue(entry, AmaltheaPackage.eINSTANCE.getModeValue_ValueProvider());
//				} else {
//					valueProviders.put(valueProvider, entry);
//				}
//			}
//		}
		
		// check
//		for(ModeLabel modeLabel : valueProviders.keySet()) {
//			if(false == modeLabels.contains(modeLabel)) {
//				ModeCondition entry = valueProviders.get(modeLabel);
//				issue(entry, AmaltheaPackage.eINSTANCE.getModeValue_ValueProvider());
//			}
//		}
	}

	private void issue(EObject obj, EStructuralFeature feature, Object value) {
		// dummy
	}

	private void issue(EObject obj, EStructuralFeature feature) {
		// dummy
	}

}