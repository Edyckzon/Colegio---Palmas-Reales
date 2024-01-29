package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.CategoriaM;

@Repository
public interface CategoriaMRepository extends JpaRepository<CategoriaM, Integer>{
	
	

	
}
