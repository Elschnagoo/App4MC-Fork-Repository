/**
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 */
package org.eclipse.app4mc.amalthea.validation.ta.test;

import com.google.common.base.Objects;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint;
import org.eclipse.app4mc.amalthea.model.EventSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimingConstraint;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder;
import org.eclipse.app4mc.amalthea.model.builder.MappingBuilder;
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TAConstraintsModelValidatorTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private ConstraintsBuilder b2 = new ConstraintsBuilder();
  
  @Extension
  private SoftwareBuilder b3 = new SoftwareBuilder();
  
  @Extension
  private OperatingSystemBuilder b4 = new OperatingSystemBuilder();
  
  @Extension
  private MappingBuilder b5 = new MappingBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(TimingArchitectsProfile.class);
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  public DataAgeConstraint createDAC(final String name, final Time lower, final Time upper) {
    DataAgeConstraint _xblockexpression = null;
    {
      final DataAgeConstraint dac = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
      dac.setName(name);
      final DataAgeTime dat = AmaltheaFactory.eINSTANCE.createDataAgeTime();
      dat.setMinimumTime(lower);
      dat.setMaximumTime(upper);
      dac.setDataAge(dat);
      _xblockexpression = dac;
    }
    return _xblockexpression;
  }
  
  public DelayConstraint createDC(final String name, final Time lower, final Time upper) {
    DelayConstraint _xblockexpression = null;
    {
      final DelayConstraint dc = AmaltheaFactory.eINSTANCE.createDelayConstraint();
      dc.setName(name);
      dc.setLower(lower);
      dc.setUpper(upper);
      _xblockexpression = dc;
    }
    return _xblockexpression;
  }
  
  public EventChainLatencyConstraint createECLC(final String name, final Time lower, final Time upper) {
    EventChainLatencyConstraint _xblockexpression = null;
    {
      final EventChainLatencyConstraint eclc = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
      eclc.setName(name);
      eclc.setMinimum(lower);
      eclc.setMaximum(upper);
      _xblockexpression = eclc;
    }
    return _xblockexpression;
  }
  
  public RepetitionConstraint createRC(final String name, final Time lower, final Time upper, final Time jitter, final Time period) {
    RepetitionConstraint _xblockexpression = null;
    {
      final RepetitionConstraint rc = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
      rc.setName(name);
      rc.setLower(lower);
      rc.setUpper(upper);
      rc.setJitter(jitter);
      rc.setPeriod(period);
      _xblockexpression = rc;
    }
    return _xblockexpression;
  }
  
  @Test
  public void test_TAConstraintsDataAgeTime() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<DataAgeConstraint> _dataAgeConstraints = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC = this.createDAC("dac_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"));
        _dataAgeConstraints.add(_createDAC);
        EList<DataAgeConstraint> _dataAgeConstraints_1 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_1 = this.createDAC("dac_min", FactoryUtil.createTime((-1), "ms"), null);
        _dataAgeConstraints_1.add(_createDAC_1);
        EList<DataAgeConstraint> _dataAgeConstraints_2 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_2 = this.createDAC("dac_max", null, FactoryUtil.createTime((-1), "ms"));
        _dataAgeConstraints_2.add(_createDAC_2);
        EList<DataAgeConstraint> _dataAgeConstraints_3 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_3 = this.createDAC("dac_maxmin", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"));
        _dataAgeConstraints_3.add(_createDAC_3);
        EList<DataAgeConstraint> _dataAgeConstraints_4 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_4 = this.createDAC("dac_maximin", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"));
        _dataAgeConstraints_4.add(_createDAC_4);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("The minimum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_min\")"));
    Assert.assertTrue(result.contains("The maximum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_max\")"));
    Assert.assertTrue(result.contains("The minimum time must not be negative (-2 ms < 0, in Data Age Constraint \"dac_maxmin\")"));
    Assert.assertTrue(result.contains("The maximum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_maxmin\")"));
    Assert.assertTrue(result.contains("The maximum time must not be negative (-1 ms < 0, in Data Age Constraint \"dac_maximin\")"));
    Assert.assertTrue(result.contains("The minimum time is greater than the maximum time (0 ms > -1 ms, in Data Age Constraint \"dac_maximin\")"));
    Assert.assertFalse(result.contains("The minimum time must not be negative (4 ms < 0, in Data Age Constraint \"dac_ok\")"));
    Assert.assertFalse(result.contains("The maximum time must not be negative (10 ms < 0, in Data Age Constraint \"dac_ok\")"));
    Assert.assertFalse(result.contains("The minimum time greater than the maximum time (4 ms > 10 ms, in Data Age Constraint \"dac_ok\")"));
  }
  
  @Test
  public void test_TAConstraintsDelayConstraint() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        DelayConstraint _createDC = this.createDC("dc_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"));
        _timingConstraints.add(_createDC);
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        DelayConstraint _createDC_1 = this.createDC("dc_lower", FactoryUtil.createTime((-1), "ms"), null);
        _timingConstraints_1.add(_createDC_1);
        EList<TimingConstraint> _timingConstraints_2 = it_1.getTimingConstraints();
        DelayConstraint _createDC_2 = this.createDC("dc_upper", null, FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_2.add(_createDC_2);
        EList<TimingConstraint> _timingConstraints_3 = it_1.getTimingConstraints();
        DelayConstraint _createDC_3 = this.createDC("dc_upperlower", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_3.add(_createDC_3);
        EList<TimingConstraint> _timingConstraints_4 = it_1.getTimingConstraints();
        DelayConstraint _createDC_4 = this.createDC("dc_upperbelower", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_4.add(_createDC_4);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("The lower bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_lower\")"));
    Assert.assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_upper\")"));
    Assert.assertTrue(result.contains("The lower bound must not be negative (-2 ms < 0, in Delay Constraint \"dc_upperlower\")"));
    Assert.assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_upperlower\")"));
    Assert.assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Delay Constraint \"dc_upperbelower\")"));
    Assert.assertTrue(result.contains("The lower bound is greater than the upper (0 ms > -1 ms, in Delay Constraint \"dc_upperbelower\")"));
    Assert.assertFalse(result.contains("The lower bound must not be negative (4 ms < 0, in Delay Constraint \"dc_ok\")"));
    Assert.assertFalse(result.contains("The upper bound must not be negative (10 ms < 0, in Delay Constraint \"dc_ok\")"));
    Assert.assertFalse(result.contains("The lower bound greater than the upper (4 ms > 10 ms, in Delay Constraint \"dc_ok\")"));
  }
  
  @Test
  public void test_TAConstraintsECLConstraint() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC = this.createECLC("eclc_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"));
        _timingConstraints.add(_createECLC);
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_1 = this.createECLC("eclc_lower", FactoryUtil.createTime((-1), "ms"), null);
        _timingConstraints_1.add(_createECLC_1);
        EList<TimingConstraint> _timingConstraints_2 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_2 = this.createECLC("eclc_upper", null, FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_2.add(_createECLC_2);
        EList<TimingConstraint> _timingConstraints_3 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_3 = this.createECLC("eclc_upperlower", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_3.add(_createECLC_3);
        EList<TimingConstraint> _timingConstraints_4 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_4 = this.createECLC("eclc_upperbelower", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_4.add(_createECLC_4);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("The minimum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_lower\")"));
    Assert.assertTrue(result.contains("The maximum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_upper\")"));
    Assert.assertTrue(result.contains("The minimum must not be negative (-2 ms < 0, in Event Chain Latency Constraint \"eclc_upperlower\")"));
    Assert.assertTrue(result.contains("The maximum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_upperlower\")"));
    Assert.assertTrue(result.contains("The maximum must not be negative (-1 ms < 0, in Event Chain Latency Constraint \"eclc_upperbelower\")"));
    Assert.assertTrue(result.contains("The minimum is greater than the maximum (0 ms > -1 ms, in Event Chain Latency Constraint \"eclc_upperbelower\")"));
    Assert.assertFalse(result.contains("The minimum must not be negative (4 ms < 0, in Event Chain Latency Constraint \"eclc_ok\")"));
    Assert.assertFalse(result.contains("The maximum must not be negative (10 ms < 0, in Event Chain Latency Constraint \"eclc_ok\")"));
    Assert.assertFalse(result.contains("The minimum greater than the upper (4 ms > 10 ms, in Event Chain Latency Constraint \"eclc_ok\")"));
  }
  
  @Test
  public void test_TAConstraintsEDFTaskMustHaveDeadline() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<Task> _function_2 = (Task it_2) -> {
          it_2.setName("t_ok");
        };
        this.b3.task(it_1, _function_2);
        final Procedure1<Task> _function_3 = (Task it_2) -> {
          it_2.setName("t_noDead");
        };
        this.b3.task(it_1, _function_3);
      };
      this.b1.softwareModel(it, _function_1);
      final Procedure1<OSModel> _function_2 = (OSModel it_1) -> {
        final Procedure1<OperatingSystem> _function_3 = (OperatingSystem it_2) -> {
          it_2.setName("os");
          final Procedure1<TaskScheduler> _function_4 = (TaskScheduler it_3) -> {
            it_3.setName("ts");
            it_3.setSchedulingAlgorithm(AmaltheaFactory.eINSTANCE.createEarliestDeadlineFirst());
          };
          this.b4.taskScheduler(it_2, _function_4);
        };
        this.b4.operatingSystem(it_1, _function_3);
      };
      this.b1.osModel(it, _function_2);
      final Procedure1<MappingModel> _function_3 = (MappingModel it_1) -> {
        final Procedure1<TaskAllocation> _function_4 = (TaskAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "ts"));
          it_2.setTask(this.b1.<Task>_find(it_2, Task.class, "t_ok"));
        };
        this.b5.taskAllocation(it_1, _function_4);
        final Procedure1<TaskAllocation> _function_5 = (TaskAllocation it_2) -> {
          it_2.setScheduler(this.b1.<TaskScheduler>_find(it_2, TaskScheduler.class, "ts"));
          it_2.setTask(this.b1.<Task>_find(it_2, Task.class, "t_noDead"));
        };
        this.b5.taskAllocation(it_1, _function_5);
      };
      this.b1.mappingModel(it, _function_3);
      final Procedure1<ConstraintsModel> _function_4 = (ConstraintsModel it_1) -> {
        this.b2.deadline_Process(it_1, this.b1.<Task>_find(it_1, Task.class, "t_ok"), FactoryUtil.createTime(10, "ms"));
      };
      this.b1.constraintsModel(it, _function_4);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("There is no deadline ProcessRequirement for Task \"t_noDead\", since it is scheduled by an Earliest Deadline First scheduler a deadline must be specified."));
    Assert.assertFalse(result.contains("There is no deadline ProcessRequirement for Task \"t_ok\", since it is scheduled by an Earliest Deadline First scheduler a deadline must be specified."));
  }
  
  @Test
  public void test_TAConstraintsRepetitionConstraint() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        RepetitionConstraint _createRC = this.createRC("rc_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(1, "ms"), FactoryUtil.createTime(50, "ms"));
        _timingConstraints.add(_createRC);
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_1 = this.createRC("rc_lower", FactoryUtil.createTime((-1), "ms"), null, null, null);
        _timingConstraints_1.add(_createRC_1);
        EList<TimingConstraint> _timingConstraints_2 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_2 = this.createRC("rc_upper", null, FactoryUtil.createTime((-1), "ms"), null, null);
        _timingConstraints_2.add(_createRC_2);
        EList<TimingConstraint> _timingConstraints_3 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_3 = this.createRC("rc_upperlower", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"), null, null);
        _timingConstraints_3.add(_createRC_3);
        EList<TimingConstraint> _timingConstraints_4 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_4 = this.createRC("rc_upperbelower", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"), null, null);
        _timingConstraints_4.add(_createRC_4);
        EList<TimingConstraint> _timingConstraints_5 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_5 = this.createRC("rc_jitter", null, null, FactoryUtil.createTime((-1), "ms"), null);
        _timingConstraints_5.add(_createRC_5);
        EList<TimingConstraint> _timingConstraints_6 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_6 = this.createRC("rc_period", null, null, null, FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_6.add(_createRC_6);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("The lower bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_lower\")"));
    Assert.assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_upper\")"));
    Assert.assertTrue(result.contains("The lower bound must not be negative (-2 ms < 0, in Repetition Constraint \"rc_upperlower\")"));
    Assert.assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_upperlower\")"));
    Assert.assertTrue(result.contains("The upper bound must not be negative (-1 ms < 0, in Repetition Constraint \"rc_upperbelower\")"));
    Assert.assertTrue(result.contains("The lower bound is greater than the upper (0 ms > -1 ms, in Repetition Constraint \"rc_upperbelower\")"));
    Assert.assertTrue(result.contains("The jitter must not be negative (-1 ms < 0, in Repetition Constraint \"rc_jitter\")"));
    Assert.assertTrue(result.contains("The period must not be negative (-1 ms < 0, in Repetition Constraint \"rc_period\")"));
    Assert.assertFalse(result.contains("The lower bound must not be negative (4 ms < 0, in Repetition Constraint \"rc_ok\")"));
    Assert.assertFalse(result.contains("The upper bound must not be negative (10 ms < 0, in Repetition Constraint \"rc_ok\")"));
    Assert.assertFalse(result.contains("The lower bound greater than the upper (4 ms > 10 ms, in Repetition Constraint \"rc_ok\")"));
    Assert.assertFalse(result.contains("The jitter must not be negative (1 ms < 0, in Repetition Constraint \"rc_ok\")"));
    Assert.assertFalse(result.contains("The period must not be negative (50 ms < 0, in Repetition Constraint \"rc_ok\")"));
  }
  
  @Test
  public void test_TAConstraintsRTLimitMustBePositive() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<Task> _function_2 = (Task it_2) -> {
          it_2.setName("t_ok");
        };
        this.b3.task(it_1, _function_2);
        final Procedure1<Task> _function_3 = (Task it_2) -> {
          it_2.setName("t_notOk");
        };
        this.b3.task(it_1, _function_3);
      };
      this.b1.softwareModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        this.b2.deadline_Process(it_1, this.b1.<Task>_find(it_1, Task.class, "t_ok"), FactoryUtil.createTime(10, "ms"));
        this.b2.deadline_Process(it_1, this.b1.<Task>_find(it_1, Task.class, "t_notOk"), FactoryUtil.createTime(0, "ms"));
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("The response time specified in Process Requirement \"Process deadline - t_notOk\" must be greater than 0."));
    Assert.assertFalse(result.contains("The response time specified in Process Requirement \"Process deadline - t_ok\" must be greater than 0."));
  }
  
  @Test
  public void test_TAConstraintsSynchronizationToleranceNotNegative() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        final EventSynchronizationConstraint sc_ok = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
        sc_ok.setName("sc_ok");
        sc_ok.setTolerance(FactoryUtil.createTime(1, "ms"));
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        _timingConstraints.add(sc_ok);
        final EventSynchronizationConstraint sc_notOk = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
        sc_notOk.setName("sc_notOk");
        sc_notOk.setTolerance(FactoryUtil.createTime((-42), "ms"));
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        _timingConstraints_1.add(sc_notOk);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("The tolerance time specified in Event Synchronization Constraint \"sc_notOk\" must not be negative."));
    Assert.assertFalse(result.contains("The tolerance time specified in Event Synchronization Constraint \"sc_ok\" must not be negative."));
  }
}
