package com.practice;

// check in array if given number is present or not?
public class ArrayContains {
	 public static void main(String[] args) {
	        int[] num = {1, 2, 3, 4, 5};
	        int toFind = 3;
	        boolean found = false;

	        for (int n : num) {
	            if (n == toFind) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(toFind + " is found.");
	        else
	            System.out.println(toFind + " is not found.");
	    }
	}

/*
//Check if array contains a given value for non-primitive types?
public class Contains {

public static void main(String[] args) {
    String[] strings = {"One", "Two", "Three", "Four", "Five"};
    String toFind = "Four";

    boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

    if(found)
        System.out.println(toFind + " is found.");
    else
        System.out.println(toFind + " is not found.");
}
} */
//In the above program,
//we've used a non-primitive data type String and used Arrays's stream() method to first convert it to a stream and anyMatch() to check if array contains the given value toFind.