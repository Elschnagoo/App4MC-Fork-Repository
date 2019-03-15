package org.eclipse.app4mc.amalthea.models;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ConstraintsModels {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private SoftwareBuilder b2 = new SoftwareBuilder();
  
  @Extension
  private ConstraintsBuilder b3 = new ConstraintsBuilder();
  
  public static void main(final String[] args) {
    final Amalthea model1 = ConstraintsModels.createModel1();
    AmaltheaWriter.writeToFileNamed(model1, "test-data/ConstraintsUtilTestModel-gen.amxmi");
  }
  
  public static Amalthea createModel1() {
    return new ConstraintsModels().model1();
  }
  
  public Amalthea model1() {
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
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("Run1");
        };
        this.b2.runnable(it_1, _function_4);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_5 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("Run2");
        };
        this.b2.runnable(it_1, _function_5);
        final Procedure1<Task> _function_6 = (Task it_2) -> {
          it_2.setName("Task1");
        };
        this.b2.task(it_1, _function_6);
        final Procedure1<Task> _function_7 = (Task it_2) -> {
          it_2.setName("Task2");
        };
        this.b2.task(it_1, _function_7);
      };
      this.b1.softwareModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        this.b3.deadline_Process(it_1, this.b1.<Task>_find(it_1, Task.class, "Task1"), FactoryUtil.createTime(20, TimeUnit.MS));
        this.b3.deadline_Process(it_1, this.b1.<Task>_find(it_1, Task.class, "Task1"), FactoryUtil.createTime(30, TimeUnit.MS));
        this.b3.deadline_Process(it_1, this.b1.<Task>_find(it_1, Task.class, "Task1"), FactoryUtil.createTime(100, TimeUnit.MS));
        this.b3.deadline_Runnable(it_1, this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_1, org.eclipse.app4mc.amalthea.model.Runnable.class, "Run2"), FactoryUtil.createTime(80, TimeUnit.NS));
        this.b3.deadline_Runnable(it_1, this.b1.<org.eclipse.app4mc.amalthea.model.Runnable>_find(it_1, org.eclipse.app4mc.amalthea.model.Runnable.class, "Run2"), null);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    return model;
  }
}
