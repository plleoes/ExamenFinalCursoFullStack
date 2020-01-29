/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Service;
import com.pablos.ExamenFinalMascotas.Dao.MascotasRepository;
import com.pablos.ExamenFinalMascotas.Model.Mascotas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author plleo
 */
@Service
public class MascotasServiceImp implements MascotasService {
@Autowired
    private MascotasRepository rep;
    @Override
    public List<Mascotas> listadoTodasOrdenado() {
        return rep.listarMascotasOrdenado();
    }

    @Override
    public List<Mascotas> listadoporTipoOrdenado(String t) {
        return rep.listarporTipoMascota(t);
    }

    @Override
    public Mascotas nuevaMascota(Mascotas m) {
        return rep.save(m);
    }

    @Override
    public Mascotas modificarMascota(Mascotas m) {
        return rep.save(m);
    }

    @Override
    public Mascotas borrarMascota(Mascotas m) {
        return rep.delete(m);
    }

    @Override
    public Mascotas pedirMascota(int id) {
        return rep.findById(id);
    }

    @Override
    public List<String> listarTipsoMascota() {
        return rep.listarTipsoMascota();
    }
    
}
