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
@Table(name = "material")
public class Material {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_material")
	private int id_material;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "fecha_publicacion")
	private String fecha_publicacion;
	
	@Column(name = "stock")
	private int stock;
	
	@Column(name = "paginas")
	private String paginas;
	
	/* Referencia de campo de llave foranea */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cat_material")
	private CategoriaM categoriaM ;
	
	/* Referencia de campo de llave foranea */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_autor")
	private Autor autor;
	
	/* Referencia de campo de llave foranea */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_editorial")
	private Editorial editorial;

	/* Constructor */
	public Material(int id_material, String titulo, String fecha_publicacion, int stock, String paginas,
			CategoriaM categoriaM, Autor autor, Editorial editorial) {
		super();
		this.id_material = id_material;
		this.titulo = titulo;
		this.fecha_publicacion = fecha_publicacion;
		this.stock = stock;
		this.paginas = paginas;
		this.categoriaM = categoriaM;
		this.autor = autor;
		this.editorial = editorial;
	}

	public Material() {
		super();
	}

	
	/* Methods Get y Set */
	public int getId_material() {
		return id_material;
	}

	public void setId_material(int id_material) {
		this.id_material = id_material;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public CategoriaM getCategoriaM() {
		return categoriaM;
	}

	public void setCategoriaM(CategoriaM categoriaM) {
		this.categoriaM = categoriaM;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
	
	
	
}
	
