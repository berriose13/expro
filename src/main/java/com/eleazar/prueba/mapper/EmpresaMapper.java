package com.eleazar.prueba.mapper;

import com.eleazar.prueba.domain.EmpresaDto;
import com.eleazar.prueba.entity.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmpresaMapper {

    @Mapping(source = "idEmpresa", target = "id")
    @Mapping(source = "ruc", target = "rucNumber")
    @Mapping(source = "razonSocial", target = "razonSocialDescription")
    @Mapping(source = "direccion", target = "direccionEmpresa")
    @Mapping(source = "estado", target = "estadoEmpresa")
    EmpresaDto toEmpresaDto(Empresa empresa);
}
