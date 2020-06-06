package com.briones.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briones.ejercicio.models.entities.Aula;
import com.briones.ejercicio.models.services.IAulaService;

@Controller
@RequestMapping(value="/aula")  
public class AulaController {
	
	@Autowired 
	private IAulaService srvAula;
	
	@GetMapping(value="/create") //https://localhost:8084/aula/create
	public String create(Model model) {
		Aula aula = new Aula();
		model.addAttribute("title", "Registro de nuevo aula");
		model.addAttribute("aula", aula);
		return "aula/form"; 
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Aula area = srvAula.findById(id);
		model.addAttribute("aula", area);				
		return "aula/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Aula aula = srvAula.findById(id);
		model.addAttribute("aula", aula);
		model.addAttribute("title", "Actualizando el registro de " + aula);
		return "aula/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		srvAula.delete(id);
		return "redirect:/aula/list";		
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Aula> aulas = srvAula.findAll();
		model.addAttribute("areas", aulas);
		model.addAttribute("title", "Listado de aulas");
		return "aula/list";
	}
	
	@PostMapping(value="/save") 
	public String save(Aula aula, Model model) {
		srvAula.save(aula);
		return "redirect:/aula/list";
	}	

}
