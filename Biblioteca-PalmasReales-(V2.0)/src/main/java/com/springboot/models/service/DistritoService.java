package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.Distrito;

public interface DistritoService {
	public List<Distrito> listarTodos();
	public void guardar(Distrito dist);
	public Optional<Distrito> buscarID(int id);
	public void borrar(int id);
}
