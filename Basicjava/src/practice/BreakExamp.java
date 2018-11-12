package practice;

public class BreakExamp {
	// Java code to illustrate
	// using label  and break
	// instead of goto
	 
	// file name: Main.java
	    public static void main(String[] args)
	    {
	 
	    // label for outer loop
	    outer:
	        for (int i = 0; i < 10; i++) {
	        	inner:
	            for (int j = 0; j < 10; j++) {
	                if (j == 1)
	                    break inner;
	                System.out.println(" value of j = " + j);
	            }//end of inner loop
	        } // end of outer loop
	    } // end of main()
	} // end of class Main

