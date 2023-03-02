package com.prueba.mongoPrueva.controllers;

import com.prueba.mongoPrueva.model.Restaurante;
import com.prueba.mongoPrueva.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteController {
    @Autowired
    RestauranteService restauranteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listarRestaurates() {
        return new ResponseEntity<>(restauranteService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crearRestaurante(
            @RequestBody Restaurante r) {
        return new ResponseEntity<>(restauranteService.save(r),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante> actualizarRestaurante(@PathVariable Long id, @RequestBody Restaurante r) {
        Restaurante restauranteEncontrado = restauranteService.findById(id);
        if (restauranteEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                restauranteEncontrado.setNombre(r.getNombre());
                restauranteEncontrado.setTelefono(r.getTelefono());
                restauranteEncontrado.setCorreo(r.getCorreo());
                restauranteEncontrado.setDireccion(r.getDireccion());
                return new ResponseEntity<>(restauranteService.save(r), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Restaurante> eliminarRestaurante(@PathVariable Long id) {
        restauranteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
