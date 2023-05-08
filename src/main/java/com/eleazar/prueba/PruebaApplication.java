package com.eleazar.prueba;

import com.eleazar.prueba.entity.Empresa;
import com.eleazar.prueba.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class PruebaApplication implements CommandLineRunner {

	@Autowired
	private IEmpresaService empresaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Empresa empresa = new Empresa();
		empresa.setDireccion("Av El Sol 1305");
		empresa.setRuc("20467534026");
		empresa.setEstado("ACTIVA");
		empresa.setRazonSocial("BERRIOS S.A.C TI SOLUTIONS");
		empresaService.crear(empresa);
	}

}
