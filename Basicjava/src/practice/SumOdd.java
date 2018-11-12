package practice;

public class SumOdd {
//sum of first 10 odd numbers in java
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter=0;
		int sum_odd=0;
		
		for(int i =0; i<=30; i++){
			
			if(i%2!=0){
				sum_odd+=i;
				counter++;
			}
			
			if(counter==10)
				break;
		}
		System.out.println(sum_odd);
	}

}
