package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		
	System.out.println("Amrutha");
	}
	
	public void studentdept() {
	
	System.out.println("Computer Science");
		
	}
	
	public void studentId() {
		
	System.out.println("1001");
	}
	
	public static void main(String[] args) {
		
		Student obj =new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentdept();
		obj.studentId();
	}

}
