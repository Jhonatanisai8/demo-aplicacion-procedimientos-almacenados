package com.isai.demo_aplicacion_procedimientos_almacenados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isai.demo_aplicacion_procedimientos_almacenados.models.Empleado;

@Repository
public interface EmpleadoRepository
        extends JpaRepository<Empleado, Integer> {

}
