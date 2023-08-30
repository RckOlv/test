/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_raza;
    private String nombre;

    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "id_tipo")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Tipo tipo;

    @OneToMany(mappedBy = "raza")
    List<Animal> listaAnimales;

    public Raza() {
    }

    public Raza(Long id_raza, String nombre, Tipo tipo, List<Animal> listaAnimales) {
        this.id_raza = id_raza;
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaAnimales = listaAnimales;
    }

}
