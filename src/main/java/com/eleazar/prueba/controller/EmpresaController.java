package com.eleazar.prueba.controller;

import com.eleazar.prueba.entity.Empresa;
import com.eleazar.prueba.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {
    @Autowired
    private IEmpresaService empresaService;
    @GetMapping("/create")
    public Empresa crearEmpresa(@RequestBody Empresa empresa) {
        return empresaService.crear(empresa);
    }

    @GetMapping("/obtener")
    public List<Empresa> obtenerEmpresa() {
        return empresaService.obtener();
    }

}
