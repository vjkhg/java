package practice;

class Test
{
	String name;
	int age;
	
}

public class InsitializationOfObjectExample {
	
	public static void main(String args[])
	{
		Test obj = new Test();
		//initialization of object through reference variable
		obj.name="java";
		obj.age=24;
		System.out.println(obj.name+"  "+obj.age);
	}
	
}
