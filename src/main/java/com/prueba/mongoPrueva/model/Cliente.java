package com.prueba.mongoPrueva.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collection = "cliente")
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;

}
