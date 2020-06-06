package com.briones.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.briones.ejercicio.models.entities.Matricula;

public interface IMatricula extends CrudRepository<Matricula, Integer> {
}
