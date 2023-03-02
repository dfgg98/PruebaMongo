package com.prueba.mongoPrueva.service;

import com.prueba.mongoPrueva.model.Restaurante;
import com.prueba.mongoPrueva.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RestauranteServiceImpl extends GenericServiceImpl<Restaurante, Long> implements RestauranteService {
@Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public CrudRepository<Restaurante, Long> getDao() {
        return restauranteRepository;
    }
}
