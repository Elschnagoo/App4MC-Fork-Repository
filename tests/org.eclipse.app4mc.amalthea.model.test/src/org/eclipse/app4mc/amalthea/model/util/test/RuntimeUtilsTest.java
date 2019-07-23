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

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant;
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.util.DeploymentUtil;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.amalthea.models.RuntimeModels;
import org.eclipse.emf.common.util.EMap;
import org.junit.Before;
import org.junit.Test;

public class RuntimeUtilsTest {
	
	Amalthea amaltheaModel;
	List<ExecutionNeed> executionNeedsR1;
	List<ExecutionNeed> executionNeedsR2;
	List<ExecutionNeed> executionNeedsR3;
	
	DiscreteValueConstant  r1_instrConstant = null;
	DiscreteValueGaussDistribution r1_instrDeviation = null;
	DiscreteValueConstant r2_MAC_Operations = null;
	DiscreteValueConstant r1_MAC_Operations = null;
	DiscreteValueGaussDistribution r3_MAC_Operations = null;
	
	Runnable r1 = null;
	Runnable r2 = null;
	Runnable r3 = null;
	
	Task t1 = null;
	Task t2 = null;
	
	ProcessingUnitDefinition Pu1_def = null;
	ProcessingUnitDefinition Pu2_def = null;
	
	HwFeature featureIPC_12 = null;
	HwFeature featureIPC_08 = null;
	HwFeature featureMAC_Operations = null;
	
	HwFeatureCategory instructions = null;
	HwFeatureCategory mac_operations = null;
	
	ProcessingUnit core1 = null;
	ProcessingUnit core2 = null;
	
	
	@Before
	public void initalizeModel() {
		amaltheaModel = RuntimeModels.createModel1();
		Set<Runnable> runnableCollector = AmaltheaIndex.getElements(amaltheaModel, "r1", Runnable.class);
		assertNotNull("R1 not found", runnableCollector.iterator().next());
		r1 = runnableCollector.iterator().next();
		
		runnableCollector = AmaltheaIndex.getElements(amaltheaModel.getSwModel(), "r2", Runnable.class);
		assertNotNull("R2 not found", runnableCollector.iterator().next());
		r2 = runnableCollector.iterator().next();
		
		runnableCollector = AmaltheaIndex.getElements(amaltheaModel.getSwModel(), "r3", Runnable.class);
		assertNotNull("R3 not found", runnableCollector.iterator().next());
		r3 = runnableCollector.iterator().next();
		
		Set<Task> taskCollector = AmaltheaIndex.getElements(amaltheaModel.getSwModel(), "t1", Task.class);
		t1 = taskCollector.iterator().next();
		assertNotNull("T1 not found", taskCollector.iterator().next());
		
		taskCollector = AmaltheaIndex.getElements(amaltheaModel.getSwModel(), "t2", Task.class);
		t2 = taskCollector.iterator().next();
		assertNotNull("T2 not found", taskCollector.iterator().next());

		
		executionNeedsR1 = new ArrayList<ExecutionNeed>();
		executionNeedsR2 = new ArrayList<ExecutionNeed>();
		executionNeedsR3 = new ArrayList<ExecutionNeed>();
		
		for (CallGraphItem rItem : r1.getCallGraph().getItems()) {
			if (rItem instanceof ExecutionNeed) {
				executionNeedsR1.add((ExecutionNeed)rItem);
				
				EMap<String, IDiscreteValueDeviation> needs = ((ExecutionNeed)rItem).getNeeds();//.get("Instructions");
				for (String key : needs.keySet()) {
					if (key.equals("Instructions")) {
						if (needs.get(key) instanceof DiscreteValueConstant) {
							r1_instrConstant = (DiscreteValueConstant)needs.get(key);
						}
						if (needs.get(key) instanceof DiscreteValueGaussDistribution) {
							r1_instrDeviation = (DiscreteValueGaussDistribution)needs.get(key);
						}
					}
					if (key.equals("MAC_Operations")) {
						if (needs.get(key) instanceof DiscreteValueConstant) {
							r1_MAC_Operations = (DiscreteValueConstant)needs.get(key);
						}
					}
				}	
			}
		}
		for (CallGraphItem rItem : r2.getCallGraph().getItems()) {
			if (rItem instanceof ExecutionNeed) {
				executionNeedsR2.add((ExecutionNeed)rItem);
				
				EMap<String, IDiscreteValueDeviation> needs = ((ExecutionNeed)rItem).getNeeds();//.get("Instructions");
				for (String key : needs.keySet()) {
					if (key.equals("MAC_Operations")) {
						if (needs.get(key) instanceof DiscreteValueConstant) {
							r2_MAC_Operations = (DiscreteValueConstant)needs.get(key);
						}
					}
				}	
			}
		}
		for (CallGraphItem rItem : r3.getCallGraph().getItems()) {
			if (rItem instanceof ExecutionNeed) {
				executionNeedsR3.add((ExecutionNeed)rItem);
				EMap<String, IDiscreteValueDeviation> needs = ((ExecutionNeed)rItem).getNeeds();//.get("Instructions");
				for (String key : needs.keySet()) {
					if (key.equals("MAC_Operations")) {
						if (needs.get(key) instanceof DiscreteValueGaussDistribution) {
							r3_MAC_Operations = (DiscreteValueGaussDistribution)needs.get(key);
						}
					}
				}	
			}
//			executionNeedsR3.addAll(executionNeedsR2);
		}
	

		Set<ProcessingUnitDefinition> puCollector = AmaltheaIndex.getElements(amaltheaModel.getHwModel(), "Pu1_def", ProcessingUnitDefinition.class );
		assertNotNull("Pu1 not found", puCollector.iterator().next());
		Pu1_def = puCollector.iterator().next();
		
		puCollector = AmaltheaIndex.getElements(amaltheaModel.getHwModel(), "Pu2_def", ProcessingUnitDefinition.class );
		assertNotNull("Pu2 not found", puCollector.iterator().next());
		Pu2_def = puCollector.iterator().next();
		
			
		Set<HwFeature> featureCollector = AmaltheaIndex.getElements(amaltheaModel, "IPC_1.2", HwFeature.class);
		assertNotNull("Feature IPC_1.2 not found ", featureCollector.iterator().next());
		featureIPC_12 = featureCollector.iterator().next();
		
		featureCollector = AmaltheaIndex.getElements(amaltheaModel, "IPC_0.8", HwFeature.class);
		assertNotNull("Feature IPC_0.8 not found ", featureCollector.iterator().next());
		featureIPC_08 = featureCollector.iterator().next();
		
		featureCollector = AmaltheaIndex.getElements(amaltheaModel, "MacUnit_factor", HwFeature.class);
		assertNotNull("Feature MacUnit_factor not found ", featureCollector.iterator().next());
		featureMAC_Operations = featureCollector.iterator().next();

		Set<ProcessingUnit> coreCollector = AmaltheaIndex.getElements(amaltheaModel.getHwModel(), "core1", ProcessingUnit.class);
		assertNotNull("Core1 not found ", coreCollector.iterator().next());
		core1 = coreCollector.iterator().next();
		
		coreCollector = AmaltheaIndex.getElements(amaltheaModel.getHwModel(), "core2", ProcessingUnit.class);
		assertNotNull("Core2 not found ", coreCollector.iterator().next());
		core2 = coreCollector.iterator().next();
		
		Set<HwFeatureCategory> catCollector = AmaltheaIndex.getElements(amaltheaModel.getHwModel(), "Instructions", HwFeatureCategory.class);
		assertNotNull("Instruction Catogory not found ", catCollector.iterator().next());
		instructions = catCollector.iterator().next();
//		
//		catCollector = AmaltheaIndex.getElements(amaltheaModel.getHwModel(), "MAC_Operations", HwFeatureCategory.class);
//		assertNotNull("MAC_Operations Catogory not found ", catCollector.iterator().next());
//		mac_operations = catCollector.iterator().next();
		
	}

	@Test
	public void testModelExistance() {

		SWModel swModel = amaltheaModel.getSwModel();
		assertNotNull("SW model is not loaded", swModel);
		
		HWModel hwModel = amaltheaModel.getHwModel();
		assertNotNull("HW model is not loaded", hwModel);
		
		OSModel osModel = amaltheaModel.getOsModel();
		assertNotNull("OS model is not loaded", osModel);
		
		MappingModel MappingModel = amaltheaModel.getMappingModel();
		assertNotNull("Mapping model is not loaded", MappingModel);

						
	}
	
	
	@Test
	public void testRunnableItemsCollection() {
		
		
		//Test search for excecutionNeed items
		assert(SoftwareUtil.getExecutionNeeds(r1, null).containsAll(executionNeedsR1));
		assert(SoftwareUtil.getExecutionNeeds(r2, null).containsAll(executionNeedsR2));
		List<ExecutionNeed> tmp = SoftwareUtil.getExecutionNeeds(r3, null);
		assert(SoftwareUtil.getExecutionNeeds(r3, null).containsAll(executionNeedsR3));
		
		
		
	}
	
	
	@Test
	public void testExecutionTimeForRunnableFunction() {
		

		Time r1Bcet = FactoryUtil.createTime(22200000, "PS");
		Time r1Acet = FactoryUtil.createTime(22800000, "PS");
		Time r1Wcet = FactoryUtil.createTime(23400000, "PS");
		
		Time r2Time = FactoryUtil.createTime(20000000, "PS");

		Time r3Bcet = FactoryUtil.createTime(2700000, "PS");
		Time r3Acet = FactoryUtil.createTime(5600000, "PS");
		Time r3Wcet = FactoryUtil.createTime(8500000, "PS");
		
		assert(RuntimeUtil.getExecutionTimeForRunnable(r1, core1, null, RuntimeUtil.TimeType.BCET).compareTo((r1Bcet))==0);
		assert(RuntimeUtil.getExecutionTimeForRunnable(r1, core1, null, RuntimeUtil.TimeType.ACET).compareTo((r1Acet))==0);
		assert(RuntimeUtil.getExecutionTimeForRunnable(r1, core1, null, RuntimeUtil.TimeType.WCET).compareTo((r1Wcet))==0);
		
		assert(RuntimeUtil.getExecutionTimeForRunnable(r2, core2, null, RuntimeUtil.TimeType.BCET).compareTo((r2Time))==0);
		assert(RuntimeUtil.getExecutionTimeForRunnable(r2, core2, null, RuntimeUtil.TimeType.ACET).compareTo((r2Time))==0);
		assert(RuntimeUtil.getExecutionTimeForRunnable(r2, core2, null, RuntimeUtil.TimeType.WCET).compareTo((r2Time))==0);
		
		assert(RuntimeUtil.getExecutionTimeForRunnable(r3, core2, null, RuntimeUtil.TimeType.BCET).compareTo((r3Bcet))==0);
		assert(RuntimeUtil.getExecutionTimeForRunnable(r3, core2, null, RuntimeUtil.TimeType.ACET).compareTo((r3Acet))==0);
		assert(RuntimeUtil.getExecutionTimeForRunnable(r3, core2, null, RuntimeUtil.TimeType.WCET).compareTo((r3Wcet))==0);
	}

	

	
}
	
