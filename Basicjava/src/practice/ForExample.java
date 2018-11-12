package practice;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("first for loop");
		for(int x=0;x<=10;x++){
			System.out.println(x);
		}
		System.out.println("second for loop");
		//in for loop we can use multiple initialization expressions.
		//but only one conditional expression
		//we can use multiple modifying expressions
		for(int a=1,b=5; a<=5; a++,b--){
			System.out.println(a+"  "+b);
		}
	}

}
