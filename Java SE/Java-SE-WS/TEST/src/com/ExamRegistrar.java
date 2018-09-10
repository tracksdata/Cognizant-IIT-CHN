package com;

public class ExamRegistrar {

	public static ExamRegistrar getExamregister() {
		return new ExamRegistrar();
	}

	public Exam registeringStudentForExamination(Student student) {

		Paper paper = new Paper();
		Exam exam = new Exam(paper);
		return exam;

	}

}
