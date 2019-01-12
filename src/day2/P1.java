package day2;

interface Shape{
	
	abstract void draw();
	abstract float getArea();
	abstract float getPerimiter();
	//factory method: which gives u an object
	static Shape getShape(int... arg) { //object of the class
		if(arg.length==1) {
			return new Circle();
		}
		else if(arg.length==3) {
			return new Triangle();
		}
		else {
			System.out.println("Invalid args");
			return null;
		}
	}
}

class Circle implements Shape{
	
	int radius;
	private static final float PI= 3.14f;

	@Override
	public void draw() {
		System.out.println("Drawing circle");
		
	}

	@Override
	public float getArea() {
		return PI* radius* radius;
	}

	@Override
	public float getPerimiter() {
		return 2* PI * radius;
	}
	
}

class Triangle implements Shape{
	
	float a, b, c, h;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getPerimiter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Demo{
	public static void main(String[] args) {
		Shape shape= Shape.getShape(5);
		shape.draw();
		System.out.println(shape.getArea());
		
		Shape shape1= Shape.getShape(5,3,4);
		shape.draw();
		System.out.println(shape.getArea());
	}
}