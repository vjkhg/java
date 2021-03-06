package com.practice;

import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
		        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		 
		        HashSet<String> set = new HashSet<String>();
		 
		        for (int i = 0; i < s1.length; i++)
		        {
		            for (int j = 0; j < s2.length; j++)
		            {
		                if(s1[i].equals(s2[j]))
		                {
		                    set.add(s1[i]);
		                }
		            }
		        }
		 
		        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
		    }
}
		
//1)Using Iterative Method	
//In this method, we iterate both the given arrays and compare each element of one array with elements of other array.
//If the elements are found to be equal, we will add that element into HashSet. 
//This method also works for those arrays which contain duplicate elements.

/* class CommonElements
{
    public static void main(String[] args)
    {
        Integer[] i1 = {1, 2, 3, 4, 5, 4};
 
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
 
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
 
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
 
        set1.retainAll(set2);
 
        System.out.println(set1);     //Output : [3, 4, 5]
    }
} */

//2) Using retainAll() Method :
//This is one of the easiest method to find the common elements from two arrays.
//In this method, we create two HashSets using given two arrays and then use reatinAll() method of HashSet to retain only common elements from the two sets.