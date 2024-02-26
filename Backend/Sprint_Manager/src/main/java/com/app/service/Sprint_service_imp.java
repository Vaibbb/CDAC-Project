package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ManagerDao;
import com.app.dao.ServiceDao;
import com.app.entities.Sprint;


@Service
@Transactional
public class Sprint_service_imp implements Sprint_service{
	
	@Autowired
	private ServiceDao serdao;

	@Override
	public List<Sprint> getAllSprints(Integer id) {
		// TODO Auto-generated method stub
		return serdao.findbymanager_id(id);
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
	public String deleteEmpDetails(Integer sprintId) {
		// TODO Auto-generated method stub
		String mesg = "Sprint deletion failed !!!! invalid Sprint id";
		if (serdao.existsById(sprintId)) {
			serdao.deleteById(sprintId);
			mesg = "Sprint details deleted ....";
		}
		return mesg;
	}

}

