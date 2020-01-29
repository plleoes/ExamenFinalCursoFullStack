/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;

import com.pablos.ExamenFinalMascotas.Model.Mascotas;
import java.util.List;

/**
 *
 * @author plleo
 */
public interface MascotasService {
    
    Mascotas pedirMascota(int id);
    List<Mascotas> listadoTodasOrdenado();
    List<Mascotas> listadoporTipoOrdenado(String t);
    Mascotas nuevaMascota(Mascotas m);
    Mascotas modificarMascota(Mascotas m);
    Mascotas borrarMascota(Mascotas m);
    List<String> listarTipsoMascota();
 
    
}
