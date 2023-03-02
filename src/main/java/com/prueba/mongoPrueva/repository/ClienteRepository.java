package com.prueba.mongoPrueva.repository;


import com.prueba.mongoPrueva.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}
