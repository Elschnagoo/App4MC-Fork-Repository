/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters070.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters070.utils.HelperUtils_111_070;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class SwConverter implements IConverter {

	private final HelperUtils_111_070 helper;

	public SwConverter() {
		this.helper = HelperUtils_111_070.getInstance();
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();


		update_ModeSwitchEntry_isDefault(rootElement);

		update_RunnableItem_isBuffered(rootElement);

		update_RunnableItem_accessEnum(rootElement);

		update_RunnableItem_isOrdered(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	private void update_ModeSwitchEntry_isDefault(final Element rootElement) {


		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1: isDefault variable inside ModeSwitchEntry is changed to default
		 */

		final List<Attribute> isDefaultAttributes = this.helper.getXpathResult(rootElement,
				".//swModel//graphEntries[(@xsi:type=\"sw:ModeSwitch\")]/entries/@isDefault|/sw:SWModel//graphEntries[(@xsi:type=\"sw:ModeSwitch\")]/entries/@isDefault",
				Attribute.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Attribute isDefaultAttribute : isDefaultAttributes) {

			isDefaultAttribute.setName("default");
		}

	}

	private void update_RunnableItem_isBuffered(final Element rootElement) {


		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1:
		 * - isBuffered variable inside Label is changed to buffered
		 * - isBuffered variable inside LabelAccess is changed to buffered
		 * - isBuffered variable inside SenderReceiverCommunication is changed to buffered
		 *
		 * 	 (As LabelAccess, SenderReceiverCommunication are RunnableItem, all the containments of RunnableItem with the corresponding types, are considred for this migration)
		 *
		 * Note: As SenderReceiverCommunication (Abstract class) is further extended by sw:SenderReceiverRead and sw:SenderReceiverWrite. Both these types should be considered
		 */


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//swModel/labels/@isBuffered|/sw:SWModel/labels/@isBuffered");
		xpathBuffer.append("|");
		xpathBuffer.append(
				".//swModel/runnables/runnableItems[(@xsi:type=\"sw:LabelAccess\") or (@xsi:type=\"sw:SenderReceiverRead\") or (@xsi:type=\"sw:SenderReceiverWrite\")]/@isBuffered|/sw:SWModel/runnables/runnableItems[(@xsi:type=\"sw:LabelAccess\") or (@xsi:type=\"sw:SenderReceiverRead\") or (@xsi:type=\"sw:SenderReceiverWrite\")]/@isBuffered");
		xpathBuffer.append("|");
		xpathBuffer.append(
				".//swModel//runnableItem[(@xsi:type=\"sw:LabelAccess\") or (@xsi:type=\"sw:SenderReceiverRead\") or (@xsi:type=\"sw:SenderReceiverWrite\")]/@isBuffered|/sw:SWModel//runnableItem[(@xsi:type=\"sw:LabelAccess\") or (@xsi:type=\"sw:SenderReceiverRead\") or (@xsi:type=\"sw:SenderReceiverWrite\")]/@isBuffered");

		final List<Attribute> isDefaultAttributes = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Attribute.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Attribute isDefaultAttribute : isDefaultAttributes) {

			isDefaultAttribute.setName("buffered");
		}

	}

	private void update_RunnableItem_accessEnum(final Element rootElement) {


		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1:
		 * - accessEnum  variable inside SemaphoreAccess is changed to access
		 * 	 (As SemaphoreAccess is a RunnableItem, all the containments of RunnableItem are considred for this migration)
		 */


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//swModel/runnables/runnableItems[(@xsi:type=\"sw:SemaphoreAccess\")]/@accessEnum|/sw:SWModel/runnables/runnableItems[(@xsi:type=\"sw:SemaphoreAccess\")]/@accessEnum");
		xpathBuffer.append("|");
		xpathBuffer.append(
				".//swModel//runnableItem[(@xsi:type=\"sw:SemaphoreAccess\")]/@accessEnum|/sw:SWModel//runnableItem[(@xsi:type=\"sw:SemaphoreAccess\")]/@accessEnum");

		final List<Attribute> isDefaultAttributes = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Attribute.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Attribute isDefaultAttribute : isDefaultAttributes) {

			isDefaultAttribute.setName("access");
		}

	}

	private void update_RunnableItem_isOrdered(final Element rootElement) {


		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1:
		 * - isOrdered  variable inside Group is changed to ordered
		 * 	 (As Group is a RunnableItem, all the containments of RunnableItem are considred for this migration)
		 */


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//swModel/runnables/runnableItems[(@xsi:type=\"sw:Group\")]/@isOrdered|/sw:SWModel/runnables/runnableItems[(@xsi:type=\"sw:Group\")]/@isOrdered");
		xpathBuffer.append("|");
		xpathBuffer.append(
				".//swModel//runnableItem[(@xsi:type=\"sw:Group\")]/@isOrdered|/sw:SWModel//runnableItem[(@xsi:type=\"sw:Group\")]/@isOrdered");

		final List<Attribute> isDefaultAttributes = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Attribute.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Attribute isDefaultAttribute : isDefaultAttributes) {

			isDefaultAttribute.setName("ordered");
		}

	}


	/**
	 * This method is used to handle the conversion for class Periodic (till 1.1.1) which is changed to
	 * PeriodicActivation
	 *
	 * PeriodicActivation can occur inside the following -<br>
	 * - SWModel (as container) <br>
	 * - ProcessPrototype (association) <br>
	 * - Runnable (association)
	 *
	 * @param rootElement
	 */
	@SuppressWarnings("unused")
	private void updatePeriodic(final Element rootElement) {


		/*-   <activations xsi:type="sw:Periodic" name="periodic_activation"/> */

		final List<Element> activations = this.helper.getXpathResult(rootElement,
				".//swModel/activations[(@xsi:type=\"sw:Periodic\")]|/sw:SWModel/activations[(@xsi:type=\"sw:Periodic\")]",
				Element.class, this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));

		/*- <runnables name="Runnable1" activation="periodic_activation?type=sw.Periodic"/> */

		final List<Element> runnables = this.helper.getXpathResult(rootElement,
				".//swModel/runnables|/sw:SWModel/runnables", Element.class, this.helper.getNS_111("sw"),
				this.helper.getGenericNS("xsi"));


		/*-  <processPrototypes name="pp1" activation="periodic_activation?type=sw.Periodic"/> */

		final List<Element> processPrototypes = this.helper.getXpathResult(rootElement,
				".//swModel/processPrototypes|/sw:SWModel/processPrototypes", Element.class,
				this.helper.getNS_111("sw"), this.helper.getGenericNS("xsi"));


		for (final Element element : runnables) {

			/*- <runnables name="Runnable1" activation="periodic_activation?type=sw.Periodic"/> */

			final Attribute attribute = element.getAttribute("activation");

			if (attribute != null) {

				final String updatedValue = this.helper.updateReferenceWithType(attribute.getValue(),
						"PeriodicActivation");

				attribute.setValue(updatedValue);
			}
			else {
				updateReferencesInActivation(element);
			}
		}


		for (final Element element : processPrototypes) {

			/*-  <processPrototypes name="pp1" activation="periodic_activation?type=sw.Periodic"/> */

			final Attribute attribute = element.getAttribute("activation");

			if (attribute != null) {

				final String updatedValue = this.helper.updateReferenceWithType(attribute.getValue(),
						"PeriodicActivation");

				attribute.setValue(updatedValue);
			}
			else {
				updateReferencesInActivation(element);

			}
		}


		for (final Element activation : activations) {
			/*-   <activations xsi:type="sw:Periodic" name="periodic_activation"/> */

			final Attribute attribute = activation.getAttribute("type", this.helper.getGenericNS("xsi"));
			if (attribute != null) {
				attribute.setValue("am:PeriodicActivation");
			}

		}


	}

	/**
	 * This method is used to update the references & type of Periodic inside activation node (which occurs when
	 * PeriodicActivation defined in other file is referred inside Runnable/ProcessPrototype)
	 */

	private void updateReferencesInActivation(final Element element) {

		/*-
		 * Example:
		 * <runnables name="r3">
		 * 		<activation xsi:type="sw:Periodic" href="amlt:/#periodic_activation?type=sw.Periodic"/>
		 * </runnables>
		 */

		final Element activation = element.getChild("activation");

		if (activation != null) {

			/*- update value of xsi:type */

			final Attribute typeAttribute = activation.getAttribute("type", this.helper.getGenericNS("xsi"));
			if (typeAttribute != null) {

				typeAttribute.setValue("am:PeriodicActivation");
			}

			/*- update referenceValue of activation Attribute */

			final Attribute hrefAttribute = activation.getAttribute("href");

			if (hrefAttribute != null) {

				final String updatedValue = this.helper.updateReferenceWithType(hrefAttribute.getValue(),
						"PeriodicActivation");

				hrefAttribute.setValue(updatedValue);
			}


		}
	}

}
