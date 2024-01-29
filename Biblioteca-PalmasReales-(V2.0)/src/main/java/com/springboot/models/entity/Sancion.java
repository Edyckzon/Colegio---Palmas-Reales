package com.springboot.models.entity;

import java.sql.Date;

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
@Table(name= "sancion")
public class Sancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_sancion")
	private int id_sancion;
	
	@Column(name="fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name="fecha_fin")
	private Date fecha_fin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dni_alumno")
	private Alumno alumno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_estado_sancion")
	private estadoSancion estadoSancion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dni_encargado")
	private Encargado encargado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_tipo_sancion")
	private tipoSancion tipoSancion;
	


	public Sancion(int id_sancion, Date fecha_inicio, Date fecha_fin, Alumno alumno,
		com.springboot.models.entity.estadoSancion estadoSancion, Encargado encargado,
		com.springboot.models.entity.tipoSancion tipoSancion, 
		com.springboot.models.entity.tipoSancion descripciones) {
	super();
	
	this.id_sancion = id_sancion;
	this.fecha_inicio = fecha_inicio;
	this.fecha_fin = fecha_fin;
	this.alumno = alumno;
	this.estadoSancion = estadoSancion;
	this.encargado = encargado;
	this.tipoSancion = tipoSancion;
	
}


	public Sancion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId_sancion() {
		return id_sancion;
	}


	public void setId_sancion(int id_sancion) {
		this.id_sancion = id_sancion;
	}


	public Date getFecha_inicio() {
		return fecha_inicio;
	}


	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public Date getFecha_fin() {
		return fecha_fin;
	}


	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public estadoSancion getEstadoSancion() {
		return estadoSancion;
	}


	public void setEstadoSancion(estadoSancion estadoSancion) {
		this.estadoSancion = estadoSancion;
	}


	public Encargado getEncargado() {
		return encargado;
	}


	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}


	public tipoSancion getTipoSancion() {
		return tipoSancion;
	}


	public void setTipoSancion(tipoSancion tipoSancion) {
		this.tipoSancion = tipoSancion;
	}


	
	
	

	

}
