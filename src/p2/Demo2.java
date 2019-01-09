package p2;

/**
 * This is a demo on implicit and explicit casting
 * @author payal
 *
 */
public class Demo2 {
	
	/**
	 * This is a main method which is showing the 
	 * use of casting: both implicit and expicit
	 */
	//Casting in java: Implicit | Explicit
	public static void main(String[] args) {
		int a= 20; //32 bits :00000000 00000000 00000000 00010100
		byte b= (byte)a; //8 bits //Explicit casting  00010100
		System.out.println(b);
		
		int c= 120; //00000000 00000000 00000000 01111000
		byte d= (byte)c;//1111000
		System.out.println(d);
		
		int e= 370;//00000000 00000000 00000001 01110010
		byte f= (byte)e; //114
		System.out.println(f);
		/*
		 * This is a multi-line comment
		 * This is the second line
		 */
		
		byte g= 114; //8 bits 01110010
		int h= g; //Implicit casting
		
	}

}
