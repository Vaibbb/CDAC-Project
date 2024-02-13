package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Sprint_Entry")
public class Employee {
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column(length = 30,unique = true) 
	private String email;
	@Column(name="join_date")
	private LocalDate joinDate;
	@Enumerated(EnumType.STRING)
	@Column(length = 30,name="emp_type")
	private EmploymentType empType;
	private double salary;
	@ManyToOne
	@JoinColumn(name="Entry_id")
	private Sprint_entry Entry;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public EmploymentType getEmpType() {
		return empType;
	}
	public void setEmpType(EmploymentType empType) {
		this.empType = empType;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Sprint_entry getEntry() {
		return Entry;
	}
	public void setEntry(Sprint_entry entry) {
		Entry = entry;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", joinDate="
				+ joinDate + ", empType=" + empType + ", salary=" + salary + ", Entry=" + Entry + "]";
	}
	public Employee(String firstName, String lastName, String email, LocalDate joinDate, EmploymentType empType,
			double salary, Sprint_entry entry) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.joinDate = joinDate;
		this.empType = empType;
		this.salary = salary;
		Entry = entry;
	}
	
	
}
