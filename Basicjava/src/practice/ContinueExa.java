package practice;

//continue keyword is used to stop the execution of current iteration and start the execution of next iteration in a loop.
public class ContinueExa {
	
	    public static void main(String[] args) 
	    {
	        for (int i = 0; i <= 100; i++)
	        {
	            if(i % 5 != 0)
	            {
	                continue;
	            }
	             
	            System.out.println(i);
	        }
	    }
	}

