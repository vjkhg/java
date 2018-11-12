package com.practice;

public class ReturnInMainMethod {

	static void add(int x, int y){
		 System.out.println(x+y);
	 }
	public static void main(String[] args) {
		
		add(12,20);
		//return;
		System.exit(1);
System.out.println("hi");
//System.exit(0);
         return;
	}

}
