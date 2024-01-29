package com.springboot.controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.springboot.models.entity.Autor;
import com.springboot.models.entity.CategoriaM;
import com.springboot.models.entity.Editorial;
import com.springboot.models.entity.Material;
import com.springboot.models.service.AutorService;
import com.springboot.models.service.CategoriaMService;
import com.springboot.models.service.EditorialService;
import com.springboot.models.service.MaterialService;

@Controller
public class MaterialController {

	@Autowired
	private MaterialService serviceMaterial;
	
	@Autowired
	private EditorialService serviceEditorial;
	
	@Autowired 
	private AutorService serviceAutor;
	
	@Autowired 
	private CategoriaMService serviceCategoria;
	
	
	@GetMapping("/materiales")
	public String listaMateriales(Model modelo) {
		List<Material> lista = serviceMaterial.listarTodos();
		modelo.addAttribute("listaMateriales", lista);
		return "listaMateriales";
	};
	
	/*Method for search of Material X Title*/
	@GetMapping("/listaMaterialXTitulo/")
	public String consulta(@Param("filtro") String filtro ,Model modelo) {
		List<Material> listaMT = serviceMaterial.listaxTitulo(filtro);
		modelo.addAttribute("listaMaterialXTitulo", listaMT);
		return "listaMaterialXTitulo";
	};
	
	@GetMapping("/nuevoMaterial")
	public String nuevo(Model modelo) {
		List<CategoriaM> listaCat = serviceCategoria.listarTodos();
		List<Autor> listaAut = serviceAutor.listarTodos();
		List<Editorial> listaEdit = serviceEditorial.listarTodos();
		modelo.addAttribute("material", new Material());
		modelo.addAttribute("listaCategorias", listaCat);
		modelo.addAttribute("listaAutor", listaAut);
		modelo.addAttribute("listaEditorial", listaEdit);
		return "nuevoMaterial";
	};
	
	@PostMapping("/guardarMaterial")
	public String guardar(@ModelAttribute Material material) {
		serviceMaterial.guardar(material);
		return "redirect:/materiales";
	};
	
	@GetMapping("/editarMaterial/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		List<CategoriaM> listaCat = serviceCategoria.listarTodos();
		List<Autor> listaAut = serviceAutor.listarTodos();
		List<Editorial> listaEdit = serviceEditorial.listarTodos();
		Optional<Material> lista = serviceMaterial.buscarID(id);
		modelo.addAttribute("material", lista);
		modelo.addAttribute("listaCategorias", listaCat);
		modelo.addAttribute("listaAutor", listaAut);
		modelo.addAttribute("listaEditorial", listaEdit);
		return "editarMaterial";
	};
	
	@GetMapping("/borrarMaterial/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		serviceMaterial.borrar(id);
		return "redirect:/materiales";
	};
	
}
