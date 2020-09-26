package Week3.Day1.org.student;

import Week3.Day1.org.department.Department;

public class Student extends Department {

	
	public void studentName() {
		System.out.println("Student Class --> studentName method");
	}
	
	public void studentDept() {
		System.out.println("Student Class --> studentDept method");
	}
	
	public void studentId() {
		System.out.println("Student Class --> studentId method");
	}
	
	public static void main(String[] args) {
		Student sd = new Student();
		sd.studentName();
		sd.studentDept();
		sd.studentId();
		sd.deptName();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
	}

}
