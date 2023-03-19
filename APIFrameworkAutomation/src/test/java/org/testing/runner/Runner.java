package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC10_Deleterequest1;
import org.testing.TestScripts.TC1_PostRequest;
import org.testing.TestScripts.TC2_Getallrequest;
import org.testing.TestScripts.TC3_getrequest;
import org.testing.TestScripts.TC4_Putrequest;
import org.testing.TestScripts.TC5_DeleteRequest;
import org.testing.TestScripts.TC6_Postrequest1;
import org.testing.TestScripts.TC7_Getallrequest1;
import org.testing.TestScripts.TC8_getrequest1;
import org.testing.TestScripts.TC9_Putrequest1;

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
	   
	   TC5_DeleteRequest tc5=new TC5_DeleteRequest();
	   tc5.testcase5();
	   
	   TC6_Postrequest1 tc6=new TC6_Postrequest1 ();
	   tc6.testcase6();
	   
	   TC7_Getallrequest1 tc7=new TC7_Getallrequest1();
	   tc7.testcase7();
	   
	   TC8_getrequest1 tc8=new TC8_getrequest1();
	   tc8.testcase8();
	   
	   TC9_Putrequest1 tc9=new TC9_Putrequest1();
	   tc9.testcase9();
	   
	   TC10_Deleterequest1 tc10=new TC10_Deleterequest1();
	   tc10.testcase10();
	   
   }
   
}
