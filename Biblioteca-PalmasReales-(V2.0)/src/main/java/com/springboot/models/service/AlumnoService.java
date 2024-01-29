package com.springboot.models.service;

import java.util.List;
import java.util.Optional;

import com.springboot.models.entity.Alumno;

public interface AlumnoService {

	public List<Alumno> listarTodos();
	public List<Alumno> listaxDNI(int filtro);
	public void guardar(Alumno alu);
	public Optional<Alumno> buscarID(int id);
	public void borrar(int id);
	
}
