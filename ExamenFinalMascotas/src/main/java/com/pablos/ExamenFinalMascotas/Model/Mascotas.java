/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablos.ExamenFinalMascotas.Model;

import javax.persistence.*;


/**
 *
 * @author plleo
 */
@Entity
@Table(name="mascotas")
@NamedQuery(name = "Mascotas.listarTipsoMascota",
  query = "select distinct m.tipo from Mascotas m order by m.tipo")
@NamedQuery(name = "Mascotas.listarporTipoMascota",
  query = "select m from Mascotas m where m.tipo = :t order by m.nombre")
@NamedQuery(name = "Mascotas.listarMascotasOrdenado",
  query = "select m from Mascotas m order by m.nombre")
public class Mascotas {
        @Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre;
	@Column
	private String tipo;
	@Column
	private double precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

        
    
}
