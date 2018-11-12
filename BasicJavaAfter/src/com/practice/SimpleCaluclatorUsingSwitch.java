package com.practice;

import java.util.Scanner;

public class SimpleCaluclatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner reader = new Scanner(System.in);
	        System.out.println("Enter two numbers: ");

	        System.out.println("Enter first number: ");
	        // nextDouble() reads the next double from the keyboard
	        double first = reader.nextDouble();
	        System.out.println("Enter second number: ");
	        double second = reader.nextDouble();

	        System.out.println("Enter an operator (+, -, *, /, %): ");
	        char operator = reader.next().charAt(0);

	        double result;

	        switch(operator)
	        {
	            case '+':
	                result = first + second;
	                break;

	            case '-':
	                result = first - second;
	                break;

	            case '*':
	                result = first * second;
	                break;

	            case '/':
	                result = first / second;
	                break;
	                
	            case '%':
	                result = first % second;
	                break;

	            // operator doesn't match any case constant (+, -, *, /)
	            default:
	                System.out.println("Error! operator is not correct");
	                return;
	        }

	        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	    }
	}
	


