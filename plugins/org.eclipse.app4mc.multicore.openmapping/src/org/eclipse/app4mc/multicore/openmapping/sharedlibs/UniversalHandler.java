/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.sharedlibs;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.ConfigModel;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.PropertyConstraintsModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.sphinx.AmaltheaResourceFactory;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class UniversalHandler {
	private boolean verboseOutputEnable = false;
	private String pluginId = "ERR_PLUGINID_UNSET";
	private ILog iLog;
	private Logger aLog;
	private Amalthea centralModel;

	private final Map<String, EObject> cache = new HashMap<String, EObject>();
	private final Map<URI, Resource> cache2 = new HashMap<URI, Resource>();

	/**
	 * Initialization-on-demand holder implementation. Returns the instance of
	 * this class.
	 *
	 * @return <code>UniversalHandler</code> instance
	 */
	public static UniversalHandler getInstance() {
		return UniversalHandlerHolder.UH_INSTANCE;
	}

	private static class UniversalHandlerHolder {
		public static final UniversalHandler UH_INSTANCE = new UniversalHandler();
	}

	/**
	 * Initialization of AMALTHEAS Meta-Models. Constructor is private to
	 * prevent an incorrect initialization of this class.
	 */
	UniversalHandler() {
		try {
			AmaltheaPackage.eINSTANCE.eClass();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public boolean writeFile(final IPath path, final StringBuilder string) {
		final IFile outFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		final File parentFolder = new File(outFile.getParent().getFullPath().toOSString());
		parentFolder.mkdirs();

		try {
			ByteArrayInputStream stream = new ByteArrayInputStream(string.toString().getBytes("UTF-8"));
			if (outFile.exists()) {
				outFile.setContents(stream, true, true, null);
			} else {
				outFile.create(stream, true, null);
			}
			stream.close();
		} catch (CoreException | IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	/**
	 * Reads the the file which is given by the parameter <code>URI uri</code>
	 * and stores the contained models,
	 *
	 * @param uri
	 *            Path locating the models file.
	 */
	public void readModels(final URI uri, final boolean copyModel) {
		final ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());
		final Copier copier = new Copier(true, true);
		final Collection<EObject> content;
		try {
			final Resource res = resSet.createResource(uri);
			res.load(null);
			if (copyModel) {
				content = copier.copyAll(res.getContents());
			} else {
				content = res.getContents();
			}

			setModel(content);
		} catch (final WrappedException | IOException e) {
			e.printStackTrace();
		}
		if (copyModel) {
			copier.copyReferences();
		}
		return;
	}

	/**
	 * Writes the model given by <code>EObject model</code> to the file
	 * according the parameter <code>URI uri</code>.
	 *
	 * @param uri
	 *            Full path to the file where the model shall be stored.
	 * @param model
	 *            The model that shall be serialized in a XMI file.
	 */
	public void writeModel(final URI uri, final EObject model) {
		// Inspired by
		// org.eclipse.app4mc.amalthea.workflow.base.AmaltheaWriter#invokeInternal
		// and
		// org.eclipse.app4mc.amalthea.workflow.base.AmaltheaWriter#saveModel
		final ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("amxmi", new AmaltheaResourceFactory());
		((ResourceSetImpl) resSet).setURIResourceMap(this.cache2);
		final Resource resource = resSet.createResource(uri);
		((ResourceImpl) resource).setIntrinsicIDToEObjectMap(this.cache);
		final IFile outFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toString()));
		final File parentFolder = new File(outFile.getParent().getFullPath().toOSString());
		parentFolder.mkdirs();

		try {
			resource.getContents().add(model);
			resource.save(null);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Writes the model given by the <code>ArrayList<EObject> model</code> to
	 * the file according the parameter <code>URI uri</code>.
	 *
	 * @param uri
	 *            Full path to the file where the model shall be stored.
	 * @param model
	 *            The models that shall be serialized in a single XMI file.
	 */
	public void writeModel(final URI uri, final ArrayList<EObject> models) {
		final Amalthea containerModel = AmaltheaFactory.eINSTANCE.createAmalthea();
		// Fill the AMALTHEA Central model with the resp. sub-models
		for (final EObject model : models) {
			if (model instanceof CommonElements) {
				containerModel.setCommonElements((CommonElements) model);
			} else if (model instanceof SWModel) {
				containerModel.setSwModel((SWModel) model);
			} else if (model instanceof HWModel) {
				containerModel.setHwModel((HWModel) model);
			} else if (model instanceof ConstraintsModel) {
				containerModel.setConstraintsModel((ConstraintsModel) model);
			} else if (model instanceof MappingModel) {
				containerModel.setMappingModel((MappingModel) model);
			} else if (model instanceof StimuliModel) {
				containerModel.setStimuliModel((StimuliModel) model);
			} else if (model instanceof OSModel) {
				containerModel.setOsModel((OSModel) model);
			} else if (model instanceof PropertyConstraintsModel) {
				containerModel.setPropertyConstraintsModel((PropertyConstraintsModel) model);
			} else if (model instanceof EventModel) {
				containerModel.setEventModel((EventModel) model);
			} else if (model instanceof ComponentsModel) {
				containerModel.setComponentsModel((ComponentsModel) model);
			} else if (model instanceof ConfigModel) {
				containerModel.setConfigModel((ConfigModel) model);
			}
		}
		this.writeModel(uri, containerModel);
	}

	/**
	 * Output the text given by the parameter <code>String message</code> to the
	 * console (stdout) if <code>enableVerboseOutput()</code> has been called.
	 *
	 * @param message
	 *            The message that shall be printed to stdout
	 */
	public void logCon(final String message) {
		if (this.verboseOutputEnable) {
			System.out.println(message);
		}
	}

	/**
	 * Log the message given by the parameter <code>String message</code> to
	 * Eclipse's logging facility with the severity level <code>INFO</code>.
	 *
	 * @param message
	 *            The message that shall be stored in Eclipse's logging
	 *            facility.
	 */
	public void log(final String message) {
		log(message, null, IStatus.INFO);
	}

	/**
	 * Log the message given by the parameter <code>String message</code> to
	 * Eclipse's logging facility with the severity level <code>WARNING</code>.
	 *
	 * @param message
	 *            The message that shall be stored in Eclipse's logging
	 *            facility.
	 * @param e
	 *            Exception
	 */
	public void logWarn(final String message) {
		log(message, null, IStatus.WARNING);
	}

	/**
	 * Log the message given by the parameter <code>String message</code> and
	 * exception given by the parameter <code>Exception e</code> to Eclipse's
	 * logging facility with the severity level <code>ERROR</code>.
	 *
	 * @param message
	 *            The message that shall be stored in Eclipse's logging
	 *            facility.
	 * @param e
	 *            Exception
	 */
	public void log(final String message, final Exception e) {
		log(message, e, IStatus.ERROR);
	}

	/**
	 * Log the message given by the parameter <code>String message</code> and
	 * the exception given by the parameter <code>Exception e</code> to
	 * Eclipse's logging facility with the severity level given by
	 * <code>int severity</code> .
	 *
	 * @param message
	 *            The message that shall be stored in Eclipse's logging
	 *            facility.
	 * @param e
	 *            Exception
	 * @param int
	 *            severity Specifies the severity level for the log entry (see
	 *            <code>org.eclipse.core.runtime.Status</code>)
	 */
	public void log(final String message, final Exception e, final int severity) {
		// System.out.println("AL:" + this.aLog);
		// System.out.println("IL:" + this.iLog);
		// System.out.println("PI:" + getPluginId());
		// System.out.println("M" + severity + ":" + message);
		logCon(message);
		// Check for workflow context
		if (null == getLog()) {
			// Workflow, fall back to APACHE Commons Logging
			if (null == this.aLog) {
				this.aLog = Logger.getLogger(this.pluginId);
			}
			switch (severity) {
			case IStatus.OK:
			case IStatus.INFO:
			case IStatus.WARNING:
				this.aLog.info(message);
				break;
			case IStatus.ERROR:
			case IStatus.CANCEL:
				this.aLog.error(message);
				break;
			}
			if (null != e) {
				this.aLog.error("Exception: " + e);
			}
		} else {
			getLog().log(new Status(severity, getPluginId(), IStatus.OK, message, e));
		}
	}

	/**
	 * Returns the object which has been selecting while calling the plugin
	 *
	 * @param event
	 *            ExecutionEvent
	 * @return Object storing the first element of the selection
	 */
	private Object getSelection(final ExecutionEvent event) {

		// Fetch current selection
		final IStructuredSelection ssel = (IStructuredSelection) HandlerUtil.getActiveSite(event).getSelectionProvider()
				.getSelection();

		// Check if function was called properly
		if (ssel == null) {
			return null;
		}

		// return first element of selection
		return ssel.getFirstElement();
	}

	/**
	 * Returns the IFile of the file where a popup command was executed
	 *
	 * @param event
	 *            ExecutionEvent
	 * @return IFile of the chosen file on success, otherwise null
	 */
	public IFile getSelectedFile(final ExecutionEvent event) {
		final Object selection = getSelection(event);

		// Check if selected item is a file
		if (selection instanceof IFile) {
			final IFile file = (IFile) selection;
			logCon("Selected file: " + file.getFullPath());
			return file;
		}
		return null;
	}

	/**
	 * Returns the URI of the project where a popup command was executed
	 *
	 * @param event
	 *            ExecutionEvent
	 * @return URI of the project containing the selected file on success,
	 *         otherwise null
	 */
	public URI getProjectDir(final ExecutionEvent event) {
		final Object selection = getSelection(event);

		// Check if selected item is an IResource
		if (!(selection instanceof IResource)) {
			return null;
		}

		final IResource file = (IResource) selection;
		final String projectDir = file.getProject().getLocationURI().toString();
		logCon("Project Directory: " + projectDir);
		return URI.createURI(projectDir);
	}

	/**
	 * Enables the output of <code>log(...)</code> and <code>logCon(...)</code>
	 * to stdout
	 */
	public void enableVerboseOutput() {
		this.verboseOutputEnable = true;
	}

	/**
	 * Sets the plugin-id of the plugin utilizing this class for the
	 * <code>log()</code> method.
	 *
	 * @param pluginId
	 *            The plugin-id.
	 */
	public void setPluginId(final String pluginId) {
		// Overwrite Apache Commins Logging
		this.aLog = Logger.getLogger(pluginId);
		// Remember the Plugin ID
		this.pluginId = pluginId;
	}

	/**
	 * Sets the log reference of the plugin utilizing this class for the
	 * <code>log()</code> method.
	 *
	 * @param log
	 *            The log of the plugin utilizing this class
	 */
	public void setLog(final ILog log) {
		if (null != log) {
			this.iLog = log;
		}
	}

	/**
	 * Returns the plugin-id of the calling plugin.
	 *
	 * @return The log
	 */
	private String getPluginId() {
		return this.pluginId;
	}

	/**
	 * Returns a reference to the logging facility of the calling plugin.
	 *
	 * @return Returns a reference to the calling plugins logging facility.
	 */
	private ILog getLog() {
		return this.iLog;
	}

	private void setModel(final Collection<EObject> content) {
		if (content == null) {
			return;
		}

		for (final EObject model : content) {
			if (model instanceof Amalthea) {
				this.centralModel = (Amalthea) model;
			}
		}
	}

	public CommonElements getCommonElements() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getCommonElements();
	}

	public SWModel getSwModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getSwModel();
	}

	public HWModel getHwModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getHwModel();
	}

	public ConstraintsModel getConstraintsModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getConstraintsModel();
	}

	public OSModel getOsModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getOsModel();
	}

	public StimuliModel getStimuliModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getStimuliModel();
	}

	public MappingModel getMappingModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getMappingModel();
	}

	public PropertyConstraintsModel getPropertyConstraintsModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getPropertyConstraintsModel();
	}

	public EventModel getEvModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getEventModel();
	}

	public ConfigModel getConfModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getConfigModel();
	}

	public ComponentsModel getComModel() {
		if (null == this.centralModel)
			return null;
		return this.centralModel.getComponentsModel();
	}

	public Amalthea getCentralModel() {
		return this.centralModel;
	}

	public void dropCache() {
		this.centralModel = null;
	}
}