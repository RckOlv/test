/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.refugioanimales.refugioanimales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_historial;
    private LocalDate fechaRescate;
    private LocalDate fechaAdopcion;
    @ManyToOne
    @JoinColumn(name = "id_adoptante")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Adoptante adoptante;

    @OneToMany(mappedBy = "historial")
    List<Rescatista> listaRescatistas;

    @ManyToOne
    @JoinColumn(name = "id_administrador")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Administrador administrador;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    @JsonIgnore //importante agregar para evitar errores de formato en la response
    private Evento evento;

    public Historial() {
    }

    public Historial(Long id_historial, LocalDate fechaRescate, LocalDate fechaAdopcion, Adoptante adoptante, List<Rescatista> listaRescatistas, Administrador administrador, Animal animal, Estado estado, Evento evento) {
        this.id_historial = id_historial;
        this.fechaRescate = fechaRescate;
        this.fechaAdopcion = fechaAdopcion;
        this.adoptante = adoptante;
        this.listaRescatistas = listaRescatistas;
        this.administrador = administrador;
        this.animal = animal;
        this.estado = estado;
        this.evento = evento;
    }

}
