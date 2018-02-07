package org.eclipse.app4mc.amalthea.visualization.hw;
import java.io.BufferedWriter;
import java.io.IOException;

import java.io.*;

public class OutputToFile {
	
	
	void createfile(CharSequence content, String path, String fileName){
	        try {
	        	System.out.println(path);
	            
	        	FileWriter fileWriter = new FileWriter(path + "/" + fileName);
	            
	        	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	            
	        	bufferedWriter.write(content.toString());
	            
	        	bufferedWriter.close();
	            
	        	fileWriter.close();
	        
	        } catch (IOException ioe) {
	            ioe.printStackTrace();
	            //System.out.println("Error: Folder not found, refreshing the workspace may help");
	        } 
	        
	    } 
}
