package com.pragma.viajes.infraestructure.restspring.mapper;

import com.pragma.viajes.domain.model.RutaBarrio;
import com.pragma.viajes.domain.model.Viaje;
import com.pragma.viajes.infraestructure.dbspringdata.dbo.BarrioEntity;
import com.pragma.viajes.infraestructure.dbspringdata.dbo.RutaBarrioEntity;
import com.pragma.viajes.infraestructure.restspring.dto.BarrioDto;
import com.pragma.viajes.infraestructure.restspring.dto.RutaBarrioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = Viaje.class)

public interface IRutaBarrioMapper {

    @Mapping(target = "idRutaBarrio", source="idRutaBarrio")
    @Mapping(target = "idBarrio", source="idBarrio")
    @Mapping(target = "idRuta", source="idRuta")
    @Mapping(target = "posicion", source="posicion")
    @Mapping(target = "puntoEncuentro", source="puntoEncuentro")
    @Mapping(target = "viajes", source="viajes")
    RutaBarrioEntity obtenerEntidad(RutaBarrioDto rutaBarrioDto);
}


