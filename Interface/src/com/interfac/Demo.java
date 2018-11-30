package com.interfac;
interface A{
	
	int MARKS=100;
	
	void add();
	
	void div(); 
	
	
		default public   void sub(){
		System.out.println(" i am in A default sub");
	}
	
	static public void mod(){
		System.out.println("i am in A static mod()");
	}
}

interface B {
	String COLLEGE="AvrSvr";
	default public void sub(){
		System.out.println(" i am in B default sub");
	}
	static public void mod(){
		System.out.println("i am in B static mod()");
	}
	
	void div();
	
	default public void sub(int id){
			System.out.println(" i am in B default sub:"+id);
		}
		
	void mul();
}
  public class Demo implements A, B{
	
	public void add(){
		System.out.println(" add implemeted method"); 
	}
	
	public void mul(){
		System.out.println(" mul implemeted method"); 
	}
	
	 public void sub(){
		 A.super.sub();// calling super interface default method.
		 B.super.sub();//calling sub interface default method
			System.out.println(" i am in Demo(overriden) default ");
		 
	 }
	 @Override
	 
	 public void div(){
		 System.out.println(" i am in(overriden) Demo div()");
	 }
 
	 
		
public static void main(String[] args) {
	
	A obj1= new Demo();//upcasting
	Demo obj=(Demo)obj1;//down casting
	obj.add();
	obj.mul();
	obj.sub();
	obj.sub(19);
	obj.div();
	B.mod();
    A.mod();
    System.out.println(obj.MARKS);
    System.out.println(A.MARKS);
    System.out.println(obj1.MARKS);
    System.out.println(A.MARKS);
    System.out.println(B.COLLEGE);
    System.out.println(obj.COLLEGE);
 
    
  

	
}

 }
