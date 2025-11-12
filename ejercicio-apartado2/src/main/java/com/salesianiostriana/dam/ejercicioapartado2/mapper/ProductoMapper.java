package com.salesianiostriana.dam.ejercicioapartado2.mapper;

import com.salesianiostriana.dam.ejercicioapartado2.dto.ProductoDTO;
import com.salesianiostriana.dam.ejercicioapartado2.model.Producto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductoMapper {

    public ProductoDTO toDto(Producto prod){
        return new ProductoDTO(
                prod.getId(),
                prod.getNombre(),
                prod.getDesc(),
                prod.getPvp(),
                prod.getImagenes(),
                prod.getCategoria()
        );
    }

    public Producto toEntity(ProductoDTO dto){
        return Producto.builder()
                .id(dto.id())
                .nombre(dto.nombreProd())
                .desc(dto.desc())
                .pvp(dto.pvp())
                .imagenes(dto.imagenes())
                .categoria(dto.categoria())
                .build();
    }
}
