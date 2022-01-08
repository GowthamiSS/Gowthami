package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("The Student Name is Gowthami");
	}

	public void studentDept() {
		System.out.println("The Student Dept is IT");
	}

	public void studentID() {
		System.out.println("The Student ID is 11");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentID();
		s.studentDept();

	}

}
