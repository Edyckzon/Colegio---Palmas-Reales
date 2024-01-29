package com.springboot.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_sancion")
public class tipoSancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_sancion")
	private int id_tipo_sancion; 
	
	@Column(name="descripcion")
	private String descripcion; 
	
	//CONSTRUCTOR 
	public void setId_tipo_sancion(int id_tipo_sancion) {
		this.id_tipo_sancion = id_tipo_sancion;
	}
	
	

	public tipoSancion() {
		super();
	}


	/* METODOS GET Y SET */
	public int getId_tipo_sancion() {
		return id_tipo_sancion;
	}
	public tipoSancion(int id_tipo_sancion, String descripcion) {
		super();
		this.id_tipo_sancion = id_tipo_sancion;
		this.descripcion = descripcion;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	


	
	
}
