package com.eleazar.prueba.service;

import com.eleazar.prueba.entity.Empresa;

import java.util.List;

public interface IEmpresaService {
    Empresa crear(Empresa empresa);
    List<Empresa> obtener();

}
