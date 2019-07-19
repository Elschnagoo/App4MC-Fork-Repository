/**
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
 */
package org.eclipse.app4mc.amalthea.validations.test;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder;
import org.eclipse.app4mc.amalthea.model.builder.MappingBuilder;
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.amalthea.validations.MappingProfile;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class MappingModelTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private SoftwareBuilder b2 = new SoftwareBuilder();
  
  @Extension
  private OperatingSystemBuilder b3 = new OperatingSystemBuilder();
  
  @Extension
  private HardwareBuilder b4 = new HardwareBuilder();
  
  @Extension
  private MappingBuilder b5 = new MappingBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(Collections.<Class<? extends IProfile>>unmodifiableList(CollectionLiterals.<Class<? extends IProfile>>newArrayList(MappingProfile.class, EMFProfile.class)));
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  public Amalthea createValidTestModel() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<Task> _function_2 = (Task it_2) -> {
          it_2.setName("TestTask");
        };
        this.b2.task(it_1, _function_2);
      };
      this.b1.softwareModel(it, _function_1);
      final Procedure1<HWModel> _function_2 = (HWModel it_1) -> {
        final Procedure1<ProcessingUnitDefinition> _function_3 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("TestCoreDef");
        };
        this.b4.definition_ProcessingUnit(it_1, _function_3);
        final Procedure1<HwStructure> _function_4 = (HwStructure it_2) -> {
          it_2.setName("System");
          final Procedure1<ProcessingUnit> _function_5 = (ProcessingUnit it_3) -> {
            it_3.setName("TestCore");
            it_3.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_3, ProcessingUnitDefinition.class, "TestCoreDef"));
          };
          this.b4.module_ProcessingUnit(it_2, _function_5);
        };
        this.b4.structure(it_1, _function_4);
      };
      this.b1.hardwareModel(it, _function_2);
      final Procedure1<OSModel> _function_3 = (OSModel it_1) -> {
        final Procedure1<OperatingSystem> _function_4 = (OperatingSystem it_2) -> {
          it_2.setName("TestOS");
          final Procedure1<TaskScheduler> _function_5 = (TaskScheduler it_3) -> {
            it_3.setName("TestScheduler");
          };
          this.b3.taskScheduler(it_2, _function_5);
        };
        this.b3.operatingSystem(it_1, _function_4);
      };
      this.b1.osModel(it, _function_3);
      final Procedure1<MappingModel> _function_4 = (MappingModel it_1) -> {
        final Procedure1<TaskAllocation> _function_5 = (TaskAllocation it_2) -> {
          it_2.setTask(this.b1.<Task>_find(it_2, Task.class, "TestTask"));
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "TestScheduler"));
        };
        this.b5.taskAllocation(it_1, _function_5);
        final Procedure1<SchedulerAllocation> _function_6 = (SchedulerAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "TestScheduler"));
          EList<ProcessingUnit> _responsibility = it_2.getResponsibility();
          ProcessingUnit __find = this.b1.<ProcessingUnit>_find(it_2, ProcessingUnit.class, "TestCore");
          _responsibility.add(__find);
        };
        this.b5.schedulerAllocation(it_1, _function_6);
      };
      this.b1.mappingModel(it, _function_4);
    };
    return this.b1.amalthea(_function);
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping() {
    final Amalthea model = this.createValidTestModel();
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function), _function_1));
    Assert.assertTrue(result.isEmpty());
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_UnmappedTasks() {
    final Amalthea model = this.createValidTestModel();
    final Procedure1<Task> _function = (Task it) -> {
      it.setName("TestTask_left");
    };
    this.b2.task(model.getSwModel(), _function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.WARNING));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Unmapped task found: \"TestTask_left\""));
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_UnmappedScheduler() {
    final Amalthea model = this.createValidTestModel();
    final Procedure1<TaskScheduler> _function = (TaskScheduler it) -> {
      it.setName("TestScheduler_left");
    };
    this.b3.taskScheduler(IterableExtensions.<OperatingSystem>head(model.getOsModel().getOperatingSystems()), _function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.WARNING));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Scheduler not responsible for any core: \"TestScheduler_left\""));
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_MissingSchedulerInTaskAlloc() {
    final Amalthea model = this.createValidTestModel();
    TaskAllocation _head = IterableExtensions.<TaskAllocation>head(model.getMappingModel().getTaskAllocation());
    _head.setScheduler(null);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function), _function_1));
    Assert.assertTrue(result.contains("The required feature \'scheduler\' of \'TaskAllocation\' must be set"));
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_MissingTaskInTaskAlloc() {
    final Amalthea model = this.createValidTestModel();
    TaskAllocation _head = IterableExtensions.<TaskAllocation>head(model.getMappingModel().getTaskAllocation());
    _head.setTask(null);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> errors = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function), _function_1));
    final Function1<ValidationDiagnostic, Boolean> _function_2 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.WARNING));
    };
    final Function1<ValidationDiagnostic, String> _function_3 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> warnings = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_2), _function_3));
    Assert.assertTrue(errors.contains("The required feature \'task\' of \'TaskAllocation\' must be set"));
    Assert.assertTrue(warnings.contains("Unmapped task found: \"TestTask\""));
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_MissingTaskAndSchedulerInTaskAlloc() {
    final Amalthea model = this.createValidTestModel();
    TaskAllocation _head = IterableExtensions.<TaskAllocation>head(model.getMappingModel().getTaskAllocation());
    _head.setScheduler(null);
    TaskAllocation _head_1 = IterableExtensions.<TaskAllocation>head(model.getMappingModel().getTaskAllocation());
    _head_1.setTask(null);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> errors = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function), _function_1));
    final Function1<ValidationDiagnostic, Boolean> _function_2 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.WARNING));
    };
    final Function1<ValidationDiagnostic, String> _function_3 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> warnings = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_2), _function_3));
    Assert.assertTrue(errors.contains("The required feature \'scheduler\' of \'TaskAllocation\' must be set"));
    Assert.assertTrue(errors.contains("The required feature \'task\' of \'TaskAllocation\' must be set"));
    Assert.assertTrue(warnings.contains("Unmapped task found: \"TestTask\""));
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_MissingSchedulerInSchedulerAlloc() {
    final Amalthea model = this.createValidTestModel();
    SchedulerAllocation _head = IterableExtensions.<SchedulerAllocation>head(model.getMappingModel().getSchedulerAllocation());
    _head.setScheduler(null);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> errors = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function), _function_1));
    final Function1<ValidationDiagnostic, Boolean> _function_2 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.WARNING));
    };
    final Function1<ValidationDiagnostic, String> _function_3 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> warnings = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_2), _function_3));
    Assert.assertTrue(errors.contains("The required feature \'scheduler\' of \'SchedulerAllocation\' must be set"));
    Assert.assertTrue(warnings.contains("Scheduler not responsible for any core: \"TestScheduler\""));
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_MissingCoreInSchedulerAlloc() {
    final Amalthea model = this.createValidTestModel();
    IterableExtensions.<SchedulerAllocation>head(model.getMappingModel().getSchedulerAllocation()).getResponsibility().clear();
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function), _function_1));
    Assert.assertTrue(result.contains("The feature \'responsibility\' of \'SchedulerAllocation\' with 0 values must have at least 1 values"));
  }
  
  @Test
  public void testTaskToSchedulerToCoreMapping_MissingSchedulerAndCoreInSchedulerAlloc() {
    final Amalthea model = this.createValidTestModel();
    SchedulerAllocation _head = IterableExtensions.<SchedulerAllocation>head(model.getMappingModel().getSchedulerAllocation());
    _head.setScheduler(null);
    IterableExtensions.<SchedulerAllocation>head(model.getMappingModel().getSchedulerAllocation()).getResponsibility().clear();
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> errors = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function), _function_1));
    final Function1<ValidationDiagnostic, Boolean> _function_2 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.WARNING));
    };
    final Function1<ValidationDiagnostic, String> _function_3 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> warnings = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_2), _function_3));
    Assert.assertTrue(errors.contains("The required feature \'scheduler\' of \'SchedulerAllocation\' must be set"));
    Assert.assertTrue(errors.contains("The feature \'responsibility\' of \'SchedulerAllocation\' with 0 values must have at least 1 values"));
    Assert.assertTrue(warnings.contains("Scheduler not responsible for any core: \"TestScheduler\""));
  }
}
