package com.salesianiostriana.dam.ejercicioapartado2.mapper;

import com.salesianiostriana.dam.ejercicioapartado2.dto.ProductoDTO;
import com.salesianiostriana.dam.ejercicioapartado2.model.Producto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IProductoMapper {

    @Mapping(source = "nombre", target = "nombreProd")
    ProductoDTO toDto(Producto prod);

    @InheritInverseConfiguration
    Producto toEntity(ProductoDTO dto);
}
