package com.salesianiostriana.dam.ejercicioapartado2.model;


import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Categoria {

    private Long id;
    private String nombre;
}
