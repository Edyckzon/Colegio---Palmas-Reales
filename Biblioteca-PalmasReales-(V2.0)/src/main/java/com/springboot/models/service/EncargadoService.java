package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.Encargado;

public interface EncargadoService {
	public List<Encargado> listarTodos();
	public void guardar(Encargado encargado);
	public Optional <Encargado>buscarID(int id);
	public void borrar (int id);
}