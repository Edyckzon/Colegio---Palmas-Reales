package com.springboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.entity.CategoriaM;
import com.springboot.models.service.CategoriaMService;

@Controller
public class CategoriaMController {

	@Autowired
	private CategoriaMService serviceCategoria;

	@GetMapping("/categorias")
	public String listaCategorias(Model modelo) {
		List<CategoriaM> lista = serviceCategoria.listarTodos();
		modelo.addAttribute("listaCategorias", lista);
		return "listaCategorias";
	}

	@GetMapping("/nuevaCategoria")
	public String nuevo(Model modelo) {
		modelo.addAttribute("categoria", new CategoriaM());
		return "nuevaCategoria";
	}

	@PostMapping("guardarCategoria")
	public String guardar(@ModelAttribute CategoriaM cat) {
		serviceCategoria.guardar(cat);
		return "redirect:/categorias";
	}

	@GetMapping("/editarCategoria/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Optional<CategoriaM> lista = serviceCategoria.buscarID(id);
		modelo.addAttribute("categoria", lista);
		return "editarCategoria";
	}

	@GetMapping("/borrarCategoria/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		serviceCategoria.borrar(id);
		return "redirect:/categorias";
	}
}
