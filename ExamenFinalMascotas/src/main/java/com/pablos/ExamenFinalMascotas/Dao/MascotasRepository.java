/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Dao;

import com.pablos.ExamenFinalMascotas.Model.Mascotas;
import java.util.List;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author plleo
 */
public interface MascotasRepository extends Repository<Mascotas,Integer> {
    
    List<Mascotas>findAll();
    Mascotas findById(int id);
    Mascotas save(Mascotas m);
    Mascotas delete(Mascotas m);
    List<String> listarTipsoMascota();
    List<Mascotas>listarporTipoMascota(@Param("t") String t);
    List<Mascotas>listarMascotasOrdenado();
     

}
