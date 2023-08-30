/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_animal;
    private Double peso;
    private boolean estaCastrado;
    private String tamañoEsperado;

    @OneToMany(mappedBy = "animal")
    List<Historial> listaHistorial;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_raza")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Raza raza;

    public Animal() {
    }

    public Animal(Long id_animal, Double peso, boolean estaCastrado, String tamañoEsperado, List<Historial> listaHistorial, Tipo tipo, Raza raza) {
        this.id_animal = id_animal;
        this.peso = peso;
        this.estaCastrado = estaCastrado;
        this.tamañoEsperado = tamañoEsperado;
        this.listaHistorial = listaHistorial;
        this.tipo = tipo;
        this.raza = raza;
    }

}
