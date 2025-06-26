package com.isai.demo_aplicacion_procedimientos_almacenados.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "empleado")
@Getter
@Setter
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;

    @Column(length = 9, nullable = false)
    private String nif;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(length = 100, nullable = false)
    private String apellido1;

    @Column(length = 100, nullable = false)
    private String apellido2;

    @ManyToOne
    @JoinColumn(name = "id_departamento", referencedColumnName = "idDepartamento", nullable = false)
    private Departamento departamento;

}