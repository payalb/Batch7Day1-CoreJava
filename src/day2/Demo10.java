package day2;

public class Demo10 {
	public static void main(String[] args) {
		Employee obj= new Employee();
		obj.occupation= Occupation.BUSINESS;
		System.out.println(obj.occupation); 
		System.out.println(obj.occupation.getOccupation()); //B
		System.out.println(obj.occupation.ordinal());
		Occupation[] values=Occupation.values();
		for(Occupation oc: values) {
			System.out.println(oc);
		}
	}
}


enum Occupation{
	SERVICE('S'), BUSINESS('B'), NOT_WORKING('N'); //s, b, N
	private char occupation;
	Occupation(char occupation) {
		this.occupation= occupation;
	}
	
	public char getOccupation() {
		return occupation;
	}
}