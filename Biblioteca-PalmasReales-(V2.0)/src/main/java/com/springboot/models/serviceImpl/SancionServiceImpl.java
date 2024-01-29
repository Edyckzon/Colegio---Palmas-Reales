package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Sancion;
import com.springboot.models.repository.SancionRepository;
import com.springboot.models.service.SancionService;

@Service
public class SancionServiceImpl implements SancionService{

	@Autowired
	   private SancionRepository repositoryS; 
	
	@Override 
	public List<Sancion>listarTodos(){
		 return repositoryS.findAll();
	}
	               
	@Override
	public void Guardar(Sancion san) {
		repositoryS.save(san); 
	}
	
	@Override
	public Optional<Sancion> buscarID(int id){
		return repositoryS.findById(id);
	}

	@Override
	public void Borrar(int id) {
		repositoryS.deleteById(id);
	}
	
}
