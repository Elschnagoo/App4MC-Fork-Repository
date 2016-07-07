/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

// ********************************************************************************  
// name                 : Workflow/mapping_energy
// script-type          : JavaScript
// description          : Runs the Mapping energy workflow
// ********************************************************************************  

//basic setup
loadModule('/System/Resources')
loadModule('/APP4MC/Workflow')

//Importing needed packages
importPackage(org.eclipse.app4mc.amalthea.workflow.component)
importPackage(org.eclipse.app4mc.amalthea.workflow.core)
importPackage(org.eclipse.app4mc.multicore.openmapping.workflow)

//Configure logging
addLoggerToConsole("org.eclipse.app4mc.multicore")
addLoggerToConsole("org.eclipse.app4mc.amalthea.workflow")


print("Starting Workflow ...")
//general setup
const BASE = "platform:/resource"
const PROJECT = BASE + "/org.eclipse.app4mc.amalthea.example.democar.mapping"
const MODEL_LOCATION1 = PROJECT + "/modelEnergyEfficient/AMALTHEA_Democar_EnergyEfficientMappingExample.amxmi"
const MODEL_LOCATION2 = PROJECT + "/modelEnergyEfficient/IMX6.amxmi"

var ctx = new DefaultContext()

//Reader
var reader = new ModelReader()
reader.addFileName(MODEL_LOCATION1)
reader.addFileName(MODEL_LOCATION2)
reader.run(ctx)

//generate mapping based on initial model
//result model is saved in modelslot mapping
var mappingIlpen = new GenerateMapping()
mappingIlpen.setMappingAlg("ilp_energy")
mappingIlpen.setEnableLog(true)
mappingIlpen.run(ctx)

//Writer for Dfg
var writerIlpen = new ModelWriter()
writerIlpen.setModelSlot("mapping")
writerIlpen.setFileName("mapping_democar")
writerIlpen.setSingleFile(true)
writerIlpen.setOutputDir(PROJECT + "/workflow-output/ilpen/democar")
writerIlpen.run(ctx)

//Reader
var reader = new ModelReader()
reader.addFileName(PROJECT + "/modelEnergyEfficient/AMALTHEA_HVAC_EnergyEfficientMapping_Example.amxmi")
reader.addFileName(PROJECT + "/modelEnergyEfficient/IMX6.amxmi")
reader.run(ctx)

//generate mapping based on initial model
//result model is saved in modelslot mapping
//reuse already defined component
mappingIlpen.run(ctx)

//Writer for Dfg

writerIlpen.setFileName("mapping_hvac")
writerIlpen.setOutputDir(PROJECT + "/workflow-output/ilpen/hvac")
writerIlpen.run(ctx)


print("Finished Workflow")
ctx.clear()
endWorkflow()