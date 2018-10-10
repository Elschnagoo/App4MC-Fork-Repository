/**
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.model.util.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.util.ModelUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class AmaltheaIndexTest {
  @Before
  public void setUp() throws Exception {
  }
  
  @After
  public void tearDown() throws Exception {
  }
  
  @Test
  public void testIndexSearch() {
    final Amalthea model = this.createTestModel();
    final Set<? extends Label> elementsBasedOnName = AmaltheaIndex.<Label>getElements(model, "d0", Label.class);
    Assert.assertEquals(
      "Label d0 present in the model, but not found by index search.", 1, elementsBasedOnName.size());
    final Set<? extends Label> elementsBasedOnRegex = AmaltheaIndex.<Label>getElements(model, Pattern.compile("d\\d"), Label.class);
    Assert.assertEquals(
      "Label d0, d1 present in the model, but not found by index search.", 2, elementsBasedOnRegex.size());
    final Set<? extends Label> elementsBasedOnType = AmaltheaIndex.<Label>getElements(model, Pattern.compile(".*"), Label.class);
    Assert.assertEquals(
      "Label d0, d1 present in the model, but not found by index search.", 2, elementsBasedOnType.size());
  }
  
  @Test
  public void testIndex() {
    final Amalthea model = this.createTestModel();
    Set<? extends Label> labelsBasedOnName = AmaltheaIndex.<Label>getElements(model, "d0", Label.class);
    Assert.assertEquals(
      "Label d0 should already be present in the model.", 1, labelsBasedOnName.size());
    Set<? extends org.eclipse.app4mc.amalthea.model.Runnable> runnablesBasedOnName = AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(model, "r0", org.eclipse.app4mc.amalthea.model.Runnable.class);
    Assert.assertEquals(
      "Runnable r0 should already be present in the model.", 1, runnablesBasedOnName.size());
    List<EObject> elements_to_be_deleted = new ArrayList<EObject>();
    elements_to_be_deleted.addAll(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(model, "r0", org.eclipse.app4mc.amalthea.model.Runnable.class));
    elements_to_be_deleted.addAll(AmaltheaIndex.<Label>getElements(model, Pattern.compile("d\\d"), Label.class));
    Assert.assertEquals(
      "Elements to delete should be runnable r0 and labels l0 and l1. ", 3, elements_to_be_deleted.size());
    AmaltheaIndex.deleteAll(elements_to_be_deleted);
    runnablesBasedOnName = AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(model, "r0", org.eclipse.app4mc.amalthea.model.Runnable.class);
    Assert.assertEquals(
      "Runnable r0 is removed from the model..and it is not expected to be found as a part of the index.", 0, runnablesBasedOnName.size());
    labelsBasedOnName = AmaltheaIndex.<Label>getElements(model, "d0", Label.class);
    Assert.assertEquals(
      "Label d0 is removed from the model..and it is not expected to be found as a part of the index.", 0, labelsBasedOnName.size());
    labelsBasedOnName = AmaltheaIndex.<Label>getElements(model, "d1", Label.class);
    Assert.assertEquals(
      "Label d1 is removed from the model..and it is not expected to be found as a part of the index.", 0, labelsBasedOnName.size());
  }
  
  @Test
  public void testRemoveAllLabels() {
    final Amalthea model = this.createTestModel();
    Assert.assertEquals("label d0 is present in the model", 1, AmaltheaIndex.<Label>getElements(model, "d0", Label.class).size());
    AmaltheaIndex.deleteAll(model.getSwModel().getLabels());
    Assert.assertEquals("label d0 is not removed from model", 0, AmaltheaIndex.<Label>getElements(model, "d0", Label.class).size());
    final org.eclipse.app4mc.amalthea.model.Runnable runnable0 = IterableExtensions.head(AmaltheaIndex.<org.eclipse.app4mc.amalthea.model.Runnable>getElements(model, "r0", org.eclipse.app4mc.amalthea.model.Runnable.class));
    final EList<RunnableItem> runnableItems = runnable0.getRunnableItems();
    final Function1<RunnableItem, Boolean> _function = (RunnableItem s) -> {
      return Boolean.valueOf(((s instanceof LabelAccess) && (((LabelAccess) s).getData() != null)));
    };
    final Iterable<RunnableItem> filteredItems = IterableExtensions.<RunnableItem>filter(runnableItems, _function);
    Assert.assertEquals("runnable0 should not contain reference to Label in LabelAccess - as all labels are deleted", 0, IterableExtensions.size(filteredItems));
  }
  
  private Amalthea createTestModel() {
    final Amalthea model = AmaltheaFactory.eINSTANCE.createAmalthea();
    final SWModel sw = ModelUtil.getOrCreateSwModel(model);
    final MappingModel map = ModelUtil.getOrCreateMappingModel(model);
    Label label0 = AmaltheaFactory.eINSTANCE.createLabel();
    label0.setName("d0");
    sw.getLabels().add(label0);
    Label label1 = AmaltheaFactory.eINSTANCE.createLabel();
    label1.setName("d1");
    sw.getLabels().add(label1);
    org.eclipse.app4mc.amalthea.model.Runnable runnable0 = AmaltheaFactory.eINSTANCE.createRunnable();
    runnable0.setName("r0");
    sw.getRunnables().add(runnable0);
    for (int i = 0; (i < 10); i++) {
      {
        LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
        la.setData(label0);
        runnable0.getRunnableItems().add(la);
      }
    }
    MemoryMapping elementMapping = AmaltheaFactory.eINSTANCE.createMemoryMapping();
    elementMapping.setAbstractElement(label0);
    map.getMemoryMapping().add(elementMapping);
    return model;
  }
}
