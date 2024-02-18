package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Manager")
public class Manager extends Base_Entity {
	
	@Column(name="first_name",length = 30)
	private String firstName;
	@Column(name="last_name",length = 30)
	private String lastName;
	@Column(length = 30,unique = true) 
	private String email;
	@Column(length = 20,nullable = false)
	private String password;
//	@Transient //skip from persistence (i.e no col will be generated)
//	private String confirmPassword;
	@Column(name="join_date")
	private LocalDate joinDate;
	@Enumerated(EnumType.STRING) 
	@Column(length = 30,name="Position")
	private Position Position; 
	@Column
	private double salary;//auto adds NOT NULL constraint
	
	@OneToMany(mappedBy = "manager_id",cascade = CascadeType.ALL,
			orphanRemoval = true ,fetch=FetchType.EAGER )
	private List<Sprint> sprint_list = new ArrayList<>();

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public Position getPosition() {
		return Position;
	}

	public void setPosition(Position position) {
		Position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Sprint> getSprint_list() {
		return sprint_list;
	}

	public void setSprint_list(ArrayList<Sprint> sprint_list) {
		this.sprint_list = sprint_list;
	}

	@Override
	public String toString() {
		return "Manager [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", joinDate=" + joinDate + ", Position=" + Position + ", salary=" + salary
				+ ", sprint_list=" + sprint_list + "]";
	}

	public Manager(String firstName, String lastName, String email, String password, LocalDate joinDate,
			com.app.entities.Position position, double salary, ArrayList<Sprint> sprint_list) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.joinDate = joinDate;
		Position = position;
		this.salary = salary;
		this.sprint_list = sprint_list;
	}

	public Manager() {
		super();
	}

	

}
