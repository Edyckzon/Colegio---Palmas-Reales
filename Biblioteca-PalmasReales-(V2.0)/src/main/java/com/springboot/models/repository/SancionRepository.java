package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Sancion;

@Repository
public interface SancionRepository extends JpaRepository<Sancion, Integer>{
}
