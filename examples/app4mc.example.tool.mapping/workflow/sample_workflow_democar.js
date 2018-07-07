/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 * *******************************************************************************
 */

// ********************************************************************************  
// name                 : Workflow/mapping
// script-type          : JavaScript
// description          : Runs the Mapping workflow
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
const PROJECT = BASE + "/app4mc.example.tool.mapping"
const MODEL_LOCATION1 = PROJECT + "/model/AMALTHEA_Democar_MappingExample.amxmi"
const MODEL_LOCATION2 = PROJECT + "/model/AMALTHEA_Democar_MappingExample-hw.amxmi"

var ctx = new DefaultContext()

//Reader
var reader = new ModelReader()
reader.addFileName(MODEL_LOCATION1)
reader.addFileName(MODEL_LOCATION2)
reader.run(ctx)

//create tasks based on initial model
//result is saved in modelslot createtasks
var createTasks = new CreateTasks()
createTasks.run(ctx)

//Writer
var writer = new ModelWriter()
writer.setModelSlot("createtasks")
writer.setFileName("createtasks")
writer.setSingleFile(true)
writer.setOutputDir(PROJECT + "/workflow-output/demo/create")
writer.run(ctx)

//generate mapping based on initial model
//result model is saved in modelslot mapping
var mappingDfg = new GenerateMapping()
mappingDfg.setModelSlot("createtasks")
mappingDfg.setMappingAlg("dfg")
mappingDfg.setEnableLog(true)
mappingDfg.run(ctx)

//Writer for Dfg
var writerDfg = new ModelWriter()
writerDfg.setModelSlot("mapping")
writerDfg.setFileName("mapping_dfg")
writerDfg.setSingleFile(true)
writerDfg.setOutputDir(PROJECT + "/workflow-output/demo/dfg")
writerDfg.run(ctx)

//generate mapping based on initial model with ilp
//result model is saved in modelslot mappingilp
var mappingIlp = new GenerateMapping()
mappingIlp.setModelSlot("createtasks")
mappingIlp.setMappingAlg("ilp_lb")
mappingIlp.setEnableLog(true)
mappingIlp.setResultSlot("mappingilp")
mappingIlp.run(ctx)

//Writer for Ilp
var writerIlp = new ModelWriter()
writerIlp.setModelSlot("mappingilp")
writerIlp.setFileName("mapping_ilplb")
writerIlp.setSingleFile(true)
writerIlp.setOutputDir(PROJECT + "/workflow-output/demo/ilp")
writerIlp.run(ctx)

//generate mapping based on initial model with GA
//result model is saved in modelslot mappingga
var mappingGa = new GenerateMapping()
mappingGa.setModelSlot("createtasks")
mappingGa.setMappingAlg("ga_lb")
mappingGa.setEnableLog(true)
mappingGa.setResultSlot("mappingga")
mappingGa.run(ctx)

//Writer for GA (Load Balancing)
var writerGa = new ModelWriter()
writerGa.setModelSlot("mappingga")
writerGa.setFileName("mapping_galb")
writerGa.setSingleFile(true)
writerGa.setOutputDir(PROJECT + "/workflow-output/demo/ga_lb")
writerGa.run(ctx)

//generate mapping based on initial model with GA
//result model is saved in modelslot mappingga
var mappingGaCon = new GenerateMapping()
mappingGaCon.setModelSlot("createtasks")
mappingGaCon.setMappingAlg("ga_constraints")
mappingGaCon.setEnableLog(true)
mappingGaCon.setResultSlot("mappinggacon")
mappingGaCon.run(ctx)

//Writer for GA (Constrained)
var writerGaCon = new ModelWriter()
writerGaCon.setModelSlot("mappinggacon")
writerGaCon.setFileName("mapping_gacon")
writerGaCon.setSingleFile(true)
writerGaCon.setOutputDir(PROJECT + "/workflow-output/demo/ga_con")
writerGaCon.run(ctx)

print("Finished Workflow")
ctx.clear()
endWorkflow()