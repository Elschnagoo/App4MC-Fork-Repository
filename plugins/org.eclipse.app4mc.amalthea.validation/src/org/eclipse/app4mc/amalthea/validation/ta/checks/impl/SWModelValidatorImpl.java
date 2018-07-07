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

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class SWModelValidatorImpl extends AbstractValidatorImpl {

	public SWModelValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public SWModelValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks the parameter size of {@link Label}. The parameter must not be set to zero or lower.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkLabelSize(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Label) {
				final Label label = (Label) elem;
				final DataSize size = label.getSize();
				if (null != size) {
					BigInteger value = size.getValue();
					if(null == value) {
						this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());
					} else {
						if( false == (0 < value.compareTo(BigInteger.ZERO))) {
							this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());
						}
					}
					DataSizeUnit unit = size.getUnit();
					if(null == unit) {
						this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());
					} else {
						if(DataSizeUnit._UNDEFINED_ == unit) {
							this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getAbstractMemoryElement_Size());
						}
					}
				}
			}
		}
	}

	/*
	 * Checks the reference to a Runnable of {@link TaskRunnableCall}. The reference must be set and reference an existing Runnable.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkRunnableReferenceOfTaskRunnableCall(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<TaskRunnableCall> runnableCalls = new HashSet<>();
		final Set<Runnable> runnables = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof TaskRunnableCall) {
				final TaskRunnableCall runnableCall = (TaskRunnableCall) elem;
				runnableCalls.add(runnableCall);
			} else if (elem instanceof SWModel) {
				final SWModel swModel = (SWModel) elem;

				final Collection<Runnable> runnableList = swModel.getRunnables();
				if (null != runnableList) {
					for (final Runnable runnable : runnableList) {
						if (null != runnable) {
							runnables.add(runnable);
						}
					}
				}
			}
		}

		for (final TaskRunnableCall runnableCall : runnableCalls) {
			if (null != runnableCall) {
				final Runnable runnable = runnableCall.getRunnable();
				if ((null == runnable) || (false == runnables.contains(runnable))) {
					this.issueCreator.issue(runnableCall, AmaltheaPackage.eINSTANCE.getTaskRunnableCall_Runnable());
				}
			}
		}
	}

	/*
	 * Checks the reference to a Runnable of {@link RunnableCall}. The reference must be set and reference an existing Runnable.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkRunnableReferenceOfRunnableCall(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Map<RunnableCall, Runnable> call2Runnable = new HashMap<>();
		final Set<RunnableCall> runnableCalls = new HashSet<>();
		final Set<Runnable> runnables = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Runnable) {
				final Runnable runnable = (Runnable) elem;
				for (final RunnableItem runnableItem : runnable.getRunnableItems()) {
					if (runnableItem instanceof RunnableCall) {
						RunnableCall runnableCall = (RunnableCall) runnableItem;
						call2Runnable.put(runnableCall, runnable);
						if (null != runnableCall) {
							runnableCalls.add(runnableCall);
						}
					}
				}
			} else if (elem instanceof SWModel) {
				final SWModel swModel = (SWModel) elem;

				final Collection<Runnable> runnableList = swModel.getRunnables();
				if (null != runnableList) {
					for (final Runnable runnable : runnableList) {
						if (null != runnable) {
							runnables.add(runnable);
						}
					}
				}
			}
		}

		for (final RunnableCall runnableCall : runnableCalls) {
			if (null != runnableCall) {
				final Runnable calledRunnable = runnableCall.getRunnable();
				final Runnable callingRunnable = call2Runnable.get(runnableCall);
				if ((null == calledRunnable) || (false == runnables.contains(calledRunnable)) || (calledRunnable.equals(callingRunnable))) {
					this.issueCreator.issue(runnableCall, AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable());
				}
			}
		}
	}

	/*
	 * Checks the reference to an OsEvent of {@link EventMask}. The reference must be set and reference an existing Runnable.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkOsEventReferenceOfEventMask(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<OsEvent> events = new HashSet<>();
		final Set<EventMask> eventMasks = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof SWModel) {
				final SWModel model = (SWModel) elem;
				for (final OsEvent event : model.getEvents()) {
					if (null != event) {
						events.add(event);
					}
				}
			} else if (elem instanceof EventMask) {
				final EventMask eventMask = (EventMask) elem;
				eventMasks.add(eventMask);
			}
		}

		for (final EventMask eventMask : eventMasks) {
			if (null != eventMask) {
				if (true == eventMask.getEvents().isEmpty()) {
					this.issueCreator.issue(eventMask, AmaltheaPackage.eINSTANCE.getEventMask_Events());
				} else {
					for (final OsEvent event : eventMask.getEvents()) {
						if ((null == event) || (false == events.contains(event))) {
							this.issueCreator.issue(eventMask, AmaltheaPackage.eINSTANCE.getEventMask_Events());
						}
					}
				}
			}
		}
	}

	/*
	 * Checks, if for each OsEvents in {@link EventMask} of an WaitEvent an according SetEvent is available.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkEventMaskEvents(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<OsEvent> sets = new HashSet<>();
		final Set<OsEvent> waits = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof SetEvent) {
				final SetEvent set = (SetEvent) elem;
				final EventMask eventMask = set.getEventMask();
				for (final OsEvent event : eventMask.getEvents()) {
					if (null != event) {
						sets.add(event);
					}
				}
			} else if (elem instanceof WaitEvent) {
				final WaitEvent wait = (WaitEvent) elem;
				final EventMask eventMask = wait.getEventMask();
				for (final OsEvent event : eventMask.getEvents()) {
					if (null != event) {
						waits.add(event);
					}
				}
			}
		}

		final Set<OsEvent> disjoint = new HashSet<OsEvent>(waits);
		disjoint.removeAll(sets);
		for (final OsEvent event : disjoint) {
			if (null != event) {
				this.issueCreator.issue(event, AmaltheaPackage.eINSTANCE.getSWModel_Events(), event.getName());
			}
		}
	}

	/*
	 * Checks the reference "valueProvider" of {@link ModeSwitch}. The reference must be set and reference an existing ModeLabel.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeSwitchValueProvider(final Amalthea amalthea) {

//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//		final Set<ModeSwitch> modeSwitchSet = new HashSet<>();
//		final Set<ModeLabel> modeLabelSet = new HashSet<>();
//
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof ModeSwitch) {
//				final ModeSwitch modeSwitch = (ModeSwitch) elem;
//				modeSwitchSet.add(modeSwitch);
//			} else if (elem instanceof SWModel) {
//				final SWModel swModel = (SWModel) elem;
//
//				final Collection<ModeLabel> labelList = swModel.getModeLabels();
//				if (null != labelList) {
//					for (final ModeLabel modeLabel : labelList) {
//						if (null != modeLabel) {
//							modeLabelSet.add(modeLabel);
//						}
//					}
//				}
//			}
//		}
//
//		for (final ModeSwitch modeSwitch : modeSwitchSet) {
//			if (null != modeSwitch) {
//				final ModeLabel modeLabel = modeSwitch.getValueProvider();
//				if ((null == modeLabel) || (false == modeLabelSet.contains(modeLabel))) {
//					this.issueCreator.issue(modeSwitch, AmaltheaPackage.eINSTANCE.getModeSwitch_ValueProvider());
//				}
//			}
//		}
	}

	/*
	 * Checks the parameter "value" of {@link ModeSwitchEntry}. The same parameter value must not be used multiple times.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeSwitchEntryValue1(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<ModeSwitch> modeSwitchSet = new HashSet<>();
		final Set<ModeLabel> modeLabelSet = new HashSet<>();

		while (amaIter.hasNext()) {
			
			final EObject elem = amaIter.next();
			if (elem instanceof ModeSwitch) {
				final ModeSwitch modeSwitch = (ModeSwitch) elem;
				modeSwitchSet.add(modeSwitch);
			} else if (elem instanceof SWModel) {
				final SWModel swModel = (SWModel) elem;

				final Collection<ModeLabel> labelList = swModel.getModeLabels();
				if (null != labelList) {
					for (final ModeLabel modeLabel : labelList) {
						if (null != modeLabel) {
							modeLabelSet.add(modeLabel);
						}
					}
				}
			}
		}

		final Set<ModeSwitchEntry<?>> erroneous = new HashSet<>();
//		for (final ModeSwitch modeSwitch : modeSwitchSet) {
//			if (null != modeSwitch) {
//				final Map<ModeLiteral, ModeSwitchEntry<?>> values = new HashMap<>();
//				for (final ModeSwitchEntry<?> modeSwitchEntry : modeSwitch.getEntries()) {
//					EList<ModeLiteral> valueList = modeSwitchEntry.getValues();
//					if (false == valueList.isEmpty()) {
//						for(ModeLiteral value : valueList) {
//							if (null != value) {
//								if (true == values.keySet().contains(value)) {
//									erroneous.add(modeSwitchEntry);
//									erroneous.add(values.get(value));
//								} else {
//									values.put(value, modeSwitchEntry);
//								}
//							}
//						}
//					}
//				}
//			} 
//		}
//
//		for (final ModeSwitchEntry<?> modeSwitchEntry : erroneous) {
//			this.issueCreator.issue(modeSwitchEntry, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());
//		}
	}

	/*
	 * Checks the parameter "value" of {@link ModeSwitchEntry}. The parameter must be set and be conform to the referenced mode.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeSwitchEntryValue2(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<ModeSwitch> modeSwitchSet = new HashSet<>();
		final Set<ModeLabel> modeLabelSet = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ModeSwitch) {
				final ModeSwitch modeSwitch = (ModeSwitch) elem;
				modeSwitchSet.add(modeSwitch);
			} else if (elem instanceof SWModel) {
				final SWModel swModel = (SWModel) elem;

				final Collection<ModeLabel> labelList = swModel.getModeLabels();
				if (null != labelList) {
					for (final ModeLabel modeLabel : labelList) {
						if (null != modeLabel) {
							modeLabelSet.add(modeLabel);
						}
					}
				}
			}
		}

//		for (final ModeSwitch modeSwitch : modeSwitchSet) {
//			if (null != modeSwitch) {
//				for (final ModeSwitchEntry<?> modeSwitchEntry : modeSwitch.getEntries()) {
//					EList<ModeLiteral> valueList = modeSwitchEntry.getValues();
//					if (true != valueList.isEmpty()) {
//						for(ModeLiteral value : valueList) {
//							if (null == value) {
//								this.issueCreator.issue(modeSwitchEntry, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());
//							} else {
//								final ModeLabel modeLabel = modeSwitch.getValueProvider();
//								if (null != modeLabel) {
//									final Mode mode = modeLabel.getMode();
//									if (null != mode) {
//										if (false == mode.getLiterals().contains(value)) {
//											this.issueCreator.issue(modeSwitchEntry, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());
//										}
//									}
//								}
//							}
//						}
//					} else {
//						this.issueCreator.issue(modeSwitchEntry, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());
//					}
//				}
//			}
//		}
	}

	/*
	 * Checks the reference "mode" of {@link ModeLabel}. The reference must be set and reference an existing Mode.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeLabelMode(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<ModeLabel> modeLabelSet = new HashSet<>();
		final Set<Mode> modeSet = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ModeSwitch) {
//				final ModeSwitch modeSwitch = (ModeSwitch) elem;
//				final ModeLabel modeLabel = modeSwitch.getValueProvider();
//				modeLabelSet.add(modeLabel);
			} else if (elem instanceof SWModel) {
				final SWModel swModel = (SWModel) elem;
				final Collection<Mode> modeList = swModel.getModes();
				if (null != modeList) {
					for (final Mode mode : modeList) {
						if (null != mode) {
							modeSet.add(mode);
						}
					}
				}
			}
		}

		for (final ModeLabel modeLabel : modeLabelSet) {
			if (null != modeLabel) {
				final Mode mode = modeLabel.getMode();
				if ((null == mode) || (false == modeSet.contains(mode))) {
					this.issueCreator.issue(modeLabel, AmaltheaPackage.eINSTANCE.getModeLabel_Mode());
				}
			}
		}
	}

	/*
	 * Checks the parameter "initialValue" of {@link ModeLabel}. The parameter must be conform to the referenced mode.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeLabelInitialValue(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<ModeLabel> modeLabelSet = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ModeSwitch) {
//				final ModeSwitch modeSwitch = (ModeSwitch) elem;
//				final ModeLabel modeValueProvider = modeSwitch.getValueProvider();
//				modeLabelSet.add(modeValueProvider);
			}
		}

		for (final ModeLabel modeLabel : modeLabelSet) {
			if (null != modeLabel) {
				final ModeLiteral initialValue = modeLabel.getInitialValue();
				final Mode mode = modeLabel.getMode();
				if ((null != mode) && (null != initialValue)) {
					if (false == mode.getLiterals().contains(initialValue)) {
						this.issueCreator.issue(modeLabel, AmaltheaPackage.eINSTANCE.getModeLabel_InitialValue());
					}
				}
			}
		}
	}

	/*
	 * Checks the parameter Offset of {@link Counter}. The parameter must be larger than zero.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkCounterOffset(final Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Counter) {
				final Counter counter = (Counter) elem;
				final long offset = counter.getOffset();
				if (0 >= offset) {
					this.issueCreator.issue(counter, AmaltheaPackage.eINSTANCE.getCounter_Offset());
				}
			}
		}
	}

	/*
	 * Checks the ServerRunnable reference of {@link ServerCall}. The reference must be set and reference an existing Runnable but not itself.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkServerCallServerRunnable(final Amalthea amalthea) {

		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		final Set<Runnable> runnables = new HashSet<>();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Runnable) {
				final Runnable runnable = (Runnable) elem;
				runnables.add(runnable);
			}
		}
		for (final Runnable runnable : runnables) {
			for (final RunnableItem item : runnable.getRunnableItems()) {
				if (item instanceof ServerCall) {
					final ServerCall serverCall = (ServerCall) item;
					final Runnable serverRunnable = serverCall.getServerRunnable();
					if (null == serverRunnable) {
						this.issueCreator.issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());
					} else {
						if (false == runnables.contains(serverRunnable)) {
							this.issueCreator.issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());
						} else {
							if (serverRunnable.equals(runnable)) {
								this.issueCreator.issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());
							}
						}
					}
				}
			}
		}
	}
	
	
	/*
	 * Checks the ResourceOwner reference of {@link EnforcedMigration}. The reference must be set and reference an existing TaskScheduler.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkEnforcedMigrationResourceOwner(final Amalthea amalthea) {
		final Set<EnforcedMigration> enforcedMigrations = new HashSet<>();
		OperatingSystem os = null;
		
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof EnforcedMigration) {
				final EnforcedMigration enforcedMigration = (EnforcedMigration) elem;
				enforcedMigrations.add(enforcedMigration);
			} else if (elem instanceof OperatingSystem) {
				os = (OperatingSystem) elem;
			}
		}
		
		for (final EnforcedMigration enforcedMigration : enforcedMigrations) {
			boolean found = false;
			Scheduler scheduler = enforcedMigration.getResourceOwner();
			if(null != os) {
				for(TaskScheduler taskScheduler : os.getTaskSchedulers()) {
					if(taskScheduler.equals(scheduler)) {
						found = true;
					}
				}
			}
			if(false == found) {
				this.issueCreator.issue(enforcedMigration, AmaltheaPackage.eINSTANCE.getEnforcedMigration_ResourceOwner());
			}
		}
	}

	/*
	 * Checks the value of property deadline. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkRunnableDeadlineUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof Runnable) {
				Runnable runnable = (Runnable) elem;
				Time deadline = runnable.getDeadline();
				if(null != deadline) {
					BigInteger value = deadline.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(deadline, AmaltheaPackage.eINSTANCE.getRunnable_Deadline(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property min. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkPeriodicActivationMinUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof PeriodicActivation) {
				PeriodicActivation periodicActivation = (PeriodicActivation) elem;
				Time min = periodicActivation.getMin();
				if(null != min) {
					BigInteger value = min.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(min, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Min(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property max. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkPeriodicActivationMaxUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof PeriodicActivation) {
				PeriodicActivation periodicActivation = (PeriodicActivation) elem;
				Time max = periodicActivation.getMax();
				if(null != max) {
					BigInteger value = max.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(max, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Max(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property offset. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkPeriodicActivationOffsetUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof PeriodicActivation) {
				PeriodicActivation periodicActivation = (PeriodicActivation) elem;
				Time offset = periodicActivation.getOffset();
				if(null != offset) {
					BigInteger value = offset.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(offset, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Offset(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property min. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSingleActivationMinUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof SingleActivation) {
				SingleActivation singleActivation = (SingleActivation) elem;
				Time min = singleActivation.getMin();
				if(null != min) {
					BigInteger value = min.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(min, AmaltheaPackage.eINSTANCE.getSingleActivation_Min(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the value of property max. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkSingleActivationMaxUnsigned(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof SingleActivation) {
				SingleActivation singleActivation = (SingleActivation) elem;
				Time max = singleActivation.getMax();
				if(null != max) {
					BigInteger value = max.getValue();
					if(0 > value.signum()) {
						this.issueCreator.issue(max, AmaltheaPackage.eINSTANCE.getSingleActivation_Max(), value);
					}
				}
			}
		}
	}

	/*
	 * Checks the Mode referenced by {@link ModeLabelAccess}. The references ModeLabel and ModeLiteral of ModeLabelAccess must reference the same Mode.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeLabelAccessModeEqual(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ModeLabelAccess) {
				ModeLabelAccess modeLabelAccess = (ModeLabelAccess) elem;
				ModeLiteral modeLiteral = modeLabelAccess.getModeValue();
				ModeLabel modeLabel = modeLabelAccess.getData();
				if((null != modeLiteral) && (null != modeLabel)) {
					Mode mode1 = modeLabel.getMode();
					Mode mode2 = (Mode) modeLiteral.eContainer();
					if(mode1 != mode2) {
						this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_Data(), mode1, mode2);
						this.issueCreator.issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_ModeValue(), mode1, mode2);
					}
				}
			}
		}
	}

	/*
	 * Checks if {@link ModeLiteral} is referenced by a Mode.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeLiteralMode(Amalthea amalthea) {
		final TreeIterator<EObject> amaIter = amalthea.eAllContents();

		Set<ModeLiteral> modeListerals = new HashSet<ModeLiteral>();
		while (amaIter.hasNext()) {
			final EObject elem = amaIter.next();
			if (elem instanceof ModeLabel) {
				ModeLabel modeLabel = (ModeLabel) elem;
				ModeLiteral modeLiteral = modeLabel.getInitialValue(); 
				if(null != modeLiteral) {
					modeListerals.add(modeLiteral);
				}
			} else if (elem instanceof ModeLabelAccess) {
				ModeLabelAccess modeLabelAccess = (ModeLabelAccess) elem;
				ModeLiteral modeLiteral = modeLabelAccess.getModeValue(); 
				if(null != modeLiteral) {
					modeListerals.add(modeLiteral);
				}
			} else if (elem instanceof ModeSwitchEntry<?>) {
//				ModeSwitchEntry<?> modeSwitchEntry = (ModeSwitchEntry<?>) elem;
//				for(ModeLiteral modeLiteral : modeSwitchEntry.getValues()) {
//					modeListerals.add(modeLiteral);
//				}
			}
		}
		
		for(ModeLiteral modeLiteral : modeListerals) {
			if(null != modeLiteral) {
				Object object = modeLiteral.eContainer();
				if((null == object) || (false == (object instanceof Mode))) {
					this.issueCreator.issue(modeLiteral, AmaltheaPackage.eINSTANCE.getMode_Literals());
				}
			}
		}
	}
}
