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

import com.springboot.models.entity.Autor;
import com.springboot.models.service.AutorService;

@Controller
public class AutorController {

	@Autowired
	private AutorService serviceAutor;
	
	@GetMapping("/autores")
	public String listaAutores(Model modelo) {
		List<Autor> lista = serviceAutor.listarTodos();
		modelo.addAttribute("listaAutores",lista);
		return "listaAutores";
	}
	
	@GetMapping("/nuevoAutor")
	public String nuevo(Model modelo) {
		modelo.addAttribute("autor", new Autor());
		return "nuevoAutor";
	}
	
	@PostMapping("guardarAutor")
	public String guardar(@ModelAttribute Autor autor) {
		serviceAutor.guardar(autor);
		return "redirect:/autores";
	}
	
	@GetMapping("/editarAutor/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Optional<Autor> lista = serviceAutor.buscarID(id);
		modelo.addAttribute("autor",lista);
		return "editarAutor";
	}
	
	@GetMapping("/borrarAutor/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		serviceAutor.borrar(id);
		return "redirect:/autores";
	}
}
