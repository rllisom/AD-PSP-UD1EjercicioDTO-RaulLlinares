package com.salesianiostriana.dam.ejercicioapartado2.dto;

import com.salesianiostriana.dam.ejercicioapartado2.model.Categoria;

import java.util.List;

public record ProductoDTO(Long id, String nombreProd, String desc, double pvp, List<String> imagenes, Categoria categoria) {}
