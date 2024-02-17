package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.Employee_dao;
import com.app.dao.Sprint_entries_dao;
import com.app.entities.Sprint;
import com.app.entities.Sprint_entry;

public class Sprint_entries_service_imp implements Sprint_entries_service {
	
	@Autowired
	private Sprint_entries_dao serdao;

	@Override
	public List<Sprint_entry> getAllSprintentry() {
		// TODO Auto-generated method stub
		return serdao.findAll();
	}

	@Override
	public Sprint_entry addNewEmp(Sprint_entry sp) {
		// TODO Auto-generated method stub
		return serdao.save(sp);
	}

	@Override
	public Sprint_entry updateEmpDetails(Sprint_entry sp) {
		// TODO Auto-generated method stub
		return serdao.save(sp);
	}

	@Override
	public String deleteEmpDetails(Long sprintentryId) {
		// TODO Auto-generated method stub
		String mesg = "Sprint deletion failed !!!! invalid Sprint id";
		if (serdao.existsById(sprintId)) {
			serdao.deleteById(sprintId);
			mesg = "Sprint details deleted ....";
		}
		return mesg;	}



}
