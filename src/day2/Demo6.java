package day2;

public class Demo6 {
	public static void main(String[] args) {
		P2 obj= new P2();
		obj.id=5;
		P2 obj1= obj;
		obj1.id=6;
		System.out.println(obj.id); //6
	}
}
class P2{
	int id;
}