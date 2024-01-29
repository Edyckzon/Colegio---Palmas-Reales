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

import com.springboot.models.entity.Editorial;
import com.springboot.models.service.EditorialService;

@Controller
public class EditorialController {

	@Autowired
	private EditorialService serviceEditorial;

	@GetMapping("/editoriales")
	public String listaEditoriales(Model modelo) {
		List<Editorial> lista = serviceEditorial.listarTodos();
		modelo.addAttribute("listaEditoriales", lista);
		return "listaEditoriales";
	};

	@GetMapping("/nuevaEditorial")
	public String nuevo(Model modelo) {
		modelo.addAttribute("editorial", new Editorial());
		return "nuevaEditorial";
	};
	
	@PostMapping("guardarEditorial")
	public String guardar(@ModelAttribute Editorial edit) {
		serviceEditorial.guardar(edit);
		return "redirect:/editoriales";
	};
	
	@GetMapping("/editarEditorial/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Optional<Editorial> lista = serviceEditorial.buscarID(id);
		modelo.addAttribute("editorial", lista);
		return "editarEditorial";
	};
	
	@GetMapping("/borrarEditorial/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		serviceEditorial.borrar(id);
		return "redirect:/editoriales";
	};
}
