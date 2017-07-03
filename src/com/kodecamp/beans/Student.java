package com.kodecamp.beans;

import com.kodecamp.framework.NavigationRules;

public class Student {
	
	private String rollno;
	private String name;
	private String address;
	private String course;
	
	
	public Student() {
		
		System.out.println("Constructor : "+this.getClass().getName());
	}


	public String getRollno() {
		return rollno;
	}


	public void setRollno(String rollno) {
		System.out.println("RollNO : "+rollno);
		this.rollno = rollno;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		System.out.println("name : "+name);
		this.name = name;
	}


	public String getAddress() {
		
		return address;
	}


	public void setAddress(String address) {
		System.out.println("Address : "+address);
		this.address = address;
	}


	public String getCourse() {
	
		return course;
	}


	public void setCourse(String course) {
		System.out.println("Course : "+address);
		this.course = course;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name :" +name+" address :"+address+" course :"+course+" rollno : "+rollno;
	}
	
	public String submit() {
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.address);
		return NavigationRules.NAV_STUDENT_DETAILS;
	}
	

	
	

}
