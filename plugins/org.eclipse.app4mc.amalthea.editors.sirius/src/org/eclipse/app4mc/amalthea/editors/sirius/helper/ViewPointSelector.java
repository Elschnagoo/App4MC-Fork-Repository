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

import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.session.UserSession;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * Class for selecting viewpoint
 */
public final class ViewPointSelector {

    private ViewPointSelector() {
        // prevent instantiation
    }

    /**
     * Selects viewpoint according to the session
     *
     * @param session
     *            session
     */
    public static void selectViewPoint(final Session session) {
        final Set<Viewpoint> viewpoints = ViewpointRegistry.getInstance().getViewpoints();
        for (final Viewpoint viewPoint : viewpoints) {
            if (viewPoint.getModelFileExtension().equals("amxmi")) {
                // right view point found
                final UserSession userSession = new UserSession(session);
                userSession.selectViewpoint(viewPoint.getName());
            }
        }
    }

}
