package com.briones.ejercicio.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.briones.ejercicio.models.entities.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer> {
}
