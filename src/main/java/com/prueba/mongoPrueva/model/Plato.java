package com.prueba.mongoPrueva.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collection = "plato")
public class Plato {
    private String nombrePlato;
    private String descripcion;
    private double precio;

}
