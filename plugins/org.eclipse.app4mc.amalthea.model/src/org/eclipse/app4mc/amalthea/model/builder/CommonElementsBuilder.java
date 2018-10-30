/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.CoreClassifier;
import org.eclipse.app4mc.amalthea.model.MemoryClassifier;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class CommonElementsBuilder {

	public CommonElements commonElementsRoot(final Procedure1<CommonElements> initializer) {
		final CommonElements obj = AmaltheaFactory.eINSTANCE.createCommonElements();
		initializer.apply(obj);
		return obj;
	}

	// ********** Top level elements **********

	public void memoryClassifier(final CommonElements container, final Procedure1<MemoryClassifier> initializer) {
		final MemoryClassifier obj = AmaltheaFactory.eINSTANCE.createMemoryClassifier();
		container.getMemoryClassifiers().add(obj);
		initializer.apply(obj);
	}

	public void coreClassifier(final CommonElements container, final Procedure1<CoreClassifier> initializer) {
		final CoreClassifier obj = AmaltheaFactory.eINSTANCE.createCoreClassifier();
		container.getCoreClassifiers().add(obj);
		initializer.apply(obj);
	}

	public void tag(final CommonElements container, final Procedure1<Tag> initializer) {
		final Tag obj = AmaltheaFactory.eINSTANCE.createTag();
		container.getTags().add(obj);
		initializer.apply(obj);
	}

}
