/**
 * *******************************************************************************
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
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.visualization.hw.templates

import org.eclipse.app4mc.amalthea.model.ConnectionHandler
import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.Memory
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.ReferableBaseObject
import org.eclipse.app4mc.amalthea.visualization.hw.ModelToTextResult
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Display

class HWBlockDiagramCreator {

	def CharSequence generateLevel(HWModel model, HwStructure s, ModelToTextResult errorCheck) '''
		«IF !(s.name.nullOrEmpty)»
		
			frame "«s.name»" as «convertFluxString(s.name)» {
			«IF !s.modules.empty»
			
				«FOR m: s.modules»
					«IF!(m.name.nullOrEmpty)»
						«IF m instanceof ProcessingUnit»
							[«convertFluxString(m.name)»] as «convertFluxString(m.name)» <<ProcessingUnit>>
						«ELSEIF m instanceof Memory»
							[«convertFluxString(m.name)»] as «convertFluxString(m.name)» <<Memory>>
						«ELSEIF m instanceof ConnectionHandler»
							[«convertFluxString(m.name)»] as «convertFluxString(m.name)» <<ConnectionHandler>>
						«ELSE»
							[«convertFluxString(m.name)»] as «convertFluxString(m.name)» <<Cache>>
						«ENDIF»
					«ELSE»
						«MessageDialog.openError(Display.getDefault().getActiveShell(), "AMALTHEA HW Visualization", "Missing HW Module name: " + m.toString)»
						«errorCheck.errorFlag = true»
					«ENDIF»
				«ENDFOR»
			«ENDIF»
			«FOR su : s.structures»
				«generateLevel(model, su, errorCheck)»
			«ENDFOR»
		«ELSE»
			«MessageDialog.openError(Display.getDefault().getActiveShell(), "AMALTHEA HW Visualization", "Name of HwStructure is missing " + s.toString)»
			«errorCheck.errorFlag = true»
		«ENDIF»
			}
	'''

	def CharSequence generateRoutes(HWModel model, HwStructure s, ModelToTextResult errorCheck) '''
		«IF !s.connections.empty»
			
			' add physical connections of structure «s.name»:
			«FOR c : s.connections»
				«IF !(c.name.nullOrEmpty)»
					«»
						«convertFluxString((c.port1.eContainer as ReferableBaseObject).name)» -- «convertFluxString((c.port2.eContainer as ReferableBaseObject).name)» : «c.name»
				«ELSE»
					«»
						«convertFluxString((c.port1.eContainer as ReferableBaseObject).name)» -- «convertFluxString((c.port2.eContainer as ReferableBaseObject).name)» : «c.toString»
				«ENDIF»
			«ENDFOR»
		«ENDIF»	
		«IF !s.modules.empty»
			«FOR m: s.modules»
				«IF m instanceof ProcessingUnit»
					«val pUnit = m as ProcessingUnit»
					«IF !pUnit.accessElements.empty»
						
						' add logical connections of processing unit «pUnit.name»:
						«FOR ae :pUnit.accessElements»
							«IF !(ae.name.nullOrEmpty)»
								«IF ae.destination !== null»
									«»
										«convertFluxString(pUnit.name)» ..>«convertFluxString(ae.destination.name)» : «ae.name»
								«ELSE»
									«MessageDialog.openError(Display.getDefault().getActiveShell(), "AMALTHEA HW Visualization", "Missing Destination of AccessElement:" + ae.name)»
									«errorCheck.errorFlag = true»
								«ENDIF»	
							«ELSE»
								«IF ae.destination !== null»
									«»
										«convertFluxString(pUnit.name)» ..>«convertFluxString(ae.destination.name)» : «ae.toString»
								«ELSE»
									«MessageDialog.openError(Display.getDefault().getActiveShell(), "AMALTHEA HW Visualization", "Missing Destination of AccessElement:" + ae.toString)»
									«errorCheck.errorFlag = true»
								«ENDIF»	
							«ENDIF»
						«ENDFOR»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		«IF !s.structures.empty»
			«FOR su : s.structures»
				«generateRoutes(model, su, errorCheck)»
			«ENDFOR»
		«ENDIF»
	'''

	def generatePlantUmlContent(HWModel model, ModelToTextResult errorCheck) '''
		@startuml
		«IF !model.structures.empty»
			
			' ===== FRAMES =====
			«FOR s : model.structures»
				«generateLevel(model, s, errorCheck)»
			«ENDFOR»
			
			' ===== ROUTES =====
			«FOR s : model.structures»
				«generateRoutes(model, s, errorCheck)»
			«ENDFOR»
		«ELSE»
			«MessageDialog.openError(Display.getDefault().getActiveShell(), "AMALTHEA HW Visualization", "No Structure in the model")»
			«errorCheck.errorFlag = true»
		«ENDIF»
		
		skinparam component {
			backgroundColor<<ProcessingUnit>> #8CACFF
			borderColor<<ProcessingUnit>> #000000
			backgroundColor<<ConnectionHandler>> #FFFFA0
			borderColor<<ConnectionHandler>> #000000
			backgroundColor<<Memory>> #60FF82
			borderColor<<Memory>> #000000
			backgroundColor<<Cache>> #C8FFA6
			borderColor<<Cache>> #000000
			ArrowFontColor #C0C0C0
		}
		
		@enduml
	'''

	def convertFluxString(String instring) {
		return convertGenericString(instring, "_");
	}

	def convertGenericString(String instring, String replacestring) {
		val String Regex = '/';
		val tmpstr0 = instring.replaceAll(Regex, replacestring);

		val String Regex1 = ' ';
		val tmpstr1 = tmpstr0.replaceAll(Regex1, replacestring);

		val String Regex2 = '\\(';
		val tmpstr2 = tmpstr1.replaceAll(Regex2, replacestring);

		val String Regex3 = '\\)';
		val tmpstr3 = tmpstr2.replaceAll(Regex3, replacestring);

		val String Regex4 = '-';
		val tmpstr4 = tmpstr3.replaceAll(Regex4, replacestring);

		val String Regex5 = '\\+';
		val tmpstr5 = tmpstr4.replaceAll(Regex5, replacestring);

		val String Regex6 = '%2f';
		val tmpstr6 = tmpstr5.replaceAll(Regex6, replacestring);

		val String Regex7 = '\\(';
		val tmpstr7 = tmpstr6.replaceAll(Regex7, replacestring);

		val String Regex8 = '\\)';
		val tmpstr8 = tmpstr7.replaceAll(Regex8, replacestring);

		val String Regex9 = '%2b';
		val String Replace9 = 'plus';
		val tmpstr9 = tmpstr8.replaceAll(Regex9, Replace9);

		val String Regex10 = '%3a%3a';
		val tmpstr10 = tmpstr9.replaceAll(Regex10, replacestring);

		val String Regex11 = '\\.';
		val tmpstr11 = tmpstr10.replaceAll(Regex11, replacestring);

		val String Regex12 = '#';
		val tmpstr12 = tmpstr11.replaceAll(Regex12, replacestring);

		val String Regex13 = '"';
		val tmpstr13 = tmpstr12.replaceAll(Regex13, replacestring);

		val String Regex14 = '$';
		val tmpstr14 = tmpstr13.replaceAll(Regex14, replacestring);

		val String Regex15 = '~';
		val tmpstr15 = tmpstr14.replaceAll(Regex15, replacestring);

		val String Regex16 = '%';
		val tmpstr16 = tmpstr15.replaceAll(Regex16, replacestring);

		val String Regex17 = '&';
		val tmpstr17 = tmpstr16.replaceAll(Regex17, replacestring);

		return tmpstr17;

	}

}
