package com.briones.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.briones.ejercicio.models.dao.IMatricula;
import com.briones.ejercicio.models.entities.Matricula;

public class MatriculaService implements IMatriculaService {
	
	@Autowired 
	private IMatricula dao;
		
	@Override
	@Transactional
	public void save(Matricula m) {
		dao.save(m);		
	}

	@Override
	@Transactional
	public Matricula findById(Integer id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);				
	}

	@Override
	@Transactional
	public List<Matricula> findAll() {		
		return (List<Matricula>) dao.findAll();
	}
}

