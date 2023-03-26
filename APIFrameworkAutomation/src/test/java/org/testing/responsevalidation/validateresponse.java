package org.testing.responsevalidation;

import org.testing.Helper.JSONParsingusingJsonpath;
import org.testing.assertion.Assertion1;
import org.testng.Assert;

import io.restassured.response.Response;

public class validateresponse 
{
   public static void validatestatuscode(int expectedstatuscode,Response res) 
   {
	 /*  Assert.assertEquals(res.statusCode(), expectedstatuscode,"Statu code is not matching"); */
	   Assertion1.assertion_1(expectedstatuscode, res.statusCode());
   }
   
   public static void validateresponsedata(String expecteddata,Response res, String jsonpath ) 
   {
	
	   String actualdata=JSONParsingusingJsonpath.jsonparse(res, jsonpath);
	 /* Assert.assertEquals(actualdata, expecteddata,"Response is not matching");    */
	   Assertion1.assertion_2(expecteddata, actualdata);
	   
   }
   
   
   
}
