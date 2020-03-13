package com.cempresariales.servicio.regiones.mode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Ciudad;
import com.cempresariales.servicio.regiones.mode.service.CiudadServiceImpl;

@RestController
public class CiudadController {

	@Autowired
	private CiudadServiceImpl ciudadServicio;
	
	@GetMapping("/listarCiudades")
	public List<Ciudad> listarCiudades(){
		return ciudadServicio.findAll();
	}
	
	@GetMapping("/ciudad/{id}")
	public Ciudad verItem(@PathVariable Long id){
		return ciudadServicio.findById(id);
	}
	
	@PostMapping("/crearCiudad/{categoria}")
	public Ciudad crear(@PathVariable Ciudad categoria){
		return ciudadServicio.save(categoria);
	}
	
	@DeleteMapping("/eliminarCiudad/{id}")
	public void eliminar(@PathVariable Long id){
		ciudadServicio.deleteById(id);
	}
	
}
