/**
 ********************************************************************************
 * Copyright (c) 2013 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.tracing.converter.atdb;

import org.eclipse.app4mc.tracing.converter.ot1.OT1.DocumentRoot;
import org.eclipse.app4mc.tracing.converter.ot1.OT1.OT1Type1;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class OT1Loader {

	public static OT1Type1 loadOT1Model(final IFile iFile) {
		final URI inputUri = URI.createFileURI(iFile.getLocation().toFile().toString());
		final ResourceSet resSet = new ResourceSetImpl();
		final Resource resource = resSet.getResource(inputUri, true);
		final EList<EObject> modelContent = resource.getContents();
		final EObject rootObject = modelContent.get(0);

		if (rootObject instanceof DocumentRoot) {
			final DocumentRoot ot1DocumentRoot = (DocumentRoot) rootObject;
			final OT1Type1 ot1 = ot1DocumentRoot.getOT1();
			return ot1;
		}
		return null;
	}

}
