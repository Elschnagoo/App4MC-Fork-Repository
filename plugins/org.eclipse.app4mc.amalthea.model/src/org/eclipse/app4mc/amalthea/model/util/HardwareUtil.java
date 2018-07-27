/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.HwLatency;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPathElement;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.AccessDirection;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.TimeType;

public class HardwareUtil {

	public static <T extends HwModule> List<T> getModulesFromHWStructure(Class<T> targetClass, HwStructure structure) {
		ArrayList<HwModule> results = new ArrayList<>();
		// Cache
		if (targetClass.equals(Cache.class)) {
			for (HwModule module : structure.getModules()) {

				if (module instanceof Cache) {
					results.add(module);
				} else if (module instanceof ProcessingUnit) {
					for (Cache containedCache : ((ProcessingUnit) module).getCaches()) {
						results.add(containedCache);
					}
				}

			}
		}
		// ProcessingUnit, Memory and Connection Handler
		else {
			for (HwModule module : structure.getModules()) {
				// ProcessingUnit
				if (targetClass.equals(ProcessingUnit.class)) {
					if (module instanceof ProcessingUnit) {
						results.add(module);
					}
				}
				// Memory
				else if (targetClass.equals(Memory.class)) {
					if (module instanceof Memory) {
						results.add(module);
					}
				}
				// ConnectionHandlerDefiniton
				else {
					if (module instanceof ConnectionHandler) {
						results.add(module);
					}
				}
			}
		}
		for (HwStructure hwStruct : structure.getStructures()) {
			results.addAll(getModulesFromHWStructure(targetClass, hwStruct));
		}
		return (List<T>) results;
	}

	public static <T extends HwModule> List<T> getModulesFromHWModel(Class<T> targetClass, Amalthea model) {
		List<HwModule> modules = new ArrayList<HwModule>();
		for (HwStructure structure : model.getHwModel().getStructures()) {
			modules.addAll(getModulesFromHWStructure(targetClass, structure));
		}
		return (List<T>) modules;
	}

	public static List<ProcessingUnit> getAllProcessingUnitsForProcessingUnitDefinition(Amalthea model,
			ProcessingUnitDefinition puDef) {
		List<ProcessingUnit> pusWithGivenPUDefinition = new ArrayList<ProcessingUnit>();
		List<ProcessingUnit> pusInModel = getModulesFromHWModel(ProcessingUnit.class, model);
		if (puDef == null) { // null is the key for default values!
			return new ArrayList<ProcessingUnit>();
		}

		for (ProcessingUnit pu : pusInModel) {
			if (puDef.equals(pu.getDefinition())) {
				pusWithGivenPUDefinition.add(pu);
			}
		}

		return pusWithGivenPUDefinition;
	}

	public static Map<Memory, Long> getMemoryAccessLatenciesCycles(Amalthea model, TimeType timeType) {
		HashMap<Memory, Long> result = new HashMap<Memory, Long>();
		List<Memory> mems = getModulesFromHWModel(Memory.class, model);
		for (Memory mem : mems) {
			result.put(mem, calculateLatency(mem.getDefinition().getAccessLatency(), timeType));
		}
		return result;
	}

	public static Map<Memory, Time> getMemoryAccessLatencyTime(Amalthea model, TimeType timeType) {
		HashMap<Memory, Time> result = new HashMap<Memory, Time>();
		Map<Memory, Long> memoryMap = getMemoryAccessLatenciesCycles(model, timeType);

		for (Memory key : memoryMap.keySet()) {
			Time time = FactoryUtil.createTime(	// TODO Has to be updated in runtimeUtils
					memoryMap.get(key),
					1.0F,
					getFrequencyOfModuleInHz(key)
					);
			result.put(key, time);
		}
		return result;
	}

	public static List<HwAccessElement> getAccessElementsToDestination(HwDestination dest, Amalthea model) {
		List<HwAccessElement> result = new ArrayList<HwAccessElement>();
		List<ProcessingUnit> pus = getModulesFromHWModel(ProcessingUnit.class, model);
		for (ProcessingUnit pu : pus) {
			for (HwAccessElement element : pu.getAccessElements()) {
				if (element.getDestination().equals(dest)) {
					result.add(element);
				}
			}
		}
		return result;
	}

	public static Map<ProcessingUnit, HashMap<HwDestination, Time>> getAccessTimes(Amalthea model, TimeType timeType,
			AccessDirection direction) {
		Map<ProcessingUnit, HashMap<HwDestination, Time>> coreMemoryLatency = new HashMap<ProcessingUnit, HashMap<HwDestination, Time>>();
		List<ProcessingUnit> pus = getModulesFromHWModel(ProcessingUnit.class, model);
		for (ProcessingUnit pu : pus) {
			HashMap<HwDestination, Time> MemAccessTime = new HashMap<HwDestination, Time>();
			for (HwAccessElement accessElement : pu.getAccessElements()) {
				Time latency = null;
				if (accessElement.getAccessPath() != null) {
					latency = calculateHwAccessPathTime(accessElement, timeType, direction);
				} else {
					latency = calculateLatencyPathTime(accessElement, timeType, direction);
				}
				if (!(MemAccessTime.containsKey(accessElement.getDestination())
						&& (TimeUtil.compareTime(MemAccessTime.get(accessElement.getDestination()), latency) >= 0))) {
					MemAccessTime.put(accessElement.getDestination(), latency);
				}
			}
			coreMemoryLatency.put(pu, MemAccessTime);
		}
		return coreMemoryLatency;
	}

	public static Time calculateLatencyPathTime(HwAccessElement accessElement, TimeType timeType,
			AccessDirection direction) {
		HwLatency latency = null;
		switch (direction) {
		case READ:
			if (accessElement.getReadLatency() != null) {
				latency = accessElement.getReadLatency();
			}
			break;
		case WRITE:
			if (accessElement.getWriteLatency() != null) {
				latency = accessElement.getWriteLatency();
			}
			break;
		default:
			break;
		}
		return FactoryUtil.createTime(
				calculateLatency(latency, timeType),
				1.0F,
				getFrequencyOfModuleInHz(accessElement.getSource())
				);
	}

	public static Time calculateHwAccessPathTime(HwAccessElement accessElement, TimeType timeType,
			AccessDirection direction) {
		Time result = AmaltheaFactory.eINSTANCE.createTime();
		Frequency frequency = null;
		HwLatency latency = null;
		if (accessElement.getAccessPath() != null) {
			for (HwPathElement element : accessElement.getAccessPath().getPathElements()) {
				if (element instanceof ConnectionHandler) {
					if (direction.equals(AccessDirection.READ))
						latency = ((ConnectionHandler) element).getDefinition().getReadLatency();
					else {
						latency = ((ConnectionHandler) element).getDefinition().getWriteLatency();
					}
					frequency = getFrequencyOfModule((ConnectionHandler) element);
				} else if (element instanceof Cache) {
					latency = ((Cache) element).getDefinition().getAccessLatency();
					frequency = getFrequencyOfModule((Cache) element);
				} else if (element instanceof HwConnection) {
					if (direction.equals(AccessDirection.READ))
						latency = ((HwConnection) element).getReadLatency();
					else {
						latency = ((HwConnection) element).getWriteLatency();
					}
					// Assumption is that if the frequencyOfComponent is null the HwConnection is
					// the first element in the path, in this case the frequency of the source
					// (ProcessingUnit)
					// is the driver for the frequency. In any other case the element in front of
					// the connection is the driver (The HwPath is an ordered list of path elements)
					if (frequency == null) {
						frequency = getFrequencyOfModule(accessElement.getSource());
					}
				}
				// It is not possible to specify a Read or Write Latencies for ProcessingUnits!
				// In the case this causes some issues in future the interface HwPathElement
				// could be removed from ProcessingUnit
				else if (element instanceof ProcessingUnit) {
					frequency = getFrequencyOfModule((ProcessingUnit) element);
				}
				
				result = TimeUtil.addTimes(
						result,
						FactoryUtil.createTime(
								calculateLatency(latency, timeType),
								1.0F,
								AmaltheaServices.convertToHertz(frequency).longValue()
								)
						);
			}
		}
		return result;
	}

	public static Long calculateLatency(HwLatency latency, TimeType timeType) {
		Long result = 0L;
		if (latency instanceof LatencyConstant) {
			result = (((LatencyConstant) latency).getCycles());
		} else if (latency instanceof LatencyDeviation) {
			Deviation<LongObject> deviation = ((LatencyDeviation) latency).getCycles();// TODO: Discuss get cycles is
																						// irritating returns deviation
			if (timeType == null)
				result = (RuntimeUtil.getMean(deviation.getDistribution(), deviation.getLowerBound().getValue(),
						deviation.getUpperBound().getValue()));
			else {
				switch (timeType) {
				case ACET:
					result = (RuntimeUtil.getMean(deviation.getDistribution(), deviation.getLowerBound().getValue(),
							deviation.getUpperBound().getValue()));
					break;
				case BCET:
					result = (deviation.getLowerBound().getValue());
					break;
				case WCET:
					result = (deviation.getUpperBound().getValue());
					break;
				default:
					break;
				}
			}
		}
		return result;
	}

	/**
	 * Get the minimum data rate of an access path
	 * 
	 * @param path
	 *            to analyze
	 * @return the minimum data rate of a path element
	 */
	public static DataRate getMinDataRateOfHwAccessPath(HwAccessPath path) {
		DataRate minimum = null;
		if (path != null) {
			for (HwPathElement element : path.getPathElements()) {
				DataRate temp = null;
				if (element instanceof ConnectionHandler) {
					temp = ((ConnectionHandler) element).getDefinition().getDataRate();
				} else if (element instanceof HwConnection) {
					temp = ((HwConnection) element).getDataRate();
				}
				if (temp != null) {
					if (minimum == null || AmaltheaServices.compareDataRates(temp, minimum) < 0) {
						minimum = temp;
					}
				}
			}
		}
		return minimum;
	}

	/**
	 * Returns the frequency of a specific module
	 * 
	 * @param module
	 * @return Frequency
	 */
	public static Frequency getFrequencyOfModule(HwModule module) {
		return module.getFrequencyDomain().getDefaultValue();
	}
	
	/**
	 * Returns the frequency of a specific module in Hertz
	 * 
	 * @param module
	 * @return long
	 */
	public static long getFrequencyOfModuleInHz(HwModule module) {
		return AmaltheaServices.convertToHertz(getFrequencyOfModule(module)).longValue() ;
	}
}
