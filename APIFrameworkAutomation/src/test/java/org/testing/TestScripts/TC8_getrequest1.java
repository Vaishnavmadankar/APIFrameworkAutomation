package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.Helper.JSONParsingusingJsonpath;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JSONReplacement;
import org.testing.utilities.PropertiesFileHandler;
import org.testing.utilities.RamdomNumberGeneration;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8_getrequest1 
{
	@Test
  public void testcase8() throws IOException 
  {
		Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.getrequest("QA_URI", TC6_Postrequest1.returnidvalue);
		
		
  }
}
