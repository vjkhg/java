package practice;


class StaticMethod{  
    int rollno;  
    String name;  
    static String college = "ITS";  //static variable is used to assign common property for all objects
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
    }  
    //constructor to initialize the variables during object creating  
    StaticMethod(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
//Test class to create and display the values of object  

public class StaticMethodExample {
	public static void main(String args[]){  
		   StaticMethod.change();//calling change method  
		   //creating objects  
		   StaticMethod s1 = new StaticMethod(111,"Karan");  
		   StaticMethod s2 = new StaticMethod(222,"Aryan");  
		   StaticMethod s3 = new StaticMethod(333,"Sonoo");  
		   //calling display method  
		   s1.display();  
		   s2.display();  
		   s3.display();  
		   }  

}
