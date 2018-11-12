package practice;

public class ThisExample2 {
	void m()
	{
		System.out.println("m method");
	}
	void n()
	{
		System.out.println("n method");
		//m();//sam as this.m();
		this.m();
     }
public static void main(String args[]){
	ThisExample2 obj = new ThisExample2();
	obj.n();
}
}
