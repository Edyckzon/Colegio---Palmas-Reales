package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.Editorial;

public interface EditorialService {

	public List<Editorial> listarTodos();
	public void guardar(Editorial edit);
	public Optional<Editorial> buscarID(int id);
	public void borrar(int id);
}
