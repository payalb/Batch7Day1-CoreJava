package com.java.demo;

import java.util.Set;

public class School {
	
	int id;
	String name;
	String address;
	Set<Standard> standards;
	Set<Teacher> teachers;

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}
	
	protected void updateAddress(String address) {
		this.address= address;
	}
	
	public void print() {
		System.out.println("Id is"+ id + " , name is "+ name+ ", address is"+ address+
				" , standards are "+ standards
				+ " teachers are"+ teachers);
	}
}
