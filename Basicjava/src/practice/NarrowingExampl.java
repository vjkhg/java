package practice;

public class NarrowingExampl {
	//Java program to illustrate Conversion of int and double to byte
	
	
	    public static void main(String args[]) 
	    { 
	        byte b; 
	        int i = 257; 
	        double d = 323.142;
	        
	        System.out.println("Conversion of int to byte."); 
	        //i%256
	        b = (byte) i; 
	        System.out.println("i = " + i + " b = " + b);
	        
	        System.out.println("Conversion of double to byte.");
	        //d%256
	        b = (byte) d; 
	        System.out.println("d = " + d + " b= " + b);
	    }
	}



