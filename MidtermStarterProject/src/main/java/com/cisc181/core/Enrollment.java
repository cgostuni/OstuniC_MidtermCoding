package com.cisc181.core;

import java.util.Scanner;
import java.util.UUID;

public class Enrollment {

	UUID SectionID;
	
	UUID StudentID;
	
	UUID EnrollmentID;
	
	double Grade;
	
	// no-arg constructor private
	private Enrollment(){
		
	}
	
	
	// two-arg constructor
		
	private Enrollment(UUID StudentID , UUID SectionID){
		System.out.print("Enter a Student ID");
		//UUID StudentID = input.nextDouble();
		this.StudentID = StudentID;
		System.out.print("Enter a Section ID");
		//UUID SectionID = input.nextDouble();
		this.SectionID = SectionID;
		this.EnrollmentID = EnrollmentID;
	}
		
	// SetGrade as a procedure
	public void setGrade(double Grade){
	}
	
}
