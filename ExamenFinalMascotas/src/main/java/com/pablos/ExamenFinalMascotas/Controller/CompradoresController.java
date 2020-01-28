/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Controller;

import com.pablos.ExamenFinalMascotas.Model.Compradores;
import com.pablos.ExamenFinalMascotas.Service.CompradoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

public class CompradoresController {
@Autowired
    CompradoresService ser;

@GetMapping(path = "/existecomprador/{dni}", produces = MediaType.APPLICATION_JSON_VALUE)
public Compradores listarMascotasporTipo(@PathVariable("dni") String dni){
    return ser.existeComprador(dni);
}

@PostMapping(path = "/nuevocomprador", produces = MediaType.APPLICATION_JSON_VALUE)
public Compradores nuevoComprador(@RequestBody Compradores u){
    return ser.nuevoComprador(u);
}


    
    
}
