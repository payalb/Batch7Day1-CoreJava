package day2;

public class Puzzle3 {
public static void main(String[] args) {
	Book obj= new PracticalBook();
	System.out.println(obj.pages); 
	obj.read();
}
}

class Book{
	
	int pages= 50;
	void read(){
		System.out.println("Reading!"+ pages);
	}
}

class PracticalBook extends Book{
	
	int pages= 20;
	
	void read(){
		super.read();
		System.out.println("Learning Diagrams");
	}
}