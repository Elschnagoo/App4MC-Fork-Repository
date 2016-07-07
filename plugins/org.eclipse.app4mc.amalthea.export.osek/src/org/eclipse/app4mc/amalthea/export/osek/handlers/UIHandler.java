package org.eclipse.app4mc.amalthea.export.osek.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable; // Fixes indirect dependency on IAdaptable of file.getLocationURI()
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
@SuppressWarnings("unused")

public class UIHandler {
	private boolean VERBOSE; 
	
	public UIHandler(boolean v) {
		this.VERBOSE = v;
	}
	/**
	 * Returns the URI of the file where a popup command was executed
	 * @param event ExecutionEvent
	 * @return URI of the chosen file on success, otherwise null
	 */
	public URI getSelectedFile(ExecutionEvent event) {
		// Fetch current selection
		IStructuredSelection ssel = (IStructuredSelection) HandlerUtil.getActiveSite(event).getSelectionProvider().getSelection();
		
		// Check if function was called properly / we really selected an item
		if(ssel == null)
			return null;
		Object firstElement = ssel.getFirstElement();
		
		// Check if selected item is a file
		if(!(firstElement instanceof IFile))
			return null;
		
		IFile file = (IFile) firstElement;

	    // Create a resource
	    return URI.createURI(file.getLocationURI().toString());
	}
	
	public URI getProjectDir(ExecutionEvent event) {
		// Fetch current selection
		IStructuredSelection ssel = (IStructuredSelection) HandlerUtil.getActiveSite(event).getSelectionProvider().getSelection();
		
		// Check if function was called properly / we really selected an item
		if(ssel == null)
			return null;
		Object firstElement = ssel.getFirstElement();
		
		// Check if selected item is a file
		if(!(firstElement instanceof IFile))
			return null;
		
		IFile file = (IFile) firstElement;
		
	    // Create a resource
	    return URI.createURI(file.getWorkspace().getRoot().getLocationURI().toString()+file.getProject().getFullPath().toString());
	}
	
	public void message(String msg) {
		// Simple for now...
		if(this.VERBOSE) System.out.println(msg);
	}
}
