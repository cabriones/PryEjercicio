package com.briones.ejercicio.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.briones.ejercicio.models.dao.IAula;
import com.briones.ejercicio.models.entities.Aula;

public class AulaService implements IAulaService {
		
		@Autowired
		private IAula dao;
			
		@Override
		@Transactional
		public void save(Aula a) {
			dao.save(a);		
		}

		@Override
		@Transactional
		public Aula findById(Integer id) {		
			return dao.findById(id).get();
		}

		@Override
		@Transactional
		public void delete(Integer id) {
			dao.deleteById(id);				
		}

		@Override
		@Transactional
		public List<Aula> findAll() {		
			return (List<Aula>) dao.findAll();
		}

}
