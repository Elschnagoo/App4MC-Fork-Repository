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
package org.eclipse.app4mc.amalthea.editors.sirius.command;

import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;

/**
 * Command to create diagram for a given element.
 * 
 * @author daniel.kunz@de.bosch.com
 */
public class CreateDiagramCommand<S extends IReferable> extends RecordingCommand {

	private final Session session;
	private final S diagramTarget;
	private final Class<S> clazz;

	/**
	 * @param session
	 *            Sirius session
	 * @param diagramTarget
	 *            Diagram target of the new diagram
	 * @param clazz
	 *            The {@link Class} of the target element
	 */
	public CreateDiagramCommand(final Session session, final S diagramTarget, final Class<S> clazz) {
		super(session.getTransactionalEditingDomain());
		this.session = session;
		this.diagramTarget = diagramTarget;
		this.clazz = clazz;
	}

	@Override
	protected void doExecute() {
		final RepresentationDescription representationDescription = DialectManager.INSTANCE
				.getAvailableRepresentationDescriptions(this.session.getSelectedViewpoints(false), this.diagramTarget)
				.iterator().next();
		DialectManager.INSTANCE.createRepresentation(this.diagramTarget.getName() + " " + this.clazz.getSimpleName(),
				this.diagramTarget, representationDescription, this.session, new NullProgressMonitor());
	}

}
