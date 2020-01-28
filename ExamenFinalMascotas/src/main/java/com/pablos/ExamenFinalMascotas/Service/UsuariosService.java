/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;

import com.pablos.ExamenFinalMascotas.Model.Usuarios;
import java.util.List;

/**
 *
 * @author plleo
 */
public interface UsuariosService {
    
    List<Usuarios> listadoTodosOrdenado();
    Usuarios listaunUsuario(int id);
    
    Usuarios nuevoUsuario(Usuarios u);
    Usuarios modificarUsuario(Usuarios u);
    void borrarUsuario(Usuarios u);
    Usuarios comprobarPass(String usu,String pass);
    
}
