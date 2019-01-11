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
package org.eclipse.app4mc.amalthea.models;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.CacheDefinition;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition;
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwAccessElement;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwFeatureType;
import org.eclipse.app4mc.amalthea.model.HwPathElement;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.PuType;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class HardwareModels {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private HardwareBuilder b2 = new HardwareBuilder();
  
  public static void main(final String[] args) {
    final Amalthea model1 = new HardwareModels().model1();
    AmaltheaWriter.writeToFileNamed(model1, "test-data/HwUtilTestModel-gen.amxmi");
  }
  
  public static Amalthea hwModel1() {
    return new HardwareModels().model1();
  }
  
  public Amalthea model1() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<HWModel> _function_1 = (HWModel it_1) -> {
        final Procedure1<HwFeatureCategory> _function_2 = (HwFeatureCategory it_2) -> {
          it_2.setName("category1");
          final Procedure1<HwFeature> _function_3 = (HwFeature it_3) -> {
            it_3.setName("feature2");
            it_3.setValue(1.0);
          };
          this.b2.feature(it_2, _function_3);
        };
        this.b2.featureCategory(it_1, _function_2);
        final Procedure1<HwFeatureCategory> _function_3 = (HwFeatureCategory it_2) -> {
          it_2.setName("category2");
          it_2.setFeatureType(HwFeatureType.PERFORMANCE);
          final Procedure1<HwFeature> _function_4 = (HwFeature it_3) -> {
            it_3.setName("feature1");
            it_3.setValue(2.0);
          };
          this.b2.feature(it_2, _function_4);
        };
        this.b2.featureCategory(it_1, _function_3);
        final Procedure1<ProcessingUnitDefinition> _function_4 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("PuDef1");
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "feature1");
          _features.add(__find);
        };
        this.b2.definition_ProcessingUnit(it_1, _function_4);
        final Procedure1<MemoryDefinition> _function_5 = (MemoryDefinition it_2) -> {
          it_2.setName("MemDef1");
          it_2.setSize(FactoryUtil.createDataSize(4, DataSizeUnit.MB));
          it_2.setDataRate(FactoryUtil.createDataRate(6, DataRateUnit.GBIT_PER_SECOND));
          it_2.setAccessLatency(FactoryUtil.createLatency(5));
        };
        this.b2.definition_Memory(it_1, _function_5);
        final Procedure1<ConnectionHandlerDefinition> _function_6 = (ConnectionHandlerDefinition it_2) -> {
          it_2.setName("ChDef1");
          it_2.setReadLatency(FactoryUtil.createLatency(6));
          it_2.setWriteLatency(FactoryUtil.createLatency(3));
        };
        this.b2.definition_ConnectionHandler(it_1, _function_6);
        final Procedure1<ProcessingUnitDefinition> _function_7 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("PuDef2");
          it_2.setPuType(PuType.CPU);
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "feature2");
          _features.add(__find);
        };
        this.b2.definition_ProcessingUnit(it_1, _function_7);
        final Procedure1<CacheDefinition> _function_8 = (CacheDefinition it_2) -> {
          it_2.setName("CacheDef1");
          it_2.setNWays(0);
          it_2.setCoherency(false);
          it_2.setExclusive(false);
          it_2.setHitRate(0.0);
          it_2.setSize(FactoryUtil.createDataSize(2, DataSizeUnit.MB));
          it_2.setLineSize(FactoryUtil.createDataSize(64, DataSizeUnit.B));
          it_2.setAccessLatency(FactoryUtil.createLatency(2));
        };
        this.b2.definition_Cache(it_1, _function_8);
        final Procedure1<ConnectionHandlerDefinition> _function_9 = (ConnectionHandlerDefinition it_2) -> {
          it_2.setName("ch_test1_def");
          it_2.setReadLatency(FactoryUtil.createLatency(5));
          it_2.setDataRate(FactoryUtil.createDataRate(800, DataRateUnit.MI_BPER_SECOND));
        };
        this.b2.definition_ConnectionHandler(it_1, _function_9);
        final Procedure1<ConnectionHandlerDefinition> _function_10 = (ConnectionHandlerDefinition it_2) -> {
          it_2.setName("ch_test2_def");
          it_2.setReadLatency(FactoryUtil.createDiscreteValueGaussDistribution(15, 3, Long.valueOf(10L), Long.valueOf(20L)));
          it_2.setDataRate(FactoryUtil.createDataRate(4, DataRateUnit.GI_BPER_SECOND));
        };
        this.b2.definition_ConnectionHandler(it_1, _function_10);
        final Procedure1<FrequencyDomain> _function_11 = (FrequencyDomain it_2) -> {
          it_2.setName("freq1");
          it_2.setClockGating(false);
          it_2.setDefaultValue(FactoryUtil.createFrequency(200, FrequencyUnit.MHZ));
        };
        this.b2.domain_Frequency(it_1, _function_11);
        final Procedure1<FrequencyDomain> _function_12 = (FrequencyDomain it_2) -> {
          it_2.setName("freq2");
          it_2.setClockGating(false);
          it_2.setDefaultValue(FactoryUtil.createFrequency(500, FrequencyUnit.MHZ));
        };
        this.b2.domain_Frequency(it_1, _function_12);
        final Procedure1<HwStructure> _function_13 = (HwStructure it_2) -> {
          it_2.setName("Top1");
          this.b1.<HwStructure>_reg(it_2, it_2.getName());
          final Procedure1<Memory> _function_14 = (Memory it_3) -> {
            it_3.setName("Mem1_top1");
            this.b1.<Memory>_reg(it_3, "top1_mem1");
            it_3.setDefinition(this.b1.<MemoryDefinition>_find(it_3, MemoryDefinition.class, "MemDef1"));
            it_3.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_3, FrequencyDomain.class, "freq1"));
            final Procedure1<HwPort> _function_15 = (HwPort it_4) -> {
              it_4.setName("P1");
              this.b1.<HwPort>_reg(it_4, "top1_mem1--p1");
            };
            this.b2.port(it_3, _function_15);
          };
          this.b2.module_Memory(it_2, _function_14);
          final Procedure1<ConnectionHandler> _function_15 = (ConnectionHandler it_3) -> {
            it_3.setName("CH1_top1");
            this.b1.<ConnectionHandler>_reg(it_3, "top1_ch1");
            it_3.setDefinition(this.b1.<ConnectionHandlerDefinition>_find(it_3, ConnectionHandlerDefinition.class, "ChDef1"));
            it_3.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_3, FrequencyDomain.class, "freq1"));
            final Procedure1<HwPort> _function_16 = (HwPort it_4) -> {
              it_4.setName("P1");
              this.b1.<HwPort>_reg(it_4, "top1_ch1--p1");
            };
            this.b2.port(it_3, _function_16);
            final Procedure1<HwPort> _function_17 = (HwPort it_4) -> {
              it_4.setName("P2");
              this.b1.<HwPort>_reg(it_4, "top1_ch1--p2");
            };
            this.b2.port(it_3, _function_17);
            final Procedure1<HwPort> _function_18 = (HwPort it_4) -> {
              it_4.setName("P3");
              this.b1.<HwPort>_reg(it_4, "top1_ch1--p3");
            };
            this.b2.port(it_3, _function_18);
            final Procedure1<HwPort> _function_19 = (HwPort it_4) -> {
              it_4.setName("P4");
              this.b1.<HwPort>_reg(it_4, "top1_ch1--p4");
            };
            this.b2.port(it_3, _function_19);
          };
          this.b2.module_ConnectionHandler(it_2, _function_15);
          final Procedure1<HwStructure> _function_16 = (HwStructure it_3) -> {
            it_3.setName("Level2");
            this.b1.<HwStructure>_reg(it_3, it_3.getName());
            final Procedure1<ProcessingUnit> _function_17 = (ProcessingUnit it_4) -> {
              it_4.setName("Pu1_Lev2");
              this.b1.<ProcessingUnit>_reg(it_4, "lev2_pu1");
              it_4.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_4, ProcessingUnitDefinition.class, "PuDef2"));
              it_4.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_4, FrequencyDomain.class, "freq2"));
              final Procedure1<HwPort> _function_18 = (HwPort it_5) -> {
                it_5.setName("P1");
                this.b1.<HwPort>_reg(it_5, "lev2_pu1--p1");
              };
              this.b2.port(it_4, _function_18);
            };
            this.b2.module_ProcessingUnit(it_3, _function_17);
            final Procedure1<ProcessingUnit> _function_18 = (ProcessingUnit it_4) -> {
              it_4.setName("Pu2_Lev2");
              this.b1.<ProcessingUnit>_reg(it_4, "lev2_pu2");
              it_4.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_4, ProcessingUnitDefinition.class, "PuDef2"));
              it_4.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_4, FrequencyDomain.class, "freq2"));
              final Procedure1<HwPort> _function_19 = (HwPort it_5) -> {
                it_5.setName("P1");
                this.b1.<HwPort>_reg(it_5, "lev2_pu2--p1");
              };
              this.b2.port(it_4, _function_19);
            };
            this.b2.module_ProcessingUnit(it_3, _function_18);
            final Procedure1<HwStructure> _function_19 = (HwStructure it_4) -> {
              it_4.setName("Level3");
              this.b1.<HwStructure>_reg(it_4, it_4.getName());
              final Procedure1<ProcessingUnit> _function_20 = (ProcessingUnit it_5) -> {
                it_5.setName("Pu1_Lev3");
                this.b1.<ProcessingUnit>_reg(it_5, "lev3_pu1");
                it_5.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_5, ProcessingUnitDefinition.class, "PuDef1"));
                it_5.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_5, FrequencyDomain.class, "freq2"));
                final Procedure1<HwPort> _function_21 = (HwPort it_6) -> {
                  it_6.setName("P1");
                  this.b1.<HwPort>_reg(it_6, "lev3_pu1--p1");
                };
                this.b2.port(it_5, _function_21);
              };
              this.b2.module_ProcessingUnit(it_4, _function_20);
              final Procedure1<Memory> _function_21 = (Memory it_5) -> {
                it_5.setName("Mem1_Lev3");
                this.b1.<Memory>_reg(it_5, "lev3_mem1");
                it_5.setDefinition(this.b1.<MemoryDefinition>_find(it_5, MemoryDefinition.class, "MemDef1"));
                it_5.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_5, FrequencyDomain.class, "freq1"));
                final Procedure1<HwPort> _function_22 = (HwPort it_6) -> {
                  it_6.setName("P1");
                  this.b1.<HwPort>_reg(it_6, "lev3_mem1--p1");
                };
                this.b2.port(it_5, _function_22);
              };
              this.b2.module_Memory(it_4, _function_21);
            };
            this.b2.structure(it_3, _function_19);
          };
          this.b2.structure(it_2, _function_16);
        };
        this.b2.structure(it_1, _function_13);
        final Procedure1<HwStructure> _function_14 = (HwStructure it_2) -> {
          it_2.setName("Top2");
          this.b1.<HwStructure>_reg(it_2, it_2.getName());
          final Procedure1<Memory> _function_15 = (Memory it_3) -> {
            it_3.setName("Mem1_top2");
            this.b1.<Memory>_reg(it_3, "top2_mem1");
            it_3.setDefinition(this.b1.<MemoryDefinition>_find(it_3, MemoryDefinition.class, "MemDef1"));
            it_3.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_3, FrequencyDomain.class, "freq2"));
            final Procedure1<HwPort> _function_16 = (HwPort it_4) -> {
              it_4.setName("P1");
              this.b1.<HwPort>_reg(it_4, "top2_mem1--p1");
            };
            this.b2.port(it_3, _function_16);
          };
          this.b2.module_Memory(it_2, _function_15);
          final Procedure1<HwStructure> _function_16 = (HwStructure it_3) -> {
            it_3.setName("Level2_2");
            this.b1.<HwStructure>_reg(it_3, it_3.getName());
            final Procedure1<ProcessingUnit> _function_17 = (ProcessingUnit it_4) -> {
              it_4.setName("Pu1_Lev2_2");
              this.b1.<ProcessingUnit>_reg(it_4, "lev22_pu1");
              it_4.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_4, ProcessingUnitDefinition.class, "PuDef2"));
              it_4.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_4, FrequencyDomain.class, "freq2"));
              final Procedure1<HwPort> _function_18 = (HwPort it_5) -> {
                it_5.setName("P1");
                this.b1.<HwPort>_reg(it_5, "lev22_pu1--p1");
              };
              this.b2.port(it_4, _function_18);
              final Procedure1<Cache> _function_19 = (Cache it_5) -> {
                it_5.setName("D-Cache");
                it_5.setDefinition(this.b1.<CacheDefinition>_find(it_5, CacheDefinition.class, "CacheDef1"));
                it_5.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_5, FrequencyDomain.class, "freq1"));
              };
              this.b2.cache(it_4, _function_19);
            };
            this.b2.module_ProcessingUnit(it_3, _function_17);
            final Procedure1<ProcessingUnit> _function_18 = (ProcessingUnit it_4) -> {
              it_4.setName("test");
              this.b1.<ProcessingUnit>_reg(it_4, "lev22_pu2");
              it_4.setDefinition(this.b1.<ProcessingUnitDefinition>_find(it_4, ProcessingUnitDefinition.class, "PuDef1"));
              it_4.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_4, FrequencyDomain.class, "freq1"));
            };
            this.b2.module_ProcessingUnit(it_3, _function_18);
            final Procedure1<ConnectionHandler> _function_19 = (ConnectionHandler it_4) -> {
              it_4.setName("ch1");
              it_4.setDefinition(this.b1.<ConnectionHandlerDefinition>_find(it_4, ConnectionHandlerDefinition.class, "ch_test1_def"));
              it_4.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_4, FrequencyDomain.class, "freq1"));
            };
            this.b2.module_ConnectionHandler(it_3, _function_19);
            final Procedure1<ConnectionHandler> _function_20 = (ConnectionHandler it_4) -> {
              it_4.setName("ch2");
              it_4.setDefinition(this.b1.<ConnectionHandlerDefinition>_find(it_4, ConnectionHandlerDefinition.class, "ch_test2_def"));
              it_4.setFrequencyDomain(this.b1.<FrequencyDomain>_find(it_4, FrequencyDomain.class, "freq1"));
            };
            this.b2.module_ConnectionHandler(it_3, _function_20);
          };
          this.b2.structure(it_2, _function_16);
        };
        this.b2.structure(it_1, _function_14);
      };
      this.b1.hardwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final HwStructure top1 = this.b1.<HwStructure>_ref(HwStructure.class, "Top1");
    final Procedure1<HwConnection> _function_1 = (HwConnection it) -> {
      it.setName("con_1_top1");
      it.setPort1(this.b1.<HwPort>_ref(HwPort.class, "top1_ch1--p1"));
      it.setPort2(this.b1.<HwPort>_ref(HwPort.class, "top1_mem1--p1"));
    };
    this.b2.connection(top1, _function_1);
    final Procedure1<HwConnection> _function_2 = (HwConnection it) -> {
      it.setName("con_2_top1");
      it.setPort1(this.b1.<HwPort>_ref(HwPort.class, "lev3_pu1--p1"));
      it.setPort2(this.b1.<HwPort>_ref(HwPort.class, "top1_ch1--p2"));
      it.setReadLatency(FactoryUtil.createLatency(3));
      it.setWriteLatency(FactoryUtil.createLatency(3));
    };
    this.b2.connection(top1, _function_2);
    final Procedure1<HwConnection> _function_3 = (HwConnection it) -> {
      it.setName("con_3_top1");
      it.setPort1(this.b1.<HwPort>_ref(HwPort.class, "lev2_pu1--p1"));
      it.setPort2(this.b1.<HwPort>_ref(HwPort.class, "top1_ch1--p3"));
      it.setReadLatency(FactoryUtil.createLatency(2));
      it.setWriteLatency(FactoryUtil.createLatency(1));
    };
    this.b2.connection(top1, _function_3);
    final Procedure1<HwConnection> _function_4 = (HwConnection it) -> {
      it.setName("con_4_top1");
      it.setPort1(this.b1.<HwPort>_ref(HwPort.class, "lev2_pu2--p1"));
      it.setPort2(this.b1.<HwPort>_ref(HwPort.class, "top1_ch1--p4"));
      it.setDataRate(FactoryUtil.createDataRate(1, DataRateUnit.GB_PER_SECOND));
    };
    this.b2.connection(top1, _function_4);
    final HwStructure lev22 = this.b1.<HwStructure>_ref(HwStructure.class, "Level2_2");
    final Procedure1<HwConnection> _function_5 = (HwConnection it) -> {
      it.setName("con1_top2");
      it.setPort1(this.b1.<HwPort>_ref(HwPort.class, "lev22_pu1--p1"));
      it.setPort2(this.b1.<HwPort>_ref(HwPort.class, "top2_mem1--p1"));
      it.setReadLatency(FactoryUtil.createLatency(6));
      it.setWriteLatency(FactoryUtil.createLatency(0));
    };
    this.b2.connection(lev22, _function_5);
    final ProcessingUnit pu21 = this.b1.<ProcessingUnit>_ref(ProcessingUnit.class, "lev2_pu1");
    final Procedure1<HwAccessElement> _function_6 = (HwAccessElement it) -> {
      it.setName("ae1");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "lev3_mem1"));
      it.setReadLatency(FactoryUtil.createLatency(4));
      it.setWriteLatency(FactoryUtil.createLatency(3));
    };
    this.b2.access(pu21, _function_6);
    final Procedure1<HwAccessElement> _function_7 = (HwAccessElement it) -> {
      it.setName("ae2");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "top1_mem1"));
      final Procedure1<HwAccessPath> _function_8 = (HwAccessPath it_1) -> {
        it_1.setName("haplev3");
        EList<HwPathElement> _pathElements = it_1.getPathElements();
        HwConnection __find = this.b1.<HwConnection>_find(it_1, HwConnection.class, "con_3_top1");
        _pathElements.add(__find);
        EList<HwPathElement> _pathElements_1 = it_1.getPathElements();
        ConnectionHandler __ref = this.b1.<ConnectionHandler>_ref(ConnectionHandler.class, "top1_ch1");
        _pathElements_1.add(__ref);
        EList<HwPathElement> _pathElements_2 = it_1.getPathElements();
        HwConnection __find_1 = this.b1.<HwConnection>_find(it_1, HwConnection.class, "con_1_top1");
        _pathElements_2.add(__find_1);
      };
      this.b2.path(it, _function_8);
    };
    this.b2.access(pu21, _function_7);
    final ProcessingUnit pu22 = this.b1.<ProcessingUnit>_ref(ProcessingUnit.class, "lev2_pu2");
    final Procedure1<HwAccessElement> _function_8 = (HwAccessElement it) -> {
      it.setName("ae1");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "lev3_mem1"));
      it.setReadLatency(FactoryUtil.createLatency(4));
      it.setWriteLatency(FactoryUtil.createLatency(3));
    };
    this.b2.access(pu22, _function_8);
    final Procedure1<HwAccessElement> _function_9 = (HwAccessElement it) -> {
      it.setName("ae2");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "top1_mem1"));
      final Procedure1<HwAccessPath> _function_10 = (HwAccessPath it_1) -> {
        it_1.setName("haplev3");
        EList<HwPathElement> _pathElements = it_1.getPathElements();
        HwConnection __find = this.b1.<HwConnection>_find(it_1, HwConnection.class, "con_4_top1");
        _pathElements.add(__find);
        EList<HwPathElement> _pathElements_1 = it_1.getPathElements();
        ConnectionHandler __ref = this.b1.<ConnectionHandler>_ref(ConnectionHandler.class, "top1_ch1");
        _pathElements_1.add(__ref);
        EList<HwPathElement> _pathElements_2 = it_1.getPathElements();
        HwConnection __find_1 = this.b1.<HwConnection>_find(it_1, HwConnection.class, "con_1_top1");
        _pathElements_2.add(__find_1);
      };
      this.b2.path(it, _function_10);
    };
    this.b2.access(pu22, _function_9);
    final ProcessingUnit pu31 = this.b1.<ProcessingUnit>_ref(ProcessingUnit.class, "lev3_pu1");
    final Procedure1<HwAccessElement> _function_10 = (HwAccessElement it) -> {
      it.setName("ae1");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "lev3_mem1"));
      it.setReadLatency(FactoryUtil.createLatency(4));
      it.setWriteLatency(FactoryUtil.createLatency(3));
    };
    this.b2.access(pu31, _function_10);
    final Procedure1<HwAccessElement> _function_11 = (HwAccessElement it) -> {
      it.setName("ae2");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "top1_mem1"));
      final Procedure1<HwAccessPath> _function_12 = (HwAccessPath it_1) -> {
        it_1.setName("haplev3");
        EList<HwPathElement> _pathElements = it_1.getPathElements();
        HwConnection __find = this.b1.<HwConnection>_find(it_1, HwConnection.class, "con_2_top1");
        _pathElements.add(__find);
        EList<HwPathElement> _pathElements_1 = it_1.getPathElements();
        ConnectionHandler __ref = this.b1.<ConnectionHandler>_ref(ConnectionHandler.class, "top1_ch1");
        _pathElements_1.add(__ref);
        EList<HwPathElement> _pathElements_2 = it_1.getPathElements();
        HwConnection __find_1 = this.b1.<HwConnection>_find(it_1, HwConnection.class, "con_1_top1");
        _pathElements_2.add(__find_1);
      };
      this.b2.path(it, _function_12);
    };
    this.b2.access(pu31, _function_11);
    final Procedure1<HwAccessElement> _function_12 = (HwAccessElement it) -> {
      it.setName("ae3");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "top2_mem1"));
      it.setReadLatency(FactoryUtil.createLatency(30));
      it.setWriteLatency(FactoryUtil.createLatency(15));
      it.setDataRate(FactoryUtil.createDataRate(4, DataRateUnit.GB_PER_SECOND));
    };
    this.b2.access(pu31, _function_12);
    final ProcessingUnit pu221 = this.b1.<ProcessingUnit>_ref(ProcessingUnit.class, "lev22_pu1");
    final Procedure1<HwAccessElement> _function_13 = (HwAccessElement it) -> {
      it.setName("ae1");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "lev3_mem1"));
      it.setReadLatency(FactoryUtil.createLatency(20));
      it.setWriteLatency(FactoryUtil.createLatency(10));
    };
    this.b2.access(pu221, _function_13);
    final Procedure1<HwAccessElement> _function_14 = (HwAccessElement it) -> {
      it.setName("ae2");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "top1_mem1"));
      it.setReadLatency(FactoryUtil.createDiscreteValueGaussDistribution(28, 2, Long.valueOf(24L), Long.valueOf(32L)));
      it.setWriteLatency(FactoryUtil.createLatency(8));
    };
    this.b2.access(pu221, _function_14);
    final Procedure1<HwAccessElement> _function_15 = (HwAccessElement it) -> {
      it.setName("ae3");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "top2_mem1"));
      final Procedure1<HwAccessPath> _function_16 = (HwAccessPath it_1) -> {
        it_1.setName("hap");
        EList<HwPathElement> _pathElements = it_1.getPathElements();
        HwConnection __find = this.b1.<HwConnection>_find(it_1, HwConnection.class, "con1_top2");
        _pathElements.add(__find);
      };
      this.b2.path(it, _function_16);
      it.setDataRate(FactoryUtil.createDataRate(4, DataRateUnit.GB_PER_SECOND));
    };
    this.b2.access(pu221, _function_15);
    final ProcessingUnit pu222 = this.b1.<ProcessingUnit>_ref(ProcessingUnit.class, "lev22_pu2");
    final Procedure1<HwAccessElement> _function_16 = (HwAccessElement it) -> {
      it.setName("testAccessElement");
      it.setDestination(this.b1.<Memory>_ref(Memory.class, "top2_mem1"));
      final Procedure1<HwAccessPath> _function_17 = (HwAccessPath it_1) -> {
        it_1.setName("testpath");
        EList<HwPathElement> _pathElements = it_1.getPathElements();
        ConnectionHandler __find = this.b1.<ConnectionHandler>_find(it_1, ConnectionHandler.class, "ch1");
        _pathElements.add(__find);
        EList<HwPathElement> _pathElements_1 = it_1.getPathElements();
        ConnectionHandler __find_1 = this.b1.<ConnectionHandler>_find(it_1, ConnectionHandler.class, "ch2");
        _pathElements_1.add(__find_1);
      };
      this.b2.path(it, _function_17);
    };
    this.b2.access(pu222, _function_16);
    return model;
  }
}
