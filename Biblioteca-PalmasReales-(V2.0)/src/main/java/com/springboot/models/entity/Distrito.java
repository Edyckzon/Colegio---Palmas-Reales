package com.springboot.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distrito")
public class Distrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_distrito")
	private int id_distrito;

	@Column(name = "nom_distrito")
	private String nom_distrito;

	/* Métodos Get y Set */
	public int getId_distrito() {
		return id_distrito;
	}

	public void setId_distrito(int id_distrito) {
		this.id_distrito = id_distrito;
	}

	public String getNom_distrito() {
		return nom_distrito;
	}

	public void setNom_distrito(String nom_distrito) {
		this.nom_distrito = nom_distrito;
	}

}
