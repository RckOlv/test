package com.refugioanimales.refugioanimales.entidades;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.Size;

package com.refugioanimales.refugioanimales.entidades;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

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
@Table(name="animal")


public class animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @OneToMany(mappedBy = "animal")
    @JsonManagedReference
    private List<Animal> animales;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 15, message= "Se ha superado la cantidad de carcateres permitidos")
    private Float peso;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 10, message= "Se ha superado los caraccteres permitidos")
    private String edad;
    
    @NotBlank(message = "Campo obligatorio")
    @Size(max = 5, message= "Se ha superado los caraccteres permitidos")
    private Boolean estaCastrado;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 250, message= "Nombre demasiado largo")
    private int telefono;

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 20, message= "Se ha superado los caraccteres permitidos")
    private String tamañoEsperado;

    //falta imagen

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 250, message= "Nombre demasiado largo")
    private String dni;

    private String enlace;

    private String foto;
}
