package com;

public class Test {

	public static void main(String[] args) {

		Student std = new Student();
		std.setStudentName("Ozvitha");

		Student std1 = new Student();
		std1.setStudentName("Praveen");
		
		std1.registerStudent();
		std1.registerForExam();
		std1.apperForExam();
		System.out.println("Result: " + std1.getResult());

	}

}
