package com.practice;

//Static variables, Static Initialization Block and Static Methods – these all are static components or static members of a class. 
//These static members are stored inside the Class Memory. To access static members, you need not to create objects. 
//Directly you can access them with class name.
class StaticComponents
{
     static int staticVariable;
//Static Initialization Block is used to initialize only static variables. It is a block without a name.
//It contains set of statements enclosed within { }. 
     static
     {
          System.out.println("StaticComponents SIB");
          staticVariable = 10;
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}
public class StaticInitializationBlock {

	
		 static
	     {
	          System.out.println("MainClass SIB");
	     }
	 
	     public static void main(String[] args)
	     {
	         //Static Members directly accessed with Class Name
	          StaticComponents.staticVariable = 20;
	          StaticComponents.staticMethod();
	     }
	}


