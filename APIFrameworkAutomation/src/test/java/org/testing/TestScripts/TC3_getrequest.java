package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandler;
import org.testng.annotations.Test;

public class TC3_getrequest 
{
	@Test
	public void testcase3() throws IOException 
	{
		
	
		Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.getrequest("QA_URI", TC1_PostRequest.returnidvalue);
	}
}
