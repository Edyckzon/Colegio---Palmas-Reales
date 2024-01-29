package com.springboot.models.service;

import java.util.List;
import java.util.Optional;
import com.springboot.models.entity.Sancion;

public interface SancionService {

	 public List<Sancion>listarTodos(); 
	 public void Guardar(Sancion san); 
	 public Optional<Sancion> buscarID(int id); 
	 public void Borrar(int id);
	
}
