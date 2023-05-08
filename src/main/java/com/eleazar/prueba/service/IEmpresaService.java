package com.eleazar.prueba.service;

import com.eleazar.prueba.domain.EmpresaDto;
import com.eleazar.prueba.entity.Empresa;

import java.util.List;

public interface IEmpresaService {
    EmpresaDto crear(Empresa empresa);
    List<EmpresaDto> obtener();

}
