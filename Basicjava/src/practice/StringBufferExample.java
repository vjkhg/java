package practice;

public class StringBufferExample {
	
		public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello");  
		sb.append("Java");//now original string is changed  
		//sb.delete(1,3);
		//sb.insert(2, "gm");
		//sb.reverse();
		/*int n=sb.length();
		System.out.println(n);*/
		//sb.replace(1,3 ,"noon");
	/*String str=	sb.substring(2,5);
	System.out.println(str);*/
		//sb.deleteCharAt(2);
		System.out.println(sb);//prints Hello Java  
		}  
		}  


