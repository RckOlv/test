/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rescatista extends Persona {

    //@Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //private Long id_rescatista;
    private String direccionTransito;

    @ManyToOne
    @JoinColumn(name = "id_historial")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Historial historial;

    public Rescatista() {
    }

    public Rescatista(String direccionTransito, Historial historial) {
        this.direccionTransito = direccionTransito;
        this.historial = historial;
    }

  
   

}
