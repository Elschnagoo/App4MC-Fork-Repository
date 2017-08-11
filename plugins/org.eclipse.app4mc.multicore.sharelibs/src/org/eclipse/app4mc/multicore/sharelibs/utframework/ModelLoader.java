/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/

package org.eclipse.app4mc.multicore.sharelibs.utframework;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaLoader;
import org.eclipse.emf.common.util.URI;

public class ModelLoader {

	/**
	 * Democar example model
	 */
	public final static String DEMOCAR = "../../examples/org.eclipse.app4mc.amalthea.example.democar/AMALTHEA_Democar.amxmi";
	/**
	 * Democar mapping with task model
	 */
	public final static String DEMOCAR_WITH_PP = "../../examples/org.eclipse.app4mc.amalthea.example.democar.mapping/model/AMALTHEA_Democar_MappingExample.amxmi";
	/**
	 * Democar mapping with task model
	 */
	public final static String DEMOCAR_WITH_TASKS = "../../examples/org.eclipse.app4mc.amalthea.example.democar.mapping/model/AMALTHEA_Democar_MappingExample_withTasks.amxmi";
	/**
	 * Democar mapping
	 */
	public final static String DEMOCAR_HW = "../../examples/org.eclipse.app4mc.amalthea.example.democar.mapping/model/AMALTHEA_Democar_MappingExample-hw.amxmi";


	/**
	 * Get the specified model.
	 *
	 * @param model
	 *            model to obtain
	 *
	 * @return loaded model
	 */
	public static Amalthea getModel(final String model) {
		return AmaltheaLoader.loadFromFile(getURI(model));
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
