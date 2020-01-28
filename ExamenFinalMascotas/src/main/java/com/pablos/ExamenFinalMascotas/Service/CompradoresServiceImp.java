/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;
import com.pablos.ExamenFinalMascotas.Dao.CompradoresRepository;
import com.pablos.ExamenFinalMascotas.Model.Compradores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author plleo
 */
@Service
public class CompradoresServiceImp implements CompradoresService {
@Autowired
    private CompradoresRepository rep;
    @Override
    public Compradores existeComprador(String dni) {
        return rep.findById(dni);
    }

    @Override
    public Compradores nuevoComprador(Compradores c) {
        return rep.save(c);
    }
    
}
