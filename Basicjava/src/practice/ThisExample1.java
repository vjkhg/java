package practice;

public class ThisExample1 {
	 String name;
	 int age;
	 //with this keyword
	 ThisExample1(String name, int age){
		this.name=name;
		this.age=age;
		 }
	 
	 void display(){
		 System.out.println(name+" "+age);
	 }
	 
	 public static void main(String args[]){
		 
		 ThisExample1 obj= new ThisExample1("eswar",45);
		 
		 obj.display();
		 
	 }

}
