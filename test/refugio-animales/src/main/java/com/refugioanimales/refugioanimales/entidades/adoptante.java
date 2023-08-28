package com.refugioanimales.refugioanimales.entidades;

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
@Table(name="adoptante")

public class adoptante {

    @NotBlank(message = "Campo obligatorio")
    @Size(max = 250, message= "La direccion supera la cantidad de caracteres permitidos")
    private String direccion;

}
