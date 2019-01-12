package day2;

public class StringDemo1 {
public static void main(String[] args) {
	//String is an immutable class
	//Once u create the Object, u cannot change the state of the object
	String str= "Hello World";
	str= str+ " !";
	System.out.println(str); //Hello World !
	
	System.out.println(str.length()); //13
	System.out.println(str.indexOf("ll")); //2
	System.out.println(str.substring(5));// World !
	String str1= " H e l l o ";
	str1=str1.trim();//H e l l o
	System.out.println(str1);
	System.out.println(str1.substring(2, 4)); //
	
	String str2= "";
	System.out.println(str2.isEmpty());
	
	String str3= " ";
	System.out.println(str3.isEmpty()); //false
	System.out.println(str3.isBlank());//true
	System.out.println(str3.trim().isEmpty());//true
	
	String str4= str3.concat("abc").concat("def");
	//str4= str3+"abc"+"def";
	str4= 4+ 3+ " abc"; //7 abc
	str4= "abc"+( 4+3); //abc7
	
	System.out.println(str4.toLowerCase());
	str4.startsWith("ab");
	
	str4= "bab";
	System.out.println(str4.compareTo("bab"));
	
	
	StringBuilder builder= new StringBuilder("abc");
	builder.append("def").append(1);
	System.out.println(builder);
	
	String s1= "abc";
	s1=s1.concat("def");
}
}
