package com.springboot.models.service;


import java.util.List;
import java.util.Optional;



import com.springboot.models.entity.Material;

public interface MaterialService {
	
	
	public List<Material> listarTodos();
	public List<Material> listaxTitulo(String filtro);
	public void guardar(Material mat);
	public Optional<Material> buscarID(int id);
	public void borrar(int id);
} 
