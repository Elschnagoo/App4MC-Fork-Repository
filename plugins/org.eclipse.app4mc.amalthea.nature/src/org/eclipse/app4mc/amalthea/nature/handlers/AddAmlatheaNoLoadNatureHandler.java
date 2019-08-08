/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.nature.handlers;

import java.util.Arrays;

import org.eclipse.app4mc.amalthea.nature.AmaltheaNoLoadNature;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class AddAmlatheaNoLoadNatureHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(final ExecutionEvent event) {
		final IProject project = AmaltheaHandlerUtils.getProject(event);

		if (project != null) {
			try {
				IProjectDescription desc = project.getDescription();
				String[] prevNatures = desc.getNatureIds();

				if (Arrays.asList(prevNatures).contains(AmaltheaNoLoadNature.ID) == false) {
					String[] newNatures = new String[prevNatures.length + 1];
					System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
					newNatures[prevNatures.length] = AmaltheaNoLoadNature.ID;
					desc.setNatureIds(newNatures);
					project.setDescription(desc, new NullProgressMonitor());

				}

			} catch (final CoreException e) {
				e.printStackTrace();
			}
		}

		return null;
	}



}