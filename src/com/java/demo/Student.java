package com.java.demo;

import java.util.Set;

import p1.Person;

public class Student extends Person{

	 int studentID;
	 float marks;
	 Set<String> subjects; //Math, Physics, Physics
	 @Override
		public void setAge(int age) {
			if(age>18 && age<50)
			this.age = age;
			else
				throw new RuntimeException("Invalid age!");
		}
	//  int standard;

}
