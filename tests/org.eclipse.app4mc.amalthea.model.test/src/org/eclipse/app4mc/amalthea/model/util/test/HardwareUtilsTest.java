/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.util.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.util.HardwareUtil;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.AccessDirection;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.TimeType;
import org.eclipse.app4mc.amalthea.models.HardwareModels;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

public class HardwareUtilsTest {

	Amalthea amaltheaModel;

	@Before
	public void initalizeModel() {
		amaltheaModel = HardwareModels.createModel1();
	}

	@Test
	public void testHWModelExistance() {

		HWModel hwModel = amaltheaModel.getHwModel();

		assertNotNull("HW model is not loaded", hwModel);
	}

	@Test
	public void testHWProcessingUnitDefintions() {

		HWModel hwModel = amaltheaModel.getHwModel();

		assertNotNull("HW model is not loaded", hwModel);

		EList<HwDefinition> definitions = hwModel.getDefinitions();

		List<HwDefinition> processingUnitDefinitions = definitions.stream()
				.filter(obj -> obj instanceof ProcessingUnitDefinition).collect(Collectors.toList());

		assertEquals("AMALTHEA model file contains 2 ProcessingUnitDefinition ", 2, processingUnitDefinitions.size());

	}

	@Test
	public void testGetModulesFromHWModel() {

		List<ProcessingUnit> processingUnits = HardwareUtil.getModulesFromHwModel(ProcessingUnit.class, amaltheaModel);
		assertEquals("AMALTHEA model file contains 5 ProcessingUnits ", 5, processingUnits.size());

		List<Memory> memories = HardwareUtil.getModulesFromHwModel(Memory.class, amaltheaModel);
		assertEquals("AMALTHEA model file contains 3 Memories ", 3, memories.size());

		List<Cache> caches = HardwareUtil.getModulesFromHwModel(Cache.class, amaltheaModel);
		assertEquals("AMALTHEA model file contains 1 Cache ", 1, caches.size());

		List<ConnectionHandler> connectionHandlers = HardwareUtil.getModulesFromHwModel(ConnectionHandler.class,
				amaltheaModel);
		assertEquals("AMALTHEA model file contains 3 ConnectionHandlers ", 3, connectionHandlers.size());

	}

	@Test
	public void testGetModulesFromHWStructure() {

		List<ProcessingUnit> processingUnits = HardwareUtil.getModulesFromHWStructure(ProcessingUnit.class,
				amaltheaModel.getHwModel().getStructures().get(0).getStructures().get(0));
		assertEquals("AMALTHEA structure 1 contains 3 ProcessingUnits ", 3, processingUnits.size());

		List<Memory> memories = HardwareUtil.getModulesFromHWStructure(Memory.class,
				amaltheaModel.getHwModel().getStructures().get(0).getStructures().get(0));
		assertEquals("AMALTHEA structure contains 1 Memories ", 1, memories.size());

		List<Cache> caches = HardwareUtil.getModulesFromHWStructure(Cache.class,
				amaltheaModel.getHwModel().getStructures().get(0).getStructures().get(0));
		assertEquals("AMALTHEA structure contains 0 Cache ", 0, caches.size());

		List<ConnectionHandler> connectionHandlers = HardwareUtil.getModulesFromHWStructure(ConnectionHandler.class,
				amaltheaModel.getHwModel().getStructures().get(0).getStructures().get(0));
		assertEquals("AMALTHEA structure contains 0 ConnectionHandlers ", 0, connectionHandlers.size());

	}

	@Test
	public void testGetAllProcessingUnitsForProcessingUnitDefinition() {

		List<ProcessingUnit> processingUnits1 = HardwareUtil.getAllProcessingUnitsForProcessingUnitDefinition(
				amaltheaModel, (ProcessingUnitDefinition) amaltheaModel.getHwModel().getDefinitions().get(0));
		assertEquals("AMALTHEA model file contains 2 ProcessingUnit of the PuDef1 ", 2, processingUnits1.size());

		List<ProcessingUnit> processingUnits2 = HardwareUtil.getAllProcessingUnitsForProcessingUnitDefinition(
				amaltheaModel, (ProcessingUnitDefinition) amaltheaModel.getHwModel().getDefinitions().get(3));
		assertEquals("AMALTHEA model file contains 3 ProcessingUnit of the PuDef2 ", 3, processingUnits2.size());

	}

	@Test
	public void testGetMemoryAccessLatencies() {
		List<Memory> memories = HardwareUtil.getModulesFromHwModel(Memory.class, amaltheaModel);
		Map<Memory, Long> memoryLatencyMap = HardwareUtil.getMemoryAccessLatenciesCycles(amaltheaModel, TimeType.ACET);
		assertEquals("Number of memories in map is 3", 3, memoryLatencyMap.size());

		assertEquals("AccessLatency of Mem1_top1 is", 5, memoryLatencyMap.get(memories.get(0)).intValue());
		assertEquals("AccessLatency of Mem1_Lev3 is", 5, memoryLatencyMap.get(memories.get(1)).intValue());
		assertEquals("AccessLatency of Mem1_top2 is", 5, memoryLatencyMap.get(memories.get(2)).intValue());

	}

	@Test
	public void testGetMemoryAccessTimes() {
		List<Memory> memories = HardwareUtil.getModulesFromHwModel(Memory.class, amaltheaModel);
		Map<Memory, Time> memoryLatencyMap = HardwareUtil.getMemoryAccessLatencyTime(amaltheaModel, TimeType.ACET);
		assertEquals("Number of memories in map is 3", 3, memoryLatencyMap.size());

		assertEquals("AccessLatency of Mem1_top1 is", BigInteger.valueOf(25),
				memoryLatencyMap.get(memories.get(0)).getValue());
		assertEquals("AccessLatency of Mem1_top1 is", "ns", memoryLatencyMap.get(memories.get(0)).getUnit().toString());

		assertEquals("AccessLatency of Mem1_Lev3 is", BigInteger.valueOf(25),
				memoryLatencyMap.get(memories.get(1)).getValue());
		assertEquals("AccessLatency of Mem1_Lev3 is", "ns", memoryLatencyMap.get(memories.get(1)).getUnit().toString());

		assertEquals("AccessLatency of Mem1_top2 is", BigInteger.valueOf(10),
				memoryLatencyMap.get(memories.get(2)).getValue());
		assertEquals("AccessLatency of Mem1_top2 is", "ns", memoryLatencyMap.get(memories.get(2)).getUnit().toString());
	}

	@Test
	public void testGetAccessElementsToDestination() {
		List<Memory> memories = HardwareUtil.getModulesFromHwModel(Memory.class, amaltheaModel);

		List<HwAccessElement> accessElements1 = HardwareUtil.getAccessElementsToDestination(memories.get(0),
				amaltheaModel);
		assertEquals("AccessElements which refer to memory 1 are 4", 4, accessElements1.size());

		List<HwAccessElement> accessElements2 = HardwareUtil.getAccessElementsToDestination(memories.get(1),
				amaltheaModel);
		assertEquals("AccessElements which refer to memory 1 are 4", 4, accessElements2.size());

		List<HwAccessElement> accessElements3 = HardwareUtil.getAccessElementsToDestination(memories.get(2),
				amaltheaModel);
		assertEquals("AccessElements which refer to memory 1 are 3", 3, accessElements3.size());
	}

	@Test
	public void testcalculateLatencyPathTime() {
		List<ProcessingUnit> processingUnits = HardwareUtil.getModulesFromHwModel(ProcessingUnit.class, amaltheaModel);
		System.out.println("Pu name: " + processingUnits.get(3).getName());
		System.out.println(
				"Destination name: " + processingUnits.get(3).getAccessElements().get(2).getDestination().getName());
		Time latencyWriteACET = HardwareUtil.calculateLatencyPathTime(processingUnits.get(3).getAccessElements().get(1),
				TimeType.ACET, AccessDirection.WRITE);
		assertEquals("Write time ACET for PU_1_Lev2_2 equals 16", 16, latencyWriteACET.getValue().intValue());
		assertEquals("time unit is", "ns", latencyWriteACET.getUnit().toString());
		Time latencyWriteBCET = HardwareUtil.calculateLatencyPathTime(processingUnits.get(3).getAccessElements().get(1),
				TimeType.BCET, AccessDirection.WRITE);
		assertEquals("Write latency BCET for PU_1_Lev2_2 equals 16", 16, latencyWriteBCET.getValue().intValue());
		assertEquals("time unit is", "ns", latencyWriteBCET.getUnit().toString());
		Time latencyWriteWCET = HardwareUtil.calculateLatencyPathTime(processingUnits.get(3).getAccessElements().get(1),
				TimeType.WCET, AccessDirection.WRITE);
		assertEquals("Write latency WCET for PU_1_Lev2_2 equals 16", 16, latencyWriteWCET.getValue().intValue());
		assertEquals("time unit is", "ns", latencyWriteWCET.getUnit().toString());

		Time latencyReadACET = HardwareUtil.calculateLatencyPathTime(processingUnits.get(3).getAccessElements().get(1), TimeType.ACET, AccessDirection.READ);
		assertEquals("Read latency ACET for PU_1_Lev2_2 equals 56",56,latencyReadACET.getValue().intValue());
		assertEquals("time unit is", "ns",latencyReadACET.getUnit().toString());
		Time latencyReadBCET = HardwareUtil.calculateLatencyPathTime(processingUnits.get(3).getAccessElements().get(1), TimeType.BCET, AccessDirection.READ);
		assertEquals("Read latency BCET for PU_1_Lev2_2 equals 48",48,latencyReadBCET.getValue().intValue());
		assertEquals("time unit is", "ns",latencyReadBCET.getUnit().toString());
		Time latencyReadWCET = HardwareUtil.calculateLatencyPathTime(processingUnits.get(3).getAccessElements().get(1), TimeType.WCET, AccessDirection.READ);
		assertEquals("Read latency WCET for PU_1_Lev2_2 equals 64",64,latencyReadWCET.getValue().intValue());
		assertEquals("time unit is", "ns",latencyReadWCET.getUnit().toString());
	}

	@Test
	public void testCalculateHwAccesPathTime() {
		List<ProcessingUnit> processingUnits = HardwareUtil.getModulesFromHwModel(ProcessingUnit.class, amaltheaModel);
		System.out.println("Pu name: " + processingUnits.get(2).getName());
		System.out.println(
				"Destination name: " + processingUnits.get(2).getAccessElements().get(1).getDestination().getName());
		Time latencyWriteACET = HardwareUtil.calculateHwAccessPathTime(
				processingUnits.get(2).getAccessElements().get(1), TimeType.ACET, AccessDirection.WRITE);
		assertEquals("Hardware access path for write ACET from PU_1_Lev3 to Memory 1_top1 equals 21", 21,
				latencyWriteACET.getValue().intValue());
		assertEquals("time unit is", "ns", latencyWriteACET.getUnit().toString());
		Time latencyWriteBCET = HardwareUtil.calculateHwAccessPathTime(
				processingUnits.get(2).getAccessElements().get(1), TimeType.BCET, AccessDirection.WRITE);
		assertEquals("Hardware access path for write BCET from PU_1_Lev3 to Memory 1_top1 equals 21", 21,
				latencyWriteBCET.getValue().intValue());
		assertEquals("time unit is", "ns", latencyWriteBCET.getUnit().toString());
		Time latencyWriteWCET = HardwareUtil.calculateHwAccessPathTime(
				processingUnits.get(2).getAccessElements().get(1), TimeType.WCET, AccessDirection.WRITE);
		assertEquals("Hardware access path for write WCET from PU_1_Lev3 to Memory 1_top1 equals 21", 21,
				latencyWriteWCET.getValue().intValue());
		assertEquals("time unit is", "ns", latencyWriteWCET.getUnit().toString());

		Time latencyReadACET = HardwareUtil.calculateHwAccessPathTime(processingUnits.get(2).getAccessElements().get(1),
				TimeType.ACET, AccessDirection.READ);
		assertEquals("Hardware access path for read ACET from PU_1_Lev3 to Memory 1_top1 equals 36", 36,
				latencyReadACET.getValue().intValue());
		assertEquals("time unit is", "ns", latencyWriteACET.getUnit().toString());
	}

	@Test
	public void testGetMinDataRateOfHwAccessPath() {
		List<ProcessingUnit> processingUnits = HardwareUtil.getModulesFromHwModel(ProcessingUnit.class, amaltheaModel);

		DataRate dataRate = HardwareUtil
				.getMinDataRateOfHwAccessPath(processingUnits.get(4).getAccessElements().get(0).getAccessPath());
		assertEquals("Minimum data rate of path is 800 MiB/s ", 800, dataRate.getValue().intValue());
		assertEquals("Minimum data rate of path is 800 MiB/s ", "MiBPerSecond", dataRate.getUnit().toString());
	}

	@Test
	public void testGetAccessTimes() {
		List<ProcessingUnit> processingUnits = HardwareUtil.getModulesFromHwModel(ProcessingUnit.class, amaltheaModel);
		Map<ProcessingUnit, HashMap<HwDestination, Time>> readLatencyMapACET = HardwareUtil
				.getAccessTimes(amaltheaModel, TimeType.ACET, AccessDirection.READ);
		// Pu1_Lev2 --> Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 8 ns", 8, readLatencyMapACET.get(processingUnits.get(0))
				.get(processingUnits.get(0).getAccessElements().get(0).getDestination()).getValue().intValue());
		assertEquals("time unit is", "ns", readLatencyMapACET.get(processingUnits.get(0))
				.get(processingUnits.get(0).getAccessElements().get(0).getDestination()).getUnit().toString());
		// Pu1_Lev2 -->Mem1_top1
		assertEquals("Time to memory destination Mem1_top1 is 34 ns", 34, readLatencyMapACET.get(processingUnits.get(0))
				.get(processingUnits.get(0).getAccessElements().get(1).getDestination()).getValue().intValue());
		assertEquals("time unit is", "ns", readLatencyMapACET.get(processingUnits.get(0))
				.get(processingUnits.get(0).getAccessElements().get(0).getDestination()).getUnit().toString());

		// Pu2_Lev2 -->Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 8 ns", 8, readLatencyMapACET.get(processingUnits.get(1))
				.get(processingUnits.get(1).getAccessElements().get(0).getDestination()).getValue().intValue());
		// Pu2_Lev2 -->Mem1_top1
		assertEquals("Time to memory destination Mem1_top1 is 30 ns", 30, readLatencyMapACET.get(processingUnits.get(1))
				.get(processingUnits.get(1).getAccessElements().get(1).getDestination()).getValue().intValue());

		// Pu1_Lev3 --> Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 8 ns", 8, readLatencyMapACET.get(processingUnits.get(2))
				.get(processingUnits.get(2).getAccessElements().get(0).getDestination()).getValue().intValue());
		// Pu1_Lev3 --> Mem1_top1
		assertEquals("Time to memory destination Mem1_top1 is 36 ns", 36, readLatencyMapACET.get(processingUnits.get(2))
				.get(processingUnits.get(2).getAccessElements().get(1).getDestination()).getValue().intValue());
		// Pu1_Lev3 --> Mem1_top2
		assertEquals("Time to memory destination Mem1_top2 is 60 ns", 60, readLatencyMapACET.get(processingUnits.get(2))
				.get(processingUnits.get(2).getAccessElements().get(2).getDestination()).getValue().intValue());

		// Pu1_Lev2_2 -->Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 40 ns", 40, readLatencyMapACET.get(processingUnits.get(3))
				.get(processingUnits.get(3).getAccessElements().get(0).getDestination()).getValue().intValue());
		// Pu1_Lev2_2 -->Mem1_top1 (Distribution)

		assertEquals("Time to memory destination Mem1_top1 is 56 ns ",56, readLatencyMapACET.get(processingUnits.get(3)).get(processingUnits.get(3).getAccessElements().get(1).getDestination()).getValue().intValue());
		// Pu1_Lev2_2 -->Mem1_top2
		assertEquals("Time to memory destination Mem1_top2 is 12 ns", 12, readLatencyMapACET.get(processingUnits.get(3))
				.get(processingUnits.get(3).getAccessElements().get(2).getDestination()).getValue().intValue());

		Map<ProcessingUnit, HashMap<HwDestination, Time>> writeLatencyMapACET = HardwareUtil
				.getAccessTimes(amaltheaModel, TimeType.ACET, AccessDirection.WRITE);
		// Pu1_Lev2 --> Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 6 ns", 6, writeLatencyMapACET.get(processingUnits.get(0))
				.get(processingUnits.get(0).getAccessElements().get(0).getDestination()).getValue().intValue());
		assertEquals("time unit is", "ns", writeLatencyMapACET.get(processingUnits.get(0))
				.get(processingUnits.get(0).getAccessElements().get(0).getDestination()).getUnit().toString());
		// Pu1_Lev2 -->Mem1_top1
		assertEquals("Time to memory destination Mem1_top1 is 17 ns", 17,
				writeLatencyMapACET.get(processingUnits.get(0))
						.get(processingUnits.get(0).getAccessElements().get(1).getDestination()).getValue().intValue());
		assertEquals("time unit is", "ns", writeLatencyMapACET.get(processingUnits.get(0))
				.get(processingUnits.get(0).getAccessElements().get(0).getDestination()).getUnit().toString());

		// Pu2_Lev2 -->Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 6 ns", 6, writeLatencyMapACET.get(processingUnits.get(1))
				.get(processingUnits.get(1).getAccessElements().get(0).getDestination()).getValue().intValue());
		// Pu2_Lev2 -->Mem1_top1
		assertEquals("Time to memory destination Mem1_top1 is 15 ns", 15,
				writeLatencyMapACET.get(processingUnits.get(1))
						.get(processingUnits.get(1).getAccessElements().get(1).getDestination()).getValue().intValue());

		// Pu1_Lev3 --> Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 6 ns", 6, writeLatencyMapACET.get(processingUnits.get(2))
				.get(processingUnits.get(2).getAccessElements().get(0).getDestination()).getValue().intValue());
		// Pu1_Lev3 --> Mem1_top1
		assertEquals("Time to memory destination Mem1_top1 is 21 ns", 21,
				writeLatencyMapACET.get(processingUnits.get(2))
						.get(processingUnits.get(2).getAccessElements().get(1).getDestination()).getValue().intValue());
		// Pu1_Lev3 --> Mem1_top2
		assertEquals("Time to memory destination Mem1_top2 is 30 ns", 30,
				writeLatencyMapACET.get(processingUnits.get(2))
						.get(processingUnits.get(2).getAccessElements().get(2).getDestination()).getValue().intValue());

		// Pu1_Lev2_2 -->Mem1_Lev3
		assertEquals("Time to memory destination Mem1_lev3 is 20 ns", 20,
				writeLatencyMapACET.get(processingUnits.get(3))
						.get(processingUnits.get(3).getAccessElements().get(0).getDestination()).getValue().intValue());
		// Pu1_Lev2_2 -->Mem1_top1 (Distribution)
		assertEquals("Time to memory destination Mem1_top1 is 16 ns ", 16,
				writeLatencyMapACET.get(processingUnits.get(3))
						.get(processingUnits.get(3).getAccessElements().get(1).getDestination()).getValue().intValue());
		// Pu1_Lev2_2 -->Mem1_top2
		assertEquals("Time to memory destination Mem1_top2 is 0 ns", 0, writeLatencyMapACET.get(processingUnits.get(3))
				.get(processingUnits.get(3).getAccessElements().get(2).getDestination()).getValue().intValue());

		// test -->Mem1_top2 (Distribution) NOTE: no Write Latency specified
		assertEquals("Time to memory destination Mem1_top2 is 0 ns ", 0, writeLatencyMapACET.get(processingUnits.get(4))
				.get(processingUnits.get(4).getAccessElements().get(0).getDestination()).getValue().intValue());

		Map<ProcessingUnit, HashMap<HwDestination, Time>> writeLatencyMapBCET = HardwareUtil
				.getAccessTimes(amaltheaModel, TimeType.BCET, AccessDirection.WRITE);
		// test -->Mem1_top2 (Distribution) NOTE: no Write Latency specified works only
		// for ACET
		assertEquals("Time to memory destination Mem1_top2 is 0 ns ", 0, writeLatencyMapBCET.get(processingUnits.get(4))
				.get(processingUnits.get(4).getAccessElements().get(0).getDestination()).getValue().intValue());

		Map<ProcessingUnit, HashMap<HwDestination, Time>> readLatencyMapBCET = HardwareUtil
				.getAccessTimes(amaltheaModel, TimeType.BCET, AccessDirection.READ);
		// Pu1_Lev2_2 -->Mem1_top1 (Distribution)

		assertEquals("Time to memory destination Mem1_top1 is 48 ns ",48, readLatencyMapBCET.get(processingUnits.get(3)).get(processingUnits.get(3).getAccessElements().get(1).getDestination()).getValue().intValue());
		// test -->Mem1_top2 (Distribution)

		assertEquals("Time to memory destination Mem1_top2 is 60 ns ",60, readLatencyMapBCET.get(processingUnits.get(4)).get(processingUnits.get(4).getAccessElements().get(0).getDestination()).getValue().intValue());

		Map<ProcessingUnit, HashMap<HwDestination, Time>> readLatencyMapWCET = HardwareUtil
				.getAccessTimes(amaltheaModel, TimeType.WCET, AccessDirection.READ);
		// Pu1_Lev2_2 -->Mem1_top1 (Distribution)

		assertEquals("Time to memory destination Mem1_top1 is 64 ns ",64, readLatencyMapWCET.get(processingUnits.get(3)).get(processingUnits.get(3).getAccessElements().get(1).getDestination()).getValue().intValue());
		// test -->Mem1_top2 (Distribution)

		assertEquals("Time to memory destination Mem1_top2 is 140 ns ",140, readLatencyMapWCET.get(processingUnits.get(4)).get(processingUnits.get(4).getAccessElements().get(0).getDestination()).getValue().intValue());

	}

}
