package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	@ManyToMany(mappedBy = "Entries")
	private Set<Tasks> Tasks_list=new HashSet<>();
	@ManyToOne
	@JoinColumn(name="Sprint_entries_list")
	private Sprint sprint_id;
	
	@OneToMany(mappedBy = "Entry",cascade = CascadeType.ALL,
			orphanRemoval = true ,fetch=FetchType.EAGER )
	private List<Employee> Employee_list = new ArrayList<>();

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




	public List<Employee> getEmployee_list() {
		return Employee_list;
	}

	public void setEmployee_list(List<Employee> employee_list) {
		Employee_list = employee_list;
	}

	public Sprint_entry(String description, LocalDate start_date, LocalDate finish_date, Set<Tasks> entries,
			Sprint sprint, List<Employee> employee_list) {
		super();
		Description = description;
		this.start_date = start_date;
		this.finish_date = finish_date;
		Tasks_list = entries;
		sprint_id = sprint;
		Employee_list = employee_list;
	}

	public Sprint_entry() {
		super();
	}

	

}
