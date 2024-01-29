package com.springboot.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado_prestamo")
public class estadoPrestamo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado_prestamo")
	private int id_estado_prestamo;
	
	@Column(name = "estado")
	private String estado;

	public estadoPrestamo(int id_estado_prestamo, String estado) {
		super();
		this.id_estado_prestamo = id_estado_prestamo;
		this.estado = estado;
	}

	public estadoPrestamo() {
		super();
	}

	public int getId_estado_prestamo() {
		return id_estado_prestamo;
	}

	public void setId_estado_prestamo(int id_estado_prestamo) {
		this.id_estado_prestamo = id_estado_prestamo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
