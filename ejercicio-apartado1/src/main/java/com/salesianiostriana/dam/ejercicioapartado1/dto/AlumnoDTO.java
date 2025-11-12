package com.salesianiostriana.dam.ejercicioapartado1.dto;

import com.salesianiostriana.dam.ejercicioapartado1.model.Curso;
import com.salesianiostriana.dam.ejercicioapartado1.model.Direccion;

public record AlumnoDTO(Long id, String nombre, String apellido1, String apellido2, String telefono, String email,
                        Direccion direccion, Curso curso) {
}
