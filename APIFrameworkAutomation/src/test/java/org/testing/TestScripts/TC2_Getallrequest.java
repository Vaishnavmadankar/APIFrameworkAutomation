package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandler;

public class TC2_Getallrequest 
{

	public void testcase2() throws IOException 
	{

		Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.getallrequest("QA_URI");
		
	}
}
