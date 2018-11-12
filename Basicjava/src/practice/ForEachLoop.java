package practice;

public class ForEachLoop {
	// Java program to illustrate 
	// for-each loop
	
	    public static void main(String x[])
	    {
	        {
	            int[] marks = { 125, 132, 95, 116, 110 };
	             
	            int highest_marks = maximum(marks);
	            System.out.println("The highest score is " + highest_marks);
	        }
	    }
	    public static int maximum(int[] numbers)
	    { 
	        int maxSoFar = numbers[0];
	         
	        // for each loop
	        for (int num : numbers) 
	        {
	            if (num > maxSoFar)
	            {
	                maxSoFar = num;
	            }
	        }
	    return maxSoFar;
	    }
	}

//This loop is specifIcally designed to handle the elements of a collection. Collection represents a group of elements. 
//The for-each loop repeatedly executes a group of statements for each element of the collection. 
//It executes as many times as there are number of elements in the collection. 
