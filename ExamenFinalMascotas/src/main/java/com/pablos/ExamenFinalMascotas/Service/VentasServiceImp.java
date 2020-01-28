/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;

import com.pablos.ExamenFinalMascotas.Dao.VentasRepository;
import com.pablos.ExamenFinalMascotas.Model.Ventas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author plleo
 */
@Service
public class VentasServiceImp implements VentasService{
@Autowired
    private VentasRepository rep;
    @Override
    public List<Ventas> listadoVentas() {
        return rep.findAll();
    }

    @Override
    public double ventasTotales() {
        return rep.ventasTotales();
    }

    @Override
    public Ventas nuevaVenta(Ventas v) {
        return rep.save(v);
    }

  
}
