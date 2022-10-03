package com.pragma.viajes.infraestructure.restspring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RutaDto {

    private Long idRuta;
    private Integer cupos;
    private String descripcion;
    private Long idConductor;
    private List<RutaBarrioDto> rutasBarrios;
}
