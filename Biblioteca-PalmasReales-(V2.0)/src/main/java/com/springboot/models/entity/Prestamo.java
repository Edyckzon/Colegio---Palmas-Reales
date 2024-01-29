package com.springboot.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prestamo")
public class Prestamo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestamo")
	private int id_prestamo;
	
	@Column(name = "fecha_inicio")
	private String fecha_inicio;
	
	@Column(name = "fecha_fin")
	private String fecha_fin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dni_alumno")
	private Alumno alumno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_material")
	private Material material;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_estado_prestamo")
	private estadoPrestamo estadoPrestamo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dni_encargado")
	private Encargado encargado;

	public Prestamo(int id_prestamo, String fecha_inicio, String fecha_fin, Alumno alumno, Material material,
			com.springboot.models.entity.estadoPrestamo estadoPrestamo, Encargado encargado) {
		super();
		this.id_prestamo = id_prestamo;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.alumno = alumno;
		this.material = material;
		this.estadoPrestamo = estadoPrestamo;
		this.encargado = encargado;
	}

	public Prestamo() {
		super();
	}

	public int getId_prestamo() {
		return id_prestamo;
	}

	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public estadoPrestamo getEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(estadoPrestamo estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

	public Encargado getEncargado() {
		return encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}
	
}
