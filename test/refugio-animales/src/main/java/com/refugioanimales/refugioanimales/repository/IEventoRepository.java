/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.refugioanimales.refugioanimales.repository;

import com.refugioanimales.refugioanimales.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yonat
 */
public interface IEventoRepository  extends JpaRepository<Evento, Long>{
    
}
