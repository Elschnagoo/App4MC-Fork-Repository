package org.eclipse.app4mc.amalthea.model.util.test;

import static org.junit.Assert.assertNotNull;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.Need;
import org.eclipse.app4mc.amalthea.model.NeedConstant;
import org.eclipse.app4mc.amalthea.model.NeedDeviation;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaLoader;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.TimeType;
import org.eclipse.app4mc.amalthea.model.util.SearchElementsUtility;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.amalthea.model.util.TimeUtil;
import org.junit.Before;
import org.junit.Test;

public class RuntimeUtilsTest {
	
	Amalthea amaltheaModel;
	List<ExecutionNeed> executionNeedsR1;
	List<ExecutionNeed> executionNeedsR2;
	
	NeedConstant r1_instrConstant = null;
	NeedDeviation r1_instrDeviation = null;
	NeedConstant r1_instrPu2Extended = null;
	NeedConstant r2_MAC_Operations = null;
	NeedConstant r1_MAC_Operations = null;
	Runnable r1 = null;
	Runnable r2 = null;
	
	Task t1 = null;
	Task t2 = null;
	
	ProcessingUnitDefinition Pu1_def = null;
	ProcessingUnitDefinition Pu2_def = null;
	
	HwFeature featureIPC_12 = null;
	HwFeature featureIPC_08 = null;
	HwFeature featureMAC_Operations = null;
	
	
	@Before
	public void initalizeModel() {
		amaltheaModel = AmaltheaLoader.loadFromFileNamed("test-data/RuntimeUtilsTestModel.amxmi");
		
		executionNeedsR1 = new ArrayList<ExecutionNeed>();
		executionNeedsR2 = new ArrayList<ExecutionNeed>();
		
		r1 = (Runnable) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "r1", Runnable.class).get(0);
		r2 = (Runnable) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "r2", Runnable.class ).get(0);
		
		t1 = (Task) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "t1", Task.class).get(0);
		t2 = (Task) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "t2", Task.class ).get(0);
		
		Pu1_def = (ProcessingUnitDefinition) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "Pu1_def", ProcessingUnitDefinition.class ).get(0);
		Pu2_def = (ProcessingUnitDefinition) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "Pu2_def", ProcessingUnitDefinition.class ).get(0);
		
		featureIPC_12 = (HwFeature) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "IPC_1.2", HwFeature.class ).get(0);
		featureIPC_08 = (HwFeature) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "IPC_0.8", HwFeature.class ).get(0);
		featureMAC_Operations = (HwFeature) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "MacUnit_factor", HwFeature.class ).get(0);

		
		
		for (RunnableItem rItem : r1.getRunnableItems()) {
			if (rItem instanceof ExecutionNeed) {
				executionNeedsR1.add((ExecutionNeed)rItem);
				Need need = ((ExecutionNeed)rItem).getDefault().get("Instructions");
				if (need instanceof NeedConstant) {
					r1_instrConstant = (NeedConstant)need;
					r1_instrPu2Extended = (NeedConstant) ((ExecutionNeed)rItem).getExtended().get(Pu2_def).get("Instructions");
				}
				if (need instanceof NeedDeviation) {
					r1_instrDeviation = (NeedDeviation)need;
				}
				need = ((ExecutionNeed)rItem).getDefault().get("MAC_Operations");
				if (need instanceof NeedConstant) {
					r1_MAC_Operations = (NeedConstant)need;
				}
			}
		}
		for (RunnableItem rItem : r2.getRunnableItems()) {
			if (rItem instanceof ExecutionNeed) {
				executionNeedsR2.add((ExecutionNeed)rItem);
				Need need = ((ExecutionNeed)rItem).getDefault().get("MAC_Operations");
				if (need instanceof NeedConstant) {
					r2_MAC_Operations = (NeedConstant)need;
				}
				

			}
		}

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

		
		assertNotNull("Runnable r1 missing ",r1);
		assertNotNull("Runnable r2 missing ",r2);
		assertNotNull("ProcessUnitDefinition Pu1_def missing ",Pu1_def);
		assertNotNull("ProcessUnitDefinition Pu2_def missing ",Pu2_def);
		
		assertNotNull("HwFeature IPC_1.2 missing ",featureIPC_12);
		assertNotNull("HwFeature IPC_0.8 missing ",featureIPC_08);
		assertNotNull("HwFeature MacUnit_factor missing ",featureMAC_Operations);
		
		
	}
	
	
	@Test
	public void testRunnableItemsCollection() {
		
		
		//Test search for excecutionNeed items
		assert(SoftwareUtil.getExecutionNeedsList(r1, null).containsAll(executionNeedsR1));
		assert(SoftwareUtil.getExecutionNeedsList(r2, null).containsAll(executionNeedsR2));
		
		
		//testList PU2
		List<HwFeature> featureTest1= new ArrayList<HwFeature>();
		featureTest1.add(featureIPC_08);
		//testList PU1
		List<HwFeature> featureTest2= new ArrayList<HwFeature>();
		featureTest2.add(featureIPC_12);
		featureTest2.add(featureMAC_Operations);
		//testList empty
		List<HwFeature> featureTest3= new ArrayList<HwFeature>();
		
		//test for emty feature or puDefs
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, null, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu1_def, null, null).isEmpty());
		
		//test combinations of runnable, puDef and feature selections
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu1_def, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu1_def, featureTest2, null)).get(0).getValue().equals(r1_instrConstant);
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu1_def, featureTest2, null)).get(1).getValue().equals(r1_instrDeviation);
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu1_def, featureTest2, null)).get(2).getValue().equals(r1_MAC_Operations);
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu1_def, featureTest2, null)).size() == 3;
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu1_def, featureTest3, null).isEmpty());

		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu2_def, featureTest1, null)).get(0).getValue().equals(r1_instrPu2Extended);
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu2_def, featureTest1, null)).get(1).getValue().equals(r1_instrDeviation);
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu2_def, featureTest1, null)).size() == 2;
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu2_def, featureTest2, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(r1, Pu2_def, featureTest3, null).isEmpty());
		
		
		assert(SoftwareUtil.getExecutionNeedEntryList(r2, Pu1_def, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(r2, Pu1_def, featureTest2, null).get(0).getValue().equals(r2_MAC_Operations));
		assert(SoftwareUtil.getExecutionNeedEntryList(r2, Pu1_def, featureTest2, null).size() == 1);
		assert(SoftwareUtil.getExecutionNeedEntryList(r2, Pu1_def, featureTest3, null).isEmpty());
		
		assert(SoftwareUtil.getExecutionNeedEntryList(r2, Pu2_def, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(r2, Pu2_def, featureTest2, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(r2, Pu2_def, featureTest3, null).isEmpty());
		
		
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, null, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu1_def, null, null).isEmpty());
		
		//test combinations of task, puDef and feature selections
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu1_def, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu1_def, featureTest2, null).get(0).getValue().equals(r1_instrConstant));
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu1_def, featureTest2, null).get(1).getValue().equals(r1_instrDeviation));
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu1_def, featureTest2, null).get(2).getValue().equals(r1_MAC_Operations));
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu1_def, featureTest2, null).size() ==3);
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu1_def, featureTest3, null).isEmpty());

		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu2_def, featureTest1, null).get(0).getValue().equals(r1_instrPu2Extended));
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu2_def, featureTest1, null).get(1).getValue().equals(r1_instrDeviation));
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu2_def, featureTest1, null).size() == 2);
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu2_def, featureTest2, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(t1, Pu2_def, featureTest3, null).isEmpty());
		
		
		assert(SoftwareUtil.getExecutionNeedEntryList(t2, Pu1_def, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(t2, Pu1_def, featureTest2, null).get(0).getValue().equals(r2_MAC_Operations));
		assert(SoftwareUtil.getExecutionNeedEntryList(t2, Pu1_def, featureTest2, null).size() == 1);
		assert(SoftwareUtil.getExecutionNeedEntryList(t2, Pu1_def, featureTest3, null).isEmpty());
		
		assert(SoftwareUtil.getExecutionNeedEntryList(t2, Pu2_def, featureTest1, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(t2, Pu2_def, featureTest2, null).isEmpty());
		assert(SoftwareUtil.getExecutionNeedEntryList(t2, Pu2_def, featureTest3, null).isEmpty());


	}
	
	
	@Test
	public void testExecutionNeedValueCountsFunctions() {

		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.BCET, Pu1_def, featureIPC_08, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.ACET, Pu1_def, featureIPC_08, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.WCET, Pu1_def, featureIPC_08, null).longValue() == 0l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.BCET, Pu1_def, featureIPC_12, null).longValue() == 750l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.ACET, Pu1_def, featureIPC_12, null).longValue() == 1000l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.WCET, Pu1_def, featureIPC_12, null).longValue() == 1250l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.BCET, Pu1_def, featureMAC_Operations, null).longValue() == 2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.ACET, Pu1_def, featureMAC_Operations, null).longValue() == 2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.WCET, Pu1_def, featureMAC_Operations, null).longValue() == 2000l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.BCET, Pu2_def, featureIPC_08, null).longValue() == 1050);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.ACET, Pu2_def, featureIPC_08, null).longValue() == 1300);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.WCET, Pu2_def, featureIPC_08, null).longValue() == 1550l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.BCET, Pu2_def, featureIPC_12, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.ACET, Pu2_def, featureIPC_12, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.WCET, Pu2_def, featureIPC_12, null).longValue() == 0l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.BCET, Pu2_def, featureMAC_Operations, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.ACET, Pu2_def, featureMAC_Operations, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r1, TimeType.WCET, Pu2_def, featureMAC_Operations, null).longValue() == 0l);
		
		
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.BCET, Pu1_def, featureIPC_08, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.ACET, Pu1_def, featureIPC_08, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.WCET, Pu1_def, featureIPC_08, null).longValue() == 0l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.BCET, Pu1_def, featureIPC_12, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.ACET, Pu1_def, featureIPC_12, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.WCET, Pu1_def, featureIPC_12, null).longValue() == 0l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.BCET, Pu1_def, featureMAC_Operations, null).longValue() == 2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.ACET, Pu1_def, featureMAC_Operations, null).longValue() == 2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.WCET, Pu1_def, featureMAC_Operations, null).longValue() == 2000l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.BCET, Pu2_def, featureIPC_08, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.ACET, Pu2_def, featureIPC_08, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.WCET, Pu2_def, featureIPC_08, null).longValue() == 0l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.BCET, Pu2_def, featureIPC_12, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.ACET, Pu2_def, featureIPC_12, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.WCET, Pu2_def, featureIPC_12, null).longValue() == 0l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.BCET, Pu2_def, featureMAC_Operations, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.ACET, Pu2_def, featureMAC_Operations, null).longValue() == 0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForRunnable(r2, TimeType.WCET, Pu2_def, featureMAC_Operations, null).longValue() == 0l);
		
		
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureIPC_08, null).size() == 2);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureIPC_08, null).get(Pu1_def) == null);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureIPC_08, null).get(Pu2_def) == 800l);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureIPC_08, null).get(null) == 750);
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureIPC_08, null).size() == 2);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureIPC_08, null).get(Pu1_def) == null);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureIPC_08, null).get(Pu2_def) == 800l);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureIPC_08, null).get(null) == 1000l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureIPC_08, null).size() == 2);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureIPC_08, null).get(Pu1_def) == null);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureIPC_08, null).get(Pu2_def) == 800l);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureIPC_08, null).get(null) == 1250l);
		

		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureIPC_12, null).size() == 1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureIPC_12, null).get(null) == 750l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureIPC_12, null).size() == 1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureIPC_12, null).get(null) ==1000l);
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureIPC_12, null).size() == 1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureIPC_12, null).get(null) == 1250l);

		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureMAC_Operations, null).size() == 1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.BCET, featureMAC_Operations, null).get(null) ==2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureMAC_Operations, null).size() == 1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.ACET, featureMAC_Operations, null).get(null) ==2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureMAC_Operations, null).size() == 1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r1, TimeType.WCET, featureMAC_Operations, null).get(null) ==2000l);
		
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.BCET, featureIPC_08, null).size() == 0);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.ACET, featureIPC_08, null).size() == 0);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.WCET, featureIPC_08, null).size() == 0);
		
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.BCET, featureIPC_12, null).size() == 0);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.ACET, featureIPC_12, null).size() == 0);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.WCET, featureIPC_12, null).size() == 0);
		
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.BCET, featureMAC_Operations, null).size() == 1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.BCET, featureMAC_Operations, null).get(null) == 2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.ACET, featureMAC_Operations, null).size() ==  1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.ACET, featureMAC_Operations, null).get(null) ==  2000l);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.WCET, featureMAC_Operations, null).size() ==  1);
		assert(RuntimeUtil.getExecutionNeedValueCountExtendedForRunnable(r2, TimeType.WCET, featureMAC_Operations, null).get(null) ==  2000l);

	}
	
	@Test
	public void testExecutionTimeFunctions() {
		
		//testList PU2
		List<HwFeature> featureTest1= new ArrayList<HwFeature>();
		featureTest1.add(featureIPC_08);
		//testList PU1
		List<HwFeature> featureTest2= new ArrayList<HwFeature>();
		featureTest2.add(featureIPC_12);
		featureTest2.add(featureMAC_Operations);
		//testList empty
		List<HwFeature> featureTest3= new ArrayList<HwFeature>();
		
		Time time;		
		ProcessingUnit core1 = (ProcessingUnit) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "core1", ProcessingUnit.class).get(0);
		ProcessingUnit core2 = (ProcessingUnit) SearchElementsUtility.getElementsBasedOnName(amaltheaModel, "core2", ProcessingUnit.class).get(0);
		
		time = RuntimeUtil.getExecutionTimeForExecutionNeedValueCount(1000l, core1, featureIPC_08, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0);
		
		time = RuntimeUtil.getExecutionTimeForExecutionNeedValueCount(1000l, core1, featureIPC_12, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 1666666l);
		
		time = RuntimeUtil.getExecutionTimeForExecutionNeedValueCount(1000l, core1, featureMAC_Operations, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 400000l);
		
		
		time = RuntimeUtil.getExecutionTimeForExecutionNeedValueCount(1000l, core2, featureIPC_08, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2500000);
		
		time = RuntimeUtil.getExecutionTimeForExecutionNeedValueCount(1000l, core2, featureIPC_12, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0);
		
		time = RuntimeUtil.getExecutionTimeForExecutionNeedValueCount(1000l, core2, featureMAC_Operations, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		
		time.setValue(BigInteger.valueOf(2500000l));
		assert(RuntimeUtil.getExecutionNeedValueCountForTime(core1, time, featureIPC_08).getValue() ==0l);
		assert(RuntimeUtil.getExecutionNeedValueCountForTime(core2, time, featureIPC_08).getValue() ==1000l);
		
		
		time.setValue(BigInteger.valueOf(1666667l));
		assert(RuntimeUtil.getExecutionNeedValueCountForTime(core1, time, featureIPC_12).getValue() ==1000l);
		assert(RuntimeUtil.getExecutionNeedValueCountForTime(core2, time, featureIPC_12).getValue() ==0l);
		
	
		time.setValue(BigInteger.valueOf(400000l));
		assert(RuntimeUtil.getExecutionNeedValueCountForTime(core1, time, featureMAC_Operations).getValue() ==1000l);
		assert(RuntimeUtil.getExecutionNeedValueCountForTime(core2, time, featureMAC_Operations).getValue() ==0l);
		
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.BCET, core1, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.ACET, core1, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.WCET, core1, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.BCET, core1, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2050000l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.ACET, core1, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2466666l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.WCET, core1, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2883333l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.BCET, core1, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.ACET, core1, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.WCET, core1, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.BCET, core2, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2625000l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.ACET, core2, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 3250000l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.WCET, core2, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 3875000l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.BCET, core2, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.ACET, core2, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.WCET, core2, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.BCET, core2, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.ACET, core2, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r1, TimeType.WCET, core2, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		
		

		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.BCET, core1, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.ACET, core1, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.WCET, core1, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.BCET, core1, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 800000l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.ACET, core1, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 800000l);
	
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.WCET, core1, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 800000l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.BCET, core1, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.ACET, core1, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.WCET, core1, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);

		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.BCET, core2, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.ACET, core2, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.WCET, core2, featureTest1, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.BCET, core2, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.ACET, core2, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.WCET, core2, featureTest2, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.BCET, core2, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.ACET, core2, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);
		
		time = RuntimeUtil.getExecutionTimeForRunnable(r2, TimeType.WCET, core2, featureTest3, null);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 0l);




		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.BCET, featureIPC_08, null).size() == 1);
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.BCET, featureIPC_08, null).get(core1) == null);
		time = RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.BCET, featureIPC_08, null).get(core2);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2000000l);
		
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.ACET, featureIPC_08, null).size() == 1);
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.ACET, featureIPC_08, null).get(core1) == null);
		time = RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.ACET, featureIPC_08, null).get(core2);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2000000l);
		
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.WCET, featureIPC_08, null).size() == 1);
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.WCET, featureIPC_08, null).get(core1) == null);
		time = RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.WCET, featureIPC_08, null).get(core2);
		time = TimeUtil.convertToTimeUnit(time, TimeUnit.PS);
		assert(time.getValue().longValue() == 2000000l);
		
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.ACET, featureIPC_12, null).size() ==0);
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r1, TimeType.ACET, featureMAC_Operations, null).size() ==0);
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r2, TimeType.ACET, featureIPC_08, null).size() ==0);
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r2, TimeType.ACET, featureIPC_12, null).size() ==0);
		assert(RuntimeUtil.getExecutionTimeExtendedForRunnable(amaltheaModel, r2, TimeType.ACET, featureMAC_Operations, null).size() ==0);
		
//TODO:		all task related test -- but they call the basic functions anyway.
	}
}
	
