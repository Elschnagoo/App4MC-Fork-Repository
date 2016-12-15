/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util;

import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ModelStructureUtil {

	/**
	 * Model checker for debugging.
	 * 
	 * Illegal references to non contained elements will be printed to stream.
	 * 
	 * @param model
	 *            to-be-checked model (self contained)
	 * @param stream
	 *            output stream for messages (<code>null</code> -> disable messages)
	 * @param verbose
	 *            <code>true</code> -> prints all performed checks
	 * @return <code>true</code> if everything was o.k.
	 */
	public static boolean checkModel(Amalthea model, PrintStream stream, boolean verbose) {
		boolean result = true;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

		if (model == null) return false;
		
		PrintStream out;
		if (stream == null) {
			OutputStream nullOutputStream = new OutputStream() { @Override public void write(int b) { } };
			out = new PrintStream(nullOutputStream);
		} else {
			out = stream;			
		}
		
		out.println("++++ Model check startet at " + dateFormat.format(new Date()));

		// create map with Ids of contained referable objects

		HashMap<String, IReferable> idMap = new HashMap<String, IReferable>();
		final TreeIterator<EObject> iterator = EcoreUtil.getAllContents(model, false);
		while (iterator.hasNext()) {
			final EObject element = iterator.next();

			if (element instanceof IReferable) {
				final IReferable refObj = (IReferable) element;
				final String id = refObj.getUniqueName();
				if (idMap.containsKey(id)) {
					final IReferable oldObj = idMap.put(id, null);
					if (oldObj != null) {
						out.println("Name is not unique: " + id); // oldObj
					}
					out.println("Name is not unique: " + id); // refObj
				} else {
					idMap.put(id, refObj);
				}
			}
		}

		// check references to top level types

		for (Iterator<EObject> objIter = model.eAllContents(); objIter.hasNext();) {
			EObject content = objIter.next();
			// iterate over all cross references
			for (EContentsEList.FeatureIterator<EObject> featureIterator = (EContentsEList.FeatureIterator<EObject>) content
					.eCrossReferences().iterator(); featureIterator.hasNext();) {
				EObject eObj = (EObject) featureIterator.next();
				EReference eRef = (EReference) featureIterator.feature();

				if (eRef.isTransient())
					// ignore transient (back) references
					continue;

				if (!(eObj instanceof IReferable)) {
					// should never happen ! (indicates an error in the meta model)
					out.println(
							"ERROR -- unknown reference " + eRef.getName() + " to " + eObj.getClass().getSimpleName());
					continue;
				}

				IReferable refObj = (IReferable) eObj;
				if (idMap.containsKey(refObj.getUniqueName())) {
					if (verbose) {
						StringBuilder sb = new StringBuilder();
						sb.append("    reference: ");
						addReferenceDescription(eRef, content, refObj, sb);
						out.println(sb.toString());
					}
				} else {
					result = false;
					StringBuilder sb = new StringBuilder();
					sb.append("Illegal target: ");
					addReferenceDescription(eRef, content, refObj, sb);
					out.println(sb.toString());
				}
			}
		}

		// cleanup
		idMap.clear();

		out.println("++++ Model check finished at " + dateFormat.format(new Date()));
		return result;
	}

	private static String getName(EObject obj) {
		EStructuralFeature sf = obj.eClass().getEStructuralFeature("name");
		if (sf == null)
			return "";

		final String name = (String) obj.eGet(sf);
		if (name == null || name.length() == 0)
			return "???";

		return name;
	}

	private static void addShortString(EObject obj, StringBuilder sb) {
		sb.append(obj.getClass().getSimpleName());
		sb.append("@");
		sb.append(Integer.toHexString(obj.hashCode()));
	}

	private static void addReferenceDescription(EReference ref, EObject source, EObject target, StringBuilder sb) {
		addShortString(source, sb);
		sb.append("[ ");
		sb.append(getName(source));
		sb.append(" ] --- ");
		sb.append(ref.getName());
		sb.append(" --> ");
		addShortString(target, sb);
		sb.append("[ ");
		sb.append(getName(target));
		sb.append(" ]");
	}

}
