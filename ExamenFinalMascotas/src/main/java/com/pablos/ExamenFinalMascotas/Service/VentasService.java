/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;

import com.pablos.ExamenFinalMascotas.Model.Ventas;
import java.util.List;

/**
 *
 * @author plleo
 */
public interface VentasService {
    List<Ventas> listadoVentas();
    double ventasTotales();
    Ventas nuevaVenta(Ventas v);
    
}
