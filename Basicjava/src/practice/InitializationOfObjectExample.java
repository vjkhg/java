package practice;

class ObjectInitializationn{
	String name;
	int age;
	
}
public class InitializationOfObjectExample {
public static void main(String args[]){
	ObjectInitializationn obj1= new ObjectInitializationn();
	ObjectInitializationn obj2= new ObjectInitializationn();
	//example for initialization of objects through reference variable
	obj1.name="java";
	obj1.age=23;
	
	obj2.name=".net";
	obj2.age=24;
	
	System.out.println(obj1.name+" "+obj1.age);
	System.out.println(obj2.name+" "+obj2.age);
}
}
