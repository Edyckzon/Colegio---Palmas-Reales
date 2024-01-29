package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.models.entity.Encargado;

@Repository

public interface EncargadoRepository extends JpaRepository<Encargado,Integer>{

}