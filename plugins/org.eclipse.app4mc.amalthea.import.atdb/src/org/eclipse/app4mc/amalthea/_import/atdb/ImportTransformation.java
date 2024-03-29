/**
 ********************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea._import.atdb;

import org.eclipse.app4mc.amalthea._import.atdb.model.Model;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;


public class ImportTransformation {

	private IImporter importer = null;
	AmaltheaExporter exporter = null;

	public ImportTransformation(final String source, final IContainer target) {
		if (source.endsWith(".atdb")) {
			this.importer = new ATDBImporter(source);
			// get the file name of the db
			final int from = Math.max(source.lastIndexOf("/"), source.lastIndexOf("\\"));
			final int to = source.lastIndexOf(".atdb");
			final String name = source.substring(from + 1, to);
			final URI uri = URI.createURI(target.getLocationURI() + "/" + name + ".amxmi");
			this.exporter = new AmaltheaExporter(uri);
		}
	}

	public boolean run(final IProgressMonitor progressMonitor) {
		boolean result = true;

		if (this.importer != null) {
			final Model model = this.importer.run(progressMonitor);
			this.exporter.serialise(progressMonitor, model);
		}
		else {
			result = false;
		}

		return result;
	}
}
