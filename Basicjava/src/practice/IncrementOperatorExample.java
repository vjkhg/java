package practice;

public class IncrementOperatorExample {
public static void main(String args[]){
	int x=3;
	System.out.println(x);//3
	System.out.println(x++);//3
	System.out.println(x);//4
	System.out.println(++x);//5
	System.out.println(x);//5
	System.out.println(x++ + ++x);//5+7=12
	System.out.println(x);//7
	System.out.println(x++);//7
}
}
