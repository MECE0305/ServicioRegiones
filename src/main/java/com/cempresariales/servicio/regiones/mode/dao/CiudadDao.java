package com.cempresariales.servicio.regiones.mode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.Ciudad;

public interface CiudadDao extends JpaRepository<Ciudad, Long>{

}
