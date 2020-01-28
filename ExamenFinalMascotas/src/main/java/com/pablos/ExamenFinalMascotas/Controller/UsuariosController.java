/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Controller;

import com.pablos.ExamenFinalMascotas.Model.Usuarios;
import com.pablos.ExamenFinalMascotas.Service.UsuariosService;
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
public class UsuariosController {
@Autowired
    UsuariosService ser;

@GetMapping(path = "/listarusuarios", produces = MediaType.APPLICATION_JSON_VALUE)
public List<Usuarios> listarUsuarios(){
    return ser.listadoTodosOrdenado();
}

@GetMapping(path = "/listarusuarios/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public Usuarios listarunUsuario(@PathVariable("id") int id){
    return ser.listaunUsuario(id);
}

@PostMapping(path = "/nuevousuario", produces = MediaType.APPLICATION_JSON_VALUE)
public Usuarios nuevoUsuario(@RequestBody Usuarios u){
    return ser.nuevoUsuario(u);
}

@PutMapping(path = "/modificarusuario/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
public Usuarios modificarUsuario(@RequestBody Usuarios u, @PathVariable("id") int id){
    u.setId(id);
    return ser.modificarUsuario(u);
}

@DeleteMapping(path = "/borrarusuario/{id}")
public void borrarUsuario(@PathVariable("id") int id){
    ser.borrarUsuario(ser.listaunUsuario(id));
}

@GetMapping(path = "/entrar/{usu}/{pass}", produces = MediaType.APPLICATION_JSON_VALUE)
public Usuarios entrar(@PathVariable("usu") String usu,@PathVariable("pass") String pass){
    return ser.comprobarPass(usu, pass);
}

    
}
