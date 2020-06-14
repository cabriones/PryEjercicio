package com.briones.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briones.ejercicio.models.dao.IArea;
import com.briones.ejercicio.models.entities.Area;

@Service
public class AreaService implements IAreaService {
	
	@Autowired
	private IArea dao;
		
	@Override
	@Transactional
	public void save(Area a) {
		dao.save(a);		
	}

	@Override
	@Transactional
	public Area findById(Integer id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);				
	}

	@Override
	@Transactional
	public List<Area> findAll() {		
		return (List<Area>) dao.findAll();
	}
}
