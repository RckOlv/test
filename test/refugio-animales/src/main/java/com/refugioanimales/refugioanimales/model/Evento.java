package com.refugioanimales.refugioanimales.model;

import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "evento")
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
