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
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.InterruptController;
import org.eclipse.app4mc.amalthea.model.ModeCondition;
import org.eclipse.app4mc.amalthea.model.ModeConditionConjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunctionEntry;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.RelationalOperator;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
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
public class TASoftwareModelValidatorTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private SoftwareBuilder b2 = new SoftwareBuilder();
  
  @Extension
  private OperatingSystemBuilder b3 = new OperatingSystemBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(TimingArchitectsProfile.class);
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  public void modeCondition(final ModeSwitchEntry container, final Procedure1<ModeCondition> initializer) {
    ModeConditionDisjunction _condition = container.getCondition();
    boolean _tripleEquals = (_condition == null);
    if (_tripleEquals) {
      container.setCondition(AmaltheaFactory.eINSTANCE.createModeConditionDisjunction());
    }
    final ModeCondition obj = AmaltheaFactory.eINSTANCE.createModeCondition();
    EList<ModeConditionDisjunctionEntry> _entries = container.getCondition().getEntries();
    _entries.add(obj);
    initializer.apply(obj);
  }
  
  public void modeConditionSingleConjunction(final ModeSwitchEntry container, final Procedure1<ModeCondition> initializer) {
    ModeConditionDisjunction _condition = container.getCondition();
    boolean _tripleEquals = (_condition == null);
    if (_tripleEquals) {
      container.setCondition(AmaltheaFactory.eINSTANCE.createModeConditionDisjunction());
      EList<ModeConditionDisjunctionEntry> _entries = container.getCondition().getEntries();
      ModeConditionConjunction _createModeConditionConjunction = AmaltheaFactory.eINSTANCE.createModeConditionConjunction();
      _entries.add(_createModeConditionConjunction);
    }
    final ModeCondition obj = AmaltheaFactory.eINSTANCE.createModeCondition();
    ModeConditionDisjunctionEntry _get = container.getCondition().getEntries().get(0);
    ModeConditionConjunction mcc = ((ModeConditionConjunction) _get);
    EList<ModeCondition> _entries_1 = mcc.getEntries();
    _entries_1.add(obj);
    initializer.apply(obj);
  }
  
  @Test
  public void test_TASoftwareOsEvent() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<OsEvent> _function_2 = (OsEvent it_2) -> {
          it_2.setName("ev_ok");
        };
        this.b2.osEvent(it_1, _function_2);
        final Procedure1<OsEvent> _function_3 = (OsEvent it_2) -> {
          it_2.setName("ev_wait");
        };
        this.b2.osEvent(it_1, _function_3);
        final Procedure1<Task> _function_4 = (Task it_2) -> {
          it_2.setName("t1");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<SetEvent> _function_6 = (SetEvent it_4) -> {
              this.b2.eventMask(it_4, this.b1.<OsEvent>_find(it_4, OsEvent.class, "ev_ok"));
            };
            this.b2.setEvent(it_3, _function_6);
            final Procedure1<WaitEvent> _function_7 = (WaitEvent it_4) -> {
              this.b2.eventMask(it_4, this.b1.<OsEvent>_find(it_4, OsEvent.class, "ev_ok"));
            };
            this.b2.waitEvent(it_3, _function_7);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.task(it_1, _function_4);
        final Procedure1<Task> _function_5 = (Task it_2) -> {
          it_2.setName("t2");
          final Procedure1<CallGraph> _function_6 = (CallGraph it_3) -> {
            final Procedure1<WaitEvent> _function_7 = (WaitEvent it_4) -> {
              this.b2.eventMask(it_4, this.b1.<OsEvent>_find(it_4, OsEvent.class, "ev_wait"));
            };
            this.b2.waitEvent(it_3, _function_7);
          };
          this.b2.callGraph(it_2, _function_6);
        };
        this.b2.task(it_1, _function_5);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("Os Event \"ev_wait\" is waited upon, but it is never set."));
    Assert.assertFalse(result.contains("Os Event \"ev_ok\" is waited upon, but it is never set."));
  }
  
  @Test
  public void test_TASoftwareModeLabel() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<EnumMode> _function_2 = (EnumMode it_2) -> {
          it_2.setName("enumerated");
          final Procedure1<ModeLiteral> _function_3 = (ModeLiteral it_3) -> {
            it_3.setName("first");
          };
          this.b2.literal(it_2, _function_3);
          final Procedure1<ModeLiteral> _function_4 = (ModeLiteral it_3) -> {
            it_3.setName("second");
          };
          this.b2.literal(it_2, _function_4);
        };
        this.b2.mode_Enum(it_1, _function_2);
        final Procedure1<ModeLabel> _function_3 = (ModeLabel it_2) -> {
          it_2.setName("ml_ok");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "enumerated"));
          it_2.setInitialValue("first");
        };
        this.b2.modeLabel(it_1, _function_3);
        final Procedure1<ModeLabel> _function_4 = (ModeLabel it_2) -> {
          it_2.setName("ml_notOk");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "enumerated"));
          it_2.setInitialValue("third");
        };
        this.b2.modeLabel(it_1, _function_4);
        final Procedure1<ModeLabel> _function_5 = (ModeLabel it_2) -> {
          it_2.setName("ml_okok");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "enumerated"));
        };
        this.b2.modeLabel(it_1, _function_5);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The initial value \"third\" in Mode Label \"ml_notOk\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertFalse(result.contains("The initial value \"first\" in Mode Label \"ml_ok\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertFalse(result.contains("The initial value \"\" in Mode Label \"ml_okok\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertFalse(result.contains("The initial value \"null\" in Mode Label \"ml_okok\" is not a valid literal of Enum Mode \"enumerated\"."));
  }
  
  @Test
  public void test_TASoftwareModeValue() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<EnumMode> _function_2 = (EnumMode it_2) -> {
          it_2.setName("enumerated");
          final Procedure1<ModeLiteral> _function_3 = (ModeLiteral it_3) -> {
            it_3.setName("first");
          };
          this.b2.literal(it_2, _function_3);
          final Procedure1<ModeLiteral> _function_4 = (ModeLiteral it_3) -> {
            it_3.setName("second");
          };
          this.b2.literal(it_2, _function_4);
        };
        this.b2.mode_Enum(it_1, _function_2);
        final Procedure1<ModeLabel> _function_3 = (ModeLabel it_2) -> {
          it_2.setName("ml");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "enumerated"));
          it_2.setInitialValue("first");
        };
        this.b2.modeLabel(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r1");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<ModeSwitch> _function_6 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_7 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r1_mse_ok");
                final Procedure1<ModeCondition> _function_8 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_8);
              };
              this.b2.entry(it_4, _function_7);
            };
            this.b2.modeSwitch(it_3, _function_6);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.runnable(it_1, _function_4);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_5 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r2");
          final Procedure1<CallGraph> _function_6 = (CallGraph it_3) -> {
            final Procedure1<ModeSwitch> _function_7 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_8 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r2_mse_notOk");
                final Procedure1<ModeCondition> _function_9 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("third");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_9);
              };
              this.b2.entry(it_4, _function_8);
            };
            this.b2.modeSwitch(it_3, _function_7);
          };
          this.b2.callGraph(it_2, _function_6);
        };
        this.b2.runnable(it_1, _function_5);
        final Procedure1<Task> _function_6 = (Task it_2) -> {
          it_2.setName("t1");
          final Procedure1<CallGraph> _function_7 = (CallGraph it_3) -> {
            final Procedure1<ModeSwitch> _function_8 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_9 = (ModeSwitchEntry it_5) -> {
                it_5.setName("t1_mse_ok");
                final Procedure1<ModeCondition> _function_10 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("second");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_10);
              };
              this.b2.entry(it_4, _function_9);
            };
            this.b2.modeSwitch(it_3, _function_8);
          };
          this.b2.callGraph(it_2, _function_7);
        };
        this.b2.task(it_1, _function_6);
        final Procedure1<Task> _function_7 = (Task it_2) -> {
          it_2.setName("t2k");
          final Procedure1<CallGraph> _function_8 = (CallGraph it_3) -> {
            final Procedure1<ModeSwitch> _function_9 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_10 = (ModeSwitchEntry it_5) -> {
                it_5.setName("t2_mse_notOk");
                final Procedure1<ModeCondition> _function_11 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("fourth");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_11);
              };
              this.b2.entry(it_4, _function_10);
            };
            this.b2.modeSwitch(it_3, _function_9);
          };
          this.b2.callGraph(it_2, _function_8);
        };
        this.b2.task(it_1, _function_7);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The mode value \"third\" in Mode Switch Entry \"r2_mse_notOk\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertFalse(result.contains("The mode value \"first\" in Mode Switch Entry \"r1_mse_ok\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertTrue(result.contains("The mode value \"fourth\" in Mode Switch Entry \"t2_mse_notOk\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertFalse(result.contains("The mode value \"second\" in Mode Switch Entry \"t1_mse_ok\" is not a valid literal of Enum Mode \"enumerated\"."));
  }
  
  @Test
  public void test_TASoftwareModeConditionDisjunctionAlwaysTrue() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<EnumMode> _function_2 = (EnumMode it_2) -> {
          it_2.setName("enumerated");
          final Procedure1<ModeLiteral> _function_3 = (ModeLiteral it_3) -> {
            it_3.setName("first");
          };
          this.b2.literal(it_2, _function_3);
          final Procedure1<ModeLiteral> _function_4 = (ModeLiteral it_3) -> {
            it_3.setName("second");
          };
          this.b2.literal(it_2, _function_4);
        };
        this.b2.mode_Enum(it_1, _function_2);
        final Procedure1<ModeLabel> _function_3 = (ModeLabel it_2) -> {
          it_2.setName("ml");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "enumerated"));
          it_2.setInitialValue("first");
        };
        this.b2.modeLabel(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<ModeSwitch> _function_6 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_7 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r_mse_ok");
                final Procedure1<ModeCondition> _function_8 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_8);
                final Procedure1<ModeCondition> _function_9 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("second");
                  it_6.setRelation(RelationalOperator.NOT_EQUAL);
                };
                this.modeCondition(it_5, _function_9);
              };
              this.b2.entry(it_4, _function_7);
            };
            this.b2.modeSwitch(it_3, _function_6);
            final Procedure1<ModeSwitch> _function_7 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_8 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r_mse_allLiterals");
                final Procedure1<ModeCondition> _function_9 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_9);
                final Procedure1<ModeCondition> _function_10 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("second");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_10);
              };
              this.b2.entry(it_4, _function_8);
            };
            this.b2.modeSwitch(it_3, _function_7);
            final Procedure1<ModeSwitch> _function_8 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_9 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r_mse_sameLiteral");
                final Procedure1<ModeCondition> _function_10 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeCondition(it_5, _function_10);
                final Procedure1<ModeCondition> _function_11 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.NOT_EQUAL);
                };
                this.modeCondition(it_5, _function_11);
              };
              this.b2.entry(it_4, _function_9);
            };
            this.b2.modeSwitch(it_3, _function_8);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.WARNING);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Disjoining all possible mode literals in Mode Switch Entry \"r_mse_allLiterals\" always evaluates to TRUE, which might not be intended here."));
    Assert.assertTrue(result.contains("Disjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_sameLiteral\" always evaluates to TRUE, which might not be intended here."));
    Assert.assertFalse(result.contains("Disjoining all possible mode literals in Mode Switch Entry \"r_mse_ok\" always evaluates to TRUE, which might not be intended here."));
    Assert.assertFalse(result.contains("Disjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_ok\" always evaluates to TRUE, which might not be intended here."));
    Assert.assertFalse(result.contains("Disjoining mode conditions on the same Mode Literal \"second\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_ok\" always evaluates to TRUE, which might not be intended here."));
  }
  
  @Test
  public void test_TASoftwareModeConditionConjunctionAlwaysFalse() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<EnumMode> _function_2 = (EnumMode it_2) -> {
          it_2.setName("enumerated");
          final Procedure1<ModeLiteral> _function_3 = (ModeLiteral it_3) -> {
            it_3.setName("first");
          };
          this.b2.literal(it_2, _function_3);
          final Procedure1<ModeLiteral> _function_4 = (ModeLiteral it_3) -> {
            it_3.setName("second");
          };
          this.b2.literal(it_2, _function_4);
        };
        this.b2.mode_Enum(it_1, _function_2);
        final Procedure1<ModeLabel> _function_3 = (ModeLabel it_2) -> {
          it_2.setName("ml");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "enumerated"));
          it_2.setInitialValue("first");
        };
        this.b2.modeLabel(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<ModeSwitch> _function_6 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_7 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r_mse_ok");
                final Procedure1<ModeCondition> _function_8 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_8);
                final Procedure1<ModeCondition> _function_9 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("second");
                  it_6.setRelation(RelationalOperator.NOT_EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_9);
              };
              this.b2.entry(it_4, _function_7);
            };
            this.b2.modeSwitch(it_3, _function_6);
            final Procedure1<ModeSwitch> _function_7 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_8 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r_mse_twoLitEQ");
                final Procedure1<ModeCondition> _function_9 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_9);
                final Procedure1<ModeCondition> _function_10 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("second");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_10);
              };
              this.b2.entry(it_4, _function_8);
            };
            this.b2.modeSwitch(it_3, _function_7);
            final Procedure1<ModeSwitch> _function_8 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_9 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r_mse_twoLitUnEQ");
                final Procedure1<ModeCondition> _function_10 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.NOT_EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_10);
                final Procedure1<ModeCondition> _function_11 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("second");
                  it_6.setRelation(RelationalOperator.NOT_EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_11);
              };
              this.b2.entry(it_4, _function_9);
            };
            this.b2.modeSwitch(it_3, _function_8);
            final Procedure1<ModeSwitch> _function_9 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchEntry> _function_10 = (ModeSwitchEntry it_5) -> {
                it_5.setName("r_mse_sameLiteral");
                final Procedure1<ModeCondition> _function_11 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_11);
                final Procedure1<ModeCondition> _function_12 = (ModeCondition it_6) -> {
                  it_6.setLabel(this.b1.<ModeLabel>_find(it_6, ModeLabel.class, "ml"));
                  it_6.setValue("first");
                  it_6.setRelation(RelationalOperator.NOT_EQUAL);
                };
                this.modeConditionSingleConjunction(it_5, _function_12);
              };
              this.b2.entry(it_4, _function_10);
            };
            this.b2.modeSwitch(it_3, _function_9);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.WARNING);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Conjoining equality of mode literals [first, second] in Mode Switch Entry \"r_mse_twoLitEQ\" always evaluates to FALSE, which might not be intended here."));
    Assert.assertTrue(result.contains("Conjoining unequality of mode literals [first, second] in Mode Switch Entry \"r_mse_twoLitUnEQ\" always evaluates to FALSE, which might not be intended here."));
    Assert.assertTrue(result.contains("Conjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_sameLiteral\" always evaluates to FALSE, which might not be intended here."));
    Assert.assertFalse(result.contains("Conjoining equality of mode literals [first, second] in Mode Switch Entry \"r_mse_ok\" always evaluates to FALSE, which might not be intended here."));
    Assert.assertFalse(result.contains("Conjoining unequality of mode literals [first, second] in Mode Switch Entry \"r_mse_ok\" always evaluates to FALSE, which might not be intended here."));
    Assert.assertFalse(result.contains("Conjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_ok\" always evaluates to FALSE, which might not be intended here."));
  }
  
  @Test
  public void test_TASoftwareServerCall() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("server_runnable");
        };
        this.b2.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<AsynchronousServerCall> _function_5 = (AsynchronousServerCall it_4) -> {
              it_4.setServerRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_4, org.eclipse.app4mc.amalthea.model.Runnable.class, "server_runnable"));
            };
            this.b2.asynchronousServerCall(it_3, _function_5);
          };
          this.b2.callGraph(it_2, _function_4);
        };
        this.b2.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_looped");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<AsynchronousServerCall> _function_6 = (AsynchronousServerCall it_4) -> {
              it_4.setServerRunnable(it_4.getContainingRunnable());
            };
            this.b2.asynchronousServerCall(it_3, _function_6);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The server runnable called by Asynchronous Server Call in Runnable \"r_looped\" must not refer to the containing runnable."));
    Assert.assertFalse(result.contains("The server runnable called by Asynchronous Server Call in Runnable \"r_ok\" must not refer to the containing runnable."));
  }
  
  @Test
  public void test_TASoftwareRunnableCall() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("other_runnable");
        };
        this.b2.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<AsynchronousServerCall> _function_5 = (AsynchronousServerCall it_4) -> {
              it_4.setServerRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_4, org.eclipse.app4mc.amalthea.model.Runnable.class, "other_runnable"));
            };
            this.b2.asynchronousServerCall(it_3, _function_5);
          };
          this.b2.callGraph(it_2, _function_4);
        };
        this.b2.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_looped");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<RunnableCall> _function_6 = (RunnableCall it_4) -> {
              it_4.setRunnable(it_4.getContainingRunnable());
            };
            this.b2.runnableCall(it_3, _function_6);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The runnable called by Runnable Call in Runnable \"r_looped\" must not refer to the containing runnable."));
    Assert.assertFalse(result.contains("The runnable called by Runnable Call in Runnable \"r_ok\" must not refer to the containing runnable."));
  }
  
  @Test
  public void test_TASoftwareEnforcedMigration() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<OSModel> _function_1 = (OSModel it_1) -> {
        final Procedure1<OperatingSystem> _function_2 = (OperatingSystem it_2) -> {
          it_2.setName("os");
          final Procedure1<TaskScheduler> _function_3 = (TaskScheduler it_3) -> {
            it_3.setName("ts");
          };
          this.b3.taskScheduler(it_2, _function_3);
          final Procedure1<InterruptController> _function_4 = (InterruptController it_3) -> {
            it_3.setName("ic");
          };
          this.b3.interruptController(it_2, _function_4);
        };
        this.b3.operatingSystem(it_1, _function_2);
      };
      this.b1.osModel(it, _function_1);
      final Procedure1<SWModel> _function_2 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<EnforcedMigration> _function_5 = (EnforcedMigration it_4) -> {
              it_4.setResourceOwner(this.b1.<TaskScheduler>_find(it_4, TaskScheduler.class, "ts"));
            };
            this.b2.enforcedMigration(it_3, _function_5);
          };
          this.b2.callGraph(it_2, _function_4);
        };
        this.b2.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_unset");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<EnforcedMigration> _function_6 = (EnforcedMigration it_4) -> {
            };
            this.b2.enforcedMigration(it_3, _function_6);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.runnable(it_1, _function_4);
        final Procedure1<Task> _function_5 = (Task it_2) -> {
          it_2.setName("t_ok");
          final Procedure1<CallGraph> _function_6 = (CallGraph it_3) -> {
            final Procedure1<EnforcedMigration> _function_7 = (EnforcedMigration it_4) -> {
              it_4.setResourceOwner(this.b1.<TaskScheduler>_find(it_4, TaskScheduler.class, "ts"));
            };
            this.b2.enforcedMigration(it_3, _function_7);
          };
          this.b2.callGraph(it_2, _function_6);
        };
        this.b2.task(it_1, _function_5);
        final Procedure1<Task> _function_6 = (Task it_2) -> {
          it_2.setName("t_bad");
          final Procedure1<CallGraph> _function_7 = (CallGraph it_3) -> {
            final Procedure1<EnforcedMigration> _function_8 = (EnforcedMigration it_4) -> {
              it_4.setResourceOwner(this.b1.<InterruptController>_find(it_4, InterruptController.class, "ic"));
            };
            this.b2.enforcedMigration(it_3, _function_8);
          };
          this.b2.callGraph(it_2, _function_7);
        };
        this.b2.task(it_1, _function_6);
      };
      this.b1.softwareModel(it, _function_2);
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
    Assert.assertTrue(result.contains("The resource owner of the Enforced Migration in Runnable \"r_unset\" must be set."));
    Assert.assertTrue(result.contains("The resource owner of the Enforced Migration in Task \"t_bad\" must refer to a task scheduler (instead of Interrupt Controller \"ic\")."));
    Assert.assertFalse(result.contains("The resource owner of the Enforced Migration in Runnable \"r_ok\" must be set."));
    Assert.assertFalse(result.contains("The resource owner of the Enforced Migration in Runnable \"r_ok\" must refer to a task scheduler (instead of Task Scheduler \"ts\")."));
    Assert.assertFalse(result.contains("The resource owner of the Enforced Migration in Task \"t_ok\" must be set."));
    Assert.assertFalse(result.contains("The resource owner of the Enforced Migration in Task \"t_ok\" must refer to a task scheduler (instead of Task Scheduler \"ts\")."));
  }
  
  @Test
  public void test_TASoftwareModeLabelAccess() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<EnumMode> _function_2 = (EnumMode it_2) -> {
          it_2.setName("enumerated");
          final Procedure1<ModeLiteral> _function_3 = (ModeLiteral it_3) -> {
            it_3.setName("first");
          };
          this.b2.literal(it_2, _function_3);
          final Procedure1<ModeLiteral> _function_4 = (ModeLiteral it_3) -> {
            it_3.setName("second");
          };
          this.b2.literal(it_2, _function_4);
        };
        this.b2.mode_Enum(it_1, _function_2);
        final Procedure1<ModeLabel> _function_3 = (ModeLabel it_2) -> {
          it_2.setName("ml");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "enumerated"));
          it_2.setInitialValue("first");
        };
        this.b2.modeLabel(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<ModeLabelAccess> _function_6 = (ModeLabelAccess it_4) -> {
              it_4.setAccess(ModeLabelAccessEnum.SET);
              it_4.setData(this.b1.<ModeLabel>_find(it_4, ModeLabel.class, "ml"));
              it_4.setValue("first");
            };
            this.b2.modeLabelAccess(it_3, _function_6);
          };
          this.b2.callGraph(it_2, _function_5);
        };
        this.b2.runnable(it_1, _function_4);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_5 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_notOk");
          final Procedure1<CallGraph> _function_6 = (CallGraph it_3) -> {
            final Procedure1<ModeLabelAccess> _function_7 = (ModeLabelAccess it_4) -> {
              it_4.setAccess(ModeLabelAccessEnum.SET);
              it_4.setData(this.b1.<ModeLabel>_find(it_4, ModeLabel.class, "ml"));
              it_4.setValue("third");
            };
            this.b2.modeLabelAccess(it_3, _function_7);
          };
          this.b2.callGraph(it_2, _function_6);
        };
        this.b2.runnable(it_1, _function_5);
        final Procedure1<Task> _function_6 = (Task it_2) -> {
          it_2.setName("t_ok");
          final Procedure1<CallGraph> _function_7 = (CallGraph it_3) -> {
            final Procedure1<ModeLabelAccess> _function_8 = (ModeLabelAccess it_4) -> {
              it_4.setAccess(ModeLabelAccessEnum.SET);
              it_4.setData(this.b1.<ModeLabel>_find(it_4, ModeLabel.class, "ml"));
              it_4.setValue("second");
            };
            this.b2.modeLabelAccess(it_3, _function_8);
          };
          this.b2.callGraph(it_2, _function_7);
        };
        this.b2.task(it_1, _function_6);
        final Procedure1<Task> _function_7 = (Task it_2) -> {
          it_2.setName("t_notOk");
          final Procedure1<CallGraph> _function_8 = (CallGraph it_3) -> {
            final Procedure1<ModeLabelAccess> _function_9 = (ModeLabelAccess it_4) -> {
              it_4.setAccess(ModeLabelAccessEnum.SET);
              it_4.setData(this.b1.<ModeLabel>_find(it_4, ModeLabel.class, "ml"));
              it_4.setValue("fourth");
            };
            this.b2.modeLabelAccess(it_3, _function_9);
          };
          this.b2.callGraph(it_2, _function_8);
        };
        this.b2.task(it_1, _function_7);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The mode label access value to be updated to \"third\" in Runnable \"r_notOk\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertFalse(result.contains("The mode label access value to be updated to \"first\" in Runnable \"r1_ok\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertTrue(result.contains("The mode label access value to be updated to \"fourth\" in Task \"t_notOk\" is not a valid literal of Enum Mode \"enumerated\"."));
    Assert.assertFalse(result.contains("The mode label access value to be updated to \"second\" in Task \"t_ok\" is not a valid literal of Enum Mode \"enumerated\"."));
  }
}
