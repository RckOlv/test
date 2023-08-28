package com.refugioanimales.refugioanimales.entidades;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="persona")


public class persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToMany(mappedBy = "persona")
    @JsonManagedReference
    private List<Persona> personas;


    @NotBlank(message = "Campo obligatorio")
    @Size(max = 250, message= "El nombre supera la cantidad de caracteres permitidos")
    private String nombre;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 250, message= "El apellido supera la cantidad de caracteres permitidos")
    private String apellido;
    
    @NotBlank(message = "Campo obligatorio")
    @Size(max = 250, message= "La direccion supera la cantidad de caracteres permitidos")
    private String direccion;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 25, message= "Se ha superado la cantidad de caracteres permitidos")
    private int telefono;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 20, message= "Los datos ingresados supera la cantidad de caracteres permitidos")
    private String sexo;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 25, message= "Se ha superado la cantidad de caracteres permitidos")
    private String dni;

    /*@DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaPresentación;
    
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    //@Temporal(TemporalType.DATE)
    //private Date fechaFin;

    @Basic
    private LocalTime horaPresentacion;*/
    
    private String enlace;

    private String foto;
}
