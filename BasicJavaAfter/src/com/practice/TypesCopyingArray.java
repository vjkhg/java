package com.practice;

import java.util.Arrays;

public class TypesCopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of int
		 
	/*	 //1)directly assigning one array to another array
	       int[] b = a;             //copying array 'a' to array 'b' 
		 //if any further changes in values of one array will reflect in another array  if we copy array in this way*/
		 
	/*	 //2)creating a copy of array 'a' using copyOf() method of java.util.Arrays class
	       // Copying An Array Using copyOf() Method of java.util.Array Class :
		     int[] b = Arrays.copyOf(a, a.length);  */
		 
	/*	  //3)creating a copy of array 'a' using clone() method
              int[] b = a.clone();  */
		 
	/*	//4)Creating an array object of same length as array 'a'
		 
	        int[] b = new int[a.length];
	 
	        //creating a copy of array 'a' using arraycopy() method of System class
	 
	        System.arraycopy(a, 0, b, 0, a.length);  */
		 
	 //5)Copying An Array Using for Loop
		 int[] b = new int[a.length];             //Declaring and instantiating another array of ints with same length
		 
	        for (int i = 0; i < a.length; i++)
	        {
	            b[i] = a[i];
	        }
	 
	        //Printing elements of array 'b'
	 
	        for (int i = 0; i < b.length; i++)
	        {
	            System.out.println(b[i]);
	        }
	 
	        a[2] = 56;     //Changing value of 3rd element of array 'a'
	 
	        System.out.println(b[2]);    //value of 3rd element of array 'b' wont changes
	 
	        b[4] = 100;     //Changing value of 5th element of array 'b'
	 
	        System.out.println(a[4]);     //value of 5th element of array 'a' wont changes
	    }
	}


