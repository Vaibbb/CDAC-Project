package com.app.service;

import java.util.Optional;

import com.app.entities.Manager;

public interface Manager_service {

	public Optional<Manager> findByEmail(String email);
	
}
