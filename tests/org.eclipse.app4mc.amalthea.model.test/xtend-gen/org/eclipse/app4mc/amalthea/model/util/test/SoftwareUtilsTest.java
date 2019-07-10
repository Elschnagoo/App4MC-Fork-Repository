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
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.amalthea.models.SoftwareModels;
import org.eclipse.emf.common.util.EList;
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
    this.model = SoftwareModels.createModel1();
    this.run1 = IterableExtensions.<org.eclipse.app4mc.amalthea.model.Runnable>head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run1", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.run2 = IterableExtensions.<org.eclipse.app4mc.amalthea.model.Runnable>head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run2", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.run3 = IterableExtensions.<org.eclipse.app4mc.amalthea.model.Runnable>head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run3", org.eclipse.app4mc.amalthea.model.Runnable.class));
    this.run4 = IterableExtensions.<org.eclipse.app4mc.amalthea.model.Runnable>head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(this.model, "Run4", org.eclipse.app4mc.amalthea.model.Runnable.class));
  }
  
  @Test
  public void testCollectRunnableItems() {
    final EList<CallGraphItem> list1 = SoftwareUtil.collectCallGraphItems(this.run1.getCallGraph());
    Assert.assertEquals(
      "collectRunnableItems: 6 items expected", 6, list1.size());
    final EList<Ticks> list2 = SoftwareUtil.<Ticks>collectCallGraphItems(this.run1.getCallGraph(), null, Ticks.class);
    Assert.assertEquals(
      "collectRunnableItems: 2 items (ticks) expected", 2, list2.size());
    final Function<LabelAccess, Boolean> _function = (LabelAccess i) -> {
      LabelAccessEnum _access = i.getAccess();
      return Boolean.valueOf((_access == LabelAccessEnum.READ));
    };
    final EList<LabelAccess> list3 = SoftwareUtil.<LabelAccess>collectCallGraphItems(this.run1.getCallGraph(), null, LabelAccess.class, _function);
    Assert.assertEquals(
      "collectRunnableItems: 2 items (label accesses) expected", 2, list3.size());
    final EList<CallGraphItem> list4 = SoftwareUtil.collectCallGraphItems(this.run4.getCallGraph());
    Assert.assertEquals(
      "collectRunnableItems: 1 item expected", 1, list4.size());
  }
  
  @Test
  public void testLabelAccessMethods() {
    final Amalthea model = SoftwareModels.createModel2();
    final org.eclipse.app4mc.amalthea.model.Runnable run1 = IterableExtensions.<org.eclipse.app4mc.amalthea.model.Runnable>head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(model, "Run1", org.eclipse.app4mc.amalthea.model.Runnable.class));
    final Set<Label> set1 = SoftwareUtil.getAccessedLabelSet(run1, null);
    Assert.assertEquals(
      "getAccessedLabelSet: 5 items (label accesses) expected", 5, set1.size());
    final Set<Label> set2 = SoftwareUtil.getReadLabelSet(run1, null);
    Assert.assertEquals(
      "getReadLabelSet: 4 items (label accesses) expected", 4, set2.size());
    final Set<Label> set3 = SoftwareUtil.getWriteLabelSet(run1, null);
    Assert.assertEquals(
      "getWriteLabelSet: 3 items (label accesses) expected", 3, set3.size());
    final List<LabelAccess> list1 = SoftwareUtil.getLabelAccessList(run1, null);
    Assert.assertEquals(
      "getLabelAccessList: 10 items (label accesses) expected", 10, list1.size());
    final List<LabelAccess> list2 = SoftwareUtil.getReadLabelAccessList(run1, null);
    Assert.assertEquals(
      "getReadLabelAccessList: 5 items (label accesses) expected", 5, list2.size());
    final List<LabelAccess> list3 = SoftwareUtil.getWriteLabelAccessList(run1, null);
    Assert.assertEquals(
      "getWriteLabelAccessList: 3 items (label accesses) expected", 3, list3.size());
    final Map<Label, List<LabelAccess>> map1 = SoftwareUtil.getLabelToLabelAccessMap(run1, null);
    Assert.assertEquals(
      "getAccessedLabelSet: 5 items (label -> label accesses) expected", 5, map1.size());
    final Map<Label, List<LabelAccessStatistic>> map2 = SoftwareUtil.getLabelAccessStatisticsMap(run1, null);
    Assert.assertEquals(
      "getAccessedLabelSet: 3 items (label -> access statistics) expected", 3, map2.size());
  }
}
