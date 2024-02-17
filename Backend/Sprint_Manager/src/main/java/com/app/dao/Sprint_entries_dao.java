package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Sprint;
import com.app.entities.Sprint_entry;

public interface Sprint_entries_dao extends JpaRepository<Sprint_entry,Long> {

}
