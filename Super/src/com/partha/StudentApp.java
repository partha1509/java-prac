package com.partha;

public class StudentApp {

	public static void main(String[] args) {
		System.out.println("Starting student app");

		User user = new Employee("shabaz", 26, "srcocder");
		System.out.println(user);

		Student st1;

		if (user instanceof Student) {
			st1 = (Student) user;
		}

	}

}
