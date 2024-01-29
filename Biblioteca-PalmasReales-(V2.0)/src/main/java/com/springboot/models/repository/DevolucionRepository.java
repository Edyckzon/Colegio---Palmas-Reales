package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Devolucion;

@Repository
public interface DevolucionRepository extends JpaRepository<Devolucion, Integer>{

}
