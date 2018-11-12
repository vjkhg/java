package practice;

public class StringComparision {
	public static void main(String args[])
	{
		String str1="Regnant";
		String str2="Regnant";
		String str3= new String("regnant");
		String str4= new String("Regnant");
		String str5="REGNANT";
		String str6 ;
		str6="java";
		
	//eqauals() operation
		System.out.println(str1.equals(str2));
		System.out.println(str5.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str6));
		System.out.println(str3.equals(str4));
		
		// ==(assignment operator) 
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str5);
		System.out.println(str2==str4);
		System.out.println(str4==str5);
		System.out.println(str3==str4);
		
		//compareTo()
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str4.compareTo(str6));
		System.out.println(str5.compareTo(str2));
		
		//concat()
		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str4));
		System.out.println(str5.concat(str6));
		System.out.println(str1.concat(str6));
		
		//using +
		
		System.out.println(str1+str2+35+67);
		System.out.println(str4+str5);
		System.out.println(10+2+str5+str6+80+67);
		
		
			
		}
	}

