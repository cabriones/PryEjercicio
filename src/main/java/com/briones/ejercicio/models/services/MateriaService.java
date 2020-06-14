package com.briones.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briones.ejercicio.models.dao.IMateria;
import com.briones.ejercicio.models.entities.Materia;

@Service
public class MateriaService implements IMateriaService {
	
	@Autowired 
	private IMateria dao;
		
	@Override
	@Transactional
	public void save(Materia m) {
		dao.save(m);		
	}

	@Override
	@Transactional
	public Materia findById(Integer id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);				
	}

	@Override
	@Transactional
	public List<Materia> findAll() {		
		return (List<Materia>) dao.findAll();
	}
}
