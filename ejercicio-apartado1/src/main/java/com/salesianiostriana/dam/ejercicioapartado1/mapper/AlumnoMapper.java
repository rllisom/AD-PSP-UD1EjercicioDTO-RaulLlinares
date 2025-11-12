package com.salesianiostriana.dam.ejercicioapartado1.mapper;

import com.salesianiostriana.dam.ejercicioapartado1.dto.AlumnoDTO;
import com.salesianiostriana.dam.ejercicioapartado1.model.Alumno;

public class AlumnoMapper {

    public AlumnoDTO toDTO (Alumno alumno){
        if (alumno == null) return null;

        return new AlumnoDTO(
                alumno.getId(),
                alumno.getNombre(),
                alumno.getApellido1(),
                alumno.getApellido2(),
                alumno.getTelefono(),
                alumno.getEmail(),
                alumno.getDireccion(),
                alumno.getCurso()
        );
    }

    public Alumno toAlumno(AlumnoDTO dto){
        if (dto == null) return null;

        return Alumno.builder()
                .id(dto.id())
                .nombre(dto.nombre())
                .apellido1(dto.apellido1())
                .apellido2(dto.apellido2())
                .telefono(dto.telefono())
                .email(dto.email())
                .direccion(dto.direccion())
                .curso(dto.curso())
                .build();
    }
}
