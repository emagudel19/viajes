package com.pragma.viajes.infraestructure.restspring.mapper;

import com.pragma.viajes.domain.model.RutaBarrio;
import com.pragma.viajes.domain.model.Viaje;
import com.pragma.viajes.infraestructure.dbspringdata.dbo.RutaBarrioEntity;
import com.pragma.viajes.infraestructure.dbspringdata.dbo.RutaEntity;
import com.pragma.viajes.infraestructure.restspring.dto.RutaBarrioDto;
import com.pragma.viajes.infraestructure.restspring.dto.RutaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = RutaBarrio.class)

public interface IRutaMapper {

    @Mapping(target = "idRuta", source="idRuta")
    @Mapping(target = "cupos", source="cupos")
    @Mapping(target = "rutasBarrios", source="rutasBarrios")
    RutaEntity obtenerEntidad(RutaDto rutaDto);
}


