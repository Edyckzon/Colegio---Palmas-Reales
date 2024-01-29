package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Devolucion;
import com.springboot.models.repository.DevolucionRepository;
import com.springboot.models.service.DevolucionService;

@Service
public class DevolucionServiceImpl implements DevolucionService{

	
	@Autowired
	private DevolucionRepository repository;
	
	@Override
	public List<Devolucion> listarTodos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void guardar(Devolucion dev) {
		// TODO Auto-generated method stub
		repository.save(dev);
	}

	@Override
	public Optional<Devolucion> buscarID(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
