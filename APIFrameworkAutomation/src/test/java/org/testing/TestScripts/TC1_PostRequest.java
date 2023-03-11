package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandler;
import org.testing.utilities.PropertiesFileHandler;

public class TC1_PostRequest {
	public static void main(String[] args) throws IOException {
		
		
		Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
	    String Requestbody=JsonFileHandler.loadjsonData("../APIFrameworkAutomation/src/test/java/org/testing/resources/RequestData.json"); 
		HTTPMethods http=new HTTPMethods(pr);
		
		http.postrequest("QA_URI",Requestbody );
	}

}
