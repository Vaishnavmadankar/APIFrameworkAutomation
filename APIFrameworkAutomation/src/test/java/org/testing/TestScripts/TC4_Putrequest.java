package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JSONReplacement;
import org.testing.utilities.JsonFileHandler;
import org.testing.utilities.PropertiesFileHandler;
import org.testng.annotations.Test;

public class TC4_Putrequest 
{
	@Test
  public  void testcase4() throws IOException 
  {
	  
	  Properties pr=PropertiesFileHandler.loadproperties("../APIFrameworkAutomation/URI.Properties");
	  String Requestbody=JsonFileHandler.loadjsonData("../APIFrameworkAutomation/src/test/java/org/testing/resources/RequestDataPut.json");
	  Requestbody=JSONReplacement.replaceVariable(Requestbody, "id",TC1_PostRequest.returnidvalue);
	  
	  HTTPMethods http=new HTTPMethods(pr);
	  
	  http.Putrequest("QA_URI",Requestbody,TC1_PostRequest.returnidvalue);
	  
  }	

}
