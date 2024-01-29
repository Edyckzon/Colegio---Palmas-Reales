package com.springboot.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadoSancion")
public class estadoSancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado_sancion")
	private int id_estado_sancion;
	
	@Column(name= "estado") 
	private String estado;
	

	public estadoSancion() {
		super();
	}

	public int getId_estado_sancion() {
		return id_estado_sancion;
	}

	public void setId_estado_sancion(int id_estado_sancion) {
		this.id_estado_sancion = id_estado_sancion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	} 
	
}
