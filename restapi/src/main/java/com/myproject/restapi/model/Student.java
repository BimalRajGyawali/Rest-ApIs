package com.myproject.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int roll;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	private String firstName;
	private String lastName;
	private double marks;

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks
				+ "]";
	}

}
