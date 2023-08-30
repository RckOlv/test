/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.controller;

import com.grupo13.refugioAnimales.model.Raza;
import com.grupo13.refugioAnimales.service.IRazaService;
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
public class RazaController {
    
    @Autowired
    private IRazaService razaService;
    
    @GetMapping("/razas/traer")
    public List<Raza> getRazas(){
        List<Raza> listaRazas = razaService.getRazas();
        return listaRazas;
    }
    
    @GetMapping("/raza/traer/{id}")
    public Raza getRaza(@PathVariable Long id){
        Raza raza = razaService.getRaza(id);
        return raza;
    }
    
    @PostMapping("/raza/crear")
    public void saveRaza(@RequestBody Raza raza){
        razaService.saveRaza(raza);
    }
    
    @PutMapping("/raza/editar")
    public void editRaza(@RequestBody Raza raza){
        razaService.editRaza(raza);
    }
    
    @DeleteMapping("/raza/borrar/{id}")
    public void deleteRaza(@PathVariable Long id){
        razaService.deleteRaza(id);
    }
    
}
