package com.app.service;

import java.util.List;

import com.app.entities.Sprint_entry;

public interface Sprint_entries_service {
	
	public List<Sprint_entry> getAllSprintentry();

	public Sprint_entry addNewEntry(Sprint_entry sp);

	public Sprint_entry updateSprintentryDetails(Sprint_entry sp);

	public String deleteEntryDetails(Long sprintentryId) ;

}
