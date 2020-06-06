package com.briones.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.briones.ejercicio.models.entities.Aula;

public interface IAula extends CrudRepository<Aula, Integer> {
}
