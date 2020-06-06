package com.briones.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.briones.ejercicio.models.dao.IProfesor;
import com.briones.ejercicio.models.entities.Profesor;

public class ProfesorService implements IProfesorService {
	
	@Autowired
	private IProfesor dao;
		
	@Override
	@Transactional
	public void save(Profesor p) {
		dao.save(p);		
	}

	@Override
	@Transactional
	public Profesor findById(Integer id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);				
	}

	@Override
	@Transactional
	public List<Profesor> findAll() {		
		return (List<Profesor>) dao.findAll();
	}
}
