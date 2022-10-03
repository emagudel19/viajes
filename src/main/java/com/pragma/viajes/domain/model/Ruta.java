package com.pragma.viajes.domain.model;

public class Ruta {

    private Long idRuta;
    private Integer cupos;
    private String descripcion;
    private Long idConductor;

    public Ruta(Long idRuta, Integer cupos, String descripcion, Long idConductor) {
        this.idRuta = idRuta;
        this.cupos = cupos;
        this.descripcion = descripcion;
        this.idConductor = idConductor;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Long idConductor) {
        this.idConductor = idConductor;
    }
}
