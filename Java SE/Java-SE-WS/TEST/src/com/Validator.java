package com;

public class Validator {

	public static Validator getValidator() {
		return new Validator();
	}

	public boolean validateStudentDetails(Student student) {

		if (student.getStudentName() != null) {
			return true;
		}

		return false;
	}

}
