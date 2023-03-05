package org.testing.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// Purpose of this method - to load properties files
// Input parameter - file path
// Output Parameter - properties object

public class PropertiesFileHandler {

	public static Properties loadproperties(String filepath) throws IOException 
	{
	 File F=new File(filepath);	
     FileReader Fr=new FileReader(F);   
     Properties pr=new Properties();
     pr.load(Fr);
     return pr;

	}

}
