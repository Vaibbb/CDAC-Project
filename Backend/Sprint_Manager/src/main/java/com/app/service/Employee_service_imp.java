package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.Employee_dao;
import com.app.dao.ServiceDao;
import com.app.dao.Sprint_entries_dao;
import com.app.entities.Employee;
import com.app.entities.Sprint;


@Service
@Transactional
public class Employee_service_imp implements Employee_service {
	
	@Autowired
	private Employee_dao serdao;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return serdao.findAll();
	}

	@Override
	public Employee addNewEmp(Employee sp) {
		// TODO Auto-generated method stub
		return serdao.save(sp);
	}

	@Override
	public Employee updateEmpDetails(Employee sp) {
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
		return mesg;	}



}
