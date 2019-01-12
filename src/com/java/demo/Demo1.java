package com.java.demo;

import java.util.Scanner;

import p1.Person;

public class Demo1 {
	Scanner obj= new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
	/*	Person p1= new Person();
		
		Person p2= new Person();
		System.out.println(Person.count);
		p1= null;
		p2= null;
		System.gc(); //Asking ur scheduler to run gc thread
		Thread.sleep(5000);
		System.out.println(Person.count);
		System.out.println("done");*/
		
		Student obj= new Student();
		Teacher teacher = new Teacher();
	}
	@Override
	public void finalize() {
		obj.close();
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