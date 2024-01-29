package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Alumno;
import com.springboot.models.repository.AlumnoRepository;
import com.springboot.models.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;

	@Override
	public List<Alumno> listarTodos() {
		return repository.findAll();
	}
	
	/*Metodo para consultas de alumno x dni*/
	@Override
	public List<Alumno> listaxDNI(int filtro) {
		return repository.findAll(filtro);
	}

	@Override 
	public void guardar(Alumno alu) {
		repository.save(alu);
	}

	@Override
	public Optional<Alumno> buscarID(int id) {
		return repository.findById(id);
	}

	@Override
	public void borrar(int id) {
		repository.deleteById(id);
	}

}
