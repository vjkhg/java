package practice;

class ObjectInitialization{
	String name;
	int age;
	
	void insertRecord(int n , String s){
		name=s;
		age=n;
		}
	void displayInfomation(){
		System.out.println(name+" "+age);
	}
}

public class IntializationOfObjectExample {
	public static void main(String args[]){
		ObjectInitialization obj1 = new ObjectInitialization();
		ObjectInitialization obj2 = new ObjectInitialization();
		// Initialization of object through method
		obj1.insertRecord(7, "hi");
		obj2.insertRecord(8,"hjkluy");
		
		obj1.displayInfomation();
		obj2.displayInfomation();
	}
	

}
