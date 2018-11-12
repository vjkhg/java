package practice;

//calling parameterized constructor form default constructor
	
	class Ab{ 
		//default constructor
		Ab(){  
		this(5);  
		System.out.println("hello a");  
		}  
		//parametarized constructor
		Ab(int x){  
		System.out.println(x);  
		}  
		}  
		class ThisExample5{  
		public static void main(String args[]){  
		Ab a=new Ab();  
		}}  


