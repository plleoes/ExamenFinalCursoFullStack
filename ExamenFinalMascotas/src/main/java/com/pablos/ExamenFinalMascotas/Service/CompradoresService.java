/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;

import com.pablos.ExamenFinalMascotas.Model.Compradores;

/**
 *
 * @author plleo
 */
public interface CompradoresService {
    
    Compradores existeComprador(String dni);
    Compradores nuevoComprador(Compradores c);
        
}
