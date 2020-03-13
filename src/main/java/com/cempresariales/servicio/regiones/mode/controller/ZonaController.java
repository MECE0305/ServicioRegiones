package com.cempresariales.servicio.regiones.mode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Zona;
import com.cempresariales.servicio.regiones.mode.service.ZonaServiceImp;

@RestController
public class ZonaController {

	@Autowired
	private ZonaServiceImp zonaServicio;
	
	@GetMapping("/listarZonas")
	public List<Zona> listarZonas(){
		return zonaServicio.findAll();
	}
	
	@GetMapping("/zona/{id}")
	public Zona ver(@PathVariable Long id){
		return zonaServicio.findById(id);
	}
	
	@PostMapping("/crearZona/{zona}")
	public Zona crear(@PathVariable Zona zona){
		return zonaServicio.save(zona);
	}
	
	@DeleteMapping("/eliminarZona/{id}")
	public void eliminar(@PathVariable Long id){
		zonaServicio.delete(id);
	}
}
