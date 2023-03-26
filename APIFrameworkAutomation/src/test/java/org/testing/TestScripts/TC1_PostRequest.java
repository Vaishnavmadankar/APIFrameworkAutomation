package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.Helper.JSONParsingusingJsonpath;
import org.testing.responsevalidation.validateresponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JSONReplacement;
import org.testing.utilities.JsonFileHandler;
import org.testing.utilities.PropertiesFileHandler;
import org.testing.utilities.RamdomNumberGeneration;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	
	 static String returnidvalue;
	 
	@Test
	public void testcase1() throws IOException 
	{
		
		
		
		Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
	    String Requestbody=JsonFileHandler.loadjsonData("../APIFrameworkAutomation/src/test/java/org/testing/resources/RequestData.json"); 
	    
	    String idvalue=RamdomNumberGeneration.generateNumber();
	    Requestbody=JSONReplacement.replaceVariable(Requestbody,"id", idvalue);
	    
	    
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.postrequest("QA_URI",Requestbody );
		returnidvalue=JSONParsingusingJsonpath.jsonparse(res,"id");
		
		
		validateresponse.validatestatuscode(201,res);
		
		
	}

}
