/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Administrador extends Persona {

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    //private Long id_administrador;
    private String usuario;
    private String clave;
    
    @OneToMany(mappedBy = "administrador")
    private List<Historial> listaHistorial;

    public Administrador() {
    }

    public Administrador(String usuario, String clave, List<Historial> listaHistorial, String nombre, String apellido, String direccion, String telefono, String sexo, String dni) {
        super(nombre, apellido, direccion, telefono, sexo, dni);
        this.usuario = usuario;
        this.clave = clave;
        this.listaHistorial = listaHistorial;
    }



   
    

  

}
