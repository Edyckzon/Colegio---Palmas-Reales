package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.CategoriaM;
import com.springboot.models.repository.CategoriaMRepository;
import com.springboot.models.service.CategoriaMService;


@Service
public class CategoriaMServiceImpl implements CategoriaMService{

	@Autowired
	private CategoriaMRepository repositoryC;
	
	@Override
	public List<CategoriaM> listarTodos() {
		return repositoryC.findAll();
	}

	@Override
	public void guardar(CategoriaM catm) {
		repositoryC.save(catm);
	}

	@Override
	public Optional<CategoriaM> buscarID(int id) {
		return repositoryC.findById(id);
	}

	@Override
	public void borrar(int id) {
		repositoryC.deleteById(id);
	}
}
