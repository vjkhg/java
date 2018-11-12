package com.practice;

public class Fibnocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		//System.out.println(a);
		//System.out.println(b);
		System.out.print(a+"+"+b);
		int c;
		int i=2;
		while(i<=10){
			c=a+b;
			System.out.print("+"+c);
			a=b;
			b=c;
			i++;
		}
		
	}

}

// 0+1+1+2+3+5..