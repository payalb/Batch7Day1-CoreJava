package demo3;

import java.io.File;

public interface I1 {
	float PI= 3.14f;
	
	void m1();
	static void m2() {
		
	}
	default void print() {
		System.out.println(1);
	}
}

 interface I2 {
	
	void m1();
	static void m2() {
		
	}
	default void print() {
		System.out.println(2);
	}
}

class Demo2  implements I1, I2{
	{
		System.out.println(I1.PI);
	//	I1.PI++;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	public void print() {
			//System.out.println(1);
	//	I1.super.print();
		I2.super.print();
		}
}