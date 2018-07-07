/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/

package org.eclipse.app4mc.multicore.sharelibs.utframework;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaLoader;
import org.eclipse.emf.common.util.URI;

public class ModelLoader {

	/**
	 * Democar example model
	 */
	public final static String DEMOCAR = "../../examples/app4mc.example.democar/democar.amxmi";
	/**
	 * Democar mapping with task model
	 */
	public final static String DEMOCAR_WITH_PP = "../../examples/app4mc.example.tool.mapping/model/AMALTHEA_Democar_MappingExample.amxmi";
	/**
	 * Democar mapping with task model
	 */
	public final static String DEMOCAR_WITH_TASKS = "../../examples/app4mc.example.tool.mapping/model/AMALTHEA_Democar_MappingExample_withTasks.amxmi";
	/**
	 * Democar mapping
	 */
	public final static String DEMOCAR_HW = "../../examples/app4mc.example.tool.mapping/model/AMALTHEA_Democar_MappingExample-hw.amxmi";


	/**
	 * Get the specified model.
	 *
	 * @param model
	 *            model to obtain
	 *
	 * @return loaded model
	 */
	public static Amalthea getModel(final String model) {
		return AmaltheaLoader.loadFromURI(getURI(model));
	}


	/**
	 * Get the URI of a provided model
	 *
	 * @param model
	 *            model path
	 *
	 * @return uri of the model
	 */
	public static URI getURI(final String model) {
		return URI.createFileURI(model);
	}

}
