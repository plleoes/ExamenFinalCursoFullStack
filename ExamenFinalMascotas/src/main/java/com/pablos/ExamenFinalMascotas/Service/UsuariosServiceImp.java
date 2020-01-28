/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;

import com.pablos.ExamenFinalMascotas.Dao.UsuariosRepository;
import com.pablos.ExamenFinalMascotas.Model.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author plleo
 */
@Service
public class UsuariosServiceImp implements UsuariosService
{
@Autowired
private UsuariosRepository rep;
    @Override
    public List<Usuarios> listadoTodosOrdenado() {
        return rep.listadoUsuariosOrdenado();
    }

    @Override
    public Usuarios nuevoUsuario(Usuarios u) {
    return rep.save(u);
    }

    @Override
    public Usuarios modificarUsuario(Usuarios u) {
    return rep.save(u);
    }

    @Override
    public void borrarUsuario(Usuarios u) {
        rep.delete(u);
    }

    @Override
    public Usuarios comprobarPass(String usu, String pass) {
        return rep.compruebaUsuariopass(usu, pass);
    }

    @Override
    public Usuarios listaunUsuario(int id) {
        return rep.findById(id);
    }
    
}
