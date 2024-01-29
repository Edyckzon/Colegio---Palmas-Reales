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

import com.springboot.models.entity.Alumno;
import com.springboot.models.entity.Encargado;
import com.springboot.models.entity.Sancion;
import com.springboot.models.entity.estadoSancion;
import com.springboot.models.entity.tipoSancion;
import com.springboot.models.service.AlumnoService;
import com.springboot.models.service.EncargadoService;
import com.springboot.models.service.SancionService;
import com.springboot.models.service.estadoSancionService;
import com.springboot.models.service.tipoSancionService;

@Controller
public class SancionController {

	   @Autowired
	   private SancionService serviceSancion; 
	  
	   /* CRUDS  */
	   
	@Autowired
	private EncargadoService serviceEncargado;
	
	@Autowired
	private AlumnoService serviceAlumnos; 
	
	/* TABLAS ZZZ*/ 
	@Autowired
	private estadoSancionService serviceEstadoSancion; 
	@Autowired
	private tipoSancionService serviceTipoSancion; 
	
	
	/* ---------------------------------- */ 
	
	@GetMapping("/sanciones")
	public String listaSanciones(Model modelo) {
		List<Sancion>lista = serviceSancion.listarTodos(); 
		modelo.addAttribute("listaSanciones", lista); 
		modelo.addAttribute("espacio", " ");
		return "listaSanciones";
	}
	
	@GetMapping("/nuevaSancion")
	public String nuevo(Model modelo) {
		Sancion sancion = new Sancion();
		List<Encargado> listaEnc = serviceEncargado.listarTodos();
		List<Alumno> listaAlum = serviceAlumnos.listarTodos();
		List<tipoSancion>listaTip = serviceTipoSancion.listarTodos();
		List <estadoSancion> listaEst = serviceEstadoSancion.listarTodos();
		modelo.addAttribute("sancion", sancion);
		modelo.addAttribute("listaEncargados", listaEnc); 
		modelo.addAttribute("listarAlumnos", listaAlum);
		modelo.addAttribute("listarTipos", listaTip);
		modelo.addAttribute("listaEstados", listaEst); 
		return "nuevaSancion";
	}
	
	@PostMapping("/guardarSancion")
	public String guardar(@ModelAttribute Sancion sancion) {
		serviceSancion.Guardar(sancion); 
		return "redirect:/sanciones"; 
	}
	
	@GetMapping("/editarSancion/{id}")
	   public String editar(@PathVariable int id, Model modelo) {
		List<Encargado>listaEnc = serviceEncargado.listarTodos();
		List<Alumno> listaAlum = serviceAlumnos.listarTodos();
		List <tipoSancion> listaTip = serviceTipoSancion.listarTodos(); 
		List <estadoSancion> listaEst = serviceEstadoSancion.listarTodos(); 
		Optional<Sancion> lista = serviceSancion.buscarID(id);
		  modelo.addAttribute("sanciones", lista); 
		  modelo.addAttribute("listaEncargados", listaEnc);
		  modelo.addAttribute("listarAlumnos", listaAlum); 
		  modelo.addAttribute("listarTipos", listaTip); 
		  modelo.addAttribute("listaEstados", listaEst);
		return "editarSancion";
	}
	
	@GetMapping("/borrarSancion/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
	         serviceSancion.Borrar(id); 
	         return "redirect:/sanciones";
	}
	
}
