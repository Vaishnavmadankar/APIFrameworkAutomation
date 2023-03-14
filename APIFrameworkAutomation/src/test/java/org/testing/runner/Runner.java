package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC1_PostRequest;
import org.testing.TestScripts.TC2_Getallrequest;

public class Runner 
{
   public static void main(String[] args) throws IOException 
   {

	   TC1_PostRequest TC1=new TC1_PostRequest();
	   TC1.testcase1();
	   TC2_Getallrequest TC2=new TC2_Getallrequest();
	   TC2.testcase2();
	   
}
}
