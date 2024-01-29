package com.springboot.models.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.models.entity.estadoPrestamo;
import com.springboot.models.repository.estadoPrestamoRepository;
import com.springboot.models.service.estadoPrestamoService;



@Service
public class estadoPrestamoServiceImpl implements estadoPrestamoService{
	
	@Autowired
	private estadoPrestamoRepository repositoryEP;
	
	@Override
	public List<estadoPrestamo> listarTodos(){
		
		return repositoryEP.findAll();
	};
	
	
	
	

}
