package com.app.dao;
import com.app.entities.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ManagerDao extends JpaRepository<Manager,Long> {
	
	@Query(value = "SELECT * FROM Manager m WHERE m.email = :email", nativeQuery = true)
	Optional<Manager> findByEmail(@Param("email") String email);


}
