package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.ManagerDao;
import com.app.dao.ServiceDao;
import com.app.entities.Sprint;

public class Sprint_service_imp implements Sprint_service{
	
	@Autowired
	private ServiceDao serdao;

	@Override
	public List<Sprint> getAllSprints() {
		// TODO Auto-generated method stub
		return serdao.findAll();
	}

	@Override
	public Sprint addNewEmp(Sprint sp) {
		// TODO Auto-generated method stub
		return serdao.save(sp);
	}

	@Override
	public Sprint updateEmpDetails(Sprint sp) {
		// TODO Auto-generated method stub
		return serdao.save(sp);
	}

	@Override
	public String deleteEmpDetails(Long sprintId) {
		// TODO Auto-generated method stub
		String mesg = "Sprint deletion failed !!!! invalid Sprint id";
		if (serdao.existsById(sprintId)) {
			serdao.deleteById(sprintId);
			mesg = "Sprint details deleted ....";
		}
		return mesg;
	}

}
