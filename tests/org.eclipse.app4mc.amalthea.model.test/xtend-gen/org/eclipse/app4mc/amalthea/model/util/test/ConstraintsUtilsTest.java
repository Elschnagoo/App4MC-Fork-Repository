/**
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 * Contributors:
 * Robert Bosch GmbH - initial API and implementation
 */
package org.eclipse.app4mc.amalthea.model.util.test;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.util.ConstraintsUtil;
import org.eclipse.app4mc.amalthea.models.ConstraintsModels;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class ConstraintsUtilsTest {
  private Amalthea model;
  
  private org.eclipse.app4mc.amalthea.model.Runnable run1;
  
  private org.eclipse.app4mc.amalthea.model.Runnable run2;
  
  private Task task1;
  
  @Before
  public void initalizeModel() {
    this.model = ConstraintsModels.createModel1();
    this.run1 = IterableExtensions.<org.eclipse.app4mc.amalthea.model.Runnable>head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run1", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.run2 = IterableExtensions.<org.eclipse.app4mc.amalthea.model.Runnable>head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run2", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.task1 = IterableExtensions.<Task>head(AmaltheaIndex.<Task>getElements(this.model, "Task1", Task.class));
  }
  
  @Test
  public void testRunnableDeadline() {
    final Time deadline1 = ConstraintsUtil.getDeadline(this.run1);
    Assert.assertEquals(
      "testRunnableDeadline: null expected", null, deadline1);
    final Time deadline2 = ConstraintsUtil.getDeadline(this.run2, this.model.getConstraintsModel());
    Assert.assertEquals(
      "testRunnableDeadline: 80 ns expected", 80, deadline2.getValue().intValue());
    Assert.assertEquals(
      "testRunnableDeadline: 80 ns expected", TimeUnit.NS, deadline2.getUnit());
  }
  
  @Test
  public void testProcessDeadline() {
    final Time deadline3 = ConstraintsUtil.getDeadline(this.task1);
    Assert.assertEquals(
      "testProcessDeadline: 20 ms expected", 20, deadline3.getValue().intValue());
    Assert.assertEquals(
      "testProcessDeadline: 20 ms expected", TimeUnit.MS, deadline3.getUnit());
    final Time deadline4 = ConstraintsUtil.getDeadline(this.task1, this.model.getConstraintsModel());
    Assert.assertEquals(
      "testProcessDeadline: same result expected", deadline3, deadline4);
  }
}
