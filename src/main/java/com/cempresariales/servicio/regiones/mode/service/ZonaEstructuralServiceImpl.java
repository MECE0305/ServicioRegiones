package com.cempresariales.servicio.regiones.mode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cempresariales.servicio.commons.model.entity.ZonaEstructural;
import com.cempresariales.servicio.commons.model.entity.ZonaEstructuralHasCiudad;
import com.cempresariales.servicio.regiones.mode.dao.ZonaEstructuralDao;


@Service
public class ZonaEstructuralServiceImpl implements ZonaEstructuralService{

	@Autowired
	private ZonaEstructuralDao repo;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<ZonaEstructural> findAll() {
		return (List<ZonaEstructural>) repo.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public ZonaEstructural findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public ZonaEstructural save(ZonaEstructural entidad) {
		return repo.save(entidad);
	}

	@Override
	public void deleteById(Long id) {	
		repo.deleteById(id);
	}

	@Override
	public List<ZonaEstructural> findZonaEstructuralByCiudad(Long id) {
		return repo.findZonaEstructuralByCiudad(id);
	}

	@Override
	public List<ZonaEstructuralHasCiudad> findZonaEstructuralCiudadByZonaEstructura(Long id) {
		return repo.findZonaEstructuralCiudadByZonaEstructura(id);
	}

}
