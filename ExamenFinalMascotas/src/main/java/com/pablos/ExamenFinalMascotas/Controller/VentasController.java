/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Controller;

import com.pablos.ExamenFinalMascotas.Model.Ventas;
import com.pablos.ExamenFinalMascotas.Service.VentasService;
import java.util.List;
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
public class VentasController {
@Autowired
    VentasService ser;
@GetMapping(path = "/listarventas", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Ventas> listarVentas(){
    return ser.listadoVentas();
}

@GetMapping(path = "/ventastotales/{t}", produces = MediaType.APPLICATION_JSON_VALUE)
public double ventasTotales(){
    return ser.ventasTotales();
}

@PostMapping(path = "/nuevaventa", produces = MediaType.APPLICATION_JSON_VALUE)
public Ventas nuevaVenta(@RequestBody Ventas u){
    return ser.nuevaVenta(u);
}

    
    
}
