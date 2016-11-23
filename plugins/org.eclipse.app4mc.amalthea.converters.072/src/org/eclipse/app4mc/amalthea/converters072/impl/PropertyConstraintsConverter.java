package org.eclipse.app4mc.amalthea.converters072.impl;

import java.io.File;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters072.utils.HelperUtils_071_072;
import org.eclipse.app4mc.amalthea.converters072.utils.HwElementsCacheBuilder;
import org.eclipse.app4mc.amalthea.converters072.utils.HwElementsCacheEnum;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Parent;

public class PropertyConstraintsConverter extends AbstractConverter {

	private List<ICache> caches;
	private Map<File, Document> fileName_documentsMap;

	public PropertyConstraintsConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.1 to 0.7.2 : Starting PropertyConstraints converter");

		this.caches = caches;

		this.fileName_documentsMap = fileName_documentsMap;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		remove_CoreTypes_MemoryTypes(rootElement);

		update_Core_Refs(rootElement);

		update_Memory_Refs(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * Bug 507885:
	 *
	 * Based on the change in MetaModel -> CoreType & MemoryType objects should not be defined inside
	 * PropertyConstraints model.
	 *
	 *
	 * Based on the above point -> EStructuralFeatures inside PropertyConstraintsModel class : coreTypeDefinitions,
	 * memoryTypeDefinitions are removed as a part of migration.
	 *
	 * Definitions of corresponding CoreType and MemoryType are checked if they already exists in HW Models (in model
	 * scope). If they do not exists, definitions from PropertyConstraints model are moved to HW Model
	 *
	 * @param rootElement
	 *            org.jdom2.Element of Amalthea object
	 */

	@SuppressWarnings("unchecked")
	private void remove_CoreTypes_MemoryTypes(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./propertyConstraintsModel");


		final List<Element> propertyConstraintsModelElements = this.helper.getXpathResult(rootElement,
				xpathBuffer.toString(), Element.class, this.helper.getGenericNS("xsi"));

		if (propertyConstraintsModelElements.size() > 0) {

			final Element propertyConstraintsModel = propertyConstraintsModelElements.get(0);

			final List<Element> coreTypeDefinitions = propertyConstraintsModel.getChildren("coreTypeDefinitions");

			final Iterator<Element> coreTypesIterator = coreTypeDefinitions.iterator();

			while (coreTypesIterator.hasNext()) {

				final Element coreTypeDefinition = coreTypesIterator.next();

				final String coreTypeName = coreTypeDefinition.getAttributeValue("name");

				/*-removing the element from iterator -> as in below code iterating list is modified*/
				coreTypesIterator.remove();
				/*- removing the CoreType objects from the PropertyConstraints model */
				propertyConstraintsModel.removeContent(coreTypeDefinition);


				if (coreTypeName != null) {

					/*- Below code is used to check if the  CoreType element definition is available in the HW Model*/

					if (!isHWElementPresentInCache(HwElementsCacheEnum.CORE_TYPE_NAMES, coreTypeName)) {

						final Entry<File, Element> entry = getFirstOccuranceOfHwModelFromModelFiles();

						final File fileAssociatedToHwElement = entry.getKey();

						final Element hwModelElement = entry.getValue();

						/*- renaming the xml tag name from coreTypeDefinitions to coreTypes -> as it will associated to HW Model */
						coreTypeDefinition.setName("coreTypes");
						/*- associating coreTypes to HW Model */
						hwModelElement.addContent(coreTypeDefinition);

						/*-newly added coreType elements are updated in the cache */

						final List<String> coreTypeNames = (List<String>) getHwElementsCacheBuilder().getCacheMap()
								.get(fileAssociatedToHwElement).get(HwElementsCacheEnum.CORE_TYPE_NAMES.name());

						coreTypeNames.add(coreTypeName);
					}
				}


			}

			final List<Element> memoryTypeDefinitions = propertyConstraintsModel.getChildren("memoryTypeDefinitions");

			final Iterator<Element> memoryTypesIterator = memoryTypeDefinitions.iterator();

			while (memoryTypesIterator.hasNext()) {

				final Element memoryTypeDefinition = memoryTypesIterator.next();

				final String memoryTypeName = memoryTypeDefinition.getAttributeValue("name");

				/*-removing the element from iterator -> as in below code iterating list is modified*/
				memoryTypesIterator.remove();

				/*- removing the MemoryType objects from the PropertyConstraints model */
				propertyConstraintsModel.removeContent(memoryTypeDefinition);

				if (memoryTypeName != null) {

					/*- Below code is used to check if the  MemoryType element definition is available in the HW Model*/

					if (!isHWElementPresentInCache(HwElementsCacheEnum.MEMORY_TYPE_NAMES, memoryTypeName)) {

						final Entry<File, Element> entry = getFirstOccuranceOfHwModelFromModelFiles();

						final File fileAssociatedToHwElement = entry.getKey();

						final Element hwModelElement = entry.getValue();

						/*- renaming the xml tag name from memoryTypeDefinitions to memoryTypes -> as it will associated to HW Model */
						memoryTypeDefinition.setName("memoryTypes");
						/*- associating coreTypes to HW Model */
						hwModelElement.addContent(memoryTypeDefinition);

						/*-newly added memorType elements are updated in the cache */

						final List<String> memoryTypeNames = (List<String>) getHwElementsCacheBuilder().getCacheMap()
								.get(fileAssociatedToHwElement).get(HwElementsCacheEnum.MEMORY_TYPE_NAMES.name());

						memoryTypeNames.add(memoryTypeName);
					}
				}


			}
		}

	}

	/**
	 * Bug 507885: As HW elements should not be created inside PropertyConstraints model -> Model change is made to
	 * refer the Memory elements from HW Model. <br>
	 *
	 * This method will remove the definitions of Memory objects inside PropertyConstraints model and add the memory
	 * references (defined in HW Model)
	 *
	 * - In case if HW Model doesn't exists in any of the AMALTHEA models (in scope) -> then a new HW Model and the
	 * corresponding Memory objects are created accordingly.
	 *
	 * Note: For the newly created Memory elements -> name of the Memory element is set same as the Memory element which
	 * was defined inside PropertyConstraints model
	 *
	 * @param rootElement
	 *            org.jdom2.Element of Amalthea object
	 */
	@SuppressWarnings("unchecked")
	private void update_Memory_Refs(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./propertyConstraintsModel//firstConstraint[@xsi:type=\"am:HwMemoryProperty\"]/memory");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//secondConstraint[@xsi:type=\"am:HwMemoryProperty\"]/memory");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//hwConstraint[@xsi:type=\"am:HwMemoryProperty\"]/memory");

		final List<Element> memoryElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));


		final Iterator<Element> memoryElementsIterator = memoryElements.iterator();

		while (memoryElementsIterator.hasNext()) {

			final Element memoryElement = memoryElementsIterator.next();

			final String memoryName = memoryElement.getAttributeValue("name");


			final Parent parent = memoryElement.getParent();


			/*- removing the Memory object from PropertyConstraints model */
			parent.removeContent(memoryElement);

			if (memoryName != null) {

				final Element refMemoryElement = new Element("memory");
				refMemoryElement.setAttribute("href", "amlt:/#" + memoryName + "?type=Memory");
				/*- adding reference to Memory object (which is defined in the HW Model) */
				parent.addContent(refMemoryElement);

				/*- Below code is used to check if the referred Memory element definition is available in the HW Model. If not create the required structure and define Memory objects*/

				if (!isHWElementPresentInCache(HwElementsCacheEnum.MEMORY_NAMES, memoryName)) {

					final Entry<File, Element> entry = getFirstOccuranceOfHwModelFromModelFiles();

					final File fileAssociatedToHwElement = entry.getKey();

					final Element hwModelElement = entry.getValue();

					Element system = hwModelElement.getChild("system");
					if (system == null) {
						system = new Element("system");
						system.setAttribute("name", "migration_gen_system");
						hwModelElement.addContent(system);
					}

					final Element genMemoryElement = new Element("memories");
					genMemoryElement.setAttribute("name", memoryName);
					system.addContent(genMemoryElement);

					/*-newly added memory elements are updated in the cache */

					final List<String> memoryNames = (List<String>) getHwElementsCacheBuilder().getCacheMap()
							.get(fileAssociatedToHwElement).get(HwElementsCacheEnum.MEMORY_NAMES.name());

					memoryNames.add(memoryName);

				}

			}
		}

	}

	/**
	 * Bug 507885: As HW elements should not be created inside PropertyConstraints model -> Model change is made to
	 * refer the Core elements from HW Model. <br>
	 *
	 * This method will remove the definitions of Core objects inside PropertyConstraints model and add the references
	 * to the Core elements (defined in HW Model)
	 *
	 * - In case if HW Model doesn't exists in any of the AMALTHEA models (in scope) -> then a new HW Model and the
	 * corresponding Core objects are created accordingly.
	 *
	 * Note: For the newly created Core elements -> name of the Core element is set same as the Core element which was
	 * defined inside PropertyConstraints model
	 *
	 * @param rootElement
	 *            org.jdom2.Element of Amalthea object
	 */
	@SuppressWarnings("unchecked")
	private void update_Core_Refs(final Element rootElement) {
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./propertyConstraintsModel//firstConstraint[@xsi:type=\"am:HwCoreProperty\"]/core");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//secondConstraint[@xsi:type=\"am:HwCoreProperty\"]/core");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//hwConstraint[@xsi:type=\"am:HwCoreProperty\"]/core");

		final List<Element> coreElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		final Iterator<Element> coreElementsIterator = coreElements.iterator();

		while (coreElementsIterator.hasNext()) {

			final Element coreElement = coreElementsIterator.next();

			final String coreName = coreElement.getAttributeValue("name");


			final Parent parent = coreElement.getParent();

			parent.removeContent(coreElement);

			if (coreName != null) {

				final Element refCoreElement = new Element("core");
				refCoreElement.setAttribute("href", "amlt:/#" + coreName + "?type=Core");
				parent.addContent(refCoreElement);

				/*- Below code is used to check if the referred Core element definition is available in the HW Model. If not create the required structure and define Core objects*/

				if (!isHWElementPresentInCache(HwElementsCacheEnum.CORE_NAMES, coreName)) {

					final Entry<File, Element> entry = getFirstOccuranceOfHwModelFromModelFiles();

					final File fileAssociatedToHwElement = entry.getKey();

					final Element hwModelElement = entry.getValue();

					Element system = hwModelElement.getChild("system");
					if (system == null) {
						system = new Element("system");
						system.setAttribute("name", "migration_gen_system");
						hwModelElement.addContent(system);
					}

					final List<Element> ecuElements = this.helper.getXpathResult(system,
							".//ecus[@name=\"migration_gen_ecu\"]", Element.class);

					if (ecuElements.size() > 0) {

						final Element ecus = ecuElements.get(0);

						final List<Element> microControllersList = ecus.getChildren("microcontrollers");

						for (final Element microControllers : microControllersList) {

							final String microControllerName = microControllers.getAttributeValue("name");

							if (microControllerName != null
									&& microControllerName.equals("migration_gen_microcontroller")) {
								/*- associating PC model Core Element to HW Model */
								coreElement.setName("cores");
								microControllers.addContent(coreElement);

								break;
							}
						}

					}
					else {

						final Element ecus = new Element("ecus");

						ecus.setAttribute("name", "migration_gen_ecu");

						system.addContent(ecus);
						final Element microControllers = new Element("microcontrollers");

						microControllers.setAttribute("name", "migration_gen_microcontroller");

						ecus.addContent(microControllers);
						/*- associating PC model Core Element to HW Model */
						coreElement.setName("cores");
						microControllers.addContent(coreElement);
					}


					/*-newly added core elements are updated in the cache */

					final List<String> coreNames = (List<String>) getHwElementsCacheBuilder().getCacheMap()
							.get(fileAssociatedToHwElement).get(HwElementsCacheEnum.CORE_NAMES.name());

					coreNames.add(coreName);

				}
			}
		}
	}

	private Entry<File, Element> firstOccuranceOfHwModelInModelScope;

	/**
	 * This method is used to get the first HW Model from the model scope (i.e. Model scope can have multiple model
	 * files with HW Models -> this method is used to return the first HW Model )
	 *
	 * @return Entry<File, Element> Entry object -> <br>
	 *         key is the File containing HW Model, <br>
	 *         value is the org.jdom2.Element of "HW Model"
	 */
	private Entry<File, Element> getFirstOccuranceOfHwModelFromModelFiles() {

		if (this.firstOccuranceOfHwModelInModelScope != null) {
			return this.firstOccuranceOfHwModelInModelScope;
		}


		final HwElementsCacheBuilder iCache = getHwElementsCacheBuilder();

		if (iCache == null) {

			throw new RuntimeException("HwElementsCache is not buit and Object of it is not available in Converters");
		}

		final Map<File, Map<String, Object>> cacheMap = iCache.getCacheMap();

		final Set<File> fileSet = this.fileName_documentsMap.keySet();


		final TreeSet<File> sortedInputFileSet = new TreeSet<File>(fileSet);

		for (final File file : sortedInputFileSet) {

			final Map<String, Object> map = cacheMap.get(file);

			final Object object = map.get(HwElementsCacheEnum.HwModel.name());

			/*-this is the case where HW Model is existing inside the AMALTHEA model file*/
			if (object instanceof Element) {
				/*- returning Entry object with key as file (containing HW Model), value as the org.jdom2.Element representing HWModel*/
				this.firstOccuranceOfHwModelInModelScope = new AbstractMap.SimpleEntry<File, Element>(file,
						(Element) object);
				return this.firstOccuranceOfHwModelInModelScope;
			}

		}

		/*- this is the case where HW model is not found*/

		// creating HWModel in the first input AMALTHEA model file

		final File firstInputModelFile = sortedInputFileSet.first();
		final Document document = this.fileName_documentsMap.get(firstInputModelFile);

		if (document != null) {

			final Element rootElement = document.getRootElement();

			if (rootElement.getName().equals("Amalthea")) {

				final Element hwModel = new Element("hwModel");

				rootElement.addContent(hwModel);

				final Map<String, Object> map = cacheMap.get(firstInputModelFile);

				/*- updating the cace with created HwModel*/
				map.put(HwElementsCacheEnum.HwModel.name(), hwModel);

				/*- returning Entry object with key as file (containing HW Model), value as the org.jdom2.Element representing HWModel*/
				this.firstOccuranceOfHwModelInModelScope = new AbstractMap.SimpleEntry<File, Element>(
						firstInputModelFile, hwModel);
				return this.firstOccuranceOfHwModelInModelScope;

			}
		}
		return null;

	}


	/**
	 * This method is used to check if the HW Element (with a specific name) is existing in the cache i.e. if the
	 * element is defined in HW Model
	 *
	 * @param type
	 *            Type of HW Element
	 * @param hwElementName
	 *            name of the HW Element
	 * @return boolean true if for the supplied type & name there exists a element in HW Model (of model scope)
	 */
	@SuppressWarnings("unchecked")
	private boolean isHWElementPresentInCache(final HwElementsCacheEnum type, final String hwElementName) {

		final HwElementsCacheBuilder iCache = getHwElementsCacheBuilder();

		if (iCache == null) {

			throw new RuntimeException("HwElementsCache is not buit and Object of it is not available in Converters");
		}

		final Map<File, Map<String, Object>> cacheMap = iCache.getCacheMap();

		final Set<File> fileSet = this.fileName_documentsMap.keySet();

		for (final File file : fileSet) {

			final Map<String, Object> map = cacheMap.get(file);

			final Object object = map.get(type.name());

			if (object instanceof List) {
				if (((List<String>) object).contains(hwElementName)) {
					return true;
				}
			}
		}

		return false;
	}

	private HwElementsCacheBuilder hwElementsCacheBuilder;

	/**
	 * This method is used to get the HwElementsCacheBuilder object
	 *
	 * @return HwElementsCacheBuilder
	 */
	private HwElementsCacheBuilder getHwElementsCacheBuilder() {

		if (this.hwElementsCacheBuilder == null) {
			for (final ICache cache : this.caches) {

				if (cache instanceof HwElementsCacheBuilder) {
					this.hwElementsCacheBuilder = (HwElementsCacheBuilder) cache;
					return this.hwElementsCacheBuilder;
				}
			}
		}

		return this.hwElementsCacheBuilder;
	}

}
