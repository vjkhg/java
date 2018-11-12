package practice;

public class StringFunctions {

	public static void main(String args[]){
		String str="  this is veerendra  ";
		int len=str.length();
		System.out.println("length of string is:" +len);
		Boolean empty=str.isEmpty();
		System.out.println("is string empty:" +empty);
		char ch =str.charAt(2);
		System.out.println("character at 2nd position:"+ch);
        int Lastindex  = str.lastIndexOf("is");
        System.out.println("lastindex of is :"+Lastindex);
        int index = str.indexOf("is");
        System.out.println("frist index of is :"+index);
        String replace=str.replace('s', 'Z');
        System.out.println("repalced string:"+replace);
        String rep=str.replaceAll("is", "iz");
        System.out.println("new string:"+rep);
        String replaceall=str.replaceAll("e","w");
        System.out.println("new string:"+replaceall);
        String uppercase=str.toUpperCase();
        System.out.println("uppercase string:"+uppercase);
        String lowercase=str.toLowerCase();
        System.out.println("lowercase string:"+lowercase);
        String trim= str.trim();
        System.out.println("string after trim function:"+trim);
        String sub=str.substring(8);
        System.out.println("substring with starting index:"+sub);
        String substring=str.substring(9, 15);
        System.out.println("substring with frist and last index:"+substring);
        
        
        
        
        
        
	}
}
