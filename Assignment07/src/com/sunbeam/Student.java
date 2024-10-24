package com.sunbeam;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	private int roll;
	private String name;
	private String city;
	private double marks;
	
	
	
	public Student() {
		super();
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.roll-o.roll;
	}
	
	
}
