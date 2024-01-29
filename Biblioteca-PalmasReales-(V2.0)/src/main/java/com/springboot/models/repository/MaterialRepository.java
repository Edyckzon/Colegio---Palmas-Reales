package com.springboot.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer>{
	
	/*Method for search of Material X Title*/
	@Query("SELECT m FROM Material m WHERE m.titulo LIKE %?1%")
	public List<Material> findAll(String filtro);
}
