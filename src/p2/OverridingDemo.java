package p2;

public class OverridingDemo {

	
	
	public static void main(String[] args) {
		OverridingDemo obj1= new OverridingDemo();
		obj1.m1();//1
		Demo4 obj2= new Demo4();
		obj2.m1();//2
		//obj2.m1(2); //2
		OverridingDemo obj3= new Demo4();
		obj3.m1();//2
	}
	void m1() {
		System.out.println(1);
	}
}

class Demo4 extends OverridingDemo{
	@Override //compile time check 
	protected void m1() {
		System.out.println(2);
	}
	
	
	
	/* public int m1(){
	  	return 1;
	  }*/
	 
	
}