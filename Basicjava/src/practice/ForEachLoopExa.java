package practice;


//This loop is specifIcally designed to handle the elements of a collection. Collection represents a group of elements. 
//The for-each loop repeatedly executes a group of statements for each element of the collection. 
//It executes as many times as there are number of elements in the collection. 

public class ForEachLoopExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={24,67,42,94,-87};
		for(int val: arr){
			System.out.println("values of array are:"+val);
		}
	}

}
