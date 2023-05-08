package com.eleazar.prueba.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpresa;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "razonSocial")
    private String razonSocial;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado")
    private String estado;
}
