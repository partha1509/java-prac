package com.partha;

public class Employee extends User {
	
private String designation;

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public Employee(String name, int age, String designation) {
	super(name, age);
	this.designation = designation;
}

@Override
public String toString() {
	return designation+"  "+getName()+"  "+getAge();
}


}
