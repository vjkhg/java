package practice;


public class AreaOfSquare {
	int length;
	int width;
	void insert(int l, int w)
	{
		length=l;
		width=w;
	}
	void display(){
		System.out.println(length*width);
	}

public static void main(String args[]){
	AreaOfSquare obj = new AreaOfSquare();
	
	obj.insert(6,6);
	
	obj.display();
	
	
}
}


/*
public class AreaOfSquare {
public static void main(String args[]){
   int length, area;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the length of the square ::");
   length = sc.nextInt();
   area = length* length;
   System.out.println("Area of the square is ::"+area);
}
}
*/