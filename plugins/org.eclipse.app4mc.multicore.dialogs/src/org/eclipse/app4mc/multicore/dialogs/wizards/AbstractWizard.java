/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.dialogs.wizards;

import java.util.ArrayList;

import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class AbstractWizard extends Wizard implements IWizard {
	private boolean debug_log = false;

	/**
	 * Constructor for MulticoreWizard.
	 */
	public AbstractWizard() {
		super();

		setForcePreviousAndNextButtons(true);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#getPageCount()
	 */
	@Override
	public int getPageCount() {
		final int count = getPages().length;

		log("getPageCount returned: " + count);

		return count;
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard.IWizardPage)
	 */
	@Override
	public IWizardPage getNextPage(final IWizardPage page) {
		final IWizardPage nextPage = super.getNextPage(page);
		AbstractWizardPage absPage;

		if (nextPage == null) {
			log("getNextPage returned: null");
			return null;
		}

		if (!(nextPage instanceof AbstractWizardPage)) {
			log("getNextPage returned: " + nextPage.getTitle());
			return nextPage;
		}

		absPage = (AbstractWizardPage) nextPage;

		if (absPage.isEnabled()) {
			log("getNextPage returned: " + nextPage.getTitle());
			return nextPage;
		}

		return getNextPage(nextPage);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#getPreviousPage(org.eclipse.jface.wizard.IWizardPage)
	 */
	@Override
	public IWizardPage getPreviousPage(final IWizardPage page) {
		final IWizardPage[] pages = getPages();
		int currentPageIndex = 0;
		int prevPageIndex = 0;

		// Get current page index
		for (final IWizardPage currPage : pages) {
			if (currPage.equals(page)) {

				break;
			}
			currentPageIndex++;
		}

		prevPageIndex = currentPageIndex - 1;

		// Look for the next visible page
		if (prevPageIndex >= 0) {
			log("getPreviousPage returned: " + pages[prevPageIndex]);
			return pages[prevPageIndex];
		}

		log("getPreviousPage returned: null");
		return null;
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#getPages()
	 */
	@Override
	public IWizardPage[] getPages() {
		final ArrayList<IWizardPage> enabledPages = new ArrayList<IWizardPage>();

		log("getPages returned: ");

		for (final IWizardPage currPage : super.getPages()) {
			if (((AbstractWizardPage) currPage).isEnabled()) {
				enabledPages.add(currPage);
				log("--> [" + currPage.getTitle() + "]");
			}
		}

		return enabledPages.toArray(new IWizardPage[enabledPages.size()]);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#needsPreviousAndNextButtons()
	 */
	@Override
	public boolean needsPreviousAndNextButtons() {
		final Boolean needs = true;

		log("needsPreviousAndNextButtons returned: " + needs.toString());

		return needs;
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		log("Calling unimplemented performFinish method");
		return false;
	}

	/**
	 * Enable class logging
	 *
	 * @param enabled
	 */
	public void setLoggingEnabled(final boolean enabled) {
		this.debug_log = enabled;
	}

	/**
	 * Add a message to log
	 *
	 * @param message
	 *            message to be added
	 */
	private void log(final String message) {
		if (!this.debug_log) {
			return;
		}
		UniversalHandler.getInstance().log(message);
	}

	/**
	 * Store values to preference store
	 *
	 * @return true
	 */
	public boolean store() {
		boolean success = true;

		for (final IWizardPage currPage : super.getPages()) {
			if (!(currPage instanceof AbstractWizardPage)) {
				continue;
			}

			log("store stored: " + currPage.getTitle());
			success &= ((AbstractWizardPage) currPage).store();
		}

		return success;
	}

}