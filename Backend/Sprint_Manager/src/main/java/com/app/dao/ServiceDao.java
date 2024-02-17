package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Manager;
import com.app.entities.Sprint;

public interface ServiceDao extends JpaRepository<Sprint,Long> {

}
