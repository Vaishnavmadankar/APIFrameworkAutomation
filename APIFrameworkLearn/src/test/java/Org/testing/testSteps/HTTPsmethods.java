package Org.testing.testSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

// Purpose of this method - to insert the new records in server 
// Input parameter - body data + uri key


public class HTTPsmethods 
{
         Properties pr;
	public HTTPsmethods(Properties pr) {
		this.pr=pr;
		
	}
	
	public void postrequest(String urikey,String requestbodydata) {
		
		String urivaules=pr.getProperty(urikey);
	
		Response res=
				
         given()
         .contentType(ContentType.JSON)
         .body(requestbodydata)
         .when()
         .post(urivaules);
        
		System.out.println("Status code is "+ res.getStatusCode());
		
	}

	
}
