/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Dao;

import com.pablos.ExamenFinalMascotas.Model.Compradores;
import org.springframework.data.repository.Repository;

/**
 *
 * @author plleo
 */
public interface CompradoresRepository  extends Repository<Compradores,String> {
    
    Compradores findById(String dni);
    Compradores save(Compradores c);
    
}
