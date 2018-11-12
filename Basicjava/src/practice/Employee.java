package practice;

 class EmployeeTest {
	
	String name;
	int age;
	float salary;
void insertRecord(String s , int n , float f){
		name=s;
		age=n;
		salary=f;
	}
	
	void display(){
		System.out.println(name+" "+age+" "+salary);
	}

}

class Employee{
	
	public static void main(String args[]){
		
		EmployeeTest obj1=new EmployeeTest();
		EmployeeTest obj2=new EmployeeTest();
		
		obj1.insertRecord("ravi",45, 37900.6f);
		obj2.insertRecord("ramudu", 46, 45609.8f);

		obj1.display();
		obj2.display();
		//obj1.name="ravi";
		
	}
	
}
