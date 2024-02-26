package com.app.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.app.entities.Manager;
import com.app.service.Manager_service_imp;

@RestController
@RequestMapping("/manager")
@CrossOrigin(origins = "http://localhost:3000")
public class ManagerController {
	
	@Autowired
	private Manager_service_imp service;
	
	@GetMapping("/email/{email}")
	public Optional<Manager> getManByDept(@PathVariable String email) {
		System.out.println("in get man by email " + email);
		Optional<Manager> man =service.findByEmail(email);
		System.out.println(man);
		return man;
	}

	@PostMapping
	public Manager addEmpDetails(@RequestBody Manager man) {
		System.out.println("in add emp " + man);// id : null , rest all fields : present
		return service.addman(man);
	}
	
}
