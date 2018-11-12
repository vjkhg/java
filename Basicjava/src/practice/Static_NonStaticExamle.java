package practice;

public class Static_NonStaticExamle {
	String name="Regnant";
	static int age=24;
	void sum()
	{
		System.out.println(" instance sum method");
	}
	
	static void addition(){
		System.out.println(" static addition method");
	}
	
	public static void main (String args[]){
		
		//calling static variable and method
		//1.directly we can  call them
		System.out.println(age);
        addition();
        //2.using classname. we can call them
		System.out.println(Static_NonStaticExamle.age);
		Static_NonStaticExamle.addition();
		
		
		//calling non_static var's and methods by using  object of class
		Static_NonStaticExamle sn=new Static_NonStaticExamle();
		System.out.println(sn.name);
		sn.sum();
		
		//3.using obj.of class we can call static var's and method
		System.out.println(sn.age);
		sn.addition();
	
	}

};
