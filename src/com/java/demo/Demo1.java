package com.java.demo;

import p1.Person;

public class Demo1 {
	public static void main(String[] args) {
		Person p1= new Person();
		Employee e1= new Employee();
		
	}

}

class Employee extends Person{
	
	
	void print() {
		System.out.println(name);
		System.out.println(Person.count);
		Person p1= new Person();
		System.out.println(p1.count);
		//System.out.println(p1.age);
		System.out.println(count);
	}
	
	
}