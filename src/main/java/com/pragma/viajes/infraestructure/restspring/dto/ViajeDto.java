package com.pragma.viajes.infraestructure.restspring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ViajeDto {

    private Long idViaje;
    private Date horario;
    private Long idRuta;
}
