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
 *     Robert Bosch GmbH
 *        - initial API and implementation
 *        - additional changes to accommodate the decorator for Validation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.providers;

import org.apache.commons.lang.StringUtils;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.ElementTypeLabelDecorator;
import org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor.ExtendedBasicTransactionalFormEditor;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.ui.provider.TransactionalAdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sphinx.emf.check.services.CheckProblemMarkerService;
import org.eclipse.sphinx.emf.util.EObjectUtil;
import org.eclipse.sphinx.emf.validation.markers.ValidationMarkerManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class ExtendedColumnLabelProvider extends ColumnLabelProvider {

	private final ExtendedBasicTransactionalFormEditor editor;

	private final TransactionalAdapterFactoryLabelProvider delegate;

	private final ILabelDecorator labelDecorator;

	@SuppressWarnings("javadoc")
	public ExtendedColumnLabelProvider(final ExtendedBasicTransactionalFormEditor editor,
			final TransactionalAdapterFactoryLabelProvider delegate) {
		super();
		this.editor = editor;
		this.delegate = delegate;
		this.labelDecorator = new ElementTypeLabelDecorator();
	}

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object element) {
		Object target = element;
		if (element instanceof IStructuredSelection) {
			target = ((IStructuredSelection) element).getFirstElement();
		}

		final String text = stripTypePrefix(this.delegate.getText(target), target);

		if (this.editor.isShowTypesOfElements()) {
			return this.labelDecorator.decorateText(text, target);
		}
		return text;
	}

	/**
	 * Removes the type information at the beginning of the label text.
	 *
	 * @param text
	 *            original label text
	 * @param element
	 *            object that provides type information
	 * @return the stripped label text (or "???" if text is blank)
	 */
	private String stripTypePrefix(final String text, final Object element) {
		if (StringUtils.isBlank(text)) {
			return "???"; //$NON-NLS-1$
		}

		final String type = (element instanceof EObject) ? ((EObject) element).eClass().getName() : null;
		if (StringUtils.isBlank(type)) {
			return text;
		}

		final String typeWithBlanks = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(type), ' ');
		return StringUtils.removeStart(text.trim(), typeWithBlanks + " ").trim(); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.jface.viewers.CellLabelProvider#getToolTipText(java.lang.Object)
	 */
	@Override
	public String getToolTipText(final Object element) {
		return this.delegate.getText(element);
	}


	/**
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#addListener(org.eclipse.jface .viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(final ILabelProviderListener listener) {
		this.delegate.addListener(listener);
	}

	/**
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		this.delegate.dispose();
	}

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getBackground(java.lang.Object)
	 */
	@Override
	public Color getBackground(final Object object) {
		return this.delegate.getBackground(object);
	}

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getFont(java.lang.Object)
	 */
	@Override
	public Font getFont(final Object object) {
		return this.delegate.getFont(object);
	}

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getForeground(java.lang .Object)
	 */
	@Override
	public Color getForeground(final Object object) {
		return this.delegate.getForeground(object);
	}

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(final Object object) {
		return checkForMarkers(object);
	}

	/*
	 * TODO: efficient handling with Listeners i.e., react to marker deletion.
	 */
	private Image checkForMarkers(final Object object) {
		Image image = this.delegate.getImage(object);
		try {
			if (object instanceof EObject) {
				final IMarker markers[] = CheckProblemMarkerService.INSTANCE.getValidationMarkers((EObject) object,
						EObjectUtil.DEPTH_ONE);
				if (ValidationMarkerManager.getInstance().isError(markers)) {
					image = addErrorOverlay(image);
				}
				else if (ValidationMarkerManager.getInstance().isWarning(markers)) {
					image = addWarningOverlay(image);
				}
			}
		}
		catch (final CoreException e) {
			e.printStackTrace();
		}

		return image;
	}

	/**
	 * Add overlay image depending upon the type of error/warning marker TODO: Move this to a clean up LabelDecorator
	 * Implementation because not stable enough
	 *
	 * @param image
	 * @param
	 * @return
	 */
	private Image addErrorOverlay(final Image image) {
		final Point size = new Point(16, 16);
		final ImageDescriptor overlay = PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_DEC_FIELD_ERROR);
		final DecorationOverlayIcon deco = new DecorationOverlayIcon(image, new ImageDescriptor[] { null, null, null,
				overlay, null }, size) { // nothing to be implemented
		};
		final String imageId = "error"; //$NON-NLS-1$
		final ImageRegistry imageRegistry = createImageRegistry();
		imageRegistry.put(imageId, deco);
		return imageRegistry.get(imageId);
	}

	private Image addWarningOverlay(final Image image) {
		final Point size = new Point(16, 16);
		final ImageDescriptor overlay = PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_DEC_FIELD_WARNING);
		final DecorationOverlayIcon deco = new DecorationOverlayIcon(image, new ImageDescriptor[] { null, null, null,
				overlay, null }, size) { // nothing to be implemented
		};
		final String imageId = "warning"; //$NON-NLS-1$
		final ImageRegistry imageRegistry = createImageRegistry();
		imageRegistry.put(imageId, deco);
		return imageRegistry.get(imageId);
	}

	/**
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#isLabelProperty(java.lang .Object, java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(final Object object, final String id) {
		return this.delegate.isLabelProperty(object, id);
	}

	/**
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#removeListener(org.eclipse
	 *      .jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(final ILabelProviderListener listener) {
		this.delegate.removeListener(listener);
	}

	/**
	 * TODO:This method is a clone from UIPlugin, should not be used directly. Devise a strategy to include the UIPlugin
	 * in a smooth and clean way
	 *
	 * @return
	 */
	ImageRegistry createImageRegistry() {

		// If we are in the UI Thread use that
		if (Display.getCurrent() != null) {
			return new ImageRegistry(Display.getCurrent());
		}

		if (PlatformUI.isWorkbenchRunning()) {
			return new ImageRegistry(PlatformUI.getWorkbench().getDisplay());
		}

		// Invalid thread access if it is not the UI Thread
		// and the workbench is not created.
		throw new SWTError(SWT.ERROR_THREAD_INVALID_ACCESS);
	}
}
