package com.refugioanimales.refugioanimales.model;

import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tipo")
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
