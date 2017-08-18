/*********************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.editors.sirius.design.command;

import org.eclipse.app4mc.amalthea.editors.sirius.command.OpenEditorHandler;
import org.eclipse.app4mc.amalthea.model.Label;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class OpenLabelEditorHandler extends OpenEditorHandler<Label> {

	@Override
	protected Class<Label> getTargetClass() {
		return Label.class;
	}
	
}
