package com.practice;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0; int sum=0;  
		do
		{
			if(x%2==0)
			{
 			
	          sum+=x;
	}
			x++;
			
		}while(x<= 100);
		System.out.println(sum);
}
}