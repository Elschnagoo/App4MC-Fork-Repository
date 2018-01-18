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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * This class is used to build the cache of the entire EMF model and fetch the elements accordingly. <br>
 * 
 * This approach improves the performance of fetching the model elements based on name. In case there are modifications in the model data, cache is automatically updated (which could cost additional performance for rebuilding it)
 * 
 * <b>Note:</b>: Cache will be updated (on each model change) --> lazily on the first access of the getter methods after the EMF model change.
 * 
 *
 */
public class ModelDynamicCacheBuilder {
	
	private final Map<String, Map<String, List<EObject>>> cacheMap = new HashMap<String, Map<String, List<EObject>>>();
	
	private Object inputSource;
	
	private boolean isModelChanged=false;
	
	public ModelDynamicCacheBuilder( final Amalthea root ) {

		this.inputSource=root;

		addModelChangeListener(root, true);

		buildCache();
	}

	public ModelDynamicCacheBuilder( final ResourceSet resourceSet ) {

		this.inputSource=resourceSet;

		addModelChangeListener(resourceSet, true);

		buildCache();
	}
	
	
	private <T extends Notifier> void addModelChangeListener(final T inputSourceElement, boolean addModelChangeListener) {
		if(addModelChangeListener){

			inputSourceElement.eAdapters().add(new EContentAdapter(){

				@Override
				public void notifyChanged(Notification notification) {
					super.notifyChanged(notification);
					isModelChanged=true;
				}
			});

		}
	}

	/**
	 * This is a internal method used to build the cache for the entire Amalthea model / list of Amalthea models in the folder scope.
	 *  
	 *  After execution of <b>buildCache<b> method <b>CacheMap<b>  Map<String, Map<String, List<EObject>>> is populated with the required data.
	 *  
	 */
	private void buildCache() {

		cacheMap.clear();

		TreeIterator<EObject> allContents = null;

		if(inputSource instanceof EObject){
			allContents=  EcoreUtil.getAllContents((EObject)inputSource, true);
		}else{
			allContents=  EcoreUtil.getAllContents((ResourceSet)inputSource, true);
		}

		for (final TreeIterator<EObject> iter = allContents; iter.hasNext();) {
			final EObject element = iter.next();


			Class<? extends EObject> elementsClass = element.getClass();

			if(IReferable.class.isAssignableFrom(elementsClass)){

				if(cacheMap.containsKey(element.eClass().getName())==false){

					HashMap<String, List<EObject>> hashMap = new HashMap<String, List<EObject>>();

					cacheMap.put(element.eClass().getName(), hashMap );

				}

				if(cacheMap.get(element.eClass().getName()).containsKey(((IReferable) element).getName()) ==false){

					HashMap<String, List<EObject>> hashMap =  (HashMap<String, List<EObject>>) cacheMap.get(element.eClass().getName()) ;

					hashMap.put(((IReferable) element).getName(), new BasicEList<EObject>());

				}

				cacheMap.get(element.eClass().getName()).get(((IReferable) element).getName()).add(element);

			}

		}
	}
	

	/**
	 * This method is used to get the Amalthea model elements based on the supplied name and targetClass parameters
	 * @param name String. name of the Amalthea model element (e.g: Label name) 
	 * @param targetClass Class of the Amalthea model element (e.g: Label, Runnable, Task, ISR etc.,) 
	 *  <br> <i><u>Note</u></i> : Supplied "Class" should be concrete class, for which EObject is created. <br><i>Super class/Interface/Abstract classes are not supported</i> 
	 * @return List<EObject> matching eObjects from Amalthea model
	 *
	 */
    @SuppressWarnings("unchecked")
	public <T> List<T> getElementsBasedOnName(final String name, final Class<T> targetClass){
    	
    	if(isModelChanged){
    		buildCache();
    		isModelChanged=false;
    	}

		final Map<String, List<EObject>> map = this.cacheMap.get(targetClass.getSimpleName());

		if (map != null) {
			final List<EObject> eObject = map.get(name);

			if(eObject !=null) {
				return (List<T>) eObject;
			}

		}
		
		return new ArrayList<T>();
    }
    
	/**
	 * This method is used to get the Amalthea model elements based on the
	 * supplied regex for name and targetClass parameters
	 * 
	 * @param regexForName
	 *            String. name regex of the Amalthea model element (e.g: Label
	 *            name regex : .*_msg)
	 * @param targetClass
	 *            Class of the Amalthea model element (e.g: Label, Runnable,
	 *            Task, ISR etc.,) <br>
	 *            <i><u>Note</u></i> : Supplied "Class" should be concrete
	 *            class, for which EObject is created. <br>
	 *            <i>Super class/Interface/Abstract classes are not
	 *            supported</i>
	 * @return List<EObject> matching eObjects from Amalthea model
	 *
	 */
    @SuppressWarnings("unchecked")
	public <T extends EObject> List<T> getElementsBasedOnRegex(final String regexForName, final Class<T> targetClass){
    
    	if(isModelChanged){
    		buildCache();
    		isModelChanged=false;
    	}

		final Map<String, List<EObject>> map = this.cacheMap.get(targetClass.getSimpleName());

		if (map != null) {

			Pattern regexPattern = Pattern.compile(regexForName);

			List<String> matchingKeys = map.keySet().stream()
					.filter(s->regexPattern.matcher(s).matches())
					.collect(Collectors.toList());

			if(matchingKeys !=null){

				List<T> result=new ArrayList<>();

				
				for (String key : matchingKeys) {

					result.addAll(  (Collection<? extends T>) map.get(key));
				}

				return result;
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
	 * @return List<EObject> matching eObjects from Amalthea model
	 *
	 */
    public <T> List<T> getElementsBasedOnType(final Class<T> targetClass){
    	
    	if(isModelChanged){
    		buildCache();
    		isModelChanged=false;
    	}

    	List<T> resultElements=new ArrayList<T>();
    	
		final Map<String, List<EObject>> map = this.cacheMap.get(targetClass.getSimpleName());

		if (map != null) {
			
			for(int i=0;i<map.keySet().size();i++){

				@SuppressWarnings("unchecked")
				final List<T> eObjects = ((List<T>) map.get(i));
				
				if(eObjects !=null){
					resultElements.addAll(eObjects);
				}
				
			}

		}
		
		return resultElements;
    	
    }
    
    


}