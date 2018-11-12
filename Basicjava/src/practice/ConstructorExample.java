package practice;

public class ConstructorExample {
	
	// default constructor example
	String name;
	int rollno;
	
	void dispaly()
	{
		System.out.println(name+" "+rollno);
	}
	
	public static void main(String args[]){
		
		ConstructorExample obj = new ConstructorExample();
		
		obj.dispaly();
		
	}
}
