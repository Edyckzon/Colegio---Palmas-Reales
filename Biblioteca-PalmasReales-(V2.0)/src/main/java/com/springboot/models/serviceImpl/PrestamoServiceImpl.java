package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Prestamo;
import com.springboot.models.repository.PrestamoRepository;
import com.springboot.models.service.PrestamoService;

@Service
public class PrestamoServiceImpl implements PrestamoService{

	@Autowired
	private PrestamoRepository repositoryPrestamo;

	@Override
	public List<Prestamo> listarTodos() {
		// TODO Auto-generated method stub
		return repositoryPrestamo.findAll();
	}

	@Override
	public List<Prestamo> listaxFecha(String filtro) {
		// TODO Auto-generated method stub
		return repositoryPrestamo.findAll(filtro);
	}

	@Override
	public void guardar(Prestamo pre) {
		// TODO Auto-generated method stub
		repositoryPrestamo.save(pre);
		
	}

	@Override
	public Optional<Prestamo> buscarID(int id) {
		// TODO Auto-generated method stub
		return repositoryPrestamo.findById(id);
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		repositoryPrestamo.deleteById(id);
		
	}
}
