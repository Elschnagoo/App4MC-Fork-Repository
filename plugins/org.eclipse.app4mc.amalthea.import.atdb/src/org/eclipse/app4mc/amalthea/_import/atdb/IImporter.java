/*******************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.app4mc.amalthea._import.atdb;

import org.eclipse.app4mc.amalthea._import.atdb.model.Model;
import org.eclipse.core.runtime.IProgressMonitor;

public interface IImporter {
	
	public Model run(final IProgressMonitor progressMonitor);
}
