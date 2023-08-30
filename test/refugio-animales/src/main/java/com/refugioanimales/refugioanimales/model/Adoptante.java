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
@Setter
@Getter
public class Adoptante extends Persona {

    //@Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
   // private Long id_adoptante;

    @OneToMany(mappedBy = "adoptante")
    private List<Historial> listaHistorial;

    public Adoptante() {
    }

    public Adoptante(List<Historial> listaHistorial, String nombre, String apellido, String direccion, String telefono, String sexo, String dni) {
        super(nombre, apellido, direccion, telefono, sexo, dni);
        this.listaHistorial = listaHistorial;
    }

    

   

  

}
