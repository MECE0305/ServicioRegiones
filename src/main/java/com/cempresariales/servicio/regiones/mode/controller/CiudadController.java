package com.cempresariales.servicio.regiones.mode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Ciudad;
import com.cempresariales.servicio.commons.model.entity.Provincia;
import com.cempresariales.servicio.regiones.mode.service.CiudadServiceImpl;

@RestController
@RequestMapping(value = "ciudad")
public class CiudadController {

	@Autowired
	private CiudadServiceImpl ciudadServicio;

	@GetMapping("/listar")
	public List<Ciudad> listarCiudades() {
		return ciudadServicio.findAll();
	}

	@GetMapping("/ver/{id}")
	public Ciudad verItem(@PathVariable Long id) {
		return ciudadServicio.findById(id);
	}

	@PostMapping("/crear")
	public Ciudad crear(@RequestBody Ciudad categoria) {
		return ciudadServicio.save(categoria);
	}

	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ciudad editar(@RequestBody Ciudad entidad, @PathVariable Long id) {
		Ciudad entidadDb = ciudadServicio.findById(id);

		entidadDb = entidad;

		return ciudadServicio.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		ciudadServicio.deleteById(id);
	}

}
