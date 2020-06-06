package com.briones.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.briones.ejercicio.models.entities.Profesor;

public interface IProfesor extends CrudRepository<Profesor, Integer> {
}

