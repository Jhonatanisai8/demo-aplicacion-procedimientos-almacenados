package com.isai.demo_aplicacion_procedimientos_almacenados.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.isai.demo_aplicacion_procedimientos_almacenados.models.Empleado;
import com.isai.demo_aplicacion_procedimientos_almacenados.repository.EmpleadoRepository;
import com.isai.demo_aplicacion_procedimientos_almacenados.services.EmpleadoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl
        implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Override
    public Optional<Empleado> obtenerEmpleadoPorId(Integer id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

}
