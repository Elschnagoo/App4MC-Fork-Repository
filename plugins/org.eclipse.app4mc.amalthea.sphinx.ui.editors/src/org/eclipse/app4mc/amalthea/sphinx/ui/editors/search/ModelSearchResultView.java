/**
 ********************************************************************************
 * Copyright (c) 2013-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search;

import java.util.Collections;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.SphinxSupportPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.DecoratingStyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.search.ui.IContextMenuConstants;
import org.eclipse.search.ui.text.AbstractTextSearchViewPage;
import org.eclipse.search.ui.text.Match;
import org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ModelSearchResultView extends AbstractTextSearchViewPage {

	private SearchResultContentProvider contentProvider;
	private SearchResultTreeContentProvider contentTreeProvider;
	private final ToggleGroupViewAction toggleGroupViewAction;

	public ModelSearchResultView() {
		super(FLAG_LAYOUT_FLAT + FLAG_LAYOUT_TREE);
		this.toggleGroupViewAction = new ToggleGroupViewAction("Group by Type"); //$NON-NLS-1$
		// image taken from
		// https://github.com/eclipse/mylyn.commons/blob/d95886e9e377efa663da5901661d20e5e0da9a49/org.eclipse.mylyn.commons.ui/icons/etool16/presentation.gif
		this.toggleGroupViewAction.setImageDescriptor(AbstractUIPlugin
				.imageDescriptorFromPlugin(SphinxSupportPlugin.getPluginId(), "/icons/full/obj16/presentation.gif")); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#elementsChanged(java.lang.Object[])
	 */
	@Override
	protected void elementsChanged(final Object[] objects) {
		if (getLayout() == FLAG_LAYOUT_FLAT) {
			if (null != this.contentProvider) {
				this.contentProvider.updateElements(objects);
			}
		} else {
			if (null != this.contentTreeProvider) {
				this.contentTreeProvider.updateElements(objects);
			}
		}
		getViewer().refresh();
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#getDisplayedMatches(java.lang.Object)
	 */
	@Override
	public Match[] getDisplayedMatches(final Object element) {
		if (element instanceof TreeNode) {
			return super.getDisplayedMatches(((TreeNode) element).getValue());
		}
		return super.getDisplayedMatches(element);
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#getDisplayedMatchCount(java.lang.Object)
	 */
	@Override
	public int getDisplayedMatchCount(final Object element) {
		if (element instanceof TreeNode) {
			return super.getDisplayedMatchCount(((TreeNode) element).getValue());
		}
		return super.getDisplayedMatchCount(element);
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#clear()
	 */
	@Override
	protected void clear() {
		if (getLayout() == FLAG_LAYOUT_FLAT) {
			if (null != this.contentProvider) {
				this.contentProvider.clear();
			}
		} else {
			if (null != this.contentTreeProvider) {
				this.contentTreeProvider.clear();
			}
		}
		getViewer().refresh();
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#configureTreeViewer(org.eclipse.jface.viewers.TreeViewer)
	 */
	@Override
	protected void configureTreeViewer(final TreeViewer viewer) {
		this.contentTreeProvider = new SearchResultTreeContentProvider();
		viewer.setContentProvider(this.contentTreeProvider);
		viewer.setLabelProvider(new DecoratingStyledCellLabelProvider(new SearchResultTreeLabelProvider(),
				PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator(), null));
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#configureTableViewer(org.eclipse.jface.viewers.TableViewer)
	 */
	@Override
	protected void configureTableViewer(final TableViewer viewer) {
		final SearchResultLabelProvider labelProvider = new SearchResultLabelProvider();
		viewer.setLabelProvider(labelProvider);
		this.contentProvider = new SearchResultContentProvider();
		viewer.setContentProvider(this.contentProvider);
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#showMatch(org.eclipse.search.ui.text.Match,
	 *      int, int, boolean)
	 */
	@Override
	protected void showMatch(final Match match, final int currentOffset, final int currentLength,
			final boolean activate) throws PartInitException {
		final EObject element = (EObject) match.getElement();
		final URIEditorInput input = EcoreUIUtil.createURIEditorInput(element.eResource());
		if (null != input) {
			final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorInput editorInput = null;
			if (match instanceof SearchMatch) {
				editorInput = ((SearchMatch) match).getEditorInput();
			} else {
				// fallback
				editorInput = EcoreUIUtil.createURIEditorInput(element.eResource());
			}
			final IEditorPart part1 = page.openEditor(editorInput, "org.eclipse.app4mc.amalthea.sphinx.ui.editor", //$NON-NLS-1$
					true);
			if (part1 instanceof BasicTransactionalFormEditor) {
				((BasicTransactionalFormEditor) part1).setSelectionToViewer(Collections.singleton(element));
			}
		}
	}

	/**
	 * @see org.eclipse.search.ui.text.AbstractTextSearchViewPage#fillToolbar(org.eclipse.jface.action.IToolBarManager)
	 */
	@Override
	protected void fillToolbar(final IToolBarManager tbm) {
		super.fillToolbar(tbm);
		if (getLayout() == FLAG_LAYOUT_TREE) {
			tbm.appendToGroup(IContextMenuConstants.GROUP_VIEWER_SETUP, this.toggleGroupViewAction);
		}
	}

	private class ToggleGroupViewAction extends Action {

		public ToggleGroupViewAction(final String text) {
			super(text, IAction.AS_CHECK_BOX);
			setToolTipText(text);
		}

		/**
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@Override
		public void run() {
			final SearchResultTreeContentProvider contentProvider = (SearchResultTreeContentProvider) getViewer()
					.getContentProvider();
			contentProvider.setGroupByTypes(isChecked());
			getViewer().refresh();
		}
	}

}
