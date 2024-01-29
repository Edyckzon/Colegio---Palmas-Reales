package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.tipoSancion;

@Repository
public interface tipoSancionRepository extends JpaRepository<tipoSancion, Integer>{
}
