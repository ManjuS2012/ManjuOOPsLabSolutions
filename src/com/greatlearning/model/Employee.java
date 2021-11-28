package com.greatlearning.model;

public class Employee {
	// Declare firstName,lastName,String department

	private String firstName;
	private String lastName;
	private String department;

	// create a constructor
	public Employee(String firstName, String lastName, String department) {
		// Constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;

	}

	// create getters and setters
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
