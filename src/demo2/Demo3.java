package demo2;

public class Demo3 {

	int x;
	static int count ;
	{
		//instance block : before the constructor is called
		count++;
		x++;
	}
	
	Demo3(){
		
	}
	public static void main(String[] args) {
		Demo3 obj1= new Demo3();
		System.out.println(obj1.x);//1
		System.out.println(obj1.count);//1
		
		Demo3 obj2= new Demo3();
		System.out.println(obj2.x);//1
		System.out.println(obj2.count);//2
		
		System.out.println(Demo3.count); //2
	}
}
