package com.briones.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.briones.ejercicio.models.entities.Materia;

public interface IMateria extends CrudRepository<Materia, Integer> {
}
