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

package org.eclipse.app4mc.amalthea.editors.sirius.helper;

import java.util.Collection;

import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DRepresentation;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class RepresentationQuery {

	private final IReferable model;
	private final Session session;
	private final String name;

	/**
	 * @param model
	 *            model need to open a associated editor
	 * @param session
	 *            session
	 * @param name
	 *            the name of the representation to be found
	 */
	public RepresentationQuery(final IReferable model, final Session session, final String name) {
		this.model = model;
		this.session = session;
		this.name = name;
	}

	/**
	 * @return {@link DRepresentation} that associated with the given model in the session
	 */
	public DRepresentation execute() {
		final Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(this.model,
				this.session);
		for (final DRepresentation representation : representations) {
			if (representation.getName().equals(this.name)) {
				return representation;
			}
		}
		return null;
	}

}
