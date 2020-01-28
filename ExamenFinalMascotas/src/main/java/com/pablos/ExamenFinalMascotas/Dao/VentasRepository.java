/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Dao;

import com.pablos.ExamenFinalMascotas.Model.Ventas;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author plleo
 */
public interface VentasRepository extends Repository<Ventas,Integer> {
    
    List<Ventas>findAll();
    Ventas findById(int id);
    Ventas save(Ventas v);
    double ventasTotales();
    
}
