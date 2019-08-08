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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.app4mc.amalthea.nature.AmaltheaNoLoadNature;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class RemoveAmlatheaNoLoadNatureHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IProject project = AmaltheaHandlerUtils.getProject(event);
		if (project != null) {
			try {
				final IProjectDescription description = project.getDescription();

				String[] natureIds = description.getNatureIds();

				List<String> asList = Arrays.asList(natureIds);

				List<String> newList = new ArrayList<>();

				for (String string : asList) {
					if (string.equals(AmaltheaNoLoadNature.ID) == false) {
						newList.add(string);
					}  
				}

				String[] array = newList.toArray(new String[] {});

				description.setNatureIds(array);

				project.setDescription(description, new NullProgressMonitor());

			} catch (final CoreException e) {
				e.printStackTrace();
			}
		}

		return null;
	}
}