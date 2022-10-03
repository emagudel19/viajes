package com.pragma.viajes.infraestructure.restspring.mapper;

import com.pragma.viajes.domain.model.RutaBarrio;
import com.pragma.viajes.infraestructure.dbspringdata.dbo.BarrioEntity;
import com.pragma.viajes.infraestructure.restspring.dto.BarrioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = RutaBarrio.class)

public interface IBarrioMapper {

    @Mapping(target = "idBarrio", source="idBarrio")
    @Mapping(target = "descripcion", source="descripcion")
    @Mapping(target = "nombre", source="nombre")
    @Mapping(target = "rutasBarrios", source="rutasBarrios")
    BarrioEntity obtenerEntidad(BarrioDto barrioDto);



}


