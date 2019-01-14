/**
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.DataPlatformMapping;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwFeatureType;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.StructureType;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.CommonElementsBuilder;
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder;
import org.eclipse.app4mc.amalthea.model.builder.DatatypeBuilder;
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder;
import org.eclipse.app4mc.amalthea.model.builder.MappingBuilder;
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Examples {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private CommonElementsBuilder b2 = new CommonElementsBuilder();
  
  @Extension
  private SoftwareBuilder b3 = new SoftwareBuilder();
  
  @Extension
  private DatatypeBuilder b4 = new DatatypeBuilder();
  
  @Extension
  private OperatingSystemBuilder b5 = new OperatingSystemBuilder();
  
  @Extension
  private HardwareBuilder b6 = new HardwareBuilder();
  
  @Extension
  private ConstraintsBuilder b7 = new ConstraintsBuilder();
  
  @Extension
  private MappingBuilder b8 = new MappingBuilder();
  
  public static void main(final String[] args) {
    final Amalthea model1 = new Examples().model1();
    AmaltheaWriter.writeToFileNamed(model1, "C:/temp/ExampleModel-gen.amxmi");
  }
  
  public static Amalthea runtimeModel1() {
    return new Examples().model1();
  }
  
  public Amalthea model1() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<CommonElements> _function_1 = (CommonElements it_1) -> {
        final Procedure1<Tag> _function_2 = (Tag it_2) -> {
          it_2.setName("Optional");
          this.b1.<Tag>_reg(it_2, "tag1");
        };
        this.b2.tag(it_1, _function_2);
        final Procedure1<Tag> _function_3 = (Tag it_2) -> {
          it_2.setName("Standard");
          this.b1.<Tag>_reg(it_2, "tag2");
        };
        this.b2.tag(it_1, _function_3);
        final Procedure1<CoreClassifier> _function_4 = (CoreClassifier it_2) -> {
          it_2.setName("LockStep");
          this.b1.<CoreClassifier>_reg(it_2, "cc1");
        };
        this.b2.coreClassifier(it_1, _function_4);
        final Procedure1<CoreClassifier> _function_5 = (CoreClassifier it_2) -> {
          it_2.setName("FPU");
          this.b1.<CoreClassifier>_reg(it_2, "cc2");
        };
        this.b2.coreClassifier(it_1, _function_5);
        final Procedure1<MemoryClassifier> _function_6 = (MemoryClassifier it_2) -> {
          it_2.setName("DDR3");
          this.b1.<MemoryClassifier>_reg(it_2, "mc1");
        };
        this.b2.memoryClassifier(it_1, _function_6);
      };
      this.b1.commonElements(it, _function_1);
      final Procedure1<HWModel> _function_2 = (HWModel it_1) -> {
        final Procedure1<HwFeatureCategory> _function_3 = (HwFeatureCategory it_2) -> {
          it_2.setFeatureType(HwFeatureType.PERFORMANCE);
          final Procedure1<HwFeature> _function_4 = (HwFeature it_3) -> {
            it_3.setName("IPC_1.2");
            it_3.setValue(1.2);
          };
          this.b6.feature(it_2, _function_4);
          final Procedure1<HwFeature> _function_5 = (HwFeature it_3) -> {
            it_3.setName("IPC_0.8");
            it_3.setValue(0.8);
          };
          this.b6.feature(it_2, _function_5);
        };
        this.b6.featureCategory(it_1, _function_3);
        final Procedure1<HwFeatureCategory> _function_4 = (HwFeatureCategory it_2) -> {
          it_2.setName("MAC_Operations");
          final Procedure1<HwFeature> _function_5 = (HwFeature it_3) -> {
            it_3.setName("MacUnit_factor");
            it_3.setValue(5.0);
          };
          this.b6.feature(it_2, _function_5);
        };
        this.b6.featureCategory(it_1, _function_4);
        final Procedure1<ProcessingUnitDefinition> _function_5 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("Pu1_def");
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "IPC_1.2");
          _features.add(__find);
          EList<HwFeature> _features_1 = it_2.getFeatures();
          HwFeature __find_1 = this.b1.<HwFeature>_find(it_2, HwFeature.class, "MacUnit_factor");
          _features_1.add(__find_1);
        };
        this.b6.definition_ProcessingUnit(it_1, _function_5);
        final Procedure1<ProcessingUnitDefinition> _function_6 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("Pu2_def");
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "IPC_0.8");
          _features.add(__find);
        };
        this.b6.definition_ProcessingUnit(it_1, _function_6);
        final Procedure1<FrequencyDomain> _function_7 = (FrequencyDomain it_2) -> {
          it_2.setName("freq_Domain1");
          it_2.setClockGating(false);
          it_2.setDefaultValue(FactoryUtil.createFrequency(500, FrequencyUnit.MHZ));
        };
        this.b6.domain_Frequency(it_1, _function_7);
        final Procedure1<HwStructure> _function_8 = (HwStructure it_2) -> {
          it_2.setName("SoC");
          it_2.setStructureType(StructureType.SO_C);
          final Procedure1<ProcessingUnit> _function_9 = (ProcessingUnit it_3) -> {
            it_3.setName("core1");
            it_3.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_3, FrequencyDomain.class, "freq_Domain1"));
            it_3.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_3, ProcessingUnitDefinition.class, "Pu1_def"));
          };
          this.b6.module_ProcessingUnit(it_2, _function_9);
          final Procedure1<ProcessingUnit> _function_10 = (ProcessingUnit it_3) -> {
            it_3.setName("core2");
            it_3.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_3, FrequencyDomain.class, "freq_Domain1"));
            it_3.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_3, ProcessingUnitDefinition.class, "Pu2_def"));
          };
          this.b6.module_ProcessingUnit(it_2, _function_10);
        };
        this.b6.structure(it_1, _function_8);
      };
      this.b1.hardwareModel(it, _function_2);
      final Procedure1<SWModel> _function_3 = (SWModel it_1) -> {
        final Procedure1<BaseTypeDefinition> _function_4 = (BaseTypeDefinition it_2) -> {
          it_2.setName("Boolean");
          it_2.setSize(FactoryUtil.createDataSize(8, DataSizeUnit.BIT));
          final Procedure1<DataPlatformMapping> _function_5 = (DataPlatformMapping it_3) -> {
            it_3.setPlatformName("AR");
            it_3.setPlatformType("Boolean");
          };
          this.b4.platform(it_2, _function_5);
          final Procedure1<DataPlatformMapping> _function_6 = (DataPlatformMapping it_3) -> {
            it_3.setPlatformName("C");
            it_3.setPlatformType("bool");
          };
          this.b4.platform(it_2, _function_6);
        };
        this.b4.typeDefinition_BaseType(it_1, _function_4);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_5 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r1");
          final Procedure1<Ticks> _function_6 = (Ticks it_3) -> {
            this.b3.defaultConstant(it_3, 500);
          };
          this.b3.ticks(it_2, _function_6);
        };
        this.b3.runnable(it_1, _function_5);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_6 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r2");
          final Procedure1<Ticks> _function_7 = (Ticks it_3) -> {
            this.b3.defaultConstant(it_3, 2000);
          };
          this.b3.ticks(it_2, _function_7);
        };
        this.b3.runnable(it_1, _function_6);
        final Procedure1<Task> _function_7 = (Task it_2) -> {
          it_2.setName("t1");
          final Procedure1<CallSequence> _function_8 = (CallSequence it_3) -> {
            final Procedure1<TaskRunnableCall> _function_9 = (TaskRunnableCall it_4) -> {
              it_4.setRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_4, org.eclipse.app4mc.amalthea.model.Runnable.class, "r1"));
            };
            this.b3.runnableCall(it_3, _function_9);
          };
          this.b3.callSequence(it_2, _function_8);
        };
        this.b3.task(it_1, _function_7);
        final Procedure1<Task> _function_8 = (Task it_2) -> {
          it_2.setName("t2");
          final Procedure1<CallSequence> _function_9 = (CallSequence it_3) -> {
            final Procedure1<TaskRunnableCall> _function_10 = (TaskRunnableCall it_4) -> {
              it_4.setRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_4, org.eclipse.app4mc.amalthea.model.Runnable.class, "r2"));
            };
            this.b3.runnableCall(it_3, _function_10);
          };
          this.b3.callSequence(it_2, _function_9);
        };
        this.b3.task(it_1, _function_8);
      };
      this.b1.softwareModel(it, _function_3);
      final Procedure1<OSModel> _function_4 = (OSModel it_1) -> {
        final Procedure1<OperatingSystem> _function_5 = (OperatingSystem it_2) -> {
          it_2.setName("Os1");
          final Procedure1<TaskScheduler> _function_6 = (TaskScheduler it_3) -> {
            it_3.setName("Scheduler1");
          };
          this.b5.taskScheduler(it_2, _function_6);
          final Procedure1<TaskScheduler> _function_7 = (TaskScheduler it_3) -> {
            it_3.setName("Scheduler2");
          };
          this.b5.taskScheduler(it_2, _function_7);
        };
        this.b5.operatingSystem(it_1, _function_5);
      };
      this.b1.osModel(it, _function_4);
      final Procedure1<ConstraintsModel> _function_5 = (ConstraintsModel it_1) -> {
        final Procedure1<RunnableRequirement> _function_6 = (RunnableRequirement it_2) -> {
          it_2.setRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_2, org.eclipse.app4mc.amalthea.model.Runnable.class, "r1"));
          final Procedure1<TimeRequirementLimit> _function_7 = (TimeRequirementLimit it_3) -> {
            it_3.setMetric(TimeMetric.RESPONSE_TIME);
            it_3.setLimitType(LimitType.UPPER_LIMIT);
            it_3.setLimitValue(FactoryUtil.createTime("1 ms"));
          };
          this.b7.limit_Time(it_2, _function_7);
        };
        this.b7.requirement_Runnable(it_1, _function_6);
        this.b7.deadline_Process(it_1, this.b1.<Task>_find(it_1, Task.class, "t2"), FactoryUtil.createTime("10 ms"));
      };
      this.b1.constraintsModel(it, _function_5);
      final Procedure1<MappingModel> _function_6 = (MappingModel it_1) -> {
        final Procedure1<SchedulerAllocation> _function_7 = (SchedulerAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler2"));
          EList<ProcessingUnit> _responsibility = it_2.getResponsibility();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core2");
          _responsibility.add(__find);
          it_2.setExecutingPU(this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core2"));
        };
        this.b8.schedulerAllocation(it_1, _function_7);
        final Procedure1<SchedulerAllocation> _function_8 = (SchedulerAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler1"));
          EList<ProcessingUnit> _responsibility = it_2.getResponsibility();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core1");
          _responsibility.add(__find);
          it_2.setExecutingPU(this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core1"));
        };
        this.b8.schedulerAllocation(it_1, _function_8);
        final Procedure1<RunnableAllocation> _function_9 = (RunnableAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler1"));
          it_2.setEntity(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_2, org.eclipse.app4mc.amalthea.model.Runnable.class, "r1"));
        };
        this.b8.runnableAllocation(it_1, _function_9);
        final Procedure1<RunnableAllocation> _function_10 = (RunnableAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler2"));
          it_2.setEntity(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_2, org.eclipse.app4mc.amalthea.model.Runnable.class, "r2"));
        };
        this.b8.runnableAllocation(it_1, _function_10);
        final Procedure1<TaskAllocation> _function_11 = (TaskAllocation it_2) -> {
          it_2.setTask(this.b1.<Task>_find(it_2, Task.class, "t1"));
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler1"));
          EList<ProcessingUnit> _affinity = it_2.getAffinity();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core1");
          _affinity.add(__find);
        };
        this.b8.taskAllocation(it_1, _function_11);
        final Procedure1<TaskAllocation> _function_12 = (TaskAllocation it_2) -> {
          it_2.setTask(this.b1.<Task>_find(it_2, Task.class, "t2"));
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "Scheduler2"));
          EList<ProcessingUnit> _affinity = it_2.getAffinity();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "core2");
          _affinity.add(__find);
        };
        this.b8.taskAllocation(it_1, _function_12);
      };
      this.b1.mappingModel(it, _function_6);
    };
    final Amalthea model = this.b1.amalthea(_function);
    return model;
  }
}
