package practice;

public class ReverseTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r= 5;
		for(int i = 1; i<=r;i++){//rep. rows
			for (int st=5; st>=i;st--)//rep. columns
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
