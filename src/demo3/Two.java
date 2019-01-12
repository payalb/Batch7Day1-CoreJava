package demo3;

public class Two {
	
	final static int x;
	static {
		x=15;
	}
	/*{
		x=5;
	}*/
	/*Two(){
		x=15;
	}*/
	public static void main(String[] args) {
			final int x=5;
			System.out.println(x);
			System.out.println(Two.x);
			//x++;
	}
}
