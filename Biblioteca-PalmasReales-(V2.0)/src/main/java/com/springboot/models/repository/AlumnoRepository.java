package com.springboot.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	
	@Query("SELECT a FROM Alumno a WHERE a.dni_alumno LIKE ?1")
	public List<Alumno> findAll(int filtro);
}
