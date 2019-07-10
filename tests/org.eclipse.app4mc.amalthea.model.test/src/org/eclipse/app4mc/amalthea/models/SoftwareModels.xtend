package org.eclipse.app4mc.amalthea.models

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.EnumMode
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter

import static org.eclipse.app4mc.amalthea.model.LabelAccessEnum.*

class SoftwareModels {

	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder

	def static void main(String[] args) {
		val model1 = (new SoftwareModels).model1()
		AmaltheaWriter.writeToFileNamed(model1, "test-data/SoftwareUtilTestModel-gen.amxmi")
	}

	def static createModel1() {
		return (new SoftwareModels).model1()
	}

	def static createModel2() {
		return (new SoftwareModels).model2()
	}

	def model1() {
		val model = 
			amalthea [
				softwareModel [
					mode_Enum [ name = "state"
						literal [name = "pre-drive" ]
						literal [name = "drive" ]
						literal [name = "post-drive" ]
					]
					modeLabel [ name = "car-state" mode = _find(EnumMode, "state")  initialValue = "pre-drive"]
					
					label [name = "Lab1"]
					label [name = "Lab2"]
					label [name = "Lab3"]
					label [name = "Lab4"]
					label [name = "Lab5"]

					runnable [ name = "Run1"
						callGraph [
							ticks [ defaultConstant(200) ]
							modeSwitch [
								defaultEntry [
									labelAccess [ access = READ; data = _find(Label, "Lab1") ]
									labelAccess [ access = READ; data = _find(Label, "Lab2") ]
									ticks [ defaultConstant(333) ]
									labelAccess [ access = WRITE; data = _find(Label, "Lab3") ]
									labelAccess [ access = WRITE; data = _find(Label, "Lab4") ]
								]
							]
						]
					]
					runnable [ name = "Run2"
						callGraph [
							ticks [ defaultConstant(400) ]
							ticks [ defaultConstant(40) ]
							ticks [ defaultConstant(4) ]
							runnableCall [ runnable = _find(Runnable, "Run4") ]
							labelAccess [ access = WRITE; data = _find(Label, "Lab5") ]
						]
					]
					runnable [ name = "Run3"
						callGraph [
							labelAccess [ access = READ; data = _find(Label, "Lab5") ]
							ticks [ defaultConstant(600) ]
						]
					]
					runnable [ name = "Run4"
						callGraph [
							ticks [ defaultConstant(700) ]
						]
					]
				]
			]
		return model
	}
	
	
	def model2() {
		val fac = AmaltheaFactory.eINSTANCE
		val model = 
			amalthea [
				softwareModel [
					label [name = "Lab1"]
					label [name = "Lab2"]
					label [name = "Lab3"]
					label [name = "Lab4"]
					label [name = "Lab5"]

					runnable [ name = "Run1"
						callGraph [
							ticks [ defaultConstant(200) ]
							// incomplete label accesses
							labelAccess [ statistic = fac.createLabelAccessStatistic ]
							labelAccess [ data = _find(Label, "Lab1") statistic = fac.createLabelAccessStatistic ]
							labelAccess [ access = READ statistic = fac.createLabelAccessStatistic]
							
							// valid label accesses
							labelAccess [ access = READ; data = _find(Label, "Lab1") statistic = fac.createLabelAccessStatistic ]
							labelAccess [ access = READ; data = _find(Label, "Lab2") ]
							labelAccess [ access = READ; data = _find(Label, "Lab3") ]
							labelAccess [ access = READ; data = _find(Label, "Lab4") statistic = fac.createLabelAccessStatistic]
							ticks [ defaultConstant(333) ]
							labelAccess [ access = WRITE; data = _find(Label, "Lab3") ]
							labelAccess [ access = WRITE; data = _find(Label, "Lab4") ]
							labelAccess [ access = WRITE; data = _find(Label, "Lab5") statistic = fac.createLabelAccessStatistic]
						]
					]
				]
			]
		return model
	}
}