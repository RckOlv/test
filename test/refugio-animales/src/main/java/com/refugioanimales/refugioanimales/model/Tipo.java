/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter
public class Tipo {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_tipo;
    private String nombre;
    
    @OneToMany(mappedBy = "tipo")
    List<Animal> listaAnimal; 
    
    @OneToMany(mappedBy = "tipo")
    List<Raza> listaRaza;

    public Tipo() {
    }

    public Tipo(Long id_tipo, String nombre, List<Animal> listaAnimal, List<Raza> listaRaza) {
        this.id_tipo = id_tipo;
        this.nombre = nombre;
        this.listaAnimal = listaAnimal;
        this.listaRaza = listaRaza;
    }
}
