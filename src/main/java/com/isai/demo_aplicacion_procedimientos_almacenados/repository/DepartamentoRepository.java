package com.isai.demo_aplicacion_procedimientos_almacenados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isai.demo_aplicacion_procedimientos_almacenados.models.Departamento;

@Repository
public interface DepartamentoRepository
        extends JpaRepository<Departamento, Integer> {

}
