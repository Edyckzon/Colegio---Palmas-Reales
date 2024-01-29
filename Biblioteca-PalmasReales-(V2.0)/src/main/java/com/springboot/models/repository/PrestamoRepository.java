package com.springboot.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.springboot.models.entity.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{
	
	/*Method for search of lend Lease X Student*/
	@Query("SELECT p FROM Prestamo p WHERE p.fecha_inicio LIKE %?1%")
	public List<Prestamo> findAll(String filtro);

}
