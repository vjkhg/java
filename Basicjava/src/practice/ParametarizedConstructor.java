package practice;

public class ParametarizedConstructor {
	
	String name;
	int rollno;
	
	ParametarizedConstructor(String s, int r)
	{
name=s;
rollno=r;
	}
	
	void dispaly()
	{
		System.out.println(name+" "+rollno);
	}
	
	public static void main(String args[]){
		
		ParametarizedConstructor obj1 = new ParametarizedConstructor( "manikanta",456);
		ParametarizedConstructor obj2= new ParametarizedConstructor("vijay",678);
		
		obj1.dispaly();
		obj2.dispaly();
		//System.out.println(obj1.name+" "+obj1.rollno);
		//System.out.println(obj2.name+" "+obj2.rollno);
	}
}
