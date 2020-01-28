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
@Table(name="usuarios")
@NamedQuery(name = "Usuarios.listadoUsuariosOrdenado",
  query = "select u from Usuarios u order by u.apellidos")
@NamedQuery(name = "Usuarios.compruebaUsuariopass",
  query = "select u from Usuarios u where u.usuario = :usu and u.password = :pass")
public class Usuarios  {
    
    	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private String telefono;
	@Column
	private String usuario;
	@Column
	private String password;
	@Column
	private Boolean admin;

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

        
    
}
