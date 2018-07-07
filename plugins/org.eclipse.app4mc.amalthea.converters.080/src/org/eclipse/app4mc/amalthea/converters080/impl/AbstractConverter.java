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

package org.eclipse.app4mc.amalthea.converters080.impl;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters080.utils.HelperUtils_072_080;

public abstract class AbstractConverter implements IConverter {

	protected HelperUtils_072_080 helper;

	protected Logger logger;


}
