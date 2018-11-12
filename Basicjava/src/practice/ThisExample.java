package practice;

public class ThisExample {
 String name;
 int age;
 //without this keyword there is a ambiguity between instance variable and constructor parameters
 ThisExample(String name, int age){
	 name=name;
	 age=age;
	 }
 
 void display(){
	 System.out.println(name+" "+age);
 }
 
 public static void main(String args[]){
	 
	 ThisExample obj= new ThisExample("eswar",45);
	 
	 obj.display();
	 
 }
}