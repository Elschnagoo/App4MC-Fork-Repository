/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.common.base;

import java.io.File;
import java.util.Map;

import org.jdom2.Document;

public interface ICache {

	public void buildCache(final Map<File, Document> fileName_documentsMap);

	public Map<File, Map<String, Object>> getCacheMap();

	public void clearCacheMap();
}
