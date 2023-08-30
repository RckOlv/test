package com.refugioanimales.refugioanimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "animal")
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
