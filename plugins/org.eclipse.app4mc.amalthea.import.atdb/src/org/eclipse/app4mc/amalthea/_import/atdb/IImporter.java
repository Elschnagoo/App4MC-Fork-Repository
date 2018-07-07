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
import org.eclipse.core.runtime.IProgressMonitor;

public interface IImporter {
	
	public Model run(final IProgressMonitor progressMonitor);
}
