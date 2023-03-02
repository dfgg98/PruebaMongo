package com.prueba.mongoPrueva.service;

import com.prueba.mongoPrueva.model.Carta;
import com.prueba.mongoPrueva.repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public class CartaServiceImpl extends GenericServiceImpl<Carta, Long> implements CartaService{
    @Autowired
    CartaRepository cartaRepository;
    @Override
    public CrudRepository<Carta, Long> getDao() {
        return cartaRepository;
    }
}
