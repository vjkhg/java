package practice;

public class InfinateForLoop {

	public static void main(String args[]){
		int i= 0;
		for(;;){
			System.out.println(i);
			i++;
			if(i<10)break;
		}
	}
}
