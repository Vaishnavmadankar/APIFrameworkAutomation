package org.testing.Helper;

import io.restassured.response.Response;

public class JSONParsingusingJsonpath 
{
	public static String  jsonparse(Response res,String jsonpath)
	{
		return res.jsonPath().get(jsonpath);
	}
}
