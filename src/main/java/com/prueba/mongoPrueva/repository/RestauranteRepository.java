package com.prueba.mongoPrueva.repository;


import com.prueba.mongoPrueva.model.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestauranteRepository extends MongoRepository<Restaurante, Long> {
}
