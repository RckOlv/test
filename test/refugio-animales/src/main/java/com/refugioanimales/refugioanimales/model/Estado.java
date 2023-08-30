package com.refugioanimales.refugioanimales.model;

import jakarta.persistence.*;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "estado")
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
