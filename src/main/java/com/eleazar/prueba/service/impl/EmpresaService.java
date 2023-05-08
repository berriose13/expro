package com.eleazar.prueba.service.impl;

import com.eleazar.prueba.entity.Empresa;
import com.eleazar.prueba.repository.EmpresaRepository;
import com.eleazar.prueba.service.IEmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmpresaService implements IEmpresaService {

    @Autowired
    private final EmpresaRepository empresaRepository;

    @Override
    public Empresa crear(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public List<Empresa> obtener() {
        return empresaRepository.findAll(
                        Sort.by(Sort.Direction.DESC, "idEmpresa"))
                .stream().limit(3)
                .collect(Collectors.toList());
    }
}
