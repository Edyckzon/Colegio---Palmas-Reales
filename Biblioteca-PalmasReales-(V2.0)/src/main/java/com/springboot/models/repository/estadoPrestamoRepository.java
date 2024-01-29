package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.estadoPrestamo;

@Repository
public interface estadoPrestamoRepository extends JpaRepository<estadoPrestamo, Integer>{
	
	

}
