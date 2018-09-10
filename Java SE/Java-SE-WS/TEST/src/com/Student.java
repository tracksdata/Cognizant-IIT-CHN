package com;

public class Student {

	private String admissionId;
	private String studentName;
	private String result;
	private Exam exam;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void registerStudent() {

		Registar registar = Registar.getRegister();
		admissionId = registar.registerStuden(this);
		System.out.println("Id: " + admissionId);

	}

	public void registerForExam() {
		ExamRegistrar examRegistrar = ExamRegistrar.getExamregister();
		exam = examRegistrar.registeringStudentForExamination(this);
	}

	public void apperForExam() {
		Paper paper = exam.getPaper();
		result = paper.submit();
	}

}
