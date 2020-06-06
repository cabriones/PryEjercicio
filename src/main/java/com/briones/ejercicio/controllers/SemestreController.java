package com.briones.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briones.ejercicio.models.entities.Semestre;
import com.briones.ejercicio.models.services.ISemestreService;

@Controller
@RequestMapping(value="/semestre")  
public class SemestreController {
	
	@Autowired 
	private ISemestreService srvSemestre;
	
	@GetMapping(value="/create") //https://localhost:8084/semestre/create
	public String create(Model model) {
		Semestre semestre = new Semestre();
		model.addAttribute("title", "Registro de nuevo semestre");
		model.addAttribute("semestre", semestre);
		return "semestre/form"; 
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Semestre semestre = srvSemestre.findById(id);
		model.addAttribute("semestre", semestre);				
		return "semestre/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Semestre semestre = srvSemestre.findById(id);
		model.addAttribute("aula", semestre);
		model.addAttribute("title", "Actualizando el registro de " + semestre);
		return "semestre/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		srvSemestre.delete(id);
		return "redirect:/semestre/list";		
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Semestre> semestres = srvSemestre.findAll();
		model.addAttribute("semestres", semestres);
		model.addAttribute("title", "Listado de semestres");
		return "semestre/list";
	}
	
	@PostMapping(value="/save") 
	public String save(Semestre semestre, Model model) {
		srvSemestre.save(semestre);
		return "redirect:/semestre/list";
	}	

}

