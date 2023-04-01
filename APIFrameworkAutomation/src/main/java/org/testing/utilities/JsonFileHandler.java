package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

// Purpose of this method - to load json file //
// Input Parameter - Json file path  //
// Ouput - String Json Data //

public class JsonFileHandler 
{
      public static String loadjsonData(String filepath) throws IOException 
      {
    	
    	File F=new File(filepath);
  		FileReader FR=new FileReader(F);
  		JSONTokener Js=new JSONTokener(FR);
  		JSONObject Obj=new JSONObject(Js);
  		return Obj.toString();
  	 
      }
}
