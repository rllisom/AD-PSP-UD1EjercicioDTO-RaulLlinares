package com.salesianiostriana.dam.ejercicioapartado1.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alumno {

    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private Direccion direccion;
    private Curso curso;
}
