/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.controller;

import com.grupo13.refugioAnimales.model.Administrador;
import com.grupo13.refugioAnimales.service.IAdministradorService;
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
public class AdministradorController {
    
    @Autowired
    private IAdministradorService administradorService;
    
    @GetMapping("/administradores/traer")
    public List<Administrador> getAdministradores(){
        List<Administrador> listaAdministradores = administradorService.getAdministradores();
        return listaAdministradores;
    }
    
    @GetMapping("/administrador/traer/{id}")
    public Administrador getAdministrador(@PathVariable Long id){
        Administrador administrador = administradorService.getAdministrador(id);
        return administrador;
    }
    
    @PostMapping("/administrador/crear")
    public void saveAdministrador(@RequestBody Administrador administrador){
        administradorService.saveAdministrador(administrador);
    }
    
    @PutMapping("/administrador/editar")
    public void editAdministrador(@RequestBody Administrador administrador){
        administradorService.editAdministrador(administrador);
    }
    
    @DeleteMapping("/administrador/borrar/{id}")
    public void deleteAdministrador(@PathVariable Long id){
        administradorService.deleteAdministrador(id);
    }
    
}
