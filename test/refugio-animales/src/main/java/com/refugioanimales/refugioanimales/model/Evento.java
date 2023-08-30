/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refugioanimales.refugioanimales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Evento {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_evento;
    private String nombre;
    
    @OneToMany(mappedBy = "evento")
    List<Historial> listaHistorial;

    public Evento() {
    }

    public Evento(Long id_evento, String nombre, List<Historial> listaHistorial) {
        this.id_evento = id_evento;
        this.nombre = nombre;
        this.listaHistorial = listaHistorial;
    }

    
    
}
