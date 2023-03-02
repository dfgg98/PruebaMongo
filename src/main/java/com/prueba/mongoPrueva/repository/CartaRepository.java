package com.prueba.mongoPrueva.repository;

import com.prueba.mongoPrueva.model.Carta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartaRepository extends MongoRepository <Carta, Long>{
}
