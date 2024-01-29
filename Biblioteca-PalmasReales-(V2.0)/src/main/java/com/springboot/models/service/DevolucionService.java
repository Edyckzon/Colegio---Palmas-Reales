package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.Devolucion;

public interface DevolucionService {
	public List<Devolucion> listarTodos();
	public void guardar(Devolucion dev);
	public Optional<Devolucion> buscarID(int id);
	public void borrar(int id);

};
