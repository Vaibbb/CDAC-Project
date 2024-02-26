package com.app.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import com.app.entities.Sprint;
import com.app.service.Sprint_service_imp;

@RestController
@RequestMapping("/Sprint")
@CrossOrigin(origins = "http://localhost:3000")
public class SprintController {
	
	@Autowired
	private Sprint_service_imp service;
		
	@GetMapping("/man/{manid}")
	public ResponseEntity<?>  fetchAllSprints(@PathVariable Integer manid) throws IOException {
		System.out.println("in fetch all" + manid);
		
		return ResponseEntity.ok(service.getAllSprints(manid));
	}
	

	@PostMapping
	public Sprint addSprintDetails(@RequestBody Sprint sp) {
		System.out.println("in add emp " + sp);// id : null , rest all fields : present
		return service.addNewEmp(sp);
	}
	
	@PutMapping
	public Sprint updateSprintDetails(@RequestBody Sprint sp) {
		System.out.println("in update " + sp);
		return service.updateEmpDetails(sp);
	}
	
	@DeleteMapping("/{sprintId}") // URI variable /template var.
	public String deleteSprintDetails(@PathVariable Integer sprintId) {
		System.out.println("in del emp " + sprintId);
		return service.deleteEmpDetails(sprintId);
	}

}
