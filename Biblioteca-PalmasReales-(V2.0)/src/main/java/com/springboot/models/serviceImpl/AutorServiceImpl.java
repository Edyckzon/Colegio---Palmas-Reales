package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Autor;
import com.springboot.models.repository.AutorRepository;
import com.springboot.models.service.AutorService;



@Service
public class AutorServiceImpl implements AutorService{
	
	@Autowired
	private AutorRepository repositoryA;

	@Override
	public List<Autor> listarTodos() {
		return repositoryA.findAll();
	}

	@Override
	public void guardar(Autor aut) {
		repositoryA.save(aut);
	}

	@Override
	public Optional<Autor> buscarID(int id) {
		return repositoryA.findById(id);
	}

	@Override
	public void borrar(int id) {
		repositoryA.deleteById(id);
	}

	
}
