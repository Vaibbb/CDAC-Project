package com.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.app.dao.ManagerDao;
import com.app.entities.Manager;


@Service
@Transactional
public class Manager_service_imp implements Manager_service {

	@Autowired
	private ManagerDao mandao;
	
	



	public Manager addman(Manager man) {
		// TODO Auto-generated method stub
		return mandao.save(man);
	}





	@Override
	public Optional<Manager> findByEmail(String email) {
		// TODO Auto-generated method stub
		return 	mandao.findByEmail(email);
	}


}
