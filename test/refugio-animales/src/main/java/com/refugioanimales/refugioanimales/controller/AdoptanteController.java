/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.controller;

import com.grupo13.refugioAnimales.model.Adoptante;
import com.grupo13.refugioAnimales.service.IAdoptanteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdoptanteController {
    
    @Autowired
    private IAdoptanteService adoptanteService;
    
    @GetMapping("/adoptantes/traer")
    public List<Adoptante> getAdoptantes(){
        List<Adoptante> listaAdoptantes = adoptanteService.getAdoptantes();
        return listaAdoptantes;
    }
    
    @PostMapping("/adoptante/crear")
    public void saveAdoptante(@RequestBody Adoptante adoptante){
        adoptanteService.saveAdoptante(adoptante);
    }
    
    @PutMapping("/adoptante/editar")
    public void editAdoptante(@RequestBody Adoptante adoptante){
        adoptanteService.saveAdoptante(adoptante);
    }
    
    @DeleteMapping("/adoptante/borrar/{id}")
    public void deleteAdoptante(@PathVariable Long id){
        adoptanteService.deleteAdoptante(id);
    }
    
    @GetMapping("/adoptante/traer/{id}")
    public Adoptante getAdoptante(@PathVariable Long id){
        Adoptante adoptante = adoptanteService.getAdoptante(id);
        return adoptante;
    }
    
}
