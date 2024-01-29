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
import com.springboot.models.entity.Devolucion;

import com.springboot.models.entity.Prestamo;
import com.springboot.models.service.AlumnoService;
import com.springboot.models.service.DevolucionService;
import com.springboot.models.service.PrestamoService;

@Controller
public class DevolucionController {

	@Autowired
	private DevolucionService serviceD;
	
	@Autowired
	private PrestamoService serviceP;
	
	@Autowired
	private AlumnoService serviceA;
	
	@GetMapping("/devoluciones")
	public String listaDevoluciones(Model modelo) {
		List<Devolucion> lista = serviceD.listarTodos();
		modelo.addAttribute("listaDevoluciones", lista);
		return "listaDevolucion";
	};
	
	@GetMapping("/nuevaDevolucion")
	public String nuevo(Model modelo) {
		List<Prestamo> listaP = serviceP.listarTodos();
		List<Alumno> listaA = serviceA.listarTodos();
		modelo.addAttribute("devolucion", new Devolucion());
		modelo.addAttribute("listaPrestamos", listaP);
		modelo.addAttribute("listaAlumnos", listaA );
		return "nuevaDevolucion";
	};
	
	@PostMapping("/guardarDevolucion")
	public String guardar(@ModelAttribute Devolucion devolucion) {
		serviceD.guardar(devolucion);
		return "redirect:/devoluciones";
	};
	
	@GetMapping("/editarDevolucion/{id}")
	public String editar (@PathVariable int id, Model modelo) {
		List<Prestamo> listaPre = serviceP.listarTodos();
		List<Alumno> listaAl = serviceA.listarTodos();
		Optional<Devolucion> lista = serviceD.buscarID(id);
		modelo.addAttribute("devolucion", lista);
		modelo.addAttribute("listaPrestamos", listaPre);
		modelo.addAttribute("listaAlumnos", listaAl );
		return "editarDevolucion";
	};
	
	@GetMapping("/borrarDevolucion/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		serviceD.borrar(id);
		return "redirect:/devoluciones";
	};
	
}
