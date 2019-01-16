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

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.amalthea.models.SoftwareModels;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class SoftwareUtilsTest {
  private Amalthea model;
  
  private org.eclipse.app4mc.amalthea.model.Runnable run1;
  
  private org.eclipse.app4mc.amalthea.model.Runnable run2;
  
  private org.eclipse.app4mc.amalthea.model.Runnable run3;
  
  private org.eclipse.app4mc.amalthea.model.Runnable run4;
  
  @Before
  public void initalizeModel() {
    this.model = SoftwareModels.getModel1();
    this.run1 = IterableExtensions.head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run1", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.run2 = IterableExtensions.head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run2", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.run3 = IterableExtensions.head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run3", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.run4 = IterableExtensions.head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run4", org.eclipse.app4mc.amalthea.model.Runnable.class));
  }
  
  @Test
  public void testCollectRunnableItems() {
    final EList<RunnableItem> list1 = SoftwareUtil.collectRunnableItems(this.run1);
    Assert.assertEquals(
      "collectRunnableItems: 6 items expected", 6, list1.size());
    final EList<Ticks> list2 = SoftwareUtil.<Ticks>collectRunnableItems(this.run1, null, Ticks.class);
    Assert.assertEquals(
      "collectRunnableItems: 2 items (ticks) expected", 2, list2.size());
    final Function<LabelAccess, Boolean> _function = (LabelAccess i) -> {
      LabelAccessEnum _access = i.getAccess();
      return Boolean.valueOf((_access == LabelAccessEnum.READ));
    };
    final EList<LabelAccess> list3 = SoftwareUtil.<LabelAccess>collectRunnableItems(this.run1, null, LabelAccess.class, _function);
    Assert.assertEquals(
      "collectRunnableItems: 2 items (label accesses) expected", 2, list3.size());
    final EList<RunnableItem> list4 = SoftwareUtil.collectRunnableItems(this.run4);
    Assert.assertEquals(
      "collectRunnableItems: 1 item expected", 1, list4.size());
  }
  
  @Test
  public void testLabelAccessMethods() {
    final Amalthea model = SoftwareModels.getModel2();
    final org.eclipse.app4mc.amalthea.model.Runnable run1 = IterableExtensions.head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(model, "Run1", org.eclipse.app4mc.amalthea.model.Runnable.class));
    final Set<Label> set1 = SoftwareUtil.getAccessedLabelSet(run1, null);
    final Set<Label> set2 = SoftwareUtil.getReadLabelSet(run1, null);
    final Set<Label> set3 = SoftwareUtil.getWriteLabelSet(run1, null);
    final List<LabelAccess> list1 = SoftwareUtil.getLabelAccessList(run1, null);
    final List<LabelAccess> list2 = SoftwareUtil.getReadLabelAccessList(run1, null);
    final List<LabelAccess> list3 = SoftwareUtil.getWriteLabelAccessList(run1, null);
    final Map<Label, List<LabelAccess>> map = SoftwareUtil.getLabelToLabelAccessMap(run1, null);
    final Map<Label, List<LabelAccessStatistic>> map1 = SoftwareUtil.getLabelAccessStatisticsMap(run1, null);
    InputOutput.<String>println("done.");
  }
}
