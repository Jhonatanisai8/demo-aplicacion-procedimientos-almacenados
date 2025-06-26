package com.isai.demo_aplicacion_procedimientos_almacenados.services;

import java.util.List;
import java.util.Optional;

import com.isai.demo_aplicacion_procedimientos_almacenados.models.Empleado;

public interface EmpleadoService {

    List<Empleado> obtenerEmpleados();

    Optional<Empleado> obtenerEmpleadoPorId(Integer id);
}
