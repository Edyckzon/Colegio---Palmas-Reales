package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.models.entity.Encargado;
import com.springboot.models.repository.EncargadoRepository;
import com.springboot.models.service.EncargadoService;

@Service
public class EncargadoServiceImpl implements EncargadoService {
	
	@Autowired
	private EncargadoRepository repository;

	@Override
	public List<Encargado> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Encargado encargado) {
		repository.save(encargado);
		
	}

	@Override
	public Optional<Encargado> buscarID(int id) {
		return repository.findById(id);
	}

	@Override
	public void borrar(int id) {
		repository.deleteById(id);
		
	}

}