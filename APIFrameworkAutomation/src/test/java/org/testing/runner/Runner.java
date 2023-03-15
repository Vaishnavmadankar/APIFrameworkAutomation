package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC1_PostRequest;
import org.testing.TestScripts.TC2_Getallrequest;
import org.testing.TestScripts.TC3_getrequest;
import org.testing.TestScripts.TC4_Putrequest;

public class Runner 
{
   public static void main(String[] args) throws IOException 
   {

	   TC1_PostRequest tc1=new TC1_PostRequest();
	   tc1.testcase1();
	   
	   TC2_Getallrequest tc2=new TC2_Getallrequest();
	   tc2.testcase2();
	   
	   TC3_getrequest tc3=new TC3_getrequest();
	   tc3.testcase3();
	   
	   TC4_Putrequest tc4=new TC4_Putrequest();
	   tc4.testcase4();
   }
   
}
