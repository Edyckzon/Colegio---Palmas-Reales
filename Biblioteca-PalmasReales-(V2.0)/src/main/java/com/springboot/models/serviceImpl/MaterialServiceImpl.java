package com.springboot.models.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot.models.entity.Material;
import com.springboot.models.repository.MaterialRepository;
import com.springboot.models.service.MaterialService;

@Service
public class MaterialServiceImpl implements MaterialService{
	
	@Autowired
	private MaterialRepository repositoryM;

	@Override
	public List<Material> listarTodos() {
		// TODO Auto-generated method stub
		return repositoryM.findAll();
	};
	
	/*Method for search of Material X Title*/
	@Override
	public List<Material> listaxTitulo(String filtro) {
		// TODO Auto-generated method stub
		return repositoryM.findAll(filtro);
	};

	@Override
	public void guardar(Material mat) {
		// TODO Auto-generated method stub
		repositoryM.save(mat);
		
	};

	@Override
	public Optional<Material> buscarID(int id) {
		// TODO Auto-generated method stub
		return repositoryM.findById(id);
	};

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		repositoryM.deleteById(id);
	};

	
}
