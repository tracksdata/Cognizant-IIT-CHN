package com;

public class Registar {

	public static Registar getRegister() {
		return new Registar();
	}

	public String registerStuden(Student student) {

		String admissionId = null;

		System.out.println("Name: " + student.getStudentName());
		Validator validator = Validator.getValidator();
		validator.validateStudentDetails(student);

		if (validator.validateStudentDetails(student)) {
			admissionId = "STD001";
		}

		return admissionId;
	}

}
