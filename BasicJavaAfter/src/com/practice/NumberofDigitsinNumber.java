package com.practice;

//Count Number of Digits in an Integer using while loop?
public class NumberofDigitsinNumber {
	public static void main(String[] args) {

	        int count = 0, num = 3452;

	        while(num != 0)
	        {
	            // num = num/10
	            num /= 10;
	            ++count;
	        }

	        System.out.println("Number of digits: " + count);
	    }
	}

/*
 // number of digits in a number

public class NumberDigits {

public static void main(String[] args) {

    int count = 0, num = 123456;

    for(; num != 0; num/=10, ++count) {   
    }

    System.out.println("Number of digits: " + count);
}
} */