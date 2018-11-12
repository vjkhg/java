package practice;


class Rectangle{
	int length;
	int width;
	
	void insert(int l , int w){
		length=l;
		width=w;
		System.out.println(length*width);
		}
//void dispaly(){
	//System.out.println(length*width);
//}
}
public class AreaOFRectangle {
	public static void main(String args[]){
		Rectangle obj= new Rectangle();
		obj.insert(6, 8);
		//obj.dispaly();
	}

}
