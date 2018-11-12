package com.practice;

import java.util.Arrays;
/*
public class PrintingArrays {
//1)printing array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] array = {1, 2, 3, 4, 5};

		        System.out.println(Arrays.toString(array));
		    }
		} */

class PrintingArrays{
	public static void main(String args[]){
		int array[]={ 10, 20, 30,40};
		for(int i=0; i<=array.length;i++){
			System.out.println(array[i]);
		}
	}
}
	
/*
//2) printing array

public class Array {

public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};

    for (int element: array) {
        System.out.println(element);
    }
}
}  */


/*
//2) printing multi dimensional array

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6, 7}};

        System.out.println(Arrays.deepToString(array));
    }
} */