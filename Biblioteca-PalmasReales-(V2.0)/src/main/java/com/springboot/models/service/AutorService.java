package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.Autor;

public interface AutorService {
	
	public List<Autor> listarTodos();
	public void guardar(Autor aut);
	public Optional<Autor> buscarID(int id);
	public void borrar(int id);
}
