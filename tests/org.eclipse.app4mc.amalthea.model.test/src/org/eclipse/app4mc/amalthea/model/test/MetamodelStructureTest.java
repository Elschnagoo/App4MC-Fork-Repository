/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.test;

import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.WriterAppender;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public final class MetamodelStructureTest {

	private Logger logger;

	@Before
	public void setUp() {

		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.model.test");
		this.logger.addAppender(new ConsoleAppender(new PatternLayout("%d{ISO8601} %-5p [%c]: %m%n")));
		this.logger.setLevel(Level.INFO);
	}

	@After
	public void tearDown() {

		final Enumeration<?> allAppenders = this.logger.getAllAppenders();

		if (allAppenders != null) {
			final Object nextElement = allAppenders.nextElement();

			if (nextElement instanceof WriterAppender) {
				((WriterAppender) nextElement).close();
			}

		}
	}

	@Test
	public void checkMetaModel() {

		boolean illegalReferencesFound = false;

		final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

		final AmaltheaPackage amPackage = AmaltheaPackage.eINSTANCE;

		this.logger.info("++++ Metamodel check startet at " + dateFormat.format(new Date()));

		// Get all classes

		final List<EClass> classList = new ArrayList<EClass>();
		for (final EClassifier classifier : amPackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				classList.add((EClass) classifier);
			}
		}

		// Find references to classes without unique name

		for (final EClass eClass : classList) {
			for (final EStructuralFeature feature : eClass.getEStructuralFeatures()) {
				if (feature instanceof EReference) {
					final EReference eRef = (EReference) feature;
					if (eRef.getEType() instanceof EClass) {
						final EClass refClass = (EClass) eRef.getEType();
						if (eRef.isContainment()) {
							// print("Containment reference", eClass, eRef, refClass, Level.INFO);
							continue;
						}

						if (eRef.isContainer()) {
							print("Container reference", eClass, eRef, refClass, Level.INFO);
							continue;
						}

						if (eRef.isTransient()) {
							if (eRef.isDerived()) {
								print("Derived reference", eClass, eRef, refClass, Level.INFO);
							} else {
								print("Transient reference", eClass, eRef, refClass, Level.INFO);
							}
							continue;
						}

						if (amPackage.getIReferable().isSuperTypeOf(refClass)) {
							// valid reference
							// print("Valid reference", eClass, eRef, refClass, Level.INFO);
							continue;
						}

						// invalid reference

						illegalReferencesFound = true;

						print("Illegal reference", eClass, eRef, refClass, Level.ERROR);
					}
				}
			}
		}

		assertTrue(
				"Illegal references exists in the AMALTHEA metamodel. For detailed info of illegal references -> check the console log ",
				!illegalReferencesFound);

		this.logger.info("++++ Metamodel check finished at " + dateFormat.format(new Date()));

	} // main

	private void print(final String prefix, final EClass origin, final EReference ref, final EClass target,
			final Level level) {
		final StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(": ");
		sb.append(origin.getName());
		sb.append(" -- ");
		sb.append(ref.getName());
		sb.append(" --> ");
		sb.append(target.getName());

		if (Level.INFO == level) {
			this.logger.info(sb.toString());
		} else if (Level.ERROR == level) {
			this.logger.error(sb.toString());
		}
	}

}
