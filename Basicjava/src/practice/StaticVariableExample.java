package practice;

public class StaticVariableExample {
	
	String name;
	int rollno;
	static String college="rvce";//static variable is used to assign common property for all objects
	
	StaticVariableExample(String n,int r){
		name=n;
		rollno=r;
		}
		void display(){
			System.out.println(name+" "+rollno+" "+college);
		
		}
		public static void main(String args[]){
			StaticVariableExample obj1= new StaticVariableExample("hari",101);
			StaticVariableExample obj2= new StaticVariableExample("venkat",103);
			
			obj1.display();
			obj2.display();
			
			
		}
		
	

}
