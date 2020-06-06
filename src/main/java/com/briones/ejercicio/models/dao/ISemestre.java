package com.briones.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.briones.ejercicio.models.entities.Semestre;

public interface ISemestre extends CrudRepository<Semestre, Integer> {
}
