package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandler;
import org.testng.annotations.Test;

public class TC10_Deleterequest1 
{
	@Test
	public void testcase10() throws IOException 
	{
	
		Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.deleterequest("QA_URI", TC6_Postrequest1.returnidvalue);
		
	}

}
