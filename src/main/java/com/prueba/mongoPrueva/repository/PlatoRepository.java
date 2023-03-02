package com.prueba.mongoPrueva.repository;

import com.prueba.mongoPrueva.model.Plato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlatoRepository extends MongoRepository<Plato, Long> {
}
