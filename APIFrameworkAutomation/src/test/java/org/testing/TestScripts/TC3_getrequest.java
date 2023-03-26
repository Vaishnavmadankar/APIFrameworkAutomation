package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.validateresponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_getrequest 
{
	@Test
	public void testcase3() throws IOException 
	{
		
	
	Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.getrequest("QA_URI", TC1_PostRequest.returnidvalue);
		
		validateresponse.validatestatuscode(200, res);
	    validateresponse.validateresponsedata("Nishikant", res, "first_name");
	}
}
