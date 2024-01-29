package com.springboot.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.tipoSancion;
import com.springboot.models.repository.tipoSancionRepository;
import com.springboot.models.service.tipoSancionService;


@Service
public class tipoSancionServiceImpl implements tipoSancionService{
 
	 @Autowired
	  private tipoSancionRepository repositoryS; 
	 
	 @Override
	 public List<tipoSancion> listarTodos(){
		 return repositoryS.findAll();
	 }
	
}
