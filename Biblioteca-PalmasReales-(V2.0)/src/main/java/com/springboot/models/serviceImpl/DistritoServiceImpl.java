package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Distrito;
import com.springboot.models.repository.DistritoRepository;
import com.springboot.models.service.DistritoService;

@Service
public class DistritoServiceImpl implements DistritoService{
	
	@Autowired
	private DistritoRepository repository;

	@Override
	public List<Distrito> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Distrito dist) {
		// TODO Auto-generated method stub
		repository.save(dist);
	}

	@Override
	public Optional<Distrito> buscarID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	};
	
	
}
