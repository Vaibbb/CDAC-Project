package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Employee;
import com.app.entities.Sprint;

public interface Employee_dao extends JpaRepository<Employee,Long> {

}
