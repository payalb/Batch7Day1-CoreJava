package p2;

public class DemoOne {

	public static void main(String[] args) {
		int a= 5;
		System.out.println(a++); //5
		System.out.println(++a); //7
		
		a+=5; // a= a+5
		System.out.println(a); //12
		
		System.out.println(a==12);//true
		
		System.out.println(a>10); //true
		int b=1;
		
		System.out.println( a>12 && ++b >2); //false
		
		//and gate : 0 : 0 {1,1=1}
		System.out.println(a); //12
		System.out.println(b); //1
		
		System.out.println( a>12 & ++b >2); //false
		//and gate : 0 : 0 {1,1=1}
		System.out.println(a); //12
		System.out.println(b); //2
		
	System.out.println( a<12 || ++b >2); //true
		
		//or gate :1 : 1{0,0: 0}
		System.out.println(a); //12
		System.out.println(b); //2
		
		
		System.out.println( a<12 | ++b >2); //true
		
		//or gate :1 : 1{0,0: 0}
		System.out.println(a); //12
		System.out.println(b); //3
		
		
		System.out.println(a>=12 ? "Greater than or equal to 12" : "Less than 12"); 
		
		//ternary operator: expression(boolean)? exp1( if it is true): exp2 (if the expression value is false)
		
		
		
	}
}
