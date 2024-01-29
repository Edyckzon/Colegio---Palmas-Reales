package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.CategoriaM;

public interface CategoriaMService {
	public List<CategoriaM> listarTodos();
	public void guardar(CategoriaM catm);
	public Optional<CategoriaM> buscarID(int id);
	public void borrar(int id);
}
