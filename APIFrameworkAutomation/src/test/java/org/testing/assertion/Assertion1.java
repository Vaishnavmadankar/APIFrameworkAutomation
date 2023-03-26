package org.testing.assertion;

public class Assertion1 
{
	public static void assertion_1(int expected,int actual) 
	{
		
		if (expected==actual) 
		{
		 System.out.println("Status code is matching");	
		}
		else 
		{
           System.out.println("Status code is not matching");
		}
		
		
	}
	
	public static void assertion_2(String expected,String actual) 
	{
		
		if (expected.equals(actual)) 
		{
		 System.out.println("Data is matching");	
		}
		else 
		{
           System.out.println("Data is not matching");
		}
		
		
	}
	

}
