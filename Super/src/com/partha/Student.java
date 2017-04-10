package com.partha;

public class Student extends User {

	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(String name, int age, int marks) {
		super(name, age);
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student " + getName() + " " + getAge() + " " + marks;
	}

}
