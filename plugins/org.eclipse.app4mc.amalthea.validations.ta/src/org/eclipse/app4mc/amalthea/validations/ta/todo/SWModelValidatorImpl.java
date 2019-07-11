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
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleActivation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SWModelValidatorImpl {

	/*
	 * Checks the parameter "value" of {@link ModeSwitchEntry}. The same parameter value must not be used multiple times.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeSwitchEntryValue1(final Amalthea amalthea) {
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//		final Set<ModeSwitch> modeSwitchSet = new HashSet<>();
//		final Set<ModeLabel> modeLabelSet = new HashSet<>();
//
//		while (amaIter.hasNext()) {
//			
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

//		final Set<ModeSwitchEntry<?>> erroneous = new HashSet<>();
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
//			issue(modeSwitchEntry, AmaltheaPackage.eINSTANCE.getModeSwitchEntry_Values());
//		}
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
					issue(counter, AmaltheaPackage.eINSTANCE.getCounter_Offset());
				}
			}
		}
	}

	/*
	 * Checks the ServerRunnable reference of {@link ServerCall}. The reference must be set and reference an existing Runnable but not itself.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkServerCallServerRunnable(final Amalthea amalthea) {
//
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//		final Set<Runnable> runnables = new HashSet<>();
//
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof Runnable) {
//				final Runnable runnable = (Runnable) elem;
//				runnables.add(runnable);
//			}
//		}
//		for (final Runnable runnable : runnables) {
//			for (final RunnableItem item : runnable.getRunnableItems()) {
//				if (item instanceof ServerCall) {
//					final ServerCall serverCall = (ServerCall) item;
//					final Runnable serverRunnable = serverCall.getServerRunnable();
//					if (null == serverRunnable) {
//						issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());
//					} else {
//						if (false == runnables.contains(serverRunnable)) {
//							issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());
//						} else {
//							if (serverRunnable.equals(runnable)) {
//								issue(serverCall, AmaltheaPackage.eINSTANCE.getServerCall_ServerRunnable());
//							}
//						}
//					}
//				}
//			}
//		}
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
				issue(enforcedMigration, AmaltheaPackage.eINSTANCE.getEnforcedMigration_ResourceOwner());
			}
		}
	}

	/*
	 * Checks the value of property deadline. The parameter must not be set lower than zero.
	 * If this is the case, it will be handled as an error.
	 */
	public void checkRunnableDeadlineUnsigned(Amalthea amalthea) {
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof Runnable) {
//				Runnable runnable = (Runnable) elem;
//				Time deadline = runnable.getDeadline();
//				if(null != deadline) {
//					BigInteger value = deadline.getValue();
//					if(0 > value.signum()) {
//						issue(deadline, AmaltheaPackage.eINSTANCE.getRunnable_Deadline(), value);
//					}
//				}
//			}
//		}
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
						issue(min, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Min(), value);
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
						issue(max, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Max(), value);
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
						issue(offset, AmaltheaPackage.eINSTANCE.getPeriodicActivation_Offset(), value);
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
						issue(min, AmaltheaPackage.eINSTANCE.getSingleActivation_Min(), value);
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
						issue(max, AmaltheaPackage.eINSTANCE.getSingleActivation_Max(), value);
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
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof ModeLabelAccess) {
//				ModeLabelAccess modeLabelAccess = (ModeLabelAccess) elem;
//				String modeValue = modeLabelAccess.getValue();
//				ModeLabel modeLabel = modeLabelAccess.getData();
//				if((null != modeValue) && (null != modeLabel)) {
//					Mode mode1 = modeLabel.getMode();
//					Mode mode2 = (Mode) modeValue.eContainer();
//					if(mode1 != mode2) {
//						issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_Data(), mode1, mode2);
//						issue(modeLabelAccess, AmaltheaPackage.eINSTANCE.getModeLabelAccess_ModeValue(), mode1, mode2);
//					}
//				}
//			}
//		}
	}

	/*
	 * Checks if {@link ModeLiteral} is referenced by a Mode.
	 * If this is not the case, it will be handled as an error.
	 */
	public void checkModeLiteralMode(Amalthea amalthea) {
//		final TreeIterator<EObject> amaIter = amalthea.eAllContents();
//
//		Set<ModeLiteral> modeListerals = new HashSet<ModeLiteral>();
//		while (amaIter.hasNext()) {
//			final EObject elem = amaIter.next();
//			if (elem instanceof ModeLabel) {
//				ModeLabel modeLabel = (ModeLabel) elem;
//				ModeLiteral modeLiteral = modeLabel.getInitialValue(); 
//				if(null != modeLiteral) {
//					modeListerals.add(modeLiteral);
//				}
//			} else if (elem instanceof ModeLabelAccess) {
//				ModeLabelAccess modeLabelAccess = (ModeLabelAccess) elem;
//				ModeLiteral modeLiteral = modeLabelAccess.getModeValue(); 
//				if(null != modeLiteral) {
//					modeListerals.add(modeLiteral);
//				}
//			} else if (elem instanceof ModeSwitchEntry<?>) {
////				ModeSwitchEntry<?> modeSwitchEntry = (ModeSwitchEntry<?>) elem;
////				for(ModeLiteral modeLiteral : modeSwitchEntry.getValues()) {
////					modeListerals.add(modeLiteral);
////				}
//			}
//		}
//		
//		for(ModeLiteral modeLiteral : modeListerals) {
//			if(null != modeLiteral) {
//				Object object = modeLiteral.eContainer();
//				if((null == object) || (false == (object instanceof EnumMode))) {
//					issue(modeLiteral, AmaltheaPackage.eINSTANCE.getEnumMode_Literals());
//				}
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
