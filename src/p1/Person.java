package p1;

abstract public class Person {

	protected String name;
	protected int age;
//	Address address;
	
	public Person(){
		super();
		age= 20;
	}
	public static int count;
	{
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void finalize() {
		count--;
	//	address= null;
		System.out.println("Person object removed!!");
	}
	
}
