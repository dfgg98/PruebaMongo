package com.prueba.mongoPrueva.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.List;

@Data
@Getter
@Setter
@Document(collection = "carta")
public class Carta {
    private String nombre;
    private String categoria;
    private  int  cantidad;

    ///relacion
    private List<Plato> Listplato;
}
