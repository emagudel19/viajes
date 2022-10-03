package com.pragma.viajes.infraestructure.dbspringdata.dbo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "barrio")
@AllArgsConstructor
@NoArgsConstructor
public class BarrioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barrio")
    public Long idBarrio;


    @Id
    @Column(name = "id_conductor")
    public Long idConductor;


    @Column(name = "descripcion")
    public String descripcion;

    @Column(name = "nombre")
    public String nombre;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "idBarrio", cascade = CascadeType.ALL)
    public List<RutaBarrioEntity> rutasBarrios;


}


