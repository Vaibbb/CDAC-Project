package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Manager;
import com.app.entities.Sprint;

public interface ServiceDao extends JpaRepository<Sprint,Long> {

	@Query(value="select * from SPRINT where manager_id =:id",nativeQuery=true)
	List<Sprint> findbymanager_id(int id);

}