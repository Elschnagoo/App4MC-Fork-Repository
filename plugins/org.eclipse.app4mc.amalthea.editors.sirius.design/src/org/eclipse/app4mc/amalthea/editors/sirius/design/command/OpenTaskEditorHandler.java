/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.editors.sirius.design.command;

import org.eclipse.app4mc.amalthea.editors.sirius.command.OpenEditorHandler;
import org.eclipse.app4mc.amalthea.model.Task;

/**
 * Editor Handler for {@link Task} element.
 * 
 * @author daniel.kunz@de.bosch.com
 *
 */
public class OpenTaskEditorHandler extends OpenEditorHandler<Task> {
	
	@Override
	protected Class<Task> getTargetClass() {
		return Task.class;
	}
	
}
