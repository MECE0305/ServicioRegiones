package com.cempresariales.servicio.regiones.mode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cempresariales.servicio.regiones.mode.dao.CiudadDao;
import com.cempresariales.servicio.commons.model.entity.Ciudad;


@Service
public class CiudadServiceImpl implements ICiudadService{

	@Autowired
	private CiudadDao ciudadDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Ciudad> findAll() {
		return (List<Ciudad>) ciudadDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Ciudad findById(Long id) {
		return ciudadDao.findById(id).orElse(null);
	}

	@Override
	public Ciudad save(Ciudad ciudad) {
		return ciudadDao.save(ciudad);
	}

	@Override
	public void deleteById(Long id) {	
		ciudadDao.deleteById(id);
	}

}
