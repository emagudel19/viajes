package com.pragma.viajes.domain.model;

public class RutaBarrio {

    private Long idRutaBarrio;
    private Long idBarrio;
    private Long idRuta;
    private Integer posicion;
    private String puntoEncuentro;

    public RutaBarrio(Long idRutaBarrio, Long idBarrio, Long idRuta, Integer posicion, String puntoEncuentro) {
        this.idRutaBarrio = idRutaBarrio;
        this.idBarrio = idBarrio;
        this.idRuta = idRuta;
        this.posicion = posicion;
        this.puntoEncuentro = puntoEncuentro;
    }

    public Long getIdRutaBarrio() {
        return idRutaBarrio;
    }

    public void setIdRutaBarrio(Long idRutaBarrio) {
        this.idRutaBarrio = idRutaBarrio;
    }

    public Long getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Long idBarrio) {
        this.idBarrio = idBarrio;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public void setPuntoEncuentro(String puntoEncuentro) {
        this.puntoEncuentro = puntoEncuentro;
    }
}
