package com.pragma.viajes.infraestructure.restspring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RutaBarrioDto {

    private Long idRutaBarrio;
    private Long idBarrio;
    private Long idRuta;
    private Integer posicion;
    private String puntoEncuentro;
    private List<ViajeDto> viajes;
}

