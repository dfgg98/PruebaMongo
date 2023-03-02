package com.prueba.mongoPrueva.service;

import com.prueba.mongoPrueva.model.Plato;
import com.prueba.mongoPrueva.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PlatoServiseImpl extends GenericServiceImpl<Plato, Long> implements PlatoService{
 @Autowired
    PlatoRepository platoRepository;
   @Override
    public CrudRepository<Plato, Long> getDao() {
        return platoRepository;
    }
}
