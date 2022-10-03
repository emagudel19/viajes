package com.pragma.viajes.infraestructure.restspring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BarrioDto {

    private Long idBarrio;
    private String descripcion;
    private String nombre;
    private List<RutaBarrioDto> rutasBarrios;

}
