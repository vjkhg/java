package practice;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
			}
		System.out.println("after break ");
		}

	}


//Break: In Java, break is majorly used for:
//Terminate a sequence in a switch statement.
//To exit a loop.

//Java supports three jump statement: break, continue and return. 
//These three statements transfer control to other part of the program.

//Using break, we can force immediate termination of a loop, bypassing the conditional expression and any remaining code in the body of the loop.
//Note: Break, when used inside a set of nested loops, will only break out of the innermost loop.