/**
 ********************************************************************************
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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

import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TimeUnit
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*

class ConstraintsModels {

	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder
	extension ConstraintsBuilder b3 = new ConstraintsBuilder

	def static void main(String[] args) {
		val model1 = ConstraintsModels.createModel1()
		AmaltheaWriter.writeToFileNamed(model1, "test-data/ConstraintsUtilTestModel-gen.amxmi")
	}

	def static createModel1() {
		return (new ConstraintsModels).model1()
	}

	def model1() {
		val model = 
			amalthea [
				softwareModel [
					label [name = "Lab1"]
					label [name = "Lab2"]

					runnable [ name = "Run1" ]
					runnable [ name = "Run2" ]
					
					task [ name = "Task1" ]
					task [ name = "Task2" ]
				]
				
				constraintsModel [
					deadline_Process(_find(Task, "Task1"), createTime(20, TimeUnit::MS))
					deadline_Process(_find(Task, "Task1"), createTime(30, TimeUnit::MS))
					deadline_Process(_find(Task, "Task1"), createTime(100, TimeUnit::MS))
					
					deadline_Runnable(_find(Runnable, "Run2"), createTime(80, TimeUnit::NS))
					deadline_Runnable(_find(Runnable, "Run2"), null)
				]
			]
		return model
	}

}