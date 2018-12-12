/**
 ********************************************************************************
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
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.models

import org.eclipse.app4mc.amalthea.model.CacheDefinition
import org.eclipse.app4mc.amalthea.model.ConnectionHandler
import org.eclipse.app4mc.amalthea.model.ConnectionHandlerDefinition
import org.eclipse.app4mc.amalthea.model.DataRateUnit
import org.eclipse.app4mc.amalthea.model.DataSizeUnit
import org.eclipse.app4mc.amalthea.model.FrequencyDomain
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.HwConnection
import org.eclipse.app4mc.amalthea.model.HwFeature
import org.eclipse.app4mc.amalthea.model.HwFeatureType
import org.eclipse.app4mc.amalthea.model.HwPort
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.Memory
import org.eclipse.app4mc.amalthea.model.MemoryDefinition
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
import org.eclipse.app4mc.amalthea.model.PuType
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*

class HardwareModels {
	
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension HardwareBuilder b2 = new HardwareBuilder

	def static void main(String[] args) {
		val model1 = (new HardwareModels).model1()
		AmaltheaWriter.writeToFileNamed(model1, "test-data/HwUtilTestModel-gen.amxmi")
	}
		
	def static hwModel1() {
		(new HardwareModels).model1()
	}
		
	def model1() {
		val model = amalthea [
			hardwareModel [
				
				// ***** Features *****
				
				featureCategory [
					name = "category1"
					feature [ name = "feature2"; value = 1.0 ]
				]
				featureCategory [
					name = "category2"
					featureType = HwFeatureType::PERFORMANCE
					feature [ name = "feature1"; value = 2.0 ]
				]
				
				// ***** Definitions *****
				
				definition_ProcessingUnit [
					name = "PuDef1"
					features += _find(HwFeature, "feature1")
				]
				
				definition_Memory [
					name = "MemDef1"
					size = createDataSize(4, DataSizeUnit::MB)
					dataRate = createDataRate(6, DataRateUnit::GBIT_PER_SECOND)
					accessLatency = createLatency(5)
				]
				
				definition_ConnectionHandler [
					name = "ChDef1"
					readLatency = createLatency(6)
					writeLatency = createLatency(3)
				]
				
				definition_ProcessingUnit [
					name = "PuDef2"
					puType = PuType::CPU
					features += _find(HwFeature, "feature2")
				]
				
				definition_Cache [
					name = "CacheDef1"
					NWays = 0
					coherency=false
					exclusive = false
					hitRate = 0.0
					size = createDataSize(2, DataSizeUnit::MB)
					lineSize = createDataSize(64, DataSizeUnit::B)
					accessLatency = createLatency(2)
				]
				
				definition_ConnectionHandler [
					name = "ch_test1_def"
					readLatency = createLatency(5)
					dataRate = createDataRate(800, DataRateUnit::MI_BPER_SECOND)
				]
				
				definition_ConnectionHandler [
					name="ch_test2_def"
					readLatency = createLatency(createDeviation(createGaussDistribution(15, 3), 10, 20))
					dataRate = createDataRate(4, DataRateUnit::GI_BPER_SECOND)
				]
				
				// ***** Domains *****
				
				domain_Frequency [
					name = "freq1"
					clockGating = false
					defaultValue = createFrequency(200, FrequencyUnit::MHZ)
				]
				
				domain_Frequency [
					name = "freq2"
					clockGating = false
					defaultValue = createFrequency(500, FrequencyUnit::MHZ)
				]
				
				// ***** Structures *****
				
				structure [
					name = "Top1"
					_reg(name)
					
					module_Memory [
						name = "Mem1_top1" _reg("top1_mem1")
						definition = _find(MemoryDefinition, "MemDef1")
						frequencyDomain = _find(FrequencyDomain, "freq1")
						port [ name = "P1" _reg("top1_mem1--p1") ]
					]
					
					module_ConnectionHandler [
						name = "CH1_top1" _reg("top1_ch1")
						definition = _find(ConnectionHandlerDefinition, "ChDef1")
						frequencyDomain = _find(FrequencyDomain, "freq1")
						port [ name = "P1" _reg("top1_ch1--p1") ]
						port [ name = "P2" _reg("top1_ch1--p2") ]
						port [ name = "P3" _reg("top1_ch1--p3") ]
						port [ name = "P4" _reg("top1_ch1--p4") ]
					]
					
					structure [
						name = "Level2"
						_reg(name)
						
						module_ProcessingUnit [
							name = "Pu1_Lev2" _reg("lev2_pu1")
							definition = _find(ProcessingUnitDefinition, "PuDef2")
							frequencyDomain = _find(FrequencyDomain, "freq2")
							port [ name = "P1" _reg("lev2_pu1--p1") ]
						]
						module_ProcessingUnit [
							name = "Pu2_Lev2" _reg("lev2_pu2")
							definition = _find(ProcessingUnitDefinition, "PuDef2")
							frequencyDomain = _find(FrequencyDomain, "freq2")
							port [ name = "P1" _reg("lev2_pu2--p1") ]
						]
						
						structure [
							name = "Level3"
							_reg(name)
							
							module_ProcessingUnit [
								name = "Pu1_Lev3" _reg("lev3_pu1")
								definition = _find(ProcessingUnitDefinition, "PuDef1")
								frequencyDomain = _find(FrequencyDomain, "freq2")
								port [ name = "P1"  _reg("lev3_pu1--p1") ]
							]
							
							module_Memory [
								name = "Mem1_Lev3" _reg("lev3_mem1")
								definition = _find(MemoryDefinition, "MemDef1")
								frequencyDomain = _find(FrequencyDomain, "freq1")
								port [ name = "P1"  _reg("lev3_mem1--p1") ]
							]
						]
					]
				]

				structure [
					name = "Top2"
					_reg(name)
					
					module_Memory [
						name = "Mem1_top2" _reg("top2_mem1")
						definition = _find(MemoryDefinition, "MemDef1")
						frequencyDomain = _find(FrequencyDomain, "freq2")
						port [ name = "P1"  _reg("top2_mem1--p1") ]
					]
					
					structure [
						name = "Level2_2"
						_reg(name)
						
						module_ProcessingUnit [
							name = "Pu1_Lev2_2" _reg("lev22_pu1")
							definition = _find(ProcessingUnitDefinition, "PuDef2")
							frequencyDomain = _find(FrequencyDomain, "freq2")
							port [ name = "P1"  _reg("lev22_pu1--p1") ]
							cache [
								name = "D-Cache"
								definition = _find(CacheDefinition, "CacheDef1")
								frequencyDomain = _find(FrequencyDomain, "freq1")
							]
						]
						
						module_ProcessingUnit [
							name = "test" _reg("lev22_pu2")
							definition = _find(ProcessingUnitDefinition, "PuDef1")
							frequencyDomain = _find(FrequencyDomain, "freq1")
						]
						
						module_ConnectionHandler [
							name = "ch1"
							definition = _find(ConnectionHandlerDefinition, "ch_test1_def")
							frequencyDomain = _find(FrequencyDomain, "freq1")
						]
						
						module_ConnectionHandler [
							name = "ch2"
							definition = _find(ConnectionHandlerDefinition, "ch_test2_def")
							frequencyDomain = _find(FrequencyDomain, "freq1")
						]
					]
				]
			]
		]
		
		// ***** Connections *****
		
		val top1 = _ref(HwStructure, "Top1")
		top1.connection [
			name = "con_1_top1"
			port1 = _ref(HwPort, "top1_ch1--p1")
			port2 = _ref(HwPort, "top1_mem1--p1")
		]
		top1.connection [
			name = "con_2_top1"
			port1 = _ref(HwPort, "lev3_pu1--p1")
			port2 = _ref(HwPort, "top1_ch1--p2")
			readLatency = createLatency(3)
			writeLatency = createLatency(3)
		]
		top1.connection [
			name = "con_3_top1"
			port1 = _ref(HwPort, "lev2_pu1--p1")
			port2 = _ref(HwPort, "top1_ch1--p3")
			readLatency = createLatency(2)
			writeLatency = createLatency(1)
		]
		top1.connection [
			name = "con_4_top1"
			port1 = _ref(HwPort, "lev2_pu2--p1")
			port2 = _ref(HwPort, "top1_ch1--p4")
			dataRate = createDataRate(1, DataRateUnit::GB_PER_SECOND)
		]

		val lev22 = _ref(HwStructure, "Level2_2")
		lev22.connection [
			name = "con1_top2"
			port1 = _ref(HwPort, "lev22_pu1--p1")
			port2 = _ref(HwPort, "top2_mem1--p1")
			readLatency = createLatency(6)
			writeLatency = createLatency(0)
		]
		
		// ***** Accesses *****
		
		val pu21 = _ref(ProcessingUnit, "lev2_pu1")
		pu21.access [
			name = "ae1"
			destination = _ref(Memory, "lev3_mem1")
			readLatency = createLatency(4)
			writeLatency = createLatency(3)
		]
		pu21.access [
			name = "ae2"
			destination = _ref(Memory, "top1_mem1")
			path [
				name = "haplev3"
				pathElements += _find(HwConnection, "con_3_top1")
				pathElements += _ref(ConnectionHandler, "top1_ch1")
				pathElements += _find(HwConnection, "con_1_top1")
			]
		]
		
		val pu22 = _ref(ProcessingUnit, "lev2_pu2")
		pu22.access [
			name = "ae1"
			destination = _ref(Memory, "lev3_mem1")
			readLatency = createLatency(4)
			writeLatency = createLatency(3)
		]
		pu22.access [
			name = "ae2"
			destination = _ref(Memory, "top1_mem1")
			path [
				name = "haplev3"
				pathElements += _find(HwConnection, "con_4_top1")
				pathElements += _ref(ConnectionHandler, "top1_ch1")
				pathElements += _find(HwConnection, "con_1_top1")
			]
		]
		
		val pu31 = _ref(ProcessingUnit, "lev3_pu1")			
		pu31.access [
			name = "ae1"
			destination = _ref(Memory, "lev3_mem1")
			readLatency = createLatency(4)
			writeLatency = createLatency(3)
		]
		pu31.access [
			name = "ae2"
			destination = _ref(Memory, "top1_mem1")
			path [
				name = "haplev3"
				pathElements += _find(HwConnection, "con_2_top1")
				pathElements += _ref(ConnectionHandler, "top1_ch1")
				pathElements += _find(HwConnection, "con_1_top1")
			]
		]
		pu31.access [
			name = "ae3"
			destination = _ref(Memory, "top2_mem1")
			readLatency = createLatency(30)
			writeLatency = createLatency(15)
			dataRate = createDataRate(4, DataRateUnit::GB_PER_SECOND)
		]
				
		val pu221 = _ref(ProcessingUnit, "lev22_pu1")
		pu221.access [
			name = "ae1"
			destination = _ref(Memory, "lev3_mem1")
			readLatency = createLatency(20)
			writeLatency = createLatency(10)
		]
		pu221.access [
			name = "ae2"
			destination = _ref(Memory, "top1_mem1")
			readLatency = createLatency(createDeviation(createGaussDistribution(28,2), 24, 32))
			writeLatency = createLatency(8)
		]
		pu221.access [
			name = "ae3"
			destination = _ref(Memory, "top2_mem1")
			path [
				name = "hap"
				pathElements += _find(HwConnection, "con1_top2")
			]
			dataRate = createDataRate(4, DataRateUnit::GB_PER_SECOND)
		]
		
		val pu222 = _ref(ProcessingUnit, "lev22_pu2")
		pu222.access [
			name = "testAccessElement"
			destination = _ref(Memory, "top2_mem1")
			path [
				name = "testpath"
				pathElements += _find(ConnectionHandler, "ch1")
				pathElements += _find(ConnectionHandler, "ch2")
			]
		]
		
		return model
	}
}