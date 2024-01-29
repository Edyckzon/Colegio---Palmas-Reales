package com.springboot.models.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Editorial;
import com.springboot.models.repository.EditorialRepository;
import com.springboot.models.service.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService{

	@Autowired
	private EditorialRepository repositoryE;

	@Override
	public List<Editorial> listarTodos() {
		return repositoryE.findAll();
	}

	@Override
	public void guardar(Editorial edit) {
		repositoryE.save(edit);
	}

	@Override
	public Optional<Editorial> buscarID(int id) {
		return repositoryE.findById(id);
	}

	@Override
	public void borrar(int id) {
		repositoryE.deleteById(id);
	}
}
