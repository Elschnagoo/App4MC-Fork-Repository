/**
 ********************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
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

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.RequirementLimit;
import org.eclipse.app4mc.amalthea.model.SynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class ConstraintsModelValidatorImpl extends AbstractValidatorImpl {

	public ConstraintsModelValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public ConstraintsModelValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}
	
	/*
	 * Checks in case of EDF scheduling algorithm if for each process a deadline is set.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkEDFDeadlineAvailability(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		Set<Task> tasks = new HashSet<Task>();
		Set<Task> tasksWithDeadlines = new HashSet<Task>();
		
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof TaskAllocation) {
				TaskAllocation taskAllocation = (TaskAllocation) elem;
				TaskScheduler taskScheduler = taskAllocation.getScheduler();
				if(null != taskScheduler) {
					TaskSchedulingAlgorithm schedulingAlgorithm = taskScheduler.getSchedulingAlgorithm();
					if(schedulingAlgorithm instanceof EarliestDeadlineFirst){
						Task task = taskAllocation.getTask();
						if(null != task) {
							tasks.add(task);
						}
					}
				}
			} else if(elem instanceof ProcessRequirement) {
				ProcessRequirement requirement = (ProcessRequirement) elem;
				AbstractProcess process = requirement.getProcess();
				if(process instanceof Task) {
					Task task = (Task) process;
					RequirementLimit limit = requirement.getLimit();
					// check for deadline
					if((null != limit) && (LimitType.UPPER_LIMIT == limit.getLimitType())) {
						tasksWithDeadlines.add(task);
					}
				}
			}
		}
		Set<Task> tasksMissingDeadline = new HashSet<Task>(tasks);
		tasksMissingDeadline.removeAll(tasksWithDeadlines);
		for(Task task : tasksMissingDeadline) {
			this.issueCreator.issue(task, null , task.getName());
		}
	}

	/*
	 * Checks the value of deadline. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkDeadlineValue(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof TimeRequirementLimit) {
				TimeRequirementLimit timeRequirementLimit = (TimeRequirementLimit) elem;
				TimeMetric metric = timeRequirementLimit.getMetric();
				if(TimeMetric.RESPONSE_TIME == metric) {
					Time time = timeRequirementLimit.getLimitValue();
					if(null != time) {
						BigInteger value = time.getValue();
						TimeUnit unit = time.getUnit();
						if((0 >= value.signum()) || (TimeUnit._UNDEFINED_ == unit)) {
							this.issueCreator.issue(timeRequirementLimit, AmaltheaPackage.eINSTANCE.getTimeRequirementLimit_LimitValue(), value, unit);
						}
					}
				}
			}
		}
	}
	
	/*
	 * Checks the value of tolerance. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSynchronizationConstraintToleranceUnsigned(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof SynchronizationConstraint) {
				SynchronizationConstraint synchronizationConstraint = (SynchronizationConstraint) elem;
				Time tolerance = synchronizationConstraint.getTolerance();
				if(null != tolerance) {
					BigInteger value = tolerance.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(tolerance, AmaltheaPackage.eINSTANCE.getSynchronizationConstraint_Tolerance(), value);
					}
				}
			}
		}
	}
	
	/*
	 * Checks the value of upper. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkDelayConstraintUpperUnsigned(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof DelayConstraint) {
				DelayConstraint delayConstraint = (DelayConstraint) elem;
				Time upper = delayConstraint.getUpper();
				if(null != upper) {
					BigInteger value = upper.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(upper, AmaltheaPackage.eINSTANCE.getDelayConstraint_Upper(), value);
					}
				}
			}
		}
	}
	
	/*
	 * Checks the value of lower. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkDelayConstraintLowerUnsigned(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof DelayConstraint) {
				DelayConstraint delayConstraint = (DelayConstraint) elem;
				Time lower = delayConstraint.getLower();
				if(null != lower) {
					BigInteger value = lower.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(lower, AmaltheaPackage.eINSTANCE.getDelayConstraint_Lower(), value);
					}
				}
			}
		}
	}
	
	/*
	 * Checks the value of minimum. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkEventChainLatencyConstraintMinimumUnsigned(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof EventChainLatencyConstraint) {
				EventChainLatencyConstraint eventChainLatencyConstraint = (EventChainLatencyConstraint) elem;
				Time minimum = eventChainLatencyConstraint.getMinimum();
				if(null != minimum) {
					BigInteger value = minimum.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(minimum, AmaltheaPackage.eINSTANCE.getEventChainLatencyConstraint_Minimum(), value);
					}
				}
			}
		}
	}
	
	/*
	 * Checks the value of minimum. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkEventChainLatencyConstraintMaximumUnsigned(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof EventChainLatencyConstraint) {
				EventChainLatencyConstraint eventChainLatencyConstraint = (EventChainLatencyConstraint) elem;
				Time maximum = eventChainLatencyConstraint.getMaximum();
				if(null != maximum) {
					BigInteger value = maximum.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(maximum, AmaltheaPackage.eINSTANCE.getEventChainLatencyConstraint_Maximum(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property lower. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkRepetitionConstraintLowerUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof RepetitionConstraint) {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint) elem;
				Time lower = repetitionConstraint.getLower();
				if(null != lower) {
					BigInteger value = lower.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(lower, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Lower(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property upper. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkRepetitionConstraintUpperUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof RepetitionConstraint) {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint) elem;
				Time upper = repetitionConstraint.getUpper();
				if(null != upper) {
					BigInteger value = upper.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(upper, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Upper(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property jitter. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkRepetitionConstraintJitterUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof RepetitionConstraint) {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint) elem;
				Time jitter = repetitionConstraint.getJitter();
				if(null != jitter) {
					BigInteger value = jitter.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(jitter, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Jitter(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property period. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkRepetitionConstraintPeriodUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof RepetitionConstraint) {
				RepetitionConstraint repetitionConstraint = (RepetitionConstraint) elem;
				Time period = repetitionConstraint.getPeriod();
				if(null != period) {
					BigInteger value = period.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(period, AmaltheaPackage.eINSTANCE.getRepetitionConstraint_Period(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property minimum. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkDataAgeTimeMinimumUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof DataAgeTime) {
				DataAgeTime dataAgeTime = (DataAgeTime) elem;
				Time minimum = dataAgeTime.getMinimumTime();
				if(null != minimum) {
					BigInteger value = minimum.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(minimum, AmaltheaPackage.eINSTANCE.getDataAgeTime_MinimumTime(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property maximum. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkDataAgeTimeMaximumUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof DataAgeTime) {
				DataAgeTime dataAgeTime = (DataAgeTime) elem;
				Time maximum = dataAgeTime.getMaximumTime();
				if(null != maximum) {
					BigInteger value = maximum.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(maximum, AmaltheaPackage.eINSTANCE.getDataAgeTime_MaximumTime(), value);
					}
				}
			}
		}
	}
}
