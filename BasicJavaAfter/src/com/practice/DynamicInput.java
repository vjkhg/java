package com.practice;

import java.util.*;
public class DynamicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter  A value");
		int A= sc.nextInt();
		
		System.out.println("ente B value");
		int B = sc.nextInt();
		
		System.out.println("choose one operator: +, -, *, /, %");
		String operator= sc.next();
		
		switch(operator)
		{
			case "+" : System.out.println("result of +:"+(A+B));
			          break;
			
			case "-" : System.out.println("result of -:"+(A-B));
			           break;

			case "*" : System.out.println("result of *:"+(A*B));
			          break;

			case "/" : System.out.println("result of /:"+(A/B));
			           break;

			case "%" : System.out.println("result of %:"+(A%B));
			         break;
			
			default :
				System.out.println("enter valid operator");

			
		}
		
	}

}
