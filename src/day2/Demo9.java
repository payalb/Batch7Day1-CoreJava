package day2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo9 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//Three obj= new Three();
		Class cObj=Three.class;
		Constructor consObj=cObj.getDeclaredConstructor();
		consObj.setAccessible(true);
		Three obj=(Three) consObj.newInstance();
		Method mObj=cObj.getDeclaredMethod("m1");
		mObj.setAccessible(true);
		mObj.invoke(obj);
	}
}

class Three {

	private Three() {
		System.out.println("Constructor invoked!");
	}

	private void m1() {

		System.out.println("method invoked!");

	}
}