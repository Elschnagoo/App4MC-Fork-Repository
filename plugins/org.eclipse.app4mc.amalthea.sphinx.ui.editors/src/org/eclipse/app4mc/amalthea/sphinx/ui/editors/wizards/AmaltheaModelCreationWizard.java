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

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.wizards;

import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sphinx.emf.metamodel.IMetaModelDescriptor;
import org.eclipse.sphinx.emf.metamodel.MetaModelDescriptorRegistry;
import org.eclipse.sphinx.emf.workspace.jobs.CreateNewModelFileJob;
import org.eclipse.sphinx.emf.workspace.ui.wizards.AbstractNewModelFileWizard;
import org.eclipse.sphinx.emf.workspace.ui.wizards.pages.InitialModelProperties;
import org.eclipse.sphinx.emf.workspace.ui.wizards.pages.NewModelFileCreationPage;
import org.eclipse.swt.widgets.Composite;

public class AmaltheaModelCreationWizard extends AbstractNewModelFileWizard<IMetaModelDescriptor> {

	private final InitialModelProperties<IMetaModelDescriptor> properties = new InitialModelProperties<IMetaModelDescriptor>();

	private static final String AMALTHEA_MODEL_ID = "org.eclipse.app4mc.amalthea.model";

	private boolean isRequiredDataFound = false;

	private NewModelFileCreationPage<IMetaModelDescriptor> newModelFileCreationPage;

	@Override
	public void addPages() {

		fillRequiredData();

		if (this.properties.getMetaModelDescriptor() != null && this.properties.getRootObjectEClassifier() != null
				&& this.properties.getRootObjectEClassifier() != null) {
			this.isRequiredDataFound = true;
		}
		super.addPages();


	}

	@Override
	public void setWindowTitle(final String newTitle) {
		super.setWindowTitle("Model Creation Wizard");
	}

	@Override
	public void createPageControls(final Composite pageContainer) {
		super.createPageControls(pageContainer);

		this.newModelFileCreationPage.setTitle("AMALTHEA Model");

		this.newModelFileCreationPage.setDescription("Create new file");

	}

	/**
	 * This method is used to fetch the following contents of AMALTHEA MetaModel and populate them in properties object
	 * (of InitialModelProperties):<br>
	 * - IMetaModelDescriptor (AMALTHEA meta model descriptor)<br>
	 * - EPackage (Root EPackage of AMALTHEA meta model)<br>
	 * - EClassifier (Root EClassifier from the root EPackage of AMALTHEA)<br>
	 **/
	private void fillRequiredData() {

		// Querying MetaModel descriptor registry
		final List<IMetaModelDescriptor> descriptors = MetaModelDescriptorRegistry.INSTANCE
				.getDescriptors(MetaModelDescriptorRegistry.ANY_MM, true);

		for (final IMetaModelDescriptor iMetaModelDescriptor : descriptors) {

			final String identifier = iMetaModelDescriptor.getIdentifier();
			if (identifier.equals(AMALTHEA_MODEL_ID)) {

				// fetch EPackage and EClassifer information from the AMALTHEA MetaModelDescriptor
				this.properties.setMetaModelDescriptor(iMetaModelDescriptor);

				final Collection<EPackage> ePackages = iMetaModelDescriptor.getEPackages();

				if (ePackages.size() > 0) {
					// fetch the root EPackage from the MetaModel (In case of AMALTHEA MetaModel as there is only a
					// single EPackage , first one is picked)
					final EPackage rootObjectEPackage = (EPackage) ePackages.toArray()[0];

					this.properties.setRootObjectEPackage(rootObjectEPackage);
					// fetch the root EClassifier i.e. Amalthea class
					final EClassifier eClassifier = rootObjectEPackage.getEClassifier(Amalthea.class.getSimpleName());
					if (eClassifier != null) {
						this.properties.setRootObjectEClassifier(eClassifier);
					}
				}

				break;

			}
		}

	}

	@Override
	protected NewModelFileCreationPage<IMetaModelDescriptor> createMainPage() {
		this.newModelFileCreationPage = new NewModelFileCreationPage<IMetaModelDescriptor>(
				"amaltheaModelCreationPageID", this.selection, this.properties);
		return this.newModelFileCreationPage;
	}

	@Override
	protected Job createCreateNewModelFileJob(final String jobToCreateFile, final IFile newModelFile) {

		final IMetaModelDescriptor metaModelDescriptor = this.properties.getMetaModelDescriptor();
		final EPackage rootObjectEPackage = this.properties.getRootObjectEPackage();
		final EClassifier rootObjectEClassifier = this.properties.getRootObjectEClassifier();

		return new CreateNewModelFileJob(jobToCreateFile, newModelFile, metaModelDescriptor, rootObjectEPackage,
				rootObjectEClassifier);
	}

	@Override
	public boolean canFinish() {

		if (!this.isRequiredDataFound) {


			final String metaModelDescriptor = this.properties.getMetaModelDescriptor() == null
					? "MetaModelDescriptor (org.eclipse.app4mc.amalthea.model), " : "";
			final String ePackage = this.properties.getRootObjectEPackage() == null ? "EPackage (model), " : "";
			final String eClass = this.properties.getRootObjectEClassifier() == null ? "EClass (Amalthea)" : "";

			this.newModelFileCreationPage.setErrorMessage(
					"AMALTHEA Metamodel description is incomplete. \n Following properties are not found: "
							+ metaModelDescriptor + ePackage + eClass);

			return false;
		}
		return super.canFinish();
	}

}
