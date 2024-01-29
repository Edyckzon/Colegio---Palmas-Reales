package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.Prestamo;



public interface PrestamoService {
	
	public List<Prestamo> listarTodos();
	public List<Prestamo> listaxFecha(String filtro);
	public void guardar(Prestamo pre);
	public Optional<Prestamo> buscarID(int id);
	public void borrar(int id);

}

