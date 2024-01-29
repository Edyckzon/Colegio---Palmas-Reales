package com.springboot.models.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.models.entity.estadoSancion;
import com.springboot.models.repository.estadoSancionRepository;
import com.springboot.models.service.estadoSancionService;

@Service
public class estadoSancionImpl  implements estadoSancionService{
             
	 @Autowired
	 private estadoSancionRepository repositoryEs;

	@Override
	public List<estadoSancion> listarTodos(){
		
		return repositoryEs.findAll();
	} 
	 
 
}