package com.prueba.mongoPrueva.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@Document(collection = "restaurante")
public class Restaurante {
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private List<Cliente>listcliente;
    private  Carta carta;
}
