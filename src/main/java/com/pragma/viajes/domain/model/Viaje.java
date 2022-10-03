package com.pragma.viajes.domain.model;

import java.util.Date;

public class Viaje {

    private Long idViaje;
    private Date horario;
    private Long idRuta;

    public Viaje(Long idViaje, Date horario, Long idRuta) {
        this.idViaje = idViaje;
        this.horario = horario;
        this.idRuta = idRuta;
    }

    public Long getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Long idViaje) {
        this.idViaje = idViaje;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }
}
