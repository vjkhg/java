package com.practice;

public class EvenNumberSum {

	public static void main(String[] args) {
		
		int sum=0; int i=0;
		//for(int i = 0; i<=100;i++)
		while(i<=100)
		{
			 if( i%2==1){
				 
				 sum+=i;//sum = sum+i;
				 
				  }
			i++;
			
		}
		System.out.println(" sum of odd numbers from 0 to 100 is :"+sum);
	}

}
