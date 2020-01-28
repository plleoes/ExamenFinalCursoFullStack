/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Controller;

import com.pablos.ExamenFinalMascotas.Model.Mascotas;
import com.pablos.ExamenFinalMascotas.Service.MascotasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author plleo
 */
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping

public class MascotasController {
@Autowired
    MascotasService ser;
@GetMapping(path = "/listarmascotas", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Mascotas> listarMascotas(){
    return ser.listadoTodasOrdenado();
}

@GetMapping(path = "/listarmascotas/{t}", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Mascotas> listarMascotasporTipo(@PathVariable("t") String t){
    return ser.listadoporTipoOrdenado(t);
}

@GetMapping(path = "/listarmascota/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public Mascotas listarMascota(@PathVariable("id") int id){
    return ser.pedirMascota(id);
}

@PostMapping(path = "/nuevamascota", produces = MediaType.APPLICATION_JSON_VALUE)
public Mascotas nuevaMascota(@RequestBody Mascotas u){
    return ser.nuevaMascota(u);
}

@PutMapping(path = "/modificarmascota/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public Mascotas modificarMascota(@RequestBody Mascotas u,@PathVariable("id") int id){
    u.setId(id);
    return ser.modificarMascota(u);
}

@DeleteMapping(path = "/borrarmascota/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public void borrarMascota(@PathVariable("id") int id){
    ser.borrarMascota(ser.pedirMascota(id));
}

    
}
