package com.salesianiostriana.dam.ejercicioapartado2.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Producto {

    private Long id;
    private String nombre;
    private String desc;
    private double pvp;
    private List<String> imagenes;
    private Categoria categoria;
}
