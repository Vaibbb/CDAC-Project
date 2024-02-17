package com.app.service;

import java.util.List;

import com.app.entities.Sprint;

public interface Sprint_service {

	public List<Sprint> getAllSprints();
	public Sprint addNewEmp(Sprint sp);
	public Sprint updateEmpDetails(Sprint sp);
	public String deleteEmpDetails(Long sprintId);
	
}
