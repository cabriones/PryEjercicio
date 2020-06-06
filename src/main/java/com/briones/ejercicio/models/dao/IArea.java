package com.briones.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.briones.ejercicio.models.entities.Area;

public interface IArea extends CrudRepository<Area, Integer> {
}

