package com.refugioanimales.refugioanimales.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "adoptante")
public class Adoptante extends Persona {

    //@Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
   // private Long id_adoptante;

    @OneToMany(mappedBy = "adoptante")
    private List<Historial> listaHistorial;

    public Adoptante() {
    }

    public Adoptante(List<Historial> listaHistorial, String nombre, String apellido, String direccion, String telefono, String sexo, String dni) {
        super(nombre, apellido, direccion, telefono, sexo, dni);
        this.listaHistorial = listaHistorial;
    }

    

   

  

}
