/**
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 */
package org.eclipse.app4mc.amalthea.models;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwFeatureType;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.StructureType;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder;
import org.eclipse.app4mc.amalthea.model.builder.InstructionsBuilder;
import org.eclipse.app4mc.amalthea.model.builder.MappingBuilder;
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class RuntimeModels {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private HardwareBuilder b2 = new HardwareBuilder();
  
  @Extension
  private SoftwareBuilder b3 = new SoftwareBuilder();
  
  @Extension
  private InstructionsBuilder b4 = new InstructionsBuilder();
  
  @Extension
  private OperatingSystemBuilder b5 = new OperatingSystemBuilder();
  
  @Extension
  private MappingBuilder b6 = new MappingBuilder();
  
  public static void main(final String[] args) {
    final Amalthea model1 = new RuntimeModels().model1();
    AmaltheaWriter.writeToFileNamed(model1, "test-data/RuntimeUtilTestModel-gen.amxmi");
  }
  
  public static Amalthea runtimeModel1() {
    return new RuntimeModels().model1();
  }
  
  public Amalthea model1() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<HWModel> _function_1 = (HWModel it_1) -> {
        final Procedure1<HwFeatureCategory> _function_2 = (HwFeatureCategory it_2) -> {
          it_2.setFeatureType(HwFeatureType.PERFORMANCE);
          final Procedure1<HwFeature> _function_3 = (HwFeature it_3) -> {
            it_3.setName("IPC_1.2");
            it_3.setValue(1.2);
          };
          this.b2.feature(it_2, _function_3);
          final Procedure1<HwFeature> _function_4 = (HwFeature it_3) -> {
            it_3.setName("IPC_0.8");
            it_3.setValue(0.8);
          };
          this.b2.feature(it_2, _function_4);
        };
        this.b4.featureCategory_Instructions(it_1, _function_2);
        final Procedure1<HwFeatureCategory> _function_3 = (HwFeatureCategory it_2) -> {
          it_2.setName("MAC_Operations");
          final Procedure1<HwFeature> _function_4 = (HwFeature it_3) -> {
            it_3.setName("MacUnit_factor");
            it_3.setValue(5.0);
          };
          this.b2.feature(it_2, _function_4);
        };
        this.b2.featureCategory(it_1, _function_3);
        final Procedure1<ProcessingUnitDefinition> _function_4 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("Pu1_def");
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "IPC_1.2");
          _features.add(__find);
          EList<HwFeature> _features_1 = it_2.getFeatures();
          HwFeature __find_1 = this.b1.<HwFeature>_find(it_2, HwFeature.class, "MacUnit_factor");
          _features_1.add(__find_1);
        };
        this.b2.definition_ProcessingUnit(it_1, _function_4);
        final Procedure1<ProcessingUnitDefinition> _function_5 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("Pu2_def");
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "IPC_0.8");
          _features.add(__find);
        };
        this.b2.definition_ProcessingUnit(it_1, _function_5);
        final Procedure1<FrequencyDomain> _function_6 = (FrequencyDomain it_2) -> {
          it_2.setName("freq_Domain1");
          it_2.setClockGating(false);
          it_2.setDefaultValue(FactoryUtil.createFrequency(500, FrequencyUnit.MHZ));
        };
        this.b2.domain_Frequency(it_1, _function_6);
        final Procedure1<HwStructure> _function_7 = (HwStructure it_2) -> {
          it_2.setName("SoC");
          it_2.setStructureType(StructureType.SO_C);
          final Procedure1<ProcessingUnit> _function_8 = (ProcessingUnit it_3) -> {
            it_3.setName("core1");
            it_3.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_3, FrequencyDomain.class, "freq_Domain1"));
            it_3.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_3, ProcessingUnitDefinition.class, "Pu1_def"));
          };
          this.b2.module_ProcessingUnit(it_2, _function_8);
          final Procedure1<ProcessingUnit> _function_9 = (ProcessingUnit it_3) -> {
            it_3.setName("core2");
            it_3.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_3, FrequencyDomain.class, "freq_Domain1"));
            it_3.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_3, ProcessingUnitDefinition.class, "Pu2_def"));
          };
          this.b2.module_ProcessingUnit(it_2, _function_9);
        };
        this.b2.structure(it_1, _function_7);
      };
      this.b1.hardwareModel(it, _function_1);
      final Procedure1<SWModel> _function_2 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r1");
          final Procedure1<ExecutionNeed> _function_4 = (ExecutionNeed it_3) -> {
            this.b4.default_Instructions(it_3, 500);
            this.b4.extended_Instructions(it_3, this.b1.<ProcessingUnitDefinition>_find(it_3, ProcessingUnitDefinition.class, "Pu2_def"), 800);
          };
          this.b3.execNeed(it_2, _function_4);
          final Procedure1<ExecutionNeed> _function_5 = (ExecutionNeed it_3) -> {
            this.b4.default_Instructions(it_3, FactoryUtil.createDeviation(FactoryUtil.createGaussDistribution(500, 2), 250, 750));
          };
          this.b3.execNeed(it_2, _function_5);
          final Procedure1<ExecutionNeed> _function_6 = (ExecutionNeed it_3) -> {
            this.b3.default_Need(it_3, "MAC_Operations", FactoryUtil.createNeedConstant(2000));
          };
          this.b3.execNeed(it_2, _function_6);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r2");
          final Procedure1<ExecutionNeed> _function_5 = (ExecutionNeed it_3) -> {
            this.b3.default_Need(it_3, "MAC_Operations", FactoryUtil.createNeedConstant(2000));
          };
          this.b3.execNeed(it_2, _function_5);
        };
        this.b3.runnable(it_1, _function_4);
        final Procedure1<Task> _function_5 = (Task it_2) -> {
          it_2.setName("t1");
          final Procedure1<CallSequence> _function_6 = (CallSequence it_3) -> {
            final Procedure1<TaskRunnableCall> _function_7 = (TaskRunnableCall it_4) -> {
              it_4.setRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_4, org.eclipse.app4mc.amalthea.model.Runnable.class, "r1"));
            };
            this.b3.runnableCall(it_3, _function_7);
          };
          this.b3.callSequence(it_2, _function_6);
        };
        this.b3.task(it_1, _function_5);
        final Procedure1<Task> _function_6 = (Task it_2) -> {
          it_2.setName("t2");
          final Procedure1<CallSequence> _function_7 = (CallSequence it_3) -> {
            final Procedure1<TaskRunnableCall> _function_8 = (TaskRunnableCall it_4) -> {
              it_4.setRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_4, org.eclipse.app4mc.amalthea.model.Runnable.class, "r2"));
            };
            this.b3.runnableCall(it_3, _function_8);
          };
          this.b3.callSequence(it_2, _function_7);
        };
        this.b3.task(it_1, _function_6);
      };
      this.b1.softwareModel(it, _function_2);
      final Procedure1<OSModel> _function_3 = (OSModel it_1) -> {
        final Procedure1<OperatingSystem> _function_4 = (OperatingSystem it_2) -> {
          it_2.setName("Os1");
          final Procedure1<TaskScheduler> _function_5 = (TaskScheduler it_3) -> {
            it_3.setName("Scheduler1");
          };
          this.b5.taskScheduler(it_2, _function_5);
          final Procedure1<TaskScheduler> _function_6 = (TaskScheduler it_3) -> {
            it_3.setName("Scheduler2");
          };
          this.b5.taskScheduler(it_2, _function_6);
        };
        this.b5.operatingSystem(it_1, _function_4);
      };
      this.b1.osModel(it, _function_3);
      final Procedure1<MappingModel> _function_4 = (MappingModel it_1) -> {
        final Procedure1<SchedulerAllocation> _function_5 = (SchedulerAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler2"));
          EList<ProcessingUnit> _responsibility = it_2.getResponsibility();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core2");
          _responsibility.add(__find);
          it_2.setExecutingPU(this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core2"));
        };
        this.b6.schedulerAllocation(it_1, _function_5);
        final Procedure1<SchedulerAllocation> _function_6 = (SchedulerAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler1"));
          EList<ProcessingUnit> _responsibility = it_2.getResponsibility();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core1");
          _responsibility.add(__find);
          it_2.setExecutingPU(this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core1"));
        };
        this.b6.schedulerAllocation(it_1, _function_6);
        final Procedure1<RunnableAllocation> _function_7 = (RunnableAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler1"));
          it_2.setEntity(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_2, org.eclipse.app4mc.amalthea.model.Runnable.class, "r1"));
        };
        this.b6.runnableAllocation(it_1, _function_7);
        final Procedure1<RunnableAllocation> _function_8 = (RunnableAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler2"));
          it_2.setEntity(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_2, org.eclipse.app4mc.amalthea.model.Runnable.class, "r2"));
        };
        this.b6.runnableAllocation(it_1, _function_8);
        final Procedure1<TaskAllocation> _function_9 = (TaskAllocation it_2) -> {
          it_2.setTask(this.b1.<Task>_find(it_2, Task.class, "t1"));
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler1"));
          EList<ProcessingUnit> _affinity = it_2.getAffinity();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core1");
          _affinity.add(__find);
        };
        this.b6.taskAllocation(it_1, _function_9);
        final Procedure1<TaskAllocation> _function_10 = (TaskAllocation it_2) -> {
          it_2.setTask(this.b1.<Task>_find(it_2, Task.class, "t2"));
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler2"));
          EList<ProcessingUnit> _affinity = it_2.getAffinity();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core2");
          _affinity.add(__find);
        };
        this.b6.taskAllocation(it_1, _function_10);
      };
      this.b1.mappingModel(it, _function_4);
    };
    final Amalthea model = this.b1.amalthea(_function);
    return model;
  }
}
