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

import com.springboot.models.entity.Encargado;
import com.springboot.models.service.EncargadoService;

@Controller

public class EncargadoController {
	
	@Autowired
	private EncargadoService service;
	
	@GetMapping("/encargados")
	public String listaEncargado(Model modelo) {
		List<Encargado> listado = service.listarTodos();
		modelo.addAttribute("listaEncargado",listado);
		return "listaEncargado";	
	}
	
	@GetMapping("/nuevoEncargado")
	public String nuevo(Model modelo) {
		modelo.addAttribute("encargado", new Encargado());
		return "nuevoEncargado";
	}
	
	@PostMapping("/guardarEncargado")
	public String guardar(@ModelAttribute Encargado encargado) {
		service.guardar(encargado);
		return"redirect:/encargados";
	}
	
	@GetMapping("/editarEncargado/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Optional<Encargado>lista = service.buscarID(id);
		modelo.addAttribute("encargado",lista);
		return "editarEncargado";
	}
	
	@GetMapping("/borrarEncargado/{id}")
	public String borrar(@PathVariable int id) {
		service.borrar(id);
		return"redirect:/encargados";
	}

}