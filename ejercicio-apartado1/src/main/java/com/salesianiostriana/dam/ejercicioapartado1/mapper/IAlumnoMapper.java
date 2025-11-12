package com.salesianiostriana.dam.ejercicioapartado1.mapper;

import com.salesianiostriana.dam.ejercicioapartado1.dto.AlumnoDTO;
import com.salesianiostriana.dam.ejercicioapartado1.model.Alumno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAlumnoMapper {

    AlumnoDTO toDto(Alumno alumno);
    AlumnoDTO toEntity(AlumnoDTO dto);
}
