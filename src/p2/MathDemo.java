package p2;

public class MathDemo {

	//3 numbers, 4 numbers, float
	//diff argument: number of args/ type/ order
	/*public void add2Int(int a, int b) {
		System.out.println(a+b);
	}
	public void addIntFloat(int a, float b) {
		System.out.println(a+b);
	}
	public void addFloatInt(float a, int b) {
		System.out.println(a+b);
	}
	public void add2Float(float a, float b) {
		System.out.println(a+b);
	}
	
	public void add3Int(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add4Int(int a, int b, int c, int d) {
		System.out.println(a+b+c+ d);
	}*/
	//Method overloading
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	 int add(float a, int b) {
		System.out.println(a+b);
		return (int)a+b;
	}
	private void add(int a, float b) {
		System.out.println(a+b);
	}
}


class Demo{
	public static void main(String[] args) {
		MathDemo obj= new MathDemo();
		obj.add(3.4f,4);
	}
}
