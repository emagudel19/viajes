package com.pragma.viajes.domain.model;

public class Barrio {

    private Long idBarrio;
    private String descripcion;
    private String nombre;

    public Barrio(Long idBarrio, String descripcion, String nombre) {
        this.idBarrio = idBarrio;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Long getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Long idBarrio) {
        this.idBarrio = idBarrio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
