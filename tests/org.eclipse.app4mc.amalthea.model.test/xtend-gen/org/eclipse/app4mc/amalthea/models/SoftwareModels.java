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
package org.eclipse.app4mc.amalthea.models;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SoftwareModels {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private SoftwareBuilder b2 = new SoftwareBuilder();
  
  public static void main(final String[] args) {
    final Amalthea model1 = new SoftwareModels().model1();
    AmaltheaWriter.writeToFileNamed(model1, "test-data/SoftwareUtilTestModel1-gen.amxmi");
    final Amalthea model2 = new SoftwareModels().model2();
    AmaltheaWriter.writeToFileNamed(model2, "test-data/SoftwareUtilTestModel2-gen.amxmi");
  }
  
  public static Amalthea createModel1() {
    return new SoftwareModels().model1();
  }
  
  public static Amalthea createModel2() {
    return new SoftwareModels().model2();
  }
  
  public Amalthea model1() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<EnumMode> _function_2 = (EnumMode it_2) -> {
          it_2.setName("state");
          final Procedure1<ModeLiteral> _function_3 = (ModeLiteral it_3) -> {
            it_3.setName("pre-drive");
          };
          this.b2.literal(it_2, _function_3);
          final Procedure1<ModeLiteral> _function_4 = (ModeLiteral it_3) -> {
            it_3.setName("drive");
          };
          this.b2.literal(it_2, _function_4);
          final Procedure1<ModeLiteral> _function_5 = (ModeLiteral it_3) -> {
            it_3.setName("post-drive");
          };
          this.b2.literal(it_2, _function_5);
        };
        this.b2.mode_Enum(it_1, _function_2);
        final Procedure1<ModeLabel> _function_3 = (ModeLabel it_2) -> {
          it_2.setName("car-state");
          it_2.setMode(this.b1.<EnumMode>_find(it_2, EnumMode.class, "state"));
          it_2.setInitialValue("pre-drive");
        };
        this.b2.modeLabel(it_1, _function_3);
        final Procedure1<Label> _function_4 = (Label it_2) -> {
          it_2.setName("Lab1");
        };
        this.b2.label(it_1, _function_4);
        final Procedure1<Label> _function_5 = (Label it_2) -> {
          it_2.setName("Lab2");
        };
        this.b2.label(it_1, _function_5);
        final Procedure1<Label> _function_6 = (Label it_2) -> {
          it_2.setName("Lab3");
        };
        this.b2.label(it_1, _function_6);
        final Procedure1<Label> _function_7 = (Label it_2) -> {
          it_2.setName("Lab4");
        };
        this.b2.label(it_1, _function_7);
        final Procedure1<Label> _function_8 = (Label it_2) -> {
          it_2.setName("Lab5");
        };
        this.b2.label(it_1, _function_8);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_9 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("Run1");
          final Procedure1<CallGraph> _function_10 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_11 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 200);
            };
            this.b2.ticks(it_3, _function_11);
            final Procedure1<ModeSwitch> _function_12 = (ModeSwitch it_4) -> {
              final Procedure1<ModeSwitchDefault> _function_13 = (ModeSwitchDefault it_5) -> {
                final Procedure1<LabelAccess> _function_14 = (LabelAccess it_6) -> {
                  it_6.setAccess(LabelAccessEnum.READ);
                  it_6.setData(this.b1.<Label>_find(it_6, Label.class, "Lab1"));
                };
                this.b2.labelAccess(it_5, _function_14);
                final Procedure1<LabelAccess> _function_15 = (LabelAccess it_6) -> {
                  it_6.setAccess(LabelAccessEnum.READ);
                  it_6.setData(this.b1.<Label>_find(it_6, Label.class, "Lab2"));
                };
                this.b2.labelAccess(it_5, _function_15);
                final Procedure1<Ticks> _function_16 = (Ticks it_6) -> {
                  this.b2.defaultConstant(it_6, 333);
                };
                this.b2.ticks(it_5, _function_16);
                final Procedure1<LabelAccess> _function_17 = (LabelAccess it_6) -> {
                  it_6.setAccess(LabelAccessEnum.WRITE);
                  it_6.setData(this.b1.<Label>_find(it_6, Label.class, "Lab3"));
                };
                this.b2.labelAccess(it_5, _function_17);
                final Procedure1<LabelAccess> _function_18 = (LabelAccess it_6) -> {
                  it_6.setAccess(LabelAccessEnum.WRITE);
                  it_6.setData(this.b1.<Label>_find(it_6, Label.class, "Lab4"));
                };
                this.b2.labelAccess(it_5, _function_18);
              };
              this.b2.defaultEntry(it_4, _function_13);
            };
            this.b2.modeSwitch(it_3, _function_12);
          };
          this.b2.callGraph(it_2, _function_10);
        };
        this.b2.runnable(it_1, _function_9);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_10 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("Run2");
          final Procedure1<CallGraph> _function_11 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_12 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 400);
            };
            this.b2.ticks(it_3, _function_12);
            final Procedure1<Ticks> _function_13 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 40);
            };
            this.b2.ticks(it_3, _function_13);
            final Procedure1<Ticks> _function_14 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 4);
            };
            this.b2.ticks(it_3, _function_14);
            final Procedure1<RunnableCall> _function_15 = (RunnableCall it_4) -> {
              it_4.setRunnable(this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_4, org.eclipse.app4mc.amalthea.model.Runnable.class, "Run4"));
            };
            this.b2.runnableCall(it_3, _function_15);
            final Procedure1<LabelAccess> _function_16 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.WRITE);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab5"));
            };
            this.b2.labelAccess(it_3, _function_16);
          };
          this.b2.callGraph(it_2, _function_11);
        };
        this.b2.runnable(it_1, _function_10);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_11 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("Run3");
          final Procedure1<CallGraph> _function_12 = (CallGraph it_3) -> {
            final Procedure1<LabelAccess> _function_13 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.READ);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab5"));
            };
            this.b2.labelAccess(it_3, _function_13);
            final Procedure1<Ticks> _function_14 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 600);
            };
            this.b2.ticks(it_3, _function_14);
          };
          this.b2.callGraph(it_2, _function_12);
        };
        this.b2.runnable(it_1, _function_11);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_12 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("Run4");
          final Procedure1<CallGraph> _function_13 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_14 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 700);
            };
            this.b2.ticks(it_3, _function_14);
          };
          this.b2.callGraph(it_2, _function_13);
        };
        this.b2.runnable(it_1, _function_12);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    return model;
  }
  
  public Amalthea model2() {
    final AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<Label> _function_2 = (Label it_2) -> {
          it_2.setName("Lab1");
        };
        this.b2.label(it_1, _function_2);
        final Procedure1<Label> _function_3 = (Label it_2) -> {
          it_2.setName("Lab2");
        };
        this.b2.label(it_1, _function_3);
        final Procedure1<Label> _function_4 = (Label it_2) -> {
          it_2.setName("Lab3");
        };
        this.b2.label(it_1, _function_4);
        final Procedure1<Label> _function_5 = (Label it_2) -> {
          it_2.setName("Lab4");
        };
        this.b2.label(it_1, _function_5);
        final Procedure1<Label> _function_6 = (Label it_2) -> {
          it_2.setName("Lab5");
        };
        this.b2.label(it_1, _function_6);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_7 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("Run1");
          final Procedure1<CallGraph> _function_8 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_9 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 200);
            };
            this.b2.ticks(it_3, _function_9);
            final Procedure1<LabelAccess> _function_10 = (LabelAccess it_4) -> {
              it_4.setStatistic(fac.createLabelAccessStatistic());
            };
            this.b2.labelAccess(it_3, _function_10);
            final Procedure1<LabelAccess> _function_11 = (LabelAccess it_4) -> {
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab1"));
              it_4.setStatistic(fac.createLabelAccessStatistic());
            };
            this.b2.labelAccess(it_3, _function_11);
            final Procedure1<LabelAccess> _function_12 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.READ);
              it_4.setStatistic(fac.createLabelAccessStatistic());
            };
            this.b2.labelAccess(it_3, _function_12);
            final Procedure1<LabelAccess> _function_13 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.READ);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab1"));
              it_4.setStatistic(fac.createLabelAccessStatistic());
            };
            this.b2.labelAccess(it_3, _function_13);
            final Procedure1<LabelAccess> _function_14 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.READ);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab2"));
            };
            this.b2.labelAccess(it_3, _function_14);
            final Procedure1<LabelAccess> _function_15 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.READ);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab3"));
            };
            this.b2.labelAccess(it_3, _function_15);
            final Procedure1<LabelAccess> _function_16 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.READ);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab4"));
              it_4.setStatistic(fac.createLabelAccessStatistic());
            };
            this.b2.labelAccess(it_3, _function_16);
            final Procedure1<Ticks> _function_17 = (Ticks it_4) -> {
              this.b2.defaultConstant(it_4, 333);
            };
            this.b2.ticks(it_3, _function_17);
            final Procedure1<LabelAccess> _function_18 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.WRITE);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab3"));
            };
            this.b2.labelAccess(it_3, _function_18);
            final Procedure1<LabelAccess> _function_19 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.WRITE);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab4"));
            };
            this.b2.labelAccess(it_3, _function_19);
            final Procedure1<LabelAccess> _function_20 = (LabelAccess it_4) -> {
              it_4.setAccess(LabelAccessEnum.WRITE);
              it_4.setData(this.b1.<Label>_find(it_4, Label.class, "Lab5"));
              it_4.setStatistic(fac.createLabelAccessStatistic());
            };
            this.b2.labelAccess(it_3, _function_20);
          };
          this.b2.callGraph(it_2, _function_8);
        };
        this.b2.runnable(it_1, _function_7);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    return model;
  }
}
