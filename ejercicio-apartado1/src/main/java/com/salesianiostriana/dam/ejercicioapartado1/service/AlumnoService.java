package com.salesianiostriana.dam.ejercicioapartado1.service;

import com.salesianiostriana.dam.ejercicioapartado1.dto.AlumnoDTO;
import com.salesianiostriana.dam.ejercicioapartado1.mapper.AlumnoMapper;
import com.salesianiostriana.dam.ejercicioapartado1.mapper.IAlumnoMapper;
import com.salesianiostriana.dam.ejercicioapartado1.model.Alumno;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AlumnoService {

    private final AlumnoMapper alumnoMapper;
    private final IAlumnoMapper iAlumnoMapper;

    public Alumno create(AlumnoDTO dto){
        return alumnoMapper.toAlumno(dto);
    }

    public AlumnoDTO createDTO(Alumno alumno){
        return iAlumnoMapper.toDto(alumno);
    }
}
