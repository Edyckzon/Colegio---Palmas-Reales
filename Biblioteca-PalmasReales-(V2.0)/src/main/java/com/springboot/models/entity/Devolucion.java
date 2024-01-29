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
@Table(name = "devolucion")
public class Devolucion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_devolucion")
	private int id_devolucion;
	
	@Column(name = "fecha_devuelto")
	private String fecha_devuelto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_prestamo")
	private Prestamo prestamo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dni_alumno")
	private Alumno alumno;

	public Devolucion(int id_devolucion, String fecha_devuelto, Prestamo prestamo, Alumno alumno) {
		super();
		this.id_devolucion = id_devolucion;
		this.fecha_devuelto = fecha_devuelto;
		this.prestamo = prestamo;
		this.alumno = alumno;
	}

	public Devolucion() {
		super();
	}

	public int getId_devolucion() {
		return id_devolucion;
	}

	public void setId_devolucion(int id_devolucion) {
		this.id_devolucion = id_devolucion;
	}

	public String getFecha_devuelto() {
		return fecha_devuelto;
	}

	public void setFecha_devuelto(String fecha_devuelto) {
		this.fecha_devuelto = fecha_devuelto;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	

}
