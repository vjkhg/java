package com.practice;

public class Area {

	int l;
	int b;
	void setDim(int l , int b){
		this.l=l;
		this.b=b;
	}
	
	int getArea( ){
		return l*b;
	}
	
	public static void main(String args[]){
		
		Area a = new Area();
		a.setDim(12, 13);
	System.out.println(	a.getArea());
	}
}
