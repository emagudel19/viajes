package com.pragma.viajes.infraestructure.dbspringdata.dbo;
/*
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ruta_barrio")
@AllArgsConstructor
@NoArgsConstructor

public class RutaBarrioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long idRutaBarrio;

    @Id
    @Column(name = "id_barrio")
    public Long idBarrio;

    @Id
    @Column(name = "id_ruta")
    public Long idRuta;

    @Column(name = "posicion")
    public Integer posicion;

    @Column(name = "punto_encuentro")
    public String puntoEncuentro;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "idRuta", cascade = CascadeType.ALL)
    public List<ViajeEntity> viajes;

}

 */
