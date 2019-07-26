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
package org.eclipse.app4mc.amalthea.validations.test;

import com.google.common.base.Objects;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.ModeCondition;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunctionEntry;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.RelationalOperator;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class SoftwareModelTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private SoftwareBuilder b2 = new SoftwareBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(EMFProfile.class);
  
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
  
  @Test
  public void testModeLabel() {
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
    Assert.assertTrue(result.contains("The initialValue \'third\' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_notOk\" )"));
    Assert.assertFalse(result.contains("The initialValue \'first\' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_ok\" )"));
    Assert.assertFalse(result.contains("The initialValue \'\' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_okok\" )"));
    Assert.assertFalse(result.contains("The initialValue \'null\' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_okok\" )"));
  }
  
  @Test
  public void testModeValue() {
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
          it_2.setName("t2");
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
    Assert.assertTrue(result.contains("The value \'third\' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r2\" )"));
    Assert.assertFalse(result.contains("The value \'first\' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r1\" )"));
    Assert.assertTrue(result.contains("The value \'fourth\' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t2\" )"));
    Assert.assertFalse(result.contains("The value \'second\' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t1\" )"));
  }
  
  @Test
  public void testModeLabelAccess() {
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
    Assert.assertTrue(result.contains("The value \'third\' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r_notOk\" )"));
    Assert.assertFalse(result.contains("The value \'first\' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r_ok\" )"));
    Assert.assertTrue(result.contains("The value \'fourth\' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t_notOk\" )"));
    Assert.assertFalse(result.contains("The value \'second\' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t_ok\" )"));
  }
}
