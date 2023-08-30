package com.refugioanimales.refugioanimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "raza")
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
