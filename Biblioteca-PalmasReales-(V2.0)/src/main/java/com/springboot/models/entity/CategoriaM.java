package com.springboot.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="cat_material")
public class CategoriaM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cat_material")
	private int id_cat_material;
	
	@Column(name = "nombre")
	private String nombre;

	public CategoriaM(int id_cat_material, String nombre) {
		super();
		this.id_cat_material = id_cat_material;
		this.nombre = nombre;
	}

	public CategoriaM() {
		super();
	}

	public int getId_cat_material() {
		return id_cat_material;
	}

	public void setId_cat_material(int id_cat_material) {
		this.id_cat_material = id_cat_material;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
