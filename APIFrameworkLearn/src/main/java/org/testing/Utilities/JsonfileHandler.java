package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

// Purpose of this method - to load the json file //
// Input parameter - File path
// Output - String json data


public class JsonfileHandler 
{
  public static String loadjsonData(String filepath) throws FileNotFoundException {
	  
	  File F=new File(filepath);
	  FileReader Fr=new FileReader(F);
	  JSONTokener JS=new JSONTokener(Fr);
	  JSONObject obj=new JSONObject(JS);
	  return obj.toString();
	  
	  
  }
}
