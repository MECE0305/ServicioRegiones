package com.cempresariales.servicio.regiones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.cempresariales.servicio.commons.model.entity"})
public class ServicioRegionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioRegionesApplication.class, args);
	}

}
