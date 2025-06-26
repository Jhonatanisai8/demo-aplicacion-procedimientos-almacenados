package com.isai.demo_aplicacion_procedimientos_almacenados.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departamento")
@Getter
@Setter
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepartamento;

    @Column(length = 100, nullable = false)
    private String nombreDepartamento;

    @Column(nullable = false)
    private Double presupuestoDepartamento;

    @Column(nullable = false)
    private Double gastosDepartamento;
}
