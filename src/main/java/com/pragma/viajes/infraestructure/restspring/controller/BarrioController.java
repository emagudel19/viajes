package com.pragma.viajes.infraestructure.restspring.controller;


import com.pragma.viajes.infraestructure.dbspringdata.dbo.BarrioEntity;
import com.pragma.viajes.infraestructure.restspring.dto.BarrioDto;
import com.pragma.viajes.infraestructure.restspring.mapper.IBarrioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RestController
@RequestMapping("/viajes")
@RequiredArgsConstructor
public class BarrioController implements IBarrioMapper {

    private final ServicioUsuario servicioUsuario;

    @Autowired
    Connection connectionBd;


    @PostMapping("/crearBarrio")
    public ResponseEntity
    guardarUsuario(@RequestBody BarrioDto barrioDto) {

        String create = "insert into barrio (nombre,descripcion)values('?','%')";

        create=create.replace("?", barrioDto.getNombre());
        create=create.replace("%", barrioDto.getDescripcion());


        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connectionBd.prepareStatement(create);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        BarrioEntity barrioEntity = obtenerEntidad(barrioDto);
        try {
            return new ResponseEntity("sdaFSDF", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }


    @GetMapping("/buscar/{correo}")
    public String obtenerUsuario(@PathVariable("correo") String correo) {
        return servicioUsuario.obternerUsuario(correo);
    }

    @PutMapping("/modificar/{id}")
    public ResponseEntity modificarUsuario(@PathVariable("id") Long idUsuario, @RequestBody Usuario usuario) {
        return new ResponseEntity(servicioUsuario.usuarioAModificar(idUsuario, usuario), HttpStatus.CREATED);
    }

    @DeleteMapping("/id")
    public ResponseEntity eliminarUsuario(@PathVariable("id") Long idUsuario) {
        boolean respuesta = servicioUsuario.eliminarUsuario(idUsuario);
        if (respuesta == true) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }



    @Override
    public BarrioEntity obtenerEntidad(BarrioDto barrioDto) {
        return null;
    }
}

