package practice;

public class ContinueExamp {
	// Java code to illustrate
	// using label  and continue
	// instead of goto
	 
	
	    public static void main(String[] args)
	    {
	 
	    // label for outer loop
	    outer: 
	        for (int i = 0; i < 10; i++) {
	        	inner:
	            for (int j = 0; j < 10; j++) {
	                if (j == 1)
	                    continue inner;
	                System.out.println(" value of i = " + i+" value of j ="+j);
	            }
	        } // end of outer loop
	    } // end of main()
	} // end of class Main


