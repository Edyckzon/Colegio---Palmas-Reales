package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Distrito;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Integer>{

}
