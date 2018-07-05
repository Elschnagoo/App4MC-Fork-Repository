/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Section;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * @deprecated (0.9.1) use {@link AmaltheaIndex#getElements} instead.
 *
 */

@Deprecated
public class SearchElementsUtility {

	private Object inputSource;

	public SearchElementsUtility(final Amalthea root) {

		this.inputSource = root;

	}

	public SearchElementsUtility(final ResourceSet resourceSet) {

		this.inputSource = resourceSet;

	}

	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied regex for name and targetClass parameters
	 * 
	 * @param regexForName
	 *            String. "regex for name" of the Amalthea model element (e.g:
	 *            Label name regex : .*_msg)
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List of matching eObjects from Amalthea model
	 *
	 */
	
	public <T extends IReferable> List<T> getElementsBasedOnRegex(final String regexForName, final Class<T> targetClass) {

		Assert.isNotNull(inputSource, "Input source (Amalthea model/resourceset containing Amalthea resources) is \"null/not set\"");
		
		if (inputSource instanceof Amalthea) {

			return getElementsBasedOnNameRegex((Amalthea) inputSource, regexForName, targetClass);

		} else if (inputSource instanceof ResourceSet) {

			List<T> result = new ArrayList<>();

			EList<Resource> resources = ((ResourceSet) inputSource).getResources();

			for (Resource resource : resources) {
				EList<EObject> contents = resource.getContents();

				if (contents != null && contents.size() > 0) {
					EObject eObject = contents.get(0);

					if (eObject instanceof Amalthea) {
						List<T> elementsBasedOnName = getElementsBasedOnNameRegex((Amalthea) eObject, regexForName,
								(Class<T>) targetClass);

						result.addAll(elementsBasedOnName);
					}
				}
			}
		}

		return new ArrayList<T>();
	}

	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied name and targetClass parameters
	 * 
	 * @param name
	 *            String. name of the Amalthea model element (e.g: Label name)
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List of matching eObjects from Amalthea model
	 *
	 */
	
	public <T extends IReferable> List<T> getElementsBasedOnName(final String name, final Class<T> targetClass) {

		Assert.isNotNull(inputSource, "Input source (Amalthea model/resourceset containing Amalthea resources) is \"null/not set\"");
		
		if (inputSource instanceof Amalthea) {

			return getElementsBasedOnName((Amalthea) inputSource, name, targetClass);

		} else if (inputSource instanceof ResourceSet) {

			List<T> result = new ArrayList<>();

			EList<Resource> resources = ((ResourceSet) inputSource).getResources();

			for (Resource resource : resources) {
				EList<EObject> contents = resource.getContents();

				if (contents != null && contents.size() > 0) {
					EObject eObject = contents.get(0);

					if (eObject instanceof Amalthea) {
						List<T> elementsBasedOnName = getElementsBasedOnName((Amalthea) eObject, name,
								(Class<T>) targetClass);

						result.addAll(elementsBasedOnName);
					}
				}
			}
		}

		return new ArrayList<T>();
	}

	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied targetClass parameter
	 * 
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List of matching eObjects from Amalthea model
	 *
	 */
	public <T> List<T> getElementsBasedOnType(final Class<T> targetClass) {
		
		Assert.isNotNull(inputSource, "Input source (Amalthea model/resourceset containing Amalthea resources) is \"null/not set\"");

		if (inputSource instanceof Amalthea) {

			return getElementsBasedOnType((Amalthea) inputSource, targetClass);

		} else if (inputSource instanceof ResourceSet) {

			List<T> result = new ArrayList<>();

			EList<Resource> resources = ((ResourceSet) inputSource).getResources();

			for (Resource resource : resources) {
				EList<EObject> contents = resource.getContents();

				if (contents != null && contents.size() > 0) {
					EObject eObject = contents.get(0);

					if (eObject instanceof Amalthea) {
						List<T> elementsBasedOnType = getElementsBasedOnType((Amalthea) eObject, 
								(Class<T>) targetClass);

						result.addAll(elementsBasedOnType);
					}
				}
			}
		}

		return new ArrayList<T>();
	}

	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied regex for name and targetClass parameters
	 * 
	 * @param amalthea
	 *            Amalthea model
	 * @param nameRegex
	 *            String. name regex of the Amalthea model element (e.g: Label
	 *            name regex : .*_msg)
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List of matching eObjects from Amalthea model
	 */
	@SuppressWarnings("unchecked")
	public static <T extends IReferable> List<T> getElementsBasedOnNameRegex(final Amalthea amalthea,
			final String nameRegex, final Class<T> targetClass) {
		
		if (targetClass.equals(Runnable.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null?(List<T>) getMatchingElementsBasedOnNameRegex(nameRegex, swModel.getRunnables()):new ArrayList<T>();

		} else if (targetClass.equals(Label.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null? (List<T>) getMatchingElementsBasedOnNameRegex(nameRegex, swModel.getLabels()):new ArrayList<T>();
					

		} else if (targetClass.equals(Task.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null?(List<T>) getMatchingElementsBasedOnNameRegex(nameRegex, swModel.getTasks()):new ArrayList<T>();

		} else if (targetClass.equals(ISR.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null?(List<T>) getMatchingElementsBasedOnNameRegex(nameRegex, swModel.getIsrs()):new ArrayList<T>();

		} else if (targetClass.equals(Section.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null?(List<T>) getMatchingElementsBasedOnNameRegex(nameRegex, swModel.getSections()):new ArrayList<T>();

		}

		else if (targetClass.equals(Component.class)) {

			ComponentsModel componentsModel = amalthea.getComponentsModel();

			return componentsModel!=null?(List<T>) getMatchingElementsBasedOnNameRegex(nameRegex, componentsModel.getComponents()):new ArrayList<T>();

		} else {

			return getMatchingElementsByLoopingThroughEntireModel_nameRegexBased(amalthea, nameRegex, targetClass);
		}

	}

	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied name and targetClass parameters
	 * 
	 * @param amalthea
	 *            Amalthea model
	 * @param name
	 *            String. name of the Amalthea model element (e.g: Label
	 *            name : test_Msg)
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List of matching eObjects from Amalthea model
	 */
	@SuppressWarnings("unchecked")
	public static <T extends IReferable> List<T> getElementsBasedOnName(final Amalthea amalthea, final String name,
			final Class<T> targetClass) {

		if (targetClass.equals(Runnable.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null ?(List<T>) getMatchingElementBasedOnName(name, swModel.getRunnables()):new ArrayList<T>();

		} else if (targetClass.equals(Label.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null?(List<T>) getMatchingElementBasedOnName(name, swModel.getLabels()):new ArrayList<T>();

		} else if (targetClass.equals(Task.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null?(List<T>) getMatchingElementBasedOnName(name, swModel.getTasks()):new ArrayList<T>();

		} else if (targetClass.equals(ISR.class)) {

			SWModel swModel = amalthea.getSwModel();

			return  swModel!=null?(List<T>) getMatchingElementBasedOnName(name, swModel.getIsrs()):new ArrayList<T>();

		} else if (targetClass.equals(Section.class)) {

			SWModel swModel = amalthea.getSwModel();

			return swModel!=null?(List<T>) getMatchingElementBasedOnName(name, swModel.getSections()):new ArrayList<T>();

		}

		else if (targetClass.equals(Component.class)) {

			ComponentsModel componentsModel = amalthea.getComponentsModel();

			return componentsModel!=null?(List<T>) getMatchingElementBasedOnName(name, componentsModel.getComponents()):new ArrayList<T>();

		} else {

			return getMatchingElementByLoopingThroughEntireModel_nameBased(amalthea, name, targetClass);
		}

	}
	
	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied targetClass parameter
	 * 
	 * @param amalthea
	 *            Amalthea model
	 *            
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List of matching eObjects from Amalthea model
	 *
	 */

	@SuppressWarnings("unchecked")
	public static <T> List<T> getElementsBasedOnType(final Amalthea amalthea, final Class<T> targetClass) {

		List<T> result = new ArrayList<>();

		if (targetClass.equals(Runnable.class)) {

			SWModel swModel = amalthea.getSwModel();

			if(swModel !=null){
				result.addAll((Collection<? extends T>) swModel.getRunnables());
			}

			return result;

		} else if (targetClass.equals(Label.class)) {

			SWModel swModel = amalthea.getSwModel();

			if(swModel !=null){
				result.addAll((Collection<? extends T>) swModel.getLabels());
			}

			return result;

		} else if (targetClass.equals(Task.class)) {

			SWModel swModel = amalthea.getSwModel();

			if(swModel !=null){
				result.addAll((Collection<? extends T>) swModel.getTasks());
			}

			return result;

		} else if (targetClass.equals(ISR.class)) {

			SWModel swModel = amalthea.getSwModel();

			if(swModel !=null){
				result.addAll((Collection<? extends T>) swModel.getIsrs());
			}

			return result;

		} else if (targetClass.equals(Section.class)) {

			SWModel swModel = amalthea.getSwModel();

			if(swModel !=null){
				result.addAll((Collection<? extends T>) swModel.getSections());
			}

			return result;

		}

		else if (targetClass.equals(Component.class)) {

			ComponentsModel componentsModel = amalthea.getComponentsModel();

			if(componentsModel !=null){
				result.addAll((Collection<? extends T>) componentsModel.getComponents());
			}

			return result;

		} else {

			return getMatchingElementsByLoopingThroughEntireModel_typeBased(amalthea, targetClass);
		}

	}
	
	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied targetClass parameter
	 * 
	 * @param eObject
	 *            EObject : EMF model element
	 *            
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List of matching eObjects from the supplied EObject 
	 *
	 */
	
	public static <T> List<T> getElementsBasedOnType(final EObject eObject, final Class<T> targetClass) {
 
		return getMatchingElementsByLoopingThroughEntireModel_typeBased(eObject, targetClass);
	}
	@SuppressWarnings("unchecked")
	private static <T extends IReferable> List<T> getMatchingElementsBasedOnNameRegex(final String nameRegex,
			EList<? extends IReferable> elements) {

		Pattern regexPattern = Pattern.compile(nameRegex);

		List<? extends IReferable> result = elements.stream().filter(s -> regexPattern.matcher(s.getName()).matches())
				.collect(Collectors.toList());

		return (List<T>) result;
	}

	@SuppressWarnings("unchecked")
	private static <T extends IReferable> List<T> getMatchingElementBasedOnName(final String name,
			EList<? extends IReferable> elements) {

		Optional<? extends IReferable> findFirst = elements.stream().filter(s -> s.getName().equals(name)).findFirst();

		List<T> result = new ArrayList<>();

		if(findFirst.isPresent()){
			result.add((T) findFirst.get());
		}

		return result;

	}

	@SuppressWarnings("unchecked")
	private static <T extends IReferable> List<T> getMatchingElementByLoopingThroughEntireModel_nameBased(
			final Amalthea amalthea, final String name, final Class<T> targetClass) {

		List<T> result = new ArrayList<>();

		TreeIterator<EObject> allContents = null;

		allContents = EcoreUtil.getAllContents((EObject) amalthea, true);

		for (final TreeIterator<EObject> iter = allContents; iter.hasNext();) {
			final EObject element = iter.next();

			Class<? extends EObject> elementsClass = element.getClass();

			if (IReferable.class.isAssignableFrom(elementsClass)) {

				if (element.eClass().getName().equals(targetClass.getSimpleName())) {

					if (((IReferable) element).getName().equals(name)) {

						result.add((T) element);

						return result;

					}

				}

			}

		}

		return result;
	}

	@SuppressWarnings("unchecked")
	private static <T extends IReferable> List<T> getMatchingElementsByLoopingThroughEntireModel_nameRegexBased(
			final Amalthea amalthea, final String nameRegex, final Class<T> targetClass) {

		Pattern regexPattern = Pattern.compile(nameRegex);

		List<T> result = new ArrayList<>();

		TreeIterator<EObject> allContents = null;

		allContents = EcoreUtil.getAllContents((EObject) amalthea, true);

		for (final TreeIterator<EObject> iter = allContents; iter.hasNext();) {
			final EObject element = iter.next();

			Class<? extends EObject> elementsClass = element.getClass();

			if (IReferable.class.isAssignableFrom(elementsClass)) {

				if (element.eClass().getName().equals(targetClass.getSimpleName())) {

					if (regexPattern.matcher(((IReferable) element).getName()).matches()) {

						result.add((T) element);

						return result;

					}

				}

			}

		}

		return result;
	}

	@SuppressWarnings("unchecked")
	private static <T> List<T> getMatchingElementsByLoopingThroughEntireModel_typeBased(final EObject eObject,
			final Class<T> targetClass) {

		List<T> result = new ArrayList<>();

		TreeIterator<EObject> allContents = null;

		allContents = EcoreUtil.getAllContents((EObject) eObject, true);

		for (final TreeIterator<EObject> iter = allContents; iter.hasNext();) {
			final EObject element = iter.next();

			if (element.eClass().getName().equals(targetClass.getSimpleName())) {
				result.add((T) element);
			}

		}

		return result;
	}
}
