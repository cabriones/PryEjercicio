package com.briones.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.briones.ejercicio.models.dao.IAlumno;
import com.briones.ejercicio.models.entities.Alumno;

@Service
public class AlumnoService implements IAlumnoService {
	
	@Autowired
	private IAlumno dao;
		
	@Override
	@Transactional
	public void save(Alumno a) {
		dao.save(a);		
	}

	@Override
	@Transactional
	public Alumno findById(Integer id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);				
	}

	@Override
	@Transactional
	public List<Alumno> findAll() {		
		return (List<Alumno>) dao.findAll();
	}
}
