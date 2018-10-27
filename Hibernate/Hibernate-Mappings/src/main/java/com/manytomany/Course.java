package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
public class Course {

	@Id
	private int courseId;
	private String courseName;
	@Transient
	private double fee;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName, double fee) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.fee = fee;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "studentData", joinColumns = { @JoinColumn(name = "courseId") }, inverseJoinColumns = {
			@JoinColumn(name = "studentId") })
	private List<Student> students = new ArrayList<Student>();

	public List<Student> getStudents() {
		return students;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
