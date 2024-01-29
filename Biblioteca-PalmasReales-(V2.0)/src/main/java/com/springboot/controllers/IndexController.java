package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String goHome(Model modelo) {
		modelo.addAttribute("titulo","Bienvenido a la página principal de la biblioteca");
		return "index";
	}
}
