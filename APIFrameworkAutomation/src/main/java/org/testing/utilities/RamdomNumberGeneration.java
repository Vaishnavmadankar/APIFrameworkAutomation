package org.testing.utilities;

import java.util.Random;

public class RamdomNumberGeneration 
{
   public static String generateNumber() 
   {
	   Random r=new Random();
	   Integer i=r.nextInt();
	   return i.toString();
	   
   }
}
