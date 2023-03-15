package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

// Purpose of this method -- to insert new record in DB
// Input Parameter  - Body data and URI Key name
// Output parameter - 
 
public class HTTPMethods 
{
	Properties pr;              // Global Variable
	
	public HTTPMethods(Properties pr) 
	{
		this.pr=pr;
		
	}
	
	public Response postrequest(String urikey,String requestbodyData) 
	{
		String urivalue=pr.getProperty(urikey);
		Response res=		
		given()
		.contentType(ContentType.JSON)
		.body(requestbodyData)
		.when()
		.post(urivalue);
		
		System.out.println("Status code is "+res.statusCode());
		
		return res;
			
	}
	
	public void getallrequest(String urikey) 
	{
		String urivalue=pr.getProperty(urikey);
		Response res=		
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is");
		System.out.println(res.asString());
		
	}
	
	public void getrequest(String urikey,String idvalue) 
	{
		String urivalue=pr.getProperty(urikey)+ "/" +idvalue;
		Response res=		
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(urivalue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is");
		System.out.println(res.asString());
		
	}
	
	
	public void Putrequest(String urikey,String requestbodyData,String idvalue) 
	{
		String urivalue=pr.getProperty(urikey)+"/"+idvalue;
		Response res=		
		given()
		.contentType(ContentType.JSON)
		.body(requestbodyData)
		.when()
		.put(urivalue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("After update response the data");
		System.out.println(res.asString());
		
			
	}
	
	
	}

