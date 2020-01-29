/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Dao;

import com.pablos.ExamenFinalMascotas.Model.Usuarios;
import java.util.List;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author plleo
 */
public interface UsuariosRepository extends Repository<Usuarios,Integer> {
    
    List<Usuarios>findAll();
    Usuarios findById(int id);
    Usuarios save(Usuarios u);
    Usuarios delete(Usuarios p);
    Usuarios compruebaUsuariopass(@Param("usu") String usu,@Param("pass") String pass);
    List<Usuarios> listadoUsuariosOrdenado();
     

}
