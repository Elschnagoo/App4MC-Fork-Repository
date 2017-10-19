/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx;

import java.io.IOException;
import java.util.HashMap;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapter;
import org.eclipse.sphinx.emf.resource.ExtendedXMIHelperImpl;
import org.eclipse.sphinx.emf.resource.ExtendedXMILoadImpl;
import org.eclipse.sphinx.emf.resource.ExtendedXMISaveImpl;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;

public class AmaltheaResource extends XMIResourceImpl {

	protected ExtendedResourceAdapter extendedResourceAdapter;

	public AmaltheaResource() {
		addDefaults();
	}

	public AmaltheaResource(final URI uri) {
		super(uri);
		this.extendedResourceAdapter = new AmaltheaExtendedResourceAdapter();
		eAdapters().add(this.extendedResourceAdapter);
		addDefaults();
	}

	private void addDefaults() {
		getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");
		// Add some performance tweaks to improve loading of big models
		// http://sdqweb.ipd.kit.edu/wiki/EMF_Model_Loading_Performance_Tweaks
		getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		getDefaultLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		getDefaultLoadOptions().put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<>());

		// Also store defaults (this option has no effect on enums)
		getDefaultLoadOptions().put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		getDefaultSaveOptions().put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);

		// set zip option
		boolean isZipFile = isZipFile(getURI());
		getDefaultLoadOptions().put(OPTION_ZIP, isZipFile);
		getDefaultSaveOptions().put(OPTION_ZIP, isZipFile);
		
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	private boolean isZipFile(final URI uri) {
		boolean result = false;
		
		URI fileURI = EcoreResourceUtil.convertToAbsoluteFileURI(uri);
		if (fileURI != null) {
			try (ZipFile f = new ZipFile(fileURI.toFileString())) {
				// zipped file detected
				result = true;
			} catch (ZipException e) {
				// not a zip file
			} catch (IOException e1) {
				// unable to read
			}
		}
		
		return result;
	}
	
	/**
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
	 */
	@Override
	protected boolean useUUIDs() {
		return false;
	}

	/*
	 * @see org.eclipse.emf.ecore.resource.impl.ResourceImpl#unloaded(org.eclipse.emf.ecore.InternalEObject)
	 */
	@Override
	protected void unloaded(final InternalEObject internalEObject) {
		// Delegate to implementation provided by extended resource for enabling memory-optimized unloading
		this.extendedResourceAdapter.unloaded(internalEObject);
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl#createXMLLoad()
	 */
	@Override
	protected XMLLoad createXMLLoad() {
		// Use extended XMILoad implementation - and in turn extended SAXXMIHandler implementation - to include support
		// for on-the-fly resource migration, resource-centric problem handling, enhanced entity resolution, ignorable
		// whitespace suppression, and to enable creation of proxy URIs from serialized cross-document references to be
		// customized through extended resource service
		return new ExtendedXMILoadImpl(createXMLHelper());
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl#createXMLSave()
	 */
	@Override
	protected XMLSave createXMLSave() {
		// Use extended XMISave implementation for XMI to include support for on-the-fly resource migration and enhanced
		// schema location support
		return new ExtendedXMISaveImpl(createXMLHelper());
	}

	/*
	 * @see org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl#createXMLHelper()
	 */
	@Override
	protected XMLHelper createXMLHelper() {
		// Use extended XMIHelper implementation to enable creation of HREFs used for serializing cross-document
		// references to be customized through extended resource service
		return new ExtendedXMIHelperImpl(this);
	}

}
