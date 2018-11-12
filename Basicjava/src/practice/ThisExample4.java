package practice;

//3) this() : to invoke current class constructor

//The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor.
//In other words, it is used for constructor chaining.
class A{ 
	
	//default constructor
A()   {
	System.out.println("hello a");
	}  
//parameterized constructor
A(int x){  
this();  
System.out.println(x);  
}  
}  
class ThisExample4{  
public static void main(String args[]){  
A a=new A(10);  
}
}  



// above programe is also example of Calling default constructor from parameterized constructor: