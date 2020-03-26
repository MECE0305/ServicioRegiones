package com.cempresariales.servicio.regiones.mode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Provincia;
import com.cempresariales.servicio.regiones.mode.service.ProvinciaServiceImp;

@RestController
@RequestMapping(value = "provincia")
public class ProvinciaController {

	@Autowired
	private ProvinciaServiceImp provinciaServicio;
	
	@GetMapping("/listar")
	public List<Provincia> listarProvincias(){
		return provinciaServicio.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Provincia verProvincia(@PathVariable Long id){
		return provinciaServicio.findById(id);
	}
	
	@PostMapping("/crear")
	public Provincia crear(@RequestBody Provincia provincia){
		return provinciaServicio.save(provincia);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		provinciaServicio.delete(id);
	}
}
