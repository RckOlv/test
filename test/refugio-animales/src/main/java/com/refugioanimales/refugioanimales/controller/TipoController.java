/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.controller;

import com.grupo13.refugioAnimales.model.Tipo;
import com.grupo13.refugioAnimales.service.ITipoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoController {
    
    @Autowired
    private ITipoService tipoService;
    
    @GetMapping("/tipos/traer")
    public List<Tipo> getTipos(){
        List<Tipo> listaTipos = tipoService.getTipos();
        return listaTipos;
    }
    
    @GetMapping("/tipo/traer/{id}")
    public Tipo getTipo(@PathVariable Long id){
        Tipo tipo = tipoService.getTipo(id);
        return tipo;
    }
    
    @PostMapping("/tipo/crear")
    public void saveTipo(@RequestBody Tipo tipo){
        tipoService.saveTipo(tipo);
    }
    
    @PutMapping("/tipo/editar")
    public void editTipo(@RequestBody Tipo tipo){
        tipoService.editTipo(tipo);
    }
    
    @DeleteMapping("/tipo/borrar/{id}")
    public void deleteTipo(@PathVariable Long id){
        tipoService.deleteTipo(id);
    }
    
}
