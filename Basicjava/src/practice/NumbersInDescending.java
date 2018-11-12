package practice;

import java.util.Scanner;

public class NumbersInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number from  to print");
		int n=sc.nextInt();
		
		for(int i=n; i>=1;i--){
		System.out.println(i);	
		}
	}

}
