package day2;

public class Puzzle1 {
public static void main(String[] args) {
	RollingChair obj= new RollingChair();
}
}

class Chair{
	
	int legs= 4;
	Chair(int legs){
	 this.legs= legs;
	}
	/*Chair(){}*/
	
}

class RollingChair extends Chair{
	
	/*RollingChair(){
		super(4);
	}*/
	void setLegs(int legs){
	this.legs=legs;
	}
	
	void roll(){}
}