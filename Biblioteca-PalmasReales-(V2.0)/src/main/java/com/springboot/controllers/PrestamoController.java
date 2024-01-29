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

import com.springboot.models.entity.Alumno;
import com.springboot.models.entity.Encargado;
import com.springboot.models.entity.Material;
import com.springboot.models.entity.Prestamo;
import com.springboot.models.entity.estadoPrestamo;
import com.springboot.models.service.AlumnoService;
import com.springboot.models.service.EncargadoService;
import com.springboot.models.service.MaterialService;
import com.springboot.models.service.PrestamoService;
import com.springboot.models.service.estadoPrestamoService;

@Controller
public class PrestamoController {

	@Autowired
	private PrestamoService servicePrestamo;

	@Autowired
	private AlumnoService serviceAlu;

	@Autowired
	private MaterialService serviceMaterial;

	@Autowired
	private estadoPrestamoService serviceEP;

	@Autowired
	private EncargadoService serviceEncargado;

	@GetMapping("/prestamos")
	public String listaPrestamos(Model modelo) {
		List<Prestamo> lista = servicePrestamo.listarTodos();
		modelo.addAttribute("listaPrestamos", lista);
		return "listaPrestamos";
	};

	/* Method for search of Material X Title */
	@GetMapping("/listaPrestamoXFecha/")
	public String consulta(@Param("filtro") String filtro, Model modelo) {
		List<Prestamo> listaPX = servicePrestamo.listaxFecha(filtro);
		modelo.addAttribute("listaPrestamoXFecha", listaPX);
		return "listaPrestamoXFecha";
	};

	@GetMapping("/nuevoPrestamo")
	public String nuevo(Model modelo) {
		List<Alumno> listaAlu = serviceAlu.listarTodos();
		List<Material> listaMat = serviceMaterial.listarTodos();
		List<estadoPrestamo> listaEstPre = serviceEP.listarTodos();
		List<Encargado> listaEnca = serviceEncargado.listarTodos();
		modelo.addAttribute("prestamo", new Prestamo());
		modelo.addAttribute("listaAlumnos", listaAlu);
		modelo.addAttribute("listaMateriales", listaMat);
		modelo.addAttribute("listaEstadoPrestamo", listaEstPre);
		modelo.addAttribute("listaEncargados", listaEnca);
		return "nuevoPrestamo";
	};

	@PostMapping("/guardarPrestamo")
	public String guardar(@ModelAttribute Prestamo prestamo) {
		servicePrestamo.guardar(prestamo);
		return "redirect:/prestamos";
	};

	@GetMapping("/editarPrestamo/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		List<Alumno> listaAlu = serviceAlu.listarTodos();
		List<Material> listaMat = serviceMaterial.listarTodos();
		List<estadoPrestamo> listaEstPre = serviceEP.listarTodos();
		List<Encargado> listaEnca = serviceEncargado.listarTodos();
		Optional<Prestamo> lista = servicePrestamo.buscarID(id);
		modelo.addAttribute("prestamo", lista);
		modelo.addAttribute("listaAlumnos", listaAlu);
		modelo.addAttribute("listaMateriales", listaMat);
		modelo.addAttribute("listaEstadoPrestamo", listaEstPre);
		modelo.addAttribute("listaEncargados", listaEnca);
		return "editarPrestamo";
	};

	@GetMapping("/borrarPrestamo/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		servicePrestamo.borrar(id);
		return "redirect:/prestamos";
	};

}
