package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Tasks")
public class Tasks {
	@Column
	private double duration;
	@Column(name ="Name")
	private String name_of_task;
	@Column
	private int Priority;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "projects_emps"
			, joinColumns = @JoinColumn(name = "project_id")
	, inverseJoinColumns = @JoinColumn(name = "emp_id"))
	private Set<Sprint_entry> Entries = new HashSet<>();

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getName_of_task() {
		return name_of_task;
	}

	public void setName_of_task(String name_of_task) {
		this.name_of_task = name_of_task;
	}

	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}

	public Set<Sprint_entry> getEntries() {
		return Entries;
	}

	public void setEntries(Set<Sprint_entry> entries) {
		Entries = entries;
	}

	public Tasks(double duration, String name_of_task, int priority, Set<Sprint_entry> entries) {
		super();
		this.duration = duration;
		this.name_of_task = name_of_task;
		Priority = priority;
		Entries = entries;
	}

	public Tasks() {
		super();
	}
	
	
	
}
