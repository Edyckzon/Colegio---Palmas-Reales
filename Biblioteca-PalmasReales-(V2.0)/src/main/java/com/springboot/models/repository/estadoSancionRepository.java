package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.estadoSancion;

@Repository
public interface estadoSancionRepository extends JpaRepository<estadoSancion, Integer>{

}
