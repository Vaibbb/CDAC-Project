package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.entities.Sprint;
import com.app.entities.Sprint_entry;
import com.app.service.Employee_service_imp;
import com.app.service.Sprint_entries_service_imp;
import com.app.service.Sprint_service_imp;


@RestController
@RequestMapping("/Sprint_entries")
@CrossOrigin(origins = "http://localhost:3000")
public class Sprint_EntriesController {
	
	@Autowired
	private Sprint_entries_service_imp service_entry;
	
	@Autowired
	private Employee_service_imp employee_service;
	
	@GetMapping("/entry")
	public List<Sprint_entry> fetchAllSprintentry() {
		System.out.println("in fetch all");
		return service_entry.getAllSprintentry();
	}
	
	@PostMapping("/entry")
	public Sprint_entry addentryDetails(@RequestBody Sprint_entry sp) {
		System.out.println("in add emp " + sp);// id : null , rest all fields : present
		return service_entry.addNewEntry(sp);
	}
	
	@PutMapping("/entry")
	public Sprint_entry updateentryDetails(@RequestBody Sprint_entry sp) {
		System.out.println("in update " + sp);
		return service_entry.updateSprintentryDetails(sp);
	}
	
	@DeleteMapping("/entry/{sprintentryId}") // URI variable /template var.
	public String deleteEntryDetails(@PathVariable Integer sprintentryId) {
		System.out.println("in del emp " + sprintentryId);
		return service_entry.deleteEntryDetails(sprintentryId);
	}
	
	@GetMapping("/Employee")
	public List<Employee> fetchAllEmployee() {
		System.out.println("in fetch all");
		return employee_service.getAllEmployee();
	}
	
	@PostMapping("/Employee")
	public Employee addEmpDetails(@RequestBody Employee sp) {
		System.out.println("in add emp " + sp);// id : null , rest all fields : present
		return employee_service.addNewEmp(sp);
	}
	
	@PutMapping("/Employee")
	public Employee updateEmpDetails(@RequestBody Employee sp) {
		System.out.println("in update " + sp);
		return employee_service.updateEmpDetails(sp);
	}
	
	@DeleteMapping("/Employee/{employeeId}") // URI variable /template var.
	public String deleteEmpDetails(@PathVariable Integer sprintId) {
		System.out.println("in del emp " + sprintId);
		return employee_service.deleteEmpDetails(sprintId);
	}

}
