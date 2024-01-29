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
import com.springboot.models.entity.Distrito;
import com.springboot.models.service.AlumnoService;
import com.springboot.models.service.DistritoService;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoService serviceAlumno;

	@Autowired
	private DistritoService serviceDistrito;

	@GetMapping("/alumnos")
	public String listaAlumnos(Model modelo) {
		List<Alumno> lista = serviceAlumno.listarTodos();
		modelo.addAttribute("listaAlumnos", lista);
		return "listaAlumnos";
	};
	
	

	@GetMapping("/listaAlumnoxDNI/")
	public String consulta(@Param("filtro") int filtro ,Model modelo) {
		List<Alumno> lista = serviceAlumno.listaxDNI(filtro);
		modelo.addAttribute("listaAlumnoxDNI", lista);
		return "listaAlumnoxDNI";
	};

	@GetMapping("/nuevoAlumno")
	public String nuevo(Model modelo) {
		List<Distrito> listaDist = serviceDistrito.listarTodos();
		modelo.addAttribute("alumno", new Alumno());
		modelo.addAttribute("listaDistritos", listaDist);
		return "nuevoAlumno";
	};

	@PostMapping("/guardarAlumno")
	public String guardar(@ModelAttribute Alumno alumno) {
		serviceAlumno.guardar(alumno);
		return "redirect:/alumnos";
	};

	@GetMapping("/editarAlumno/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		List<Distrito> listaDist = serviceDistrito.listarTodos();
		Optional<Alumno> lista = serviceAlumno.buscarID(id);
		modelo.addAttribute("alumno", lista);
		modelo.addAttribute("listaDistritos", listaDist);
		return "editarAlumno";
	};

	@GetMapping("/borrarAlumno/{id}")
	public String borrar(@PathVariable int id, Model modelo) {
		serviceAlumno.borrar(id);
		return "redirect:/alumnos";
	};
}
