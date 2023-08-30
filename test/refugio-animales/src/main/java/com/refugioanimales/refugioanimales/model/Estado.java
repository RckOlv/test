/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Estado {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_estado;
    private String nombre;
    
    @OneToMany(mappedBy = "estado")
    List<Historial> listaHistorial;

    public Estado() {
    }

    public Estado(Long id_estado, String nombre, List<Historial> listaHistorial) {
        this.id_estado = id_estado;
        this.nombre = nombre;
        this.listaHistorial = listaHistorial;
    }

    
    
}
