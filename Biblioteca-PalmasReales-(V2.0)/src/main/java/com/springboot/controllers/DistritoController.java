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

import com.springboot.models.entity.Distrito;
import com.springboot.models.service.DistritoService;


@Controller
public class DistritoController {

	@Autowired
	private DistritoService serviceDistrito;
	
	@GetMapping("/distritos")
	public String listaEditoriales(Model modelo) {
		List<Distrito> lista = serviceDistrito.listarTodos();
		modelo.addAttribute("listaDistritos", lista);
		return "listaDistritos";
	};
	
	@GetMapping("/nuevoDistrito")
	public String nuevo(Model modelo) {
		modelo.addAttribute("distrito", new Distrito());
		return "nuevoDistrito";
	};
	
	@PostMapping("guardarDistrito")
	public String guardar(@ModelAttribute Distrito dist) {
		serviceDistrito.guardar(dist);
		return "redirect:/distritos";
	};
	
	@GetMapping("/editarDistrito/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Optional<Distrito> lista = serviceDistrito.buscarID(id);
		modelo.addAttribute("distrito", lista);
		return "editarDistrito";
	};
	
	@GetMapping("/borrarDistrito/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		serviceDistrito.borrar(id);
		return "redirect:/distritos";
	};
	
}
