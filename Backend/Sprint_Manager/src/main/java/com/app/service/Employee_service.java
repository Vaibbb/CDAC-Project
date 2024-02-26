package com.app.service;

import java.util.List;

import com.app.entities.Employee;
import com.app.entities.Sprint;

public interface Employee_service {
	
	public List<Employee> getAllEmployee() ;

	public Employee addNewEmp(Employee sp) ;

	public Employee updateEmpDetails(Employee sp) ;
	
	public String deleteEmpDetails(Integer sprintId) ;

}
