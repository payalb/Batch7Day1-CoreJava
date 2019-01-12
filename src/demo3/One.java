package demo3;

import java.lang.reflect.InvocationTargetException;

public class One {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	//	Demo1 obj= new Demo1();
		
		//jdbc [oracle| postgres| mysql]: driver //server
		
		//Class obj= Demo1.class;
		//Reflection api
		/*Class obj=Class.forName("demo3.Demo1"); //Dynamic loading of the class
		Object demoObj=obj.getConstructor().newInstance();
		obj.getDeclaredMethod("m1").invoke(demoObj);
	}*/
		
		Demo3 obj= new Demo3();
	}
	

}

final class Demo3{
	final void m1() {
		
	}
}
//ClassNotFoundException: CheckedException
