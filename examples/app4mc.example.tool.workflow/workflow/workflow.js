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

// **************************************************************************************  
// name                 : Sample Workflow
// script-type          : JavaScript
// description          : This workflow is used to :
//		            	  - invoke "AmaltheaReader" Component to read AMALTHEA model files
//		            	  - invoke "CreateLabelsComponent" to add new labels
//		            	  - invoke "LabelsExtractorComponent" to extract all label names
//		            	  - invoke "AmaltheaWriter" Component to write the model in file
// ***************************************************************************************  

//basic setup
loadModule('/System/Resources')
loadModule("/System/JVM");
loadModule('/APP4MC/Workflow')

//Importing needed packages

// Below two packages are mandatory as they contain class's from the framework
	importPackage(org.eclipse.app4mc.amalthea.workflow.component)
	importPackage(org.eclipse.app4mc.amalthea.workflow.core)

// Below package is specific to the plugin (where user specific component class's are defined)

importPackage(app4mc.example.tool.workflow.components)
	
	
//Configure logging
addLoggerToConsole("org.eclipse.app4mc.amalthea.workflow")

//configure logging to the plugin which contains script class's

addLoggerToConsole("app4mc.example.tool.workflow")


print("Starting Workflow ...")

//general setup
const BASE = "platform:/resource"

const PROJECT = BASE + "/app4mc.example.tool.workflow"

const MODEL_LOCATION1 = PROJECT + "/model/AMALTHEA_Democar.amxmi"
const MODEL_LOCATION2 = PROJECT + "/model/AMALTHEA_Components.amxmi"

var ctx = new DefaultContext()

/*- 
 * *******************************************************************************
 * Read all AMALTHEA model's
 * ********************************************************************************
 */
var reader = new ModelReader()
reader.addFileName(MODEL_LOCATION1)
reader.addFileName(MODEL_LOCATION2)
reader.run(ctx)

/*- 
 * *******************************************************************************
 * Create and add Labels in the AMALTHEA model
 * ********************************************************************************
 */

var labelsCreationComponent = createInstance("workspace://app4mc.example.tool.workflow/src/components/CreateLabelsComponent.java")


labelsCreationComponent.getLabelNames().add("Test_Label_1");
labelsCreationComponent.getLabelNames().add("Test_Label_2");
labelsCreationComponent.getLabelNames().add("Test_Label_3");

labelsCreationComponent.run(ctx)

/*- 
 * *******************************************************************************
 * Print all Label names available in the AMALTHEA model
 * ********************************************************************************
 */
var labelsExtractorComponent = createInstance("workspace://app4mc.example.tool.workflow/src/components/LabelsExtractorComponent.java")

labelsExtractorComponent.run(ctx)


/*- 
 * *******************************************************************************
 * Write AMALTHEA model into a file
 * ********************************************************************************
 */
var writer = new ModelWriter()
writer.setFileName("createtasks")
writer.setSingleFile(true) //with this switch it is possible to generate either a single or multiple model files
writer.setOutputDir(PROJECT + "/workflow-output/")
writer.run(ctx)
 

print("Finished Workflow")
ctx.clear()
endWorkflow()