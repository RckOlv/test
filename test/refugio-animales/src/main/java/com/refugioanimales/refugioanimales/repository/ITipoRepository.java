/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo13.refugioAnimales.repository;

import com.grupo13.refugioAnimales.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yonat
 */
public interface ITipoRepository extends JpaRepository<Tipo, Long>{
    
}
