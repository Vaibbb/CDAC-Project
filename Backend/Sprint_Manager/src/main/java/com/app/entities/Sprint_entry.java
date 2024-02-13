package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "Sprint_Entry")
public class Sprint_entry extends Base_Entity {
	
	@Column
	private String Description;
	@Column
	private LocalDate start_date;
	@Column
	private LocalDate finish_date;
	@ManyToMany(mappedBy = "employees")
	private Set<Tasks> Entries=new HashSet<>();
	@ManyToOne
	@JoinColumn(name="Sprint")
	private Sprint Sprint;
	
	@OneToMany(mappedBy = "Entry_id",cascade = CascadeType.ALL,
			orphanRemoval = true ,fetch=FetchType.EAGER )
	private ArrayList<Employee> Employee_list = new ArrayList<>();

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getFinish_date() {
		return finish_date;
	}

	public void setFinish_date(LocalDate finish_date) {
		this.finish_date = finish_date;
	}

	public Set<Tasks> getEntries() {
		return Entries;
	}

	public void setEntries(Set<Tasks> entries) {
		Entries = entries;
	}

	public Sprint getSprint() {
		return Sprint;
	}

	public void setSprint(Sprint sprint) {
		Sprint = sprint;
	}

	public ArrayList<Employee> getEmployee_list() {
		return Employee_list;
	}

	public void setEmployee_list(ArrayList<Employee> employee_list) {
		Employee_list = employee_list;
	}

	public Sprint_entry(String description, LocalDate start_date, LocalDate finish_date, Set<Tasks> entries,
			com.app.entities.Sprint sprint, ArrayList<Employee> employee_list) {
		super();
		Description = description;
		this.start_date = start_date;
		this.finish_date = finish_date;
		Entries = entries;
		Sprint = sprint;
		Employee_list = employee_list;
	}

	public Sprint_entry() {
		super();
	}

	

}
