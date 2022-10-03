package com.pragma.viajes.infraestructure.restspring.mapper;

import com.pragma.viajes.domain.model.Viaje;
import com.pragma.viajes.infraestructure.dbspringdata.dbo.BarrioEntity;
import com.pragma.viajes.infraestructure.dbspringdata.dbo.ViajeEntity;
import com.pragma.viajes.infraestructure.restspring.dto.BarrioDto;
import com.pragma.viajes.infraestructure.restspring.dto.ViajeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface IViajeMapper {

    @Mapping(target = "idViaje", source="idViaje")
    @Mapping(target = "horario", source="horario")
    @Mapping(target = "idRuta", source="idRuta")
    ViajeEntity obtenerEntidad(ViajeDto viajeDto);
}


