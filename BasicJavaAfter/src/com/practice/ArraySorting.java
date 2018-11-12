package com.practice;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] a = new int[]{45, 12, 78, 34, 89, 21};
//You can sort the array elements using Arrays.sort() method. 
//This method internally uses quick sort algorithm to sort the array elements.		         
		        Arrays.sort(a);//we have to import Arrays class from util package.
		         
		       System.out.println(Arrays.toString(a));
		       
		      
		        
		        	        //Output : [12, 21, 34, 45, 78, 89]
		    }
	}


//The main drawback of the arrays is that arrays are of fixed size.
//You can’t change the size of the array once you create it. 
//Therefore, you must know how many elements you want in an array before creating it.
//You can’t insert or delete the elements once you create an array.
//Only you can do is change the value of the elements.

