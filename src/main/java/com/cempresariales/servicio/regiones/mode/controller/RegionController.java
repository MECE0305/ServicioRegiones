package com.cempresariales.servicio.regiones.mode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Region;
import com.cempresariales.servicio.regiones.mode.service.RegionServiceImp;

@RestController
public class RegionController {

	@Autowired
	private RegionServiceImp regionServicio;
	
	@GetMapping("/listarRegiones")
	public List<Region> listarZonas(){
		return regionServicio.findAll();
	}
	
	@GetMapping("/region/{id}")
	public Region ver(@PathVariable Long id){
		return regionServicio.findById(id);
	}
	
	@PostMapping("/crearRegion/{region}")
	public Region crear(@PathVariable Region region){
		return regionServicio.save(region);
	}
	
	@DeleteMapping("/eliminarRegion/{id}")
	public void eliminar(@PathVariable Long id){
		regionServicio.delete(id);
	}
}
