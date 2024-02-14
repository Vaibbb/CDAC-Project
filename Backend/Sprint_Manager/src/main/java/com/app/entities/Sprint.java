package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Sprint")
public class Sprint extends Base_Entity{
	@Column
	private String Domain;
	@Column
	private String Priority;
	@Column(name="Deadline")
	private LocalDate Last_date_to_submit;
	@Column(length = 30,name="No_of_employees")
	private int number_emp;
    // many sprint to one manager
	@ManyToOne
	@JoinColumn(name="manager_id")
	private Manager manager_id;
	
	@OneToMany(mappedBy = "sprint_id",cascade = CascadeType.ALL,
			orphanRemoval = true ,fetch=FetchType.EAGER )
	private List<Sprint_entry> Sprint_entries_list = new ArrayList<>();

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getPriority() {
		return Priority;
	}

	public void setPriority(String priority) {
		Priority = priority;
	}

	public LocalDate getLast_date_to_submit() {
		return Last_date_to_submit;
	}

	public void setLast_date_to_submit(LocalDate last_date_to_submit) {
		Last_date_to_submit = last_date_to_submit;
	}

	public int getNumber_emp() {
		return number_emp;
	}

	public void setNumber_emp(int number_emp) {
		this.number_emp = number_emp;
	}

	public Manager getManager() {
		return manager_id;
	}

	public void setManager(Manager manager) {
		this.manager_id = manager;
	}

	public List<Sprint_entry> getSprint_entries_list() {
		return Sprint_entries_list;
	}

	public void setSprint_entries_list(List<Sprint_entry> sprint_entries_list) {
		Sprint_entries_list = sprint_entries_list;
	}

	public Sprint(String domain, String priority, LocalDate last_date_to_submit, int number_emp, Manager manager,
			List<Sprint_entry> sprint_entries_list) {
		super();
		Domain = domain;
		Priority = priority;
		Last_date_to_submit = last_date_to_submit;
		this.number_emp = number_emp;
		this.manager_id = manager;
		Sprint_entries_list = sprint_entries_list;
	}

	public Sprint() {
		super();
	}
	
	


}
