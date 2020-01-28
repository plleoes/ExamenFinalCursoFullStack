/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Model;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author plleo
 */
@Entity
@Table(name="ventas")
@NamedQuery(name = "Ventas.ventasTotales",
  query = "select sum(v.importe) from Ventas v")
public class Ventas {
    
        	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String dni;
	@Column
        @Temporal(TemporalType.TIMESTAMP)
        private Date fecha;
	@Column
	private double importe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

        
    
}
